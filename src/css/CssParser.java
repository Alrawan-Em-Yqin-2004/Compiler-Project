// Generated from CssParser.g4 by ANTLR 4.13.2
package css;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, LBRACE=3, RBRACE=4, SEMI=5, DCOLON=6, COLON=7, COMMA=8, 
		GT=9, PLUS=10, TILDE=11, STAR=12, DOT=13, SLASH=14, MINUS=15, AMP=16, 
		LBRACK=17, RBRACK=18, LPAREN=19, RPAREN=20, EQ=21, INCLUDES=22, DASHMATCH=23, 
		PREFIXM=24, SUFFIXM=25, SUBSTRM=26, AT_KEYWORD=27, IMPORTANT=28, URL=29, 
		UNICODE_RANGE=30, STRING=31, HASH=32, FUNCTION=33, DIMENSION=34, PERCENTAGE=35, 
		NUMBER=36, IDENT=37, DELIM=38;
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_ruleset = 2, RULE_atRule = 3, 
		RULE_atPrelude = 4, RULE_preludeToken = 5, RULE_blockContent = 6, RULE_selectorList = 7, 
		RULE_selector = 8, RULE_combinator = 9, RULE_compoundSelector = 10, RULE_typeSelector = 11, 
		RULE_simpleSelector = 12, RULE_classSelector = 13, RULE_idSelector = 14, 
		RULE_attributeSelector = 15, RULE_attrOperator = 16, RULE_attrValue = 17, 
		RULE_pseudoClass = 18, RULE_pseudoElement = 19, RULE_pseudoArgs = 20, 
		RULE_pseudoArg = 21, RULE_declaration = 22, RULE_property = 23, RULE_value = 24, 
		RULE_valueGroup = 25, RULE_operator = 26, RULE_term = 27, RULE_function = 28, 
		RULE_parenTerm = 29, RULE_bracketTerm = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "statement", "ruleset", "atRule", "atPrelude", "preludeToken", 
			"blockContent", "selectorList", "selector", "combinator", "compoundSelector", 
			"typeSelector", "simpleSelector", "classSelector", "idSelector", "attributeSelector", 
			"attrOperator", "attrValue", "pseudoClass", "pseudoElement", "pseudoArgs", 
			"pseudoArg", "declaration", "property", "value", "valueGroup", "operator", 
			"term", "function", "parenTerm", "bracketTerm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "';'", "'::'", "':'", "','", "'>'", "'+'", 
			"'~'", "'*'", "'.'", "'/'", "'-'", "'&'", "'['", "']'", "'('", "')'", 
			"'='", "'~='", "'|='", "'^='", "'$='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WS", "LBRACE", "RBRACE", "SEMI", "DCOLON", "COLON", 
			"COMMA", "GT", "PLUS", "TILDE", "STAR", "DOT", "SLASH", "MINUS", "AMP", 
			"LBRACK", "RBRACK", "LPAREN", "RPAREN", "EQ", "INCLUDES", "DASHMATCH", 
			"PREFIXM", "SUFFIXM", "SUBSTRM", "AT_KEYWORD", "IMPORTANT", "URL", "UNICODE_RANGE", 
			"STRING", "HASH", "FUNCTION", "DIMENSION", "PERCENTAGE", "NUMBER", "IDENT", 
			"DELIM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(62);
				match(WS);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 176228085952L) != 0)) {
				{
				{
				setState(68);
				statement();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(69);
					match(WS);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCOLON:
			case COLON:
			case STAR:
			case DOT:
			case AMP:
			case LBRACK:
			case HASH:
			case PERCENTAGE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				ruleset();
				}
				break;
			case AT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				atRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesetContext extends ParserRuleContext {
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public BlockContentContext blockContent() {
			return getRuleContext(BlockContentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			selectorList();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(87);
				match(WS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(LBRACE);
			setState(94);
			blockContent();
			setState(95);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(CssParser.AT_KEYWORD, 0); }
		public AtPreludeContext atPrelude() {
			return getRuleContext(AtPreludeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public BlockContentContext blockContent() {
			return getRuleContext(BlockContentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(AT_KEYWORD);
			setState(98);
			atPrelude();
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(99);
				match(LBRACE);
				setState(100);
				blockContent();
				setState(101);
				match(RBRACE);
				}
				break;
			case SEMI:
				{
				setState(103);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtPreludeContext extends ParserRuleContext {
		public List<PreludeTokenContext> preludeToken() {
			return getRuleContexts(PreludeTokenContext.class);
		}
		public PreludeTokenContext preludeToken(int i) {
			return getRuleContext(PreludeTokenContext.class,i);
		}
		public AtPreludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atPrelude; }
	}

	public final AtPreludeContext atPrelude() throws RecognitionException {
		AtPreludeContext _localctx = new AtPreludeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atPrelude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549754765254L) != 0)) {
				{
				{
				setState(106);
				preludeToken();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreludeTokenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<PreludeTokenContext> preludeToken() {
			return getRuleContexts(PreludeTokenContext.class);
		}
		public PreludeTokenContext preludeToken(int i) {
			return getRuleContext(PreludeTokenContext.class,i);
		}
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CssParser.SEMI, 0); }
		public PreludeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preludeToken; }
	}

	public final PreludeTokenContext preludeToken() throws RecognitionException {
		PreludeTokenContext _localctx = new PreludeTokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preludeToken);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(LPAREN);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549754765254L) != 0)) {
					{
					{
					setState(113);
					preludeToken();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(RPAREN);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(FUNCTION);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549754765254L) != 0)) {
					{
					{
					setState(121);
					preludeToken();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(RPAREN);
				}
				break;
			case COMMENT:
			case WS:
			case DCOLON:
			case COLON:
			case COMMA:
			case GT:
			case PLUS:
			case TILDE:
			case STAR:
			case DOT:
			case SLASH:
			case MINUS:
			case AMP:
			case LBRACK:
			case RBRACK:
			case EQ:
			case INCLUDES:
			case DASHMATCH:
			case PREFIXM:
			case SUFFIXM:
			case SUBSTRM:
			case AT_KEYWORD:
			case IMPORTANT:
			case URL:
			case UNICODE_RANGE:
			case STRING:
			case HASH:
			case DIMENSION:
			case PERCENTAGE:
			case NUMBER:
			case IDENT:
			case DELIM:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8591507512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContentContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CssParser.SEMI, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public BlockContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockContent; }
	}

	public final BlockContentContext blockContent() throws RecognitionException {
		BlockContentContext _localctx = new BlockContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 176228085988L) != 0)) {
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(131);
					match(WS);
					}
					break;
				case 2:
					{
					setState(132);
					match(SEMI);
					}
					break;
				case 3:
					{
					setState(133);
					declaration();
					}
					break;
				case 4:
					{
					setState(134);
					ruleset();
					}
					break;
				case 5:
					{
					setState(135);
					atRule();
					}
					break;
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			selector();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(142);
						match(WS);
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(148);
					match(COMMA);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(149);
						match(WS);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(155);
					selector();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			compoundSelector();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					combinator();
					setState(163);
					compoundSelector();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(CssParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_combinator);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(170);
					match(WS);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(177);
					match(WS);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					match(WS);
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSelectorContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public TerminalNode AMP() { return getToken(CssParser.AMP, 0); }
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundSelector);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case AMP:
			case PERCENTAGE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
				case PERCENTAGE:
				case IDENT:
					{
					setState(190);
					typeSelector();
					}
					break;
				case AMP:
					{
					setState(191);
					match(AMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295106752L) != 0)) {
					{
					{
					setState(194);
					simpleSelector();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DCOLON:
			case COLON:
			case DOT:
			case LBRACK:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					simpleSelector();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295106752L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 171798695936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
		}
		public PseudoElementContext pseudoElement() {
			return getRuleContext(PseudoElementContext.class,0);
		}
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleSelector);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				classSelector();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				idSelector();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				attributeSelector();
				}
				break;
			case DCOLON:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				pseudoElement();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				pseudoClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DOT);
			setState(217);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(HASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSelectorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public AttrOperatorContext attrOperator() {
			return getRuleContext(AttrOperatorContext.class,0);
		}
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LBRACK);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(222);
				match(WS);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(IDENT);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(229);
				match(WS);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) {
				{
				setState(235);
				attrOperator();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(236);
					match(WS);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				attrValue();
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(243);
						match(WS);
						}
						}
						setState(246); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(248);
					match(IDENT);
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(251);
					match(WS);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(259);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CssParser.EQ, 0); }
		public TerminalNode INCLUDES() { return getToken(CssParser.INCLUDES, 0); }
		public TerminalNode DASHMATCH() { return getToken(CssParser.DASHMATCH, 0); }
		public TerminalNode PREFIXM() { return getToken(CssParser.PREFIXM, 0); }
		public TerminalNode SUFFIXM() { return getToken(CssParser.SUFFIXM, 0); }
		public TerminalNode SUBSTRM() { return getToken(CssParser.SUBSTRM, 0); }
		public AttrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrOperator; }
	}

	public final AttrOperatorContext attrOperator() throws RecognitionException {
		AttrOperatorContext _localctx = new AttrOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attrOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode DIMENSION() { return getToken(CssParser.DIMENSION, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 225485783040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public PseudoArgsContext pseudoArgs() {
			return getRuleContext(PseudoArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoClass);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(COLON);
				setState(266);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(COLON);
				setState(268);
				match(FUNCTION);
				setState(269);
				pseudoArgs();
				setState(270);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementContext extends ParserRuleContext {
		public TerminalNode DCOLON() { return getToken(CssParser.DCOLON, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public PseudoArgsContext pseudoArgs() {
			return getRuleContext(PseudoArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public PseudoElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoElement; }
	}

	public final PseudoElementContext pseudoElement() throws RecognitionException {
		PseudoElementContext _localctx = new PseudoElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudoElement);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(DCOLON);
				setState(275);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(DCOLON);
				setState(277);
				match(FUNCTION);
				setState(278);
				pseudoArgs();
				setState(279);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoArgsContext extends ParserRuleContext {
		public List<PseudoArgContext> pseudoArg() {
			return getRuleContexts(PseudoArgContext.class);
		}
		public PseudoArgContext pseudoArg(int i) {
			return getRuleContext(PseudoArgContext.class,i);
		}
		public PseudoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoArgs; }
	}

	public final PseudoArgsContext pseudoArgs() throws RecognitionException {
		PseudoArgsContext _localctx = new PseudoArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pseudoArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549754765310L) != 0)) {
				{
				{
				setState(283);
				pseudoArg();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoArgContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public PseudoArgsContext pseudoArgs() {
			return getRuleContext(PseudoArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public PseudoArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoArg; }
	}

	public final PseudoArgContext pseudoArg() throws RecognitionException {
		PseudoArgContext _localctx = new PseudoArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pseudoArg);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(FUNCTION);
				setState(290);
				pseudoArgs();
				setState(291);
				match(RPAREN);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(LPAREN);
				setState(294);
				pseudoArgs();
				setState(295);
				match(RPAREN);
				}
				break;
			case COMMENT:
			case WS:
			case LBRACE:
			case RBRACE:
			case SEMI:
			case DCOLON:
			case COLON:
			case COMMA:
			case GT:
			case PLUS:
			case TILDE:
			case STAR:
			case DOT:
			case SLASH:
			case MINUS:
			case AMP:
			case LBRACK:
			case RBRACK:
			case EQ:
			case INCLUDES:
			case DASHMATCH:
			case PREFIXM:
			case SUFFIXM:
			case SUBSTRM:
			case AT_KEYWORD:
			case IMPORTANT:
			case URL:
			case UNICODE_RANGE:
			case STRING:
			case HASH:
			case DIMENSION:
			case PERCENTAGE:
			case NUMBER:
			case IDENT:
			case DELIM:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8591507456L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public TerminalNode IMPORTANT() { return getToken(CssParser.IMPORTANT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			property();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(301);
				match(WS);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(COLON);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(308);
				match(WS);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			value();
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(315);
					match(WS);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(IMPORTANT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ValueGroupContext> valueGroup() {
			return getRuleContexts(ValueGroupContext.class);
		}
		public ValueGroupContext valueGroup(int i) {
			return getRuleContext(ValueGroupContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			valueGroup();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(327);
						match(WS);
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(333);
					match(COMMA);
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(334);
						match(WS);
						}
						}
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(340);
					valueGroup();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueGroupContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public ValueGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueGroup; }
	}

	public final ValueGroupContext valueGroup() throws RecognitionException {
		ValueGroupContext _localctx = new ValueGroupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valueGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			term();
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(347);
							match(WS);
							}
							}
							setState(352);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(353);
						operator();
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(354);
							match(WS);
							}
							}
							setState(359);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(360);
						term();
						}
						break;
					case 2:
						{
						setState(363); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(362);
							match(WS);
							}
							}
							setState(365); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(367);
						term();
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(CssParser.SLASH, 0); }
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CssParser.MINUS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 54272L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CssParser.DIMENSION, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public TerminalNode UNICODE_RANGE() { return getToken(CssParser.UNICODE_RANGE, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ParenTermContext parenTerm() {
			return getRuleContext(ParenTermContext.class,0);
		}
		public BracketTermContext bracketTerm() {
			return getRuleContext(BracketTermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_term);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(DIMENSION);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				match(HASH);
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				match(URL);
				}
				break;
			case UNICODE_RANGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(382);
				match(UNICODE_RANGE);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(383);
				function();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 10);
				{
				setState(384);
				parenTerm();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				bracketTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(FUNCTION);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(389);
				match(WS);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274341691392L) != 0)) {
				{
				setState(395);
				value();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(396);
					match(WS);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(404);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenTermContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParenTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenTerm; }
	}

	public final ParenTermContext parenTerm() throws RecognitionException {
		ParenTermContext _localctx = new ParenTermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parenTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(407);
				match(WS);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274341691392L) != 0)) {
				{
				setState(413);
				value();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(414);
					match(WS);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketTermContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public BracketTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketTerm; }
	}

	public final BracketTermContext bracketTerm() throws RecognitionException {
		BracketTermContext _localctx = new BracketTermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bracketTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(LBRACK);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(425);
				match(WS);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(431);
				match(IDENT);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(432);
					match(WS);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u01be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0005\u0000"+
		"L\b\u0000\n\u0000\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0005\u0004"+
		"l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"s\b\u0005\n\u0005\f\u0005v\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0082\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0090\b\u0007\n\u0007\f\u0007\u0093\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007\f\u0007\u009a"+
		"\t\u0007\u0001\u0007\u0005\u0007\u009d\b\u0007\n\u0007\f\u0007\u00a0\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a6\b\b\n\b\f\b\u00a9"+
		"\t\b\u0001\t\u0005\t\u00ac\b\t\n\t\f\t\u00af\t\t\u0001\t\u0001\t\u0005"+
		"\t\u00b3\b\t\n\t\f\t\u00b6\t\t\u0001\t\u0004\t\u00b9\b\t\u000b\t\f\t\u00ba"+
		"\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0001\n\u0005\n\u00c4"+
		"\b\n\n\n\f\n\u00c7\t\n\u0001\n\u0004\n\u00ca\b\n\u000b\n\f\n\u00cb\u0003"+
		"\n\u00ce\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00d7\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00e0\b\u000f\n\u000f\f\u000f\u00e3\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00e7\b\u000f\n\u000f\f\u000f\u00ea"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ee\b\u000f\n\u000f\f\u000f"+
		"\u00f1\t\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00f5\b\u000f\u000b"+
		"\u000f\f\u000f\u00f6\u0001\u000f\u0003\u000f\u00fa\b\u000f\u0001\u000f"+
		"\u0005\u000f\u00fd\b\u000f\n\u000f\f\u000f\u0100\t\u000f\u0003\u000f\u0102"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0111\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011a"+
		"\b\u0013\u0001\u0014\u0005\u0014\u011d\b\u0014\n\u0014\f\u0014\u0120\t"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u012f\b\u0016\n\u0016\f\u0016\u0132\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0136\b\u0016\n\u0016\f\u0016\u0139"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u013d\b\u0016\n\u0016\f\u0016"+
		"\u0140\t\u0016\u0001\u0016\u0003\u0016\u0143\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u0149\b\u0018\n\u0018\f\u0018"+
		"\u014c\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0150\b\u0018\n\u0018"+
		"\f\u0018\u0153\t\u0018\u0001\u0018\u0005\u0018\u0156\b\u0018\n\u0018\f"+
		"\u0018\u0159\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u015d\b\u0019"+
		"\n\u0019\f\u0019\u0160\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0164"+
		"\b\u0019\n\u0019\f\u0019\u0167\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u016c\b\u0019\u000b\u0019\f\u0019\u016d\u0001\u0019\u0005"+
		"\u0019\u0171\b\u0019\n\u0019\f\u0019\u0174\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0183\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u0187\b\u001c\n\u001c"+
		"\f\u001c\u018a\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u018e\b\u001c"+
		"\n\u001c\f\u001c\u0191\t\u001c\u0003\u001c\u0193\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u0199\b\u001d\n\u001d\f\u001d"+
		"\u019c\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01a0\b\u001d\n\u001d"+
		"\f\u001d\u01a3\t\u001d\u0003\u001d\u01a5\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01ab\b\u001e\n\u001e\f\u001e\u01ae"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01b2\b\u001e\n\u001e\f\u001e"+
		"\u01b5\t\u001e\u0005\u001e\u01b7\b\u001e\n\u001e\f\u001e\u01ba\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<\u0000\u0007\u0003\u0000\u0003\u0005\u0013\u0014!!\u0001"+
		"\u0000\t\u000b\u0003\u0000\f\f##%%\u0001\u0000\u0015\u001a\u0003\u0000"+
		"\u001f\u001f\"\"$%\u0002\u0000\u0013\u0014!!\u0003\u0000\n\n\f\f\u000e"+
		"\u000f\u01e9\u0000A\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000"+
		"\u0004V\u0001\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bm\u0001"+
		"\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000"+
		"\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000"+
		"\u0000\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00cd\u0001\u0000"+
		"\u0000\u0000\u0016\u00cf\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000"+
		"\u0000\u0000\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u00db\u0001\u0000"+
		"\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u0105\u0001\u0000\u0000"+
		"\u0000\"\u0107\u0001\u0000\u0000\u0000$\u0110\u0001\u0000\u0000\u0000"+
		"&\u0119\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*\u012a"+
		"\u0001\u0000\u0000\u0000,\u012c\u0001\u0000\u0000\u0000.\u0144\u0001\u0000"+
		"\u0000\u00000\u0146\u0001\u0000\u0000\u00002\u015a\u0001\u0000\u0000\u0000"+
		"4\u0175\u0001\u0000\u0000\u00006\u0182\u0001\u0000\u0000\u00008\u0184"+
		"\u0001\u0000\u0000\u0000:\u0196\u0001\u0000\u0000\u0000<\u01a8\u0001\u0000"+
		"\u0000\u0000>@\u0005\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BM\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DH\u0003\u0002\u0001"+
		"\u0000EG\u0005\u0002\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000"+
		"\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000RU\u0003\u0004\u0002\u0000"+
		"SU\u0003\u0006\u0003\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u0003\u0001\u0000\u0000\u0000VZ\u0003\u000e\u0007\u0000WY\u0005"+
		"\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0003\f"+
		"\u0006\u0000_`\u0005\u0004\u0000\u0000`\u0005\u0001\u0000\u0000\u0000"+
		"ab\u0005\u001b\u0000\u0000bh\u0003\b\u0004\u0000cd\u0005\u0003\u0000\u0000"+
		"de\u0003\f\u0006\u0000ef\u0005\u0004\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"gi\u0005\u0005\u0000\u0000hc\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000i\u0007\u0001\u0000\u0000\u0000jl\u0003\n\u0005\u0000kj\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\t\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pt\u0005\u0013\u0000\u0000qs\u0003\n\u0005\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u0082\u0005"+
		"\u0014\u0000\u0000x|\u0005!\u0000\u0000y{\u0003\n\u0005\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0005\u0014\u0000\u0000\u0080\u0082\b\u0000\u0000"+
		"\u0000\u0081p\u0001\u0000\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u000b\u0001\u0000\u0000\u0000\u0083"+
		"\u0089\u0005\u0002\u0000\u0000\u0084\u0089\u0005\u0005\u0000\u0000\u0085"+
		"\u0089\u0003,\u0016\u0000\u0086\u0089\u0003\u0004\u0002\u0000\u0087\u0089"+
		"\u0003\u0006\u0003\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0084"+
		"\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u009e\u0003\u0010\b\u0000\u008e\u0090\u0005\u0002"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0098\u0005\b\u0000\u0000\u0095\u0097\u0005\u0002\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0003\u0010\b\u0000\u009c\u0091\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u000f\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a7\u0003\u0014\n\u0000\u00a2"+
		"\u00a3\u0003\u0012\t\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u0002\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b4"+
		"\u0007\u0001\u0000\u0000\u00b1\u00b3\u0005\u0002\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00bd"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0005\u0002\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ad"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bd\u0013"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\u0016\u000b\u0000\u00bf\u00c1"+
		"\u0005\u0010\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c5\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0018\f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00ce\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0003\u0018\f\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c0\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000"+
		"\u0000\u0000\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\u0002"+
		"\u0000\u0000\u00d0\u0017\u0001\u0000\u0000\u0000\u00d1\u00d7\u0003\u001a"+
		"\r\u0000\u00d2\u00d7\u0003\u001c\u000e\u0000\u00d3\u00d7\u0003\u001e\u000f"+
		"\u0000\u00d4\u00d7\u0003&\u0013\u0000\u00d5\u00d7\u0003$\u0012\u0000\u00d6"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005\r\u0000\u0000\u00d9\u00da\u0005%\u0000\u0000\u00da\u001b"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005 \u0000\u0000\u00dc\u001d\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e1\u0005\u0011\u0000\u0000\u00de\u00e0\u0005"+
		"\u0002\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e8\u0005%\u0000\u0000\u00e5\u00e7\u0005\u0002"+
		"\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u0101\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ef\u0003 \u0010\u0000\u00ec\u00ee\u0005\u0002\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f9\u0003\"\u0011\u0000\u00f3\u00f5\u0005\u0002\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005%\u0000\u0000\u00f9"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u0002\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u00eb\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0012\u0000\u0000\u0104"+
		"\u001f\u0001\u0000\u0000\u0000\u0105\u0106\u0007\u0003\u0000\u0000\u0106"+
		"!\u0001\u0000\u0000\u0000\u0107\u0108\u0007\u0004\u0000\u0000\u0108#\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u0111\u0005"+
		"%\u0000\u0000\u010b\u010c\u0005\u0007\u0000\u0000\u010c\u010d\u0005!\u0000"+
		"\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\u010f\u0005\u0014\u0000\u0000"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0109\u0001\u0000\u0000\u0000"+
		"\u0110\u010b\u0001\u0000\u0000\u0000\u0111%\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\u0006\u0000\u0000\u0113\u011a\u0005%\u0000\u0000\u0114\u0115"+
		"\u0005\u0006\u0000\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0117\u0003"+
		"(\u0014\u0000\u0117\u0118\u0005\u0014\u0000\u0000\u0118\u011a\u0001\u0000"+
		"\u0000\u0000\u0119\u0112\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000"+
		"\u0000\u0000\u011a\'\u0001\u0000\u0000\u0000\u011b\u011d\u0003*\u0015"+
		"\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f)\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005!\u0000\u0000\u0122\u0123\u0003(\u0014\u0000\u0123\u0124"+
		"\u0005\u0014\u0000\u0000\u0124\u012b\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005\u0013\u0000\u0000\u0126\u0127\u0003(\u0014\u0000\u0127\u0128\u0005"+
		"\u0014\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u012b\b\u0005"+
		"\u0000\u0000\u012a\u0121\u0001\u0000\u0000\u0000\u012a\u0125\u0001\u0000"+
		"\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b+\u0001\u0000\u0000"+
		"\u0000\u012c\u0130\u0003.\u0017\u0000\u012d\u012f\u0005\u0002\u0000\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0137\u0005\u0007\u0000\u0000\u0134\u0136\u0005\u0002\u0000\u0000"+
		"\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u013a\u0142\u00030\u0018\u0000\u013b\u013d\u0005\u0002\u0000\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0141\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0005\u001c\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143-\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005%\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0157\u00032"+
		"\u0019\u0000\u0147\u0149\u0005\u0002\u0000\u0000\u0148\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0151\u0005\b\u0000"+
		"\u0000\u014e\u0150\u0005\u0002\u0000\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u00032\u0019\u0000"+
		"\u0155\u014a\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u01581\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u0172\u00036\u001b\u0000\u015b\u015d\u0005\u0002\u0000\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0165"+
		"\u00034\u001a\u0000\u0162\u0164\u0005\u0002\u0000\u0000\u0163\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0003"+
		"6\u001b\u0000\u0169\u0171\u0001\u0000\u0000\u0000\u016a\u016c\u0005\u0002"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u00036\u001b"+
		"\u0000\u0170\u015e\u0001\u0000\u0000\u0000\u0170\u016b\u0001\u0000\u0000"+
		"\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u01733\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0007\u0006\u0000\u0000"+
		"\u01765\u0001\u0000\u0000\u0000\u0177\u0183\u0005$\u0000\u0000\u0178\u0183"+
		"\u0005#\u0000\u0000\u0179\u0183\u0005\"\u0000\u0000\u017a\u0183\u0005"+
		"\u001f\u0000\u0000\u017b\u0183\u0005%\u0000\u0000\u017c\u0183\u0005 \u0000"+
		"\u0000\u017d\u0183\u0005\u001d\u0000\u0000\u017e\u0183\u0005\u001e\u0000"+
		"\u0000\u017f\u0183\u00038\u001c\u0000\u0180\u0183\u0003:\u001d\u0000\u0181"+
		"\u0183\u0003<\u001e\u0000\u0182\u0177\u0001\u0000\u0000\u0000\u0182\u0178"+
		"\u0001\u0000\u0000\u0000\u0182\u0179\u0001\u0000\u0000\u0000\u0182\u017a"+
		"\u0001\u0000\u0000\u0000\u0182\u017b\u0001\u0000\u0000\u0000\u0182\u017c"+
		"\u0001\u0000\u0000\u0000\u0182\u017d\u0001\u0000\u0000\u0000\u0182\u017e"+
		"\u0001\u0000\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u01837\u0001"+
		"\u0000\u0000\u0000\u0184\u0188\u0005!\u0000\u0000\u0185\u0187\u0005\u0002"+
		"\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u0192\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u018f\u00030\u0018\u0000\u018c\u018e\u0005\u0002\u0000"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0192\u018b\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0014\u0000"+
		"\u0000\u01959\u0001\u0000\u0000\u0000\u0196\u019a\u0005\u0013\u0000\u0000"+
		"\u0197\u0199\u0005\u0002\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a4\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a1\u00030\u0018\u0000\u019e"+
		"\u01a0\u0005\u0002\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005\u0014\u0000\u0000\u01a7;\u0001\u0000\u0000\u0000\u01a8\u01ac"+
		"\u0005\u0011\u0000\u0000\u01a9\u01ab\u0005\u0002\u0000\u0000\u01aa\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b3"+
		"\u0005%\u0000\u0000\u01b0\u01b2\u0005\u0002\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01af\u0001"+
		"\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005"+
		"\u0012\u0000\u0000\u01bc=\u0001\u0000\u0000\u0000:AHMTZhmt|\u0081\u0088"+
		"\u008a\u0091\u0098\u009e\u00a7\u00ad\u00b4\u00ba\u00bc\u00c0\u00c5\u00cb"+
		"\u00cd\u00d6\u00e1\u00e8\u00ef\u00f6\u00f9\u00fe\u0101\u0110\u0119\u011e"+
		"\u012a\u0130\u0137\u013e\u0142\u014a\u0151\u0157\u015e\u0165\u016d\u0170"+
		"\u0172\u0182\u0188\u018f\u0192\u019a\u01a1\u01a4\u01ac\u01b3\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}