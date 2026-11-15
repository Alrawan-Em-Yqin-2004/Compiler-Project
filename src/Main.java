import org.antlr.v4.runtime.*;

import java.nio.file.Path;
import java.util.*;


public class Main {

    static final Map<String, String[]> LANGS = new LinkedHashMap<>();
    static {
        LANGS.put("html", new String[]{"html.HTMLLexer", "html.HTMLParser", "htmlDocument"});
        LANGS.put("css",  new String[]{"css.CssLexer", "css.CssParser", "stylesheet"});
        LANGS.put("spring", new String[]{"springjava.SpringJavaLexer", "springjava.SpringJavaParser", "springApplicationUnit"});
        LANGS.put("thymeleaf", new String[]{"thymeleaf.ThymeleafLexer", "thymeleaf.ThymeleafParser", "template"});
        LANGS.put("custom", new String[]{System.getProperty("lexer"), System.getProperty("parser"),
                                         System.getProperty("rule")});
    }

    static class ErrorCounter extends BaseErrorListener {
        final String who;
        int count = 0;
        ErrorCounter(String who) { this.who = who; }

        @Override
        public void syntaxError(Recognizer<?, ?> r, Object offendingSymbol, int line,
                                int charPositionInLine, String msg, RecognitionException e) {
            count++;
            if (count <= 20) {
                System.out.println("  [" + who + " error] line " + line + ":" + charPositionInLine + "  " + msg);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java Main <html|spring|css|thymeleaf> <file> [--tokens] [--tree]");
            return;
        }
        String lang = args[0].toLowerCase();
        String file = args[1];
        List<String> flags = Arrays.asList(args);

        String[] cfg = LANGS.get(lang);
        if (cfg == null || cfg[0] == null) {
            System.out.println("Unknown language: " + lang);
            return;
        }

        System.out.println("=== " + lang.toUpperCase() + " : " + file + " ===");

        CharStream input = CharStreams.fromPath(Path.of(file));          // UTF-8
        Lexer lexer = (Lexer) Class.forName(cfg[0]).getConstructor(CharStream.class).newInstance(input);
        ErrorCounter lexErrors = new ErrorCounter("LEXER");
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexErrors);

        CommonTokenStream stream = new CommonTokenStream(lexer);
        stream.fill();
        Vocabulary vocab = lexer.getVocabulary();

        Map<String, Integer> perType = new TreeMap<>();
        List<String> skipped = new ArrayList<>();
        int prevEnd = -1;
        int tokenCount = 0;

        for (Token t : stream.getTokens()) {
            if (t.getType() == Token.EOF) continue;
            tokenCount++;
            String name = vocab.getSymbolicName(t.getType());
            perType.merge(name, 1, Integer::sum);

            if (t.getStartIndex() > prevEnd + 1) {
                String gap = input.getText(org.antlr.v4.runtime.misc.Interval.of(prevEnd + 1, t.getStartIndex() - 1));
                if (!gap.isBlank()) skipped.add(gap);
            }
            prevEnd = t.getStopIndex();

            if (flags.contains("--tokens")) {
                String text = t.getText().replace("\r", "\\r").replace("\n", "\\n");
                if (text.length() > 60) text = text.substring(0, 57) + "...";
                System.out.printf("%4d:%-3d %-18s %s%n", t.getLine(), t.getCharPositionInLine(), name, text);
            }
        }

        System.out.println("Tokens: " + tokenCount + "   " + perType);
        System.out.println("Skipped (non-blank) regions: " + skipped.size());
        for (int i = 0; i < Math.min(skipped.size(), 8); i++) {
            String s = skipped.get(i).replace("\r", "").replace("\n", "\\n");
            System.out.println("    skipped: " + (s.length() > 50 ? s.substring(0, 47) + "..." : s));
        }

       
        int syntaxErrors = 0;
        Class<?> parserClass = null;
        try {
            parserClass = Class.forName(cfg[1]);
        } catch (ClassNotFoundException ex) {
            System.out.println("Parser: not built yet (" + cfg[1] + ")");
        }

        if (parserClass != null) {
            Parser parser = (Parser) parserClass.getConstructor(TokenStream.class).newInstance(stream);
            ErrorCounter synErrors = new ErrorCounter("PARSER");
            parser.removeErrorListeners();
            parser.addErrorListener(synErrors);

            ParserRuleContext tree = (ParserRuleContext) parserClass.getMethod(cfg[2]).invoke(parser);
            syntaxErrors = synErrors.count;
            if (flags.contains("--tree")) {
                System.out.println(tree.toStringTree(parser));
            }
        }

        
        boolean ok = lexErrors.count == 0 && syntaxErrors == 0;
        System.out.println((ok ? "RESULT: OK" : "RESULT: FAILED")
                + "   (lexer errors: " + lexErrors.count + ", syntax errors: " + syntaxErrors + ")");
        if (!ok) System.exit(1);
    }
}
