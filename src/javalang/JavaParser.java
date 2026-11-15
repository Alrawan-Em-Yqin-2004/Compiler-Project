// Generated from JavaParser.g4 by ANTLR 4.13.2
package javalang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, GOTO=22, 
		IF=23, IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, 
		LONG=29, NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, 
		RETURN=36, SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, NULL=67, TRUE=68, FALSE=69, LPAREN=70, 
		RPAREN=71, LBRACE=72, RBRACE=73, LBRACK=74, RBRACK=75, SEMI=76, COMMA=77, 
		DOT=78, ELLIPSIS=79, AT=80, COLONCOLON=81, COLON=82, QUESTION=83, ARROW=84, 
		URSHIFT_ASSIGN=85, RSHIFT_ASSIGN=86, LSHIFT_ASSIGN=87, ADD_ASSIGN=88, 
		SUB_ASSIGN=89, MUL_ASSIGN=90, DIV_ASSIGN=91, AND_ASSIGN=92, OR_ASSIGN=93, 
		XOR_ASSIGN=94, MOD_ASSIGN=95, URSHIFT=96, RSHIFT=97, LSHIFT=98, INC=99, 
		DEC=100, EQUAL=101, NOTEQUAL=102, LE=103, GE=104, AND=105, OR=106, ASSIGN=107, 
		GT=108, LT=109, NOT=110, TILDE=111, ADD=112, SUB=113, MUL=114, DIV=115, 
		BITAND=116, BITOR=117, CARET=118, MOD=119, FloatingPointLiteral=120, IntegerLiteral=121, 
		CharacterLiteral=122, TextBlock=123, StringLiteral=124, BooleanLiteral=125, 
		NullLiteral=126, Identifier=127, LINE_COMMENT=128, BLOCK_COMMENT=129, 
		WS=130;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_interfaceDeclaration = 5, 
		RULE_enumDeclaration = 6, RULE_enumConstants = 7, RULE_enumConstant = 8, 
		RULE_annotationTypeDeclaration = 9, RULE_annotationTypeBody = 10, RULE_annotationTypeMemberDeclaration = 11, 
		RULE_recordDeclaration = 12, RULE_recordHeader = 13, RULE_recordComponentList = 14, 
		RULE_recordComponent = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_interfaceBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_fieldDeclaration = 21, RULE_constantDeclaration = 22, RULE_constantDeclarators = 23, 
		RULE_constantDeclarator = 24, RULE_methodDeclaration = 25, RULE_interfaceMethodDeclaration = 26, 
		RULE_genericMethodDeclaration = 27, RULE_constructorDeclaration = 28, 
		RULE_genericConstructorDeclaration = 29, RULE_methodBody = 30, RULE_constructorBody = 31, 
		RULE_explicitConstructorInvocation = 32, RULE_formalParameters = 33, RULE_formalParameterList = 34, 
		RULE_receiverParameter = 35, RULE_formalParameter = 36, RULE_lastFormalParameter = 37, 
		RULE_variableModifier = 38, RULE_variableDeclarators = 39, RULE_variableDeclarator = 40, 
		RULE_variableDeclaratorId = 41, RULE_variableInitializer = 42, RULE_arrayInitializer = 43, 
		RULE_typeTypeOrVoid = 44, RULE_typeType = 45, RULE_classOrInterfaceType = 46, 
		RULE_primitiveType = 47, RULE_typeArguments = 48, RULE_typeArgumentList = 49, 
		RULE_typeArgument = 50, RULE_typeParameters = 51, RULE_typeParameter = 52, 
		RULE_typeList = 53, RULE_qualifiedNameList = 54, RULE_qualifiedName = 55, 
		RULE_dims = 56, RULE_modifier = 57, RULE_annotation = 58, RULE_elementValuePairs = 59, 
		RULE_elementValuePair = 60, RULE_elementValue = 61, RULE_elementValueArrayInitializer = 62, 
		RULE_block = 63, RULE_blockStatement = 64, RULE_localTypeDeclaration = 65, 
		RULE_localVariableDeclaration = 66, RULE_localVariableType = 67, RULE_statement = 68, 
		RULE_localVariableDeclarationStatement = 69, RULE_forControl = 70, RULE_enhancedForControl = 71, 
		RULE_forInit = 72, RULE_expressionList = 73, RULE_resourceSpecification = 74, 
		RULE_resourceList = 75, RULE_resource = 76, RULE_catchClause = 77, RULE_catchFormalParameter = 78, 
		RULE_catchType = 79, RULE_switchBlockStatementGroup = 80, RULE_switchLabel = 81, 
		RULE_constantExpression = 82, RULE_statementExpression = 83, RULE_expression = 84, 
		RULE_lambdaExpression = 85, RULE_lambdaParameters = 86, RULE_inferredFormalParameterList = 87, 
		RULE_assignmentExpression = 88, RULE_assignmentOperator = 89, RULE_conditionalExpression = 90, 
		RULE_conditionalOrExpression = 91, RULE_conditionalAndExpression = 92, 
		RULE_inclusiveOrExpression = 93, RULE_exclusiveOrExpression = 94, RULE_andExpression = 95, 
		RULE_equalityExpression = 96, RULE_relationalExpression = 97, RULE_patternOrType = 98, 
		RULE_shiftExpression = 99, RULE_additiveExpression = 100, RULE_multiplicativeExpression = 101, 
		RULE_unaryExpression = 102, RULE_postfixExpression = 103, RULE_selector = 104, 
		RULE_primary = 105, RULE_creator = 106, RULE_createdName = 107, RULE_typeArgumentsOrDiamond = 108, 
		RULE_innerCreator = 109, RULE_arrayCreatorRest = 110, RULE_arguments = 111, 
		RULE_literal = 112;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "interfaceDeclaration", "enumDeclaration", "enumConstants", 
			"enumConstant", "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeMemberDeclaration", 
			"recordDeclaration", "recordHeader", "recordComponentList", "recordComponent", 
			"classBody", "interfaceBody", "classBodyDeclaration", "interfaceBodyDeclaration", 
			"memberDeclaration", "fieldDeclaration", "constantDeclaration", "constantDeclarators", 
			"constantDeclarator", "methodDeclaration", "interfaceMethodDeclaration", 
			"genericMethodDeclaration", "constructorDeclaration", "genericConstructorDeclaration", 
			"methodBody", "constructorBody", "explicitConstructorInvocation", "formalParameters", 
			"formalParameterList", "receiverParameter", "formalParameter", "lastFormalParameter", 
			"variableModifier", "variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "typeTypeOrVoid", "typeType", 
			"classOrInterfaceType", "primitiveType", "typeArguments", "typeArgumentList", 
			"typeArgument", "typeParameters", "typeParameter", "typeList", "qualifiedNameList", 
			"qualifiedName", "dims", "modifier", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "block", 
			"blockStatement", "localTypeDeclaration", "localVariableDeclaration", 
			"localVariableType", "statement", "localVariableDeclarationStatement", 
			"forControl", "enhancedForControl", "forInit", "expressionList", "resourceSpecification", 
			"resourceList", "resource", "catchClause", "catchFormalParameter", "catchType", 
			"switchBlockStatementGroup", "switchLabel", "constantExpression", "statementExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"assignmentExpression", "assignmentOperator", "conditionalExpression", 
			"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
			"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"patternOrType", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "postfixExpression", "selector", "primary", "creator", 
			"createdName", "typeArgumentsOrDiamond", "innerCreator", "arrayCreatorRest", 
			"arguments", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'goto'", "'if'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", "'null'", "'true'", "'false'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'...'", "'@'", "'::'", 
			"':'", "'?'", "'->'", "'>>>='", "'>>='", "'<<='", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'>>>'", "'>>'", "'<<'", "'++'", 
			"'--'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"NULL", "TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMI", "COMMA", "DOT", "ELLIPSIS", "AT", "COLONCOLON", "COLON", 
			"QUESTION", "ARROW", "URSHIFT_ASSIGN", "RSHIFT_ASSIGN", "LSHIFT_ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "URSHIFT", "RSHIFT", "LSHIFT", 
			"INC", "DEC", "EQUAL", "NOTEQUAL", "LE", "GE", "AND", "OR", "ASSIGN", 
			"GT", "LT", "NOT", "TILDE", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "FloatingPointLiteral", "IntegerLiteral", "CharacterLiteral", 
			"TextBlock", "StringLiteral", "BooleanLiteral", "NullLiteral", "Identifier", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(226);
				packageDeclaration();
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(229);
				importDeclaration();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9222733434004893182L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 69637L) != 0)) {
				{
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case CLASS:
				case DEFAULT:
				case ENUM:
				case FINAL:
				case INTERFACE:
				case NATIVE:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case SYNCHRONIZED:
				case TRANSIENT:
				case VOLATILE:
				case RECORD:
				case SEALED:
				case NON_SEALED:
				case AT:
					{
					setState(235);
					typeDeclaration();
					}
					break;
				case SEMI:
					{
					setState(236);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(244);
				annotation();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(PACKAGE);
			setState(251);
			qualifiedName();
			setState(252);
			match(SEMI);
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IMPORT);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(255);
				match(STATIC);
				}
			}

			setState(258);
			qualifiedName();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(259);
				match(DOT);
				setState(260);
				match(MUL);
				}
			}

			setState(263);
			match(SEMI);
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
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				recordDeclaration();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 638602581381122L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65541L) != 0)) {
				{
				{
				setState(272);
				modifier();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(CLASS);
			setState(279);
			match(Identifier);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(280);
				typeParameters();
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(283);
				match(EXTENDS);
				setState(284);
				typeType();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(287);
				match(IMPLEMENTS);
				setState(288);
				typeList();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(291);
				match(PERMITS);
				setState(292);
				typeList();
				}
			}

			setState(295);
			classBody();
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 638602581381122L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65541L) != 0)) {
				{
				{
				setState(297);
				modifier();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(INTERFACE);
			setState(304);
			match(Identifier);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(305);
				typeParameters();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(308);
				match(EXTENDS);
				setState(309);
				typeList();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(312);
				match(PERMITS);
				setState(313);
				typeList();
				}
			}

			setState(316);
			interfaceBody();
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
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 638602581381122L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65541L) != 0)) {
				{
				{
				setState(318);
				modifier();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(ENUM);
			setState(325);
			match(Identifier);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(326);
				match(IMPLEMENTS);
				setState(327);
				typeList();
				}
			}

			setState(330);
			match(LBRACE);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(331);
				enumConstants();
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(334);
				match(COMMA);
				}
			}

			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9222451820917075158L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223336852482617083L) != 0)) {
				{
				{
				setState(337);
				classBodyDeclaration();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			enumConstant();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					enumConstant();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(353);
				annotation();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(Identifier);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(360);
				arguments();
				}
			}

			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(363);
				classBody();
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
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					modifier();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(372);
			match(AT);
			setState(373);
			match(INTERFACE);
			setState(374);
			match(Identifier);
			setState(375);
			annotationTypeBody();
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
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(LBRACE);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 638740960924458L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223372036854706171L) != 0)) {
				{
				{
				setState(378);
				annotationTypeMemberDeclaration();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
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
	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotationTypeMemberDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					modifier();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(392);
				typeType();
				setState(393);
				match(Identifier);
				setState(394);
				match(LPAREN);
				setState(395);
				match(RPAREN);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(396);
					match(DEFAULT);
					setState(397);
					elementValue();
					}
				}

				setState(400);
				match(SEMI);
				}
				break;
			case 2:
				{
				setState(402);
				constantDeclaration();
				}
				break;
			case 3:
				{
				setState(403);
				classDeclaration();
				}
				break;
			case 4:
				{
				setState(404);
				interfaceDeclaration();
				}
				break;
			case 5:
				{
				setState(405);
				match(SEMI);
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
	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 638602581381122L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65541L) != 0)) {
				{
				{
				setState(408);
				modifier();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(RECORD);
			setState(415);
			match(Identifier);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(416);
				typeParameters();
				}
			}

			setState(419);
			recordHeader();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(420);
				match(IMPLEMENTS);
				setState(421);
				typeList();
				}
			}

			setState(424);
			classBody();
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
	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LPAREN);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138111107368L) != 0) || _la==AT || _la==Identifier) {
				{
				setState(427);
				recordComponentList();
				}
			}

			setState(430);
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
	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordComponentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			recordComponent();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(433);
				match(COMMA);
				setState(434);
				recordComponent();
				}
				}
				setState(439);
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
	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRecordComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_recordComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					annotation();
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(446);
			typeType();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(447);
				match(ELLIPSIS);
				}
			}

			setState(450);
			variableDeclaratorId();
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(LBRACE);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9222451820917075158L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223336852482617083L) != 0)) {
				{
				{
				setState(453);
				classBodyDeclaration();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
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
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LBRACE);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9222451820917075158L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223372036854706171L) != 0)) {
				{
				{
				setState(462);
				interfaceBodyDeclaration();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
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
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(471);
					match(STATIC);
					}
				}

				setState(474);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(475);
						modifier();
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(481);
				memberDeclaration();
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
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(SEMI);
				}
				break;
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case RECORD:
			case SEALED:
			case NON_SEALED:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						modifier();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(491);
					constantDeclaration();
					}
					break;
				case 2:
					{
					setState(492);
					interfaceMethodDeclaration();
					}
					break;
				case 3:
					{
					setState(493);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(494);
					interfaceDeclaration();
					}
					break;
				case 5:
					{
					setState(495);
					enumDeclaration();
					}
					break;
				case 6:
					{
					setState(496);
					recordDeclaration();
					}
					break;
				case 7:
					{
					setState(497);
					annotationTypeDeclaration();
					}
					break;
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
	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				genericMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(508);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(509);
				enumDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(510);
				recordDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(511);
				annotationTypeDeclaration();
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			typeType();
			setState(515);
			variableDeclarators();
			setState(516);
			match(SEMI);
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
	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ConstantDeclaratorsContext constantDeclarators() {
			return getRuleContext(ConstantDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			typeType();
			setState(519);
			constantDeclarators();
			setState(520);
			match(SEMI);
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
	public static class ConstantDeclaratorsContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstantDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstantDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsContext constantDeclarators() throws RecognitionException {
		ConstantDeclaratorsContext _localctx = new ConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			constantDeclarator();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(523);
				match(COMMA);
				setState(524);
				constantDeclarator();
				}
				}
				setState(529);
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
	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(Identifier);
			setState(531);
			match(ASSIGN);
			setState(532);
			variableInitializer();
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			typeTypeOrVoid();
			setState(535);
			match(Identifier);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(536);
				typeParameters();
				}
			}

			setState(539);
			formalParameters();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(540);
				dims();
				}
			}

			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(543);
				match(THROWS);
				setState(544);
				qualifiedNameList();
				}
			}

			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(547);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(548);
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
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			typeTypeOrVoid();
			setState(552);
			match(Identifier);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(553);
				typeParameters();
				}
			}

			setState(556);
			formalParameters();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(557);
				dims();
				}
			}

			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(560);
				match(THROWS);
				setState(561);
				qualifiedNameList();
				}
			}

			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(564);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(565);
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
	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			typeParameters();
			setState(569);
			methodDeclaration();
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(Identifier);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(572);
				typeParameters();
				}
			}

			setState(575);
			formalParameters();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(576);
				match(THROWS);
				setState(577);
				qualifiedNameList();
				}
			}

			setState(580);
			constructorBody();
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
	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			typeParameters();
			setState(583);
			constructorDeclaration();
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
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			block();
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
	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(LBRACE);
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(588);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2303626398189388994L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -6988530987437059715L) != 0)) {
				{
				{
				setState(591);
				blockStatement();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
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
	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_explicitConstructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(599);
					typeArguments();
					}
				}

				setState(602);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				arguments();
				}
				break;
			case 2:
				{
				setState(604);
				primary();
				setState(605);
				match(DOT);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(606);
					typeArguments();
					}
				}

				setState(609);
				match(SUPER);
				setState(610);
				arguments();
				}
				break;
			}
			setState(614);
			match(SEMI);
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
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LPAREN);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138111369512L) != 0) || _la==AT || _la==Identifier) {
				{
				setState(617);
				formalParameterList();
				}
			}

			setState(620);
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				receiverParameter();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(623);
					match(COMMA);
					setState(624);
					formalParameterList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				formalParameter();
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(628);
						match(COMMA);
						setState(629);
						formalParameter();
						}
						} 
					}
					setState(634);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(635);
					match(COMMA);
					setState(636);
					lastFormalParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				lastFormalParameter();
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
	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_receiverParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					annotation();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(648);
			typeType();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(649);
				match(Identifier);
				setState(650);
				match(DOT);
				}
			}

			setState(653);
			match(THIS);
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
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					variableModifier();
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(661);
			typeType();
			setState(662);
			variableDeclaratorId();
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
	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					variableModifier();
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(670);
			typeType();
			setState(671);
			match(ELLIPSIS);
			setState(672);
			variableDeclaratorId();
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
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableModifier);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				annotation();
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
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			variableDeclarator();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				variableDeclarator();
				}
				}
				setState(685);
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
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			variableDeclaratorId();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(687);
				match(ASSIGN);
				setState(688);
				variableInitializer();
				}
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
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(Identifier);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(692);
				dims();
				}
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
	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableInitializer);
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case NULL:
			case TRUE:
			case FALSE:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case NOT:
			case TILDE:
			case ADD:
			case SUB:
			case FloatingPointLiteral:
			case IntegerLiteral:
			case CharacterLiteral:
			case TextBlock:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				arrayInitializer();
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
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(LBRACE);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060975L) != 0)) {
				{
				setState(700);
				variableInitializer();
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701);
						match(COMMA);
						setState(702);
						variableInitializer();
						}
						} 
					}
					setState(707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(708);
					match(COMMA);
					}
				}

				}
			}

			setState(713);
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
	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeTypeOrVoid);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(VOID);
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
	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(719);
				annotation();
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(725);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(726);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(729);
				dims();
				}
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
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classOrInterfaceType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(Identifier);
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(733);
				typeArguments();
				}
				break;
			}
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(736);
					match(DOT);
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(737);
						annotation();
						}
						}
						setState(742);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(743);
					match(Identifier);
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(744);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138111107368L) != 0)) ) {
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
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LT);
			setState(755);
			typeArgumentList();
			setState(756);
			match(GT);
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
	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			typeArgument();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(759);
				match(COMMA);
				setState(760);
				typeArgument();
				}
				}
				setState(765);
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
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeArgument);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(QUESTION);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(768);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(769);
					typeType();
					}
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
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(LT);
			setState(775);
			typeParameter();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(776);
				match(COMMA);
				setState(777);
				typeParameter();
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
			match(GT);
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
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(785);
				annotation();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(Identifier);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(792);
				match(EXTENDS);
				setState(793);
				typeType();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(794);
					match(BITAND);
					setState(795);
					typeType();
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			typeType();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(804);
				match(COMMA);
				setState(805);
				typeType();
				}
				}
				setState(810);
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
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			qualifiedName();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(812);
				match(COMMA);
				setState(813);
				qualifiedName();
				}
				}
				setState(818);
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
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(Identifier);
			setState(824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(820);
					match(DOT);
					setState(821);
					match(Identifier);
					}
					} 
				}
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(835); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(827);
						annotation();
						}
						}
						setState(832);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(833);
					match(LBRACK);
					setState(834);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(837); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_modifier);
		try {
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(842);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(845);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(846);
				match(STRICTFP);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 9);
				{
				setState(847);
				match(DEFAULT);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(848);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(849);
				match(NATIVE);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(850);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 13);
				{
				setState(851);
				match(VOLATILE);
				}
				break;
			case SEALED:
				enterOuterAlt(_localctx, 14);
				{
				setState(852);
				match(SEALED);
				}
				break;
			case NON_SEALED:
				enterOuterAlt(_localctx, 15);
				{
				setState(853);
				match(NON_SEALED);
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
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(AT);
			setState(857);
			qualifiedName();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(858);
				match(LPAREN);
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(859);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(860);
					elementValue();
					}
					break;
				}
				setState(863);
				match(RPAREN);
				}
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
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			elementValuePair();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(867);
				match(COMMA);
				setState(868);
				elementValuePair();
				}
				}
				setState(873);
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
	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(Identifier);
			setState(875);
			match(ASSIGN);
			setState(876);
			elementValue();
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
	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValue);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				elementValueArrayInitializer();
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
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(LBRACE);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060975L) != 0)) {
				{
				setState(884);
				elementValue();
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(885);
						match(COMMA);
						setState(886);
						elementValue();
						}
						} 
					}
					setState(891);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(892);
					match(COMMA);
					}
				}

				}
			}

			setState(897);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(LBRACE);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2303626398189388994L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -6988530987437059715L) != 0)) {
				{
				{
				setState(900);
				blockStatement();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
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
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockStatement);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				localVariableDeclaration();
				setState(909);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				localTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(912);
				statement();
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
	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localTypeDeclaration);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				recordDeclaration();
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
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public LocalVariableTypeContext localVariableType() {
			return getRuleContext(LocalVariableTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(921);
					variableModifier();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(927);
			localVariableType();
			setState(928);
			variableDeclarators();
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
	public static class LocalVariableTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public LocalVariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableTypeContext localVariableType() throws RecognitionException {
		LocalVariableTypeContext _localctx = new LocalVariableTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localVariableType);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				typeType();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(VAR);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementAltContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementAltContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBlockStatementAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends StatementContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public TryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends StatementContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ThrowStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SynchronizedStatementContext extends StatementContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertStatementContext extends StatementContext {
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public AssertStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends StatementContext {
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatementContext extends StatementContext {
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public YieldStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		int _la;
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new BlockStatementAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				block();
				}
				break;
			case 2:
				_localctx = new AssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(ASSERT);
				setState(936);
				expression();
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(937);
					match(COLON);
					setState(938);
					expression();
					}
				}

				setState(941);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(IF);
				setState(944);
				match(LPAREN);
				setState(945);
				expression();
				setState(946);
				match(RPAREN);
				setState(947);
				statement();
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(948);
					match(ELSE);
					setState(949);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				match(FOR);
				setState(953);
				match(LPAREN);
				setState(954);
				forControl();
				setState(955);
				match(RPAREN);
				setState(956);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(958);
				match(WHILE);
				setState(959);
				match(LPAREN);
				setState(960);
				expression();
				setState(961);
				match(RPAREN);
				setState(962);
				statement();
				}
				break;
			case 6:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(964);
				match(DO);
				setState(965);
				statement();
				setState(966);
				match(WHILE);
				setState(967);
				match(LPAREN);
				setState(968);
				expression();
				setState(969);
				match(RPAREN);
				setState(970);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(972);
				match(TRY);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(973);
					resourceSpecification();
					}
				}

				setState(976);
				block();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(977);
					catchClause();
					}
					}
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(983);
					match(FINALLY);
					setState(984);
					block();
					}
				}

				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(987);
				match(SWITCH);
				setState(988);
				match(LPAREN);
				setState(989);
				expression();
				setState(990);
				match(RPAREN);
				setState(991);
				match(LBRACE);
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(992);
					switchBlockStatementGroup();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(998);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new SynchronizedStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1000);
				match(SYNCHRONIZED);
				setState(1001);
				match(LPAREN);
				setState(1002);
				expression();
				setState(1003);
				match(RPAREN);
				setState(1004);
				block();
				}
				break;
			case 10:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1006);
				match(RETURN);
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060943L) != 0)) {
					{
					setState(1007);
					expression();
					}
				}

				setState(1010);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1011);
				match(THROW);
				setState(1012);
				expression();
				setState(1013);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1015);
				match(BREAK);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1016);
					match(Identifier);
					}
				}

				setState(1019);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1020);
				match(CONTINUE);
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1021);
					match(Identifier);
					}
				}

				setState(1024);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1025);
				match(YIELD);
				setState(1026);
				expression();
				setState(1027);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1029);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1030);
				statementExpression();
				setState(1031);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1033);
				match(Identifier);
				setState(1034);
				match(COLON);
				setState(1035);
				statement();
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
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			localVariableDeclaration();
			setState(1039);
			match(SEMI);
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
	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forControl);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2306134520053907752L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060943L) != 0)) {
					{
					setState(1042);
					forInit();
					}
				}

				setState(1045);
				match(SEMI);
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060943L) != 0)) {
					{
					setState(1046);
					expression();
					}
				}

				setState(1049);
				match(SEMI);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060943L) != 0)) {
					{
					setState(1050);
					expressionList();
					}
				}

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
	public static class EnhancedForControlContext extends ParserRuleContext {
		public LocalVariableTypeContext localVariableType() {
			return getRuleContext(LocalVariableTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1055);
					variableModifier();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1061);
			localVariableType();
			setState(1062);
			variableDeclaratorId();
			setState(1063);
			match(COLON);
			setState(1064);
			expression();
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
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_forInit);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				expressionList();
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			statementExpression();
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1071);
				match(COMMA);
				setState(1072);
				statementExpression();
				}
				}
				setState(1077);
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
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(LPAREN);
			setState(1079);
			resourceList();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1080);
				match(SEMI);
				}
			}

			setState(1083);
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
	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			resource();
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1086);
					match(SEMI);
					setState(1087);
					resource();
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
	public static class ResourceContext extends ParserRuleContext {
		public LocalVariableTypeContext localVariableType() {
			return getRuleContext(LocalVariableTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resource);
		try {
			int _alt;
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1093);
						variableModifier();
						}
						} 
					}
					setState(1098);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				setState(1099);
				localVariableType();
				setState(1100);
				variableDeclaratorId();
				setState(1101);
				match(ASSIGN);
				setState(1102);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				qualifiedName();
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
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(CATCH);
			setState(1108);
			match(LPAREN);
			setState(1109);
			catchFormalParameter();
			setState(1110);
			match(RPAREN);
			setState(1111);
			block();
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
	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1113);
				variableModifier();
				}
				}
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1119);
			catchType();
			setState(1120);
			match(Identifier);
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
	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			qualifiedName();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1123);
				match(BITOR);
				setState(1124);
				qualifiedName();
				}
				}
				setState(1129);
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
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1130);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1133); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1135);
					blockStatement();
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public TerminalNode NULL() { return getToken(JavaParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_switchLabel);
		int _la;
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				match(CASE);
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1142);
					constantExpression();
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1143);
						match(COMMA);
						setState(1144);
						constantExpression();
						}
						}
						setState(1149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1150);
					match(NULL);
					}
					break;
				case 3:
					{
					setState(1151);
					match(DEFAULT);
					}
					break;
				}
				setState(1154);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(DEFAULT);
				setState(1156);
				match(COLON);
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
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			expression();
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
	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expression);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				assignmentExpression();
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
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			lambdaParameters();
			setState(1168);
			match(ARROW);
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case NULL:
			case TRUE:
			case FALSE:
			case LPAREN:
			case AT:
			case INC:
			case DEC:
			case NOT:
			case TILDE:
			case ADD:
			case SUB:
			case FloatingPointLiteral:
			case IntegerLiteral:
			case CharacterLiteral:
			case TextBlock:
			case StringLiteral:
			case Identifier:
				{
				setState(1169);
				expression();
				}
				break;
			case LBRACE:
				{
				setState(1170);
				block();
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
	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lambdaParameters);
		int _la;
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(LPAREN);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138111369512L) != 0) || _la==AT || _la==Identifier) {
					{
					setState(1175);
					formalParameterList();
					}
				}

				setState(1178);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1179);
				match(LPAREN);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1180);
					inferredFormalParameterList();
					}
				}

				setState(1183);
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
	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(Identifier);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1187);
				match(COMMA);
				setState(1188);
				match(Identifier);
				}
				}
				setState(1193);
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			conditionalExpression();
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4196351L) != 0)) {
				{
				setState(1195);
				assignmentOperator();
				setState(1196);
				expression();
				}
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 4196351L) != 0)) ) {
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			conditionalOrExpression();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1203);
				match(QUESTION);
				setState(1204);
				expression();
				setState(1205);
				match(COLON);
				setState(1206);
				conditionalExpression();
				}
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
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JavaParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			conditionalAndExpression();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1211);
				match(OR);
				setState(1212);
				conditionalAndExpression();
				}
				}
				setState(1217);
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
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			inclusiveOrExpression();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1219);
				match(AND);
				setState(1220);
				inclusiveOrExpression();
				}
				}
				setState(1225);
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
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			exclusiveOrExpression();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1227);
				match(BITOR);
				setState(1228);
				exclusiveOrExpression();
				}
				}
				setState(1233);
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
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(JavaParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(JavaParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			andExpression();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1235);
				match(CARET);
				setState(1236);
				andExpression();
				}
				}
				setState(1241);
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
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			equalityExpression();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1243);
				match(BITAND);
				setState(1244);
				equalityExpression();
				}
				}
				setState(1249);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(JavaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JavaParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(JavaParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(JavaParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			relationalExpression();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1251);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1252);
				relationalExpression();
				}
				}
				setState(1257);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> INSTANCEOF() { return getTokens(JavaParser.INSTANCEOF); }
		public TerminalNode INSTANCEOF(int i) {
			return getToken(JavaParser.INSTANCEOF, i);
		}
		public List<PatternOrTypeContext> patternOrType() {
			return getRuleContexts(PatternOrTypeContext.class);
		}
		public PatternOrTypeContext patternOrType(int i) {
			return getRuleContext(PatternOrTypeContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(JavaParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(JavaParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(JavaParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(JavaParser.GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			shiftExpression();
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INSTANCEOF || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 99L) != 0)) {
				{
				setState(1263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LE:
				case GE:
				case GT:
				case LT:
					{
					setState(1259);
					_la = _input.LA(1);
					if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 99L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1260);
					shiftExpression();
					}
					break;
				case INSTANCEOF:
					{
					setState(1261);
					match(INSTANCEOF);
					setState(1262);
					patternOrType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1267);
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
	public static class PatternOrTypeContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public PatternOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternOrType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPatternOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternOrTypeContext patternOrType() throws RecognitionException {
		PatternOrTypeContext _localctx = new PatternOrTypeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_patternOrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			typeType();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1269);
				match(Identifier);
				}
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
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LSHIFT() { return getTokens(JavaParser.LSHIFT); }
		public TerminalNode LSHIFT(int i) {
			return getToken(JavaParser.LSHIFT, i);
		}
		public List<TerminalNode> RSHIFT() { return getTokens(JavaParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(JavaParser.RSHIFT, i);
		}
		public List<TerminalNode> URSHIFT() { return getTokens(JavaParser.URSHIFT); }
		public TerminalNode URSHIFT(int i) {
			return getToken(JavaParser.URSHIFT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			additiveExpression();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 7L) != 0)) {
				{
				{
				setState(1273);
				_la = _input.LA(1);
				if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1274);
				additiveExpression();
				}
				}
				setState(1279);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JavaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JavaParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JavaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JavaParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			multiplicativeExpression();
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1281);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1282);
				multiplicativeExpression();
				}
				}
				setState(1287);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JavaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JavaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JavaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(JavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(JavaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			unaryExpression();
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 35L) != 0)) {
				{
				{
				setState(1289);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1290);
				unaryExpression();
				}
				}
				setState(1295);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode NOT() { return getToken(JavaParser.NOT, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_unaryExpression);
		int _la;
		try {
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 30723L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1297);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(LPAREN);
				setState(1299);
				typeType();
				setState(1300);
				match(RPAREN);
				setState(1301);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				postfixExpression();
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> INC() { return getTokens(JavaParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(JavaParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(JavaParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(JavaParser.DEC, i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			primary();
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 1610613009L) != 0)) {
				{
				setState(1310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case LBRACK:
				case DOT:
					{
					setState(1307);
					selector();
					}
					break;
				case INC:
					{
					setState(1308);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(1309);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1314);
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
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_selector);
		int _la;
		try {
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				match(DOT);
				setState(1316);
				match(Identifier);
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1317);
					arguments();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(DOT);
				setState(1321);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				match(DOT);
				setState(1323);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				match(DOT);
				setState(1325);
				match(NEW);
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1326);
					typeArguments();
					}
				}

				setState(1329);
				innerCreator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1330);
				match(LBRACK);
				setState(1331);
				expression();
				setState(1332);
				match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1334);
				arguments();
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
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_primary);
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1341);
				match(LPAREN);
				setState(1342);
				expression();
				setState(1343);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1345);
				match(NEW);
				setState(1346);
				creator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1347);
				typeType();
				setState(1348);
				match(DOT);
				setState(1349);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1351);
				match(VOID);
				setState(1352);
				match(DOT);
				setState(1353);
				match(CLASS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1354);
				qualifiedName();
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
	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case Identifier:
				{
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1357);
					typeArguments();
					}
				}

				setState(1360);
				createdName();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1361);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1364);
				arguments();
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1365);
					classBody();
					}
				}

				}
				break;
			case LBRACK:
			case AT:
				{
				setState(1368);
				arrayCreatorRest();
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
	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_createdName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(Identifier);
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1372);
				typeArgumentsOrDiamond();
				}
			}

			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1375);
				match(DOT);
				setState(1376);
				match(Identifier);
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1377);
					typeArgumentsOrDiamond();
					}
				}

				}
				}
				setState(1384);
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
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_typeArgumentsOrDiamond);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				match(LT);
				setState(1386);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387);
				typeArguments();
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
	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(Identifier);
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1391);
				typeArgumentsOrDiamond();
				}
				break;
			}
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1394);
				arguments();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1395);
					classBody();
					}
				}

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
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_arrayCreatorRest);
		try {
			int _alt;
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1400);
						match(LBRACK);
						setState(1401);
						expression();
						setState(1402);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1408);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				dims();
				setState(1412);
				arrayInitializer();
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(LPAREN);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 291510839951656L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1432276635784060943L) != 0)) {
				{
				setState(1417);
				expressionList();
				}
			}

			setState(1420);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode TextBlock() { return getToken(JavaParser.TextBlock, 0); }
		public TerminalNode TRUE() { return getToken(JavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JavaParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaParserVisitor ) return ((JavaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 279223176896970759L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0082\u0591\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0001\u0000\u0003\u0000\u00e4"+
		"\b\u0000\u0001\u0000\u0005\u0000\u00e7\b\u0000\n\u0000\f\u0000\u00ea\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ee\b\u0000\n\u0000\f\u0000"+
		"\u00f1\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u00f6\b"+
		"\u0001\n\u0001\f\u0001\u00f9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u0101\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0106\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u010f\b\u0003\u0001\u0004\u0005\u0004\u0112\b\u0004\n\u0004\f\u0004\u0115"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u011a\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u011e\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0122\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0126\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u012b\b\u0005\n"+
		"\u0005\f\u0005\u012e\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0133\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0137\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u013b\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0005\u0006\u0140\b\u0006\n\u0006\f\u0006\u0143\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0149\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u014d\b\u0006\u0001\u0006\u0003\u0006\u0150"+
		"\b\u0006\u0001\u0006\u0005\u0006\u0153\b\u0006\n\u0006\f\u0006\u0156\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u015d\b\u0007\n\u0007\f\u0007\u0160\t\u0007\u0001\b\u0005\b\u0163"+
		"\b\b\n\b\f\b\u0166\t\b\u0001\b\u0001\b\u0003\b\u016a\b\b\u0001\b\u0003"+
		"\b\u016d\b\b\u0001\t\u0005\t\u0170\b\t\n\t\f\t\u0173\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u017c\b\n\n\n\f\n\u017f"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u0184\b\u000b\n\u000b\f\u000b"+
		"\u0187\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u018f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0197\b\u000b\u0001\f"+
		"\u0005\f\u019a\b\f\n\f\f\f\u019d\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a2"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a7\b\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0003\r\u01ad\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u01b4\b\u000e\n\u000e\f\u000e\u01b7\t\u000e\u0001\u000f"+
		"\u0005\u000f\u01ba\b\u000f\n\u000f\f\u000f\u01bd\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u01c1\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u01c7\b\u0010\n\u0010\f\u0010\u01ca\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01d0\b\u0011\n\u0011"+
		"\f\u0011\u01d3\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01d9\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01dd\b"+
		"\u0012\n\u0012\f\u0012\u01e0\t\u0012\u0001\u0012\u0003\u0012\u01e3\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u01e7\b\u0013\n\u0013\f\u0013\u01ea"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01f3\b\u0013\u0003\u0013\u01f5\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0201\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u020e\b\u0017\n\u0017\f\u0017\u0211\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u021a"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u021e\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0222\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0226\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u022b\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u022f\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0233\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0237"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u023e\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0243"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u024e\b\u001f\u0001"+
		"\u001f\u0005\u001f\u0251\b\u001f\n\u001f\f\u001f\u0254\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0003 \u0259\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0260\b \u0001 \u0001 \u0001 \u0003 \u0265\b \u0001 \u0001 \u0001"+
		"!\u0001!\u0003!\u026b\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u0272\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u0277\b\"\n\"\f\"\u027a\t\""+
		"\u0001\"\u0001\"\u0003\"\u027e\b\"\u0001\"\u0003\"\u0281\b\"\u0001#\u0005"+
		"#\u0284\b#\n#\f#\u0287\t#\u0001#\u0001#\u0001#\u0003#\u028c\b#\u0001#"+
		"\u0001#\u0001$\u0005$\u0291\b$\n$\f$\u0294\t$\u0001$\u0001$\u0001$\u0001"+
		"%\u0005%\u029a\b%\n%\f%\u029d\t%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0003&\u02a5\b&\u0001\'\u0001\'\u0001\'\u0005\'\u02aa\b\'\n\'\f\'\u02ad"+
		"\t\'\u0001(\u0001(\u0001(\u0003(\u02b2\b(\u0001)\u0001)\u0003)\u02b6\b"+
		")\u0001*\u0001*\u0003*\u02ba\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u02c0"+
		"\b+\n+\f+\u02c3\t+\u0001+\u0003+\u02c6\b+\u0003+\u02c8\b+\u0001+\u0001"+
		"+\u0001,\u0001,\u0003,\u02ce\b,\u0001-\u0005-\u02d1\b-\n-\f-\u02d4\t-"+
		"\u0001-\u0001-\u0003-\u02d8\b-\u0001-\u0003-\u02db\b-\u0001.\u0001.\u0003"+
		".\u02df\b.\u0001.\u0001.\u0005.\u02e3\b.\n.\f.\u02e6\t.\u0001.\u0001."+
		"\u0003.\u02ea\b.\u0005.\u02ec\b.\n.\f.\u02ef\t.\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00051\u02fa\b1\n1\f1\u02fd\t1\u0001"+
		"2\u00012\u00012\u00012\u00032\u0303\b2\u00032\u0305\b2\u00013\u00013\u0001"+
		"3\u00013\u00053\u030b\b3\n3\f3\u030e\t3\u00013\u00013\u00014\u00054\u0313"+
		"\b4\n4\f4\u0316\t4\u00014\u00014\u00014\u00014\u00014\u00054\u031d\b4"+
		"\n4\f4\u0320\t4\u00034\u0322\b4\u00015\u00015\u00015\u00055\u0327\b5\n"+
		"5\f5\u032a\t5\u00016\u00016\u00016\u00056\u032f\b6\n6\f6\u0332\t6\u0001"+
		"7\u00017\u00017\u00057\u0337\b7\n7\f7\u033a\t7\u00018\u00058\u033d\b8"+
		"\n8\f8\u0340\t8\u00018\u00018\u00048\u0344\b8\u000b8\f8\u0345\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u0357\b9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u035e\b:\u0001:\u0003:\u0361\b:\u0001;\u0001;\u0001;\u0005;\u0366"+
		"\b;\n;\f;\u0369\t;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0003"+
		"=\u0372\b=\u0001>\u0001>\u0001>\u0001>\u0005>\u0378\b>\n>\f>\u037b\t>"+
		"\u0001>\u0003>\u037e\b>\u0003>\u0380\b>\u0001>\u0001>\u0001?\u0001?\u0005"+
		"?\u0386\b?\n?\f?\u0389\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u0392\b@\u0001A\u0001A\u0001A\u0001A\u0003A\u0398\bA\u0001B\u0005"+
		"B\u039b\bB\nB\fB\u039e\tB\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u03a5"+
		"\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03ac\bD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03b7\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u03cf\bD\u0001D\u0001D\u0005D\u03d3\bD\nD\fD\u03d6\tD\u0001D"+
		"\u0001D\u0003D\u03da\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005"+
		"D\u03e2\bD\nD\fD\u03e5\tD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u03f1\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u03fa\bD\u0001D\u0001D\u0001D\u0003D\u03ff\bD\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u040d\bD\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u0414"+
		"\bF\u0001F\u0001F\u0003F\u0418\bF\u0001F\u0001F\u0003F\u041c\bF\u0003"+
		"F\u041e\bF\u0001G\u0005G\u0421\bG\nG\fG\u0424\tG\u0001G\u0001G\u0001G"+
		"\u0001G\u0001G\u0001H\u0001H\u0003H\u042d\bH\u0001I\u0001I\u0001I\u0005"+
		"I\u0432\bI\nI\fI\u0435\tI\u0001J\u0001J\u0001J\u0003J\u043a\bJ\u0001J"+
		"\u0001J\u0001K\u0001K\u0001K\u0005K\u0441\bK\nK\fK\u0444\tK\u0001L\u0005"+
		"L\u0447\bL\nL\fL\u044a\tL\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u0452\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0005N\u045b"+
		"\bN\nN\fN\u045e\tN\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0005O\u0466"+
		"\bO\nO\fO\u0469\tO\u0001P\u0004P\u046c\bP\u000bP\fP\u046d\u0001P\u0005"+
		"P\u0471\bP\nP\fP\u0474\tP\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u047a\bQ"+
		"\nQ\fQ\u047d\tQ\u0001Q\u0001Q\u0003Q\u0481\bQ\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u0486\bQ\u0001R\u0001R\u0001S\u0001S\u0001T\u0001T\u0003T\u048e\bT\u0001"+
		"U\u0001U\u0001U\u0001U\u0003U\u0494\bU\u0001V\u0001V\u0001V\u0003V\u0499"+
		"\bV\u0001V\u0001V\u0001V\u0003V\u049e\bV\u0001V\u0003V\u04a1\bV\u0001"+
		"W\u0001W\u0001W\u0005W\u04a6\bW\nW\fW\u04a9\tW\u0001X\u0001X\u0001X\u0001"+
		"X\u0003X\u04af\bX\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0003Z\u04b9\bZ\u0001[\u0001[\u0001[\u0005[\u04be\b[\n[\f[\u04c1\t["+
		"\u0001\\\u0001\\\u0001\\\u0005\\\u04c6\b\\\n\\\f\\\u04c9\t\\\u0001]\u0001"+
		"]\u0001]\u0005]\u04ce\b]\n]\f]\u04d1\t]\u0001^\u0001^\u0001^\u0005^\u04d6"+
		"\b^\n^\f^\u04d9\t^\u0001_\u0001_\u0001_\u0005_\u04de\b_\n_\f_\u04e1\t"+
		"_\u0001`\u0001`\u0001`\u0005`\u04e6\b`\n`\f`\u04e9\t`\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0005a\u04f0\ba\na\fa\u04f3\ta\u0001b\u0001b\u0003b\u04f7"+
		"\bb\u0001c\u0001c\u0001c\u0005c\u04fc\bc\nc\fc\u04ff\tc\u0001d\u0001d"+
		"\u0001d\u0005d\u0504\bd\nd\fd\u0507\td\u0001e\u0001e\u0001e\u0005e\u050c"+
		"\be\ne\fe\u050f\te\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0003f\u0519\bf\u0001g\u0001g\u0001g\u0001g\u0005g\u051f\bg\ng\fg\u0522"+
		"\tg\u0001h\u0001h\u0001h\u0003h\u0527\bh\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0003h\u0530\bh\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0003h\u0538\bh\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u054c\bi\u0001j\u0003j\u054f\bj\u0001j\u0001j\u0003j\u0553\b"+
		"j\u0001j\u0001j\u0003j\u0557\bj\u0001j\u0003j\u055a\bj\u0001k\u0001k\u0003"+
		"k\u055e\bk\u0001k\u0001k\u0001k\u0003k\u0563\bk\u0005k\u0565\bk\nk\fk"+
		"\u0568\tk\u0001l\u0001l\u0001l\u0003l\u056d\bl\u0001m\u0001m\u0003m\u0571"+
		"\bm\u0001m\u0001m\u0003m\u0575\bm\u0003m\u0577\bm\u0001n\u0001n\u0001"+
		"n\u0001n\u0004n\u057d\bn\u000bn\fn\u057e\u0001n\u0003n\u0582\bn\u0001"+
		"n\u0001n\u0001n\u0003n\u0587\bn\u0001o\u0001o\u0003o\u058b\bo\u0001o\u0001"+
		"o\u0001p\u0001p\u0001p\u0000\u0000q\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u0000\u000b\u0002\u0000((++\b\u0000"+
		"\u0003\u0003\u0005\u0005\b\b\u000e\u000e\u0014\u0014\u001b\u001b\u001d"+
		"\u001d%%\u0002\u0000\u0011\u0011((\u0002\u0000U_kk\u0001\u0000ef\u0002"+
		"\u0000ghlm\u0001\u0000`b\u0001\u0000pq\u0002\u0000rsww\u0002\u0000cdn"+
		"q\u0002\u0000CEx|\u061b\u0000\u00e3\u0001\u0000\u0000\u0000\u0002\u00f7"+
		"\u0001\u0000\u0000\u0000\u0004\u00fe\u0001\u0000\u0000\u0000\u0006\u010e"+
		"\u0001\u0000\u0000\u0000\b\u0113\u0001\u0000\u0000\u0000\n\u012c\u0001"+
		"\u0000\u0000\u0000\f\u0141\u0001\u0000\u0000\u0000\u000e\u0159\u0001\u0000"+
		"\u0000\u0000\u0010\u0164\u0001\u0000\u0000\u0000\u0012\u0171\u0001\u0000"+
		"\u0000\u0000\u0014\u0179\u0001\u0000\u0000\u0000\u0016\u0185\u0001\u0000"+
		"\u0000\u0000\u0018\u019b\u0001\u0000\u0000\u0000\u001a\u01aa\u0001\u0000"+
		"\u0000\u0000\u001c\u01b0\u0001\u0000\u0000\u0000\u001e\u01bb\u0001\u0000"+
		"\u0000\u0000 \u01c4\u0001\u0000\u0000\u0000\"\u01cd\u0001\u0000\u0000"+
		"\u0000$\u01e2\u0001\u0000\u0000\u0000&\u01f4\u0001\u0000\u0000\u0000("+
		"\u0200\u0001\u0000\u0000\u0000*\u0202\u0001\u0000\u0000\u0000,\u0206\u0001"+
		"\u0000\u0000\u0000.\u020a\u0001\u0000\u0000\u00000\u0212\u0001\u0000\u0000"+
		"\u00002\u0216\u0001\u0000\u0000\u00004\u0227\u0001\u0000\u0000\u00006"+
		"\u0238\u0001\u0000\u0000\u00008\u023b\u0001\u0000\u0000\u0000:\u0246\u0001"+
		"\u0000\u0000\u0000<\u0249\u0001\u0000\u0000\u0000>\u024b\u0001\u0000\u0000"+
		"\u0000@\u0264\u0001\u0000\u0000\u0000B\u0268\u0001\u0000\u0000\u0000D"+
		"\u0280\u0001\u0000\u0000\u0000F\u0285\u0001\u0000\u0000\u0000H\u0292\u0001"+
		"\u0000\u0000\u0000J\u029b\u0001\u0000\u0000\u0000L\u02a4\u0001\u0000\u0000"+
		"\u0000N\u02a6\u0001\u0000\u0000\u0000P\u02ae\u0001\u0000\u0000\u0000R"+
		"\u02b3\u0001\u0000\u0000\u0000T\u02b9\u0001\u0000\u0000\u0000V\u02bb\u0001"+
		"\u0000\u0000\u0000X\u02cd\u0001\u0000\u0000\u0000Z\u02d2\u0001\u0000\u0000"+
		"\u0000\\\u02dc\u0001\u0000\u0000\u0000^\u02f0\u0001\u0000\u0000\u0000"+
		"`\u02f2\u0001\u0000\u0000\u0000b\u02f6\u0001\u0000\u0000\u0000d\u0304"+
		"\u0001\u0000\u0000\u0000f\u0306\u0001\u0000\u0000\u0000h\u0314\u0001\u0000"+
		"\u0000\u0000j\u0323\u0001\u0000\u0000\u0000l\u032b\u0001\u0000\u0000\u0000"+
		"n\u0333\u0001\u0000\u0000\u0000p\u0343\u0001\u0000\u0000\u0000r\u0356"+
		"\u0001\u0000\u0000\u0000t\u0358\u0001\u0000\u0000\u0000v\u0362\u0001\u0000"+
		"\u0000\u0000x\u036a\u0001\u0000\u0000\u0000z\u0371\u0001\u0000\u0000\u0000"+
		"|\u0373\u0001\u0000\u0000\u0000~\u0383\u0001\u0000\u0000\u0000\u0080\u0391"+
		"\u0001\u0000\u0000\u0000\u0082\u0397\u0001\u0000\u0000\u0000\u0084\u039c"+
		"\u0001\u0000\u0000\u0000\u0086\u03a4\u0001\u0000\u0000\u0000\u0088\u040c"+
		"\u0001\u0000\u0000\u0000\u008a\u040e\u0001\u0000\u0000\u0000\u008c\u041d"+
		"\u0001\u0000\u0000\u0000\u008e\u0422\u0001\u0000\u0000\u0000\u0090\u042c"+
		"\u0001\u0000\u0000\u0000\u0092\u042e\u0001\u0000\u0000\u0000\u0094\u0436"+
		"\u0001\u0000\u0000\u0000\u0096\u043d\u0001\u0000\u0000\u0000\u0098\u0451"+
		"\u0001\u0000\u0000\u0000\u009a\u0453\u0001\u0000\u0000\u0000\u009c\u045c"+
		"\u0001\u0000\u0000\u0000\u009e\u0462\u0001\u0000\u0000\u0000\u00a0\u046b"+
		"\u0001\u0000\u0000\u0000\u00a2\u0485\u0001\u0000\u0000\u0000\u00a4\u0487"+
		"\u0001\u0000\u0000\u0000\u00a6\u0489\u0001\u0000\u0000\u0000\u00a8\u048d"+
		"\u0001\u0000\u0000\u0000\u00aa\u048f\u0001\u0000\u0000\u0000\u00ac\u04a0"+
		"\u0001\u0000\u0000\u0000\u00ae\u04a2\u0001\u0000\u0000\u0000\u00b0\u04aa"+
		"\u0001\u0000\u0000\u0000\u00b2\u04b0\u0001\u0000\u0000\u0000\u00b4\u04b2"+
		"\u0001\u0000\u0000\u0000\u00b6\u04ba\u0001\u0000\u0000\u0000\u00b8\u04c2"+
		"\u0001\u0000\u0000\u0000\u00ba\u04ca\u0001\u0000\u0000\u0000\u00bc\u04d2"+
		"\u0001\u0000\u0000\u0000\u00be\u04da\u0001\u0000\u0000\u0000\u00c0\u04e2"+
		"\u0001\u0000\u0000\u0000\u00c2\u04ea\u0001\u0000\u0000\u0000\u00c4\u04f4"+
		"\u0001\u0000\u0000\u0000\u00c6\u04f8\u0001\u0000\u0000\u0000\u00c8\u0500"+
		"\u0001\u0000\u0000\u0000\u00ca\u0508\u0001\u0000\u0000\u0000\u00cc\u0518"+
		"\u0001\u0000\u0000\u0000\u00ce\u051a\u0001\u0000\u0000\u0000\u00d0\u0537"+
		"\u0001\u0000\u0000\u0000\u00d2\u054b\u0001\u0000\u0000\u0000\u00d4\u0552"+
		"\u0001\u0000\u0000\u0000\u00d6\u055b\u0001\u0000\u0000\u0000\u00d8\u056c"+
		"\u0001\u0000\u0000\u0000\u00da\u056e\u0001\u0000\u0000\u0000\u00dc\u0586"+
		"\u0001\u0000\u0000\u0000\u00de\u0588\u0001\u0000\u0000\u0000\u00e0\u058e"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u0002\u0001\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u0004\u0002\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0003\u0006\u0003\u0000\u00ec\u00ee\u0005L\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005\u0000\u0000\u0001\u00f3\u0001\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0003t:\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005 \u0000\u0000"+
		"\u00fb\u00fc\u0003n7\u0000\u00fc\u00fd\u0005L\u0000\u0000\u00fd\u0003"+
		"\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u0019\u0000\u0000\u00ff\u0101"+
		"\u0005&\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0105\u0003"+
		"n7\u0000\u0103\u0104\u0005N\u0000\u0000\u0104\u0106\u0005r\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005L\u0000\u0000\u0108"+
		"\u0005\u0001\u0000\u0000\u0000\u0109\u010f\u0003\b\u0004\u0000\u010a\u010f"+
		"\u0003\n\u0005\u0000\u010b\u010f\u0003\f\u0006\u0000\u010c\u010f\u0003"+
		"\u0012\t\u0000\u010d\u010f\u0003\u0018\f\u0000\u010e\u0109\u0001\u0000"+
		"\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0007\u0001\u0000\u0000\u0000\u0110\u0112\u0003r9\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\t\u0000\u0000\u0117\u0119\u0005\u007f\u0000\u0000\u0118"+
		"\u011a\u0003f3\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u0011\u0000\u0000\u011c\u011e\u0003Z-\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u0018\u0000\u0000\u0120\u0122\u0003j5\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0001\u0000\u0000\u0000\u0123\u0124\u0005A\u0000\u0000\u0124\u0126"+
		"\u0003j5\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0003 \u0010"+
		"\u0000\u0128\t\u0001\u0000\u0000\u0000\u0129\u012b\u0003r9\u0000\u012a"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005\u001c\u0000\u0000\u0130\u0132\u0005\u007f\u0000\u0000\u0131"+
		"\u0133\u0003f3\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0011\u0000\u0000\u0135\u0137\u0003j5\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005A\u0000\u0000\u0139\u013b\u0003j5\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0003\"\u0011\u0000\u013d\u000b"+
		"\u0001\u0000\u0000\u0000\u013e\u0140\u0003r9\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0010"+
		"\u0000\u0000\u0145\u0148\u0005\u007f\u0000\u0000\u0146\u0147\u0005\u0018"+
		"\u0000\u0000\u0147\u0149\u0003j5\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0005H\u0000\u0000\u014b\u014d\u0003\u000e\u0007\u0000\u014c"+
		"\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u0150\u0005M\u0000\u0000\u014f\u014e"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0154"+
		"\u0001\u0000\u0000\u0000\u0151\u0153\u0003$\u0012\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"I\u0000\u0000\u0158\r\u0001\u0000\u0000\u0000\u0159\u015e\u0003\u0010"+
		"\b\u0000\u015a\u015b\u0005M\u0000\u0000\u015b\u015d\u0003\u0010\b\u0000"+
		"\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015f\u000f\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0161\u0163\u0003t:\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u007f\u0000\u0000\u0168\u016a"+
		"\u0003\u00deo\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d\u0003"+
		" \u0010\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0011\u0001\u0000\u0000\u0000\u016e\u0170\u0003r9\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005P\u0000\u0000\u0175\u0176\u0005\u001c\u0000\u0000\u0176"+
		"\u0177\u0005\u007f\u0000\u0000\u0177\u0178\u0003\u0014\n\u0000\u0178\u0013"+
		"\u0001\u0000\u0000\u0000\u0179\u017d\u0005H\u0000\u0000\u017a\u017c\u0003"+
		"\u0016\u000b\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0005I\u0000\u0000\u0181\u0015\u0001\u0000"+
		"\u0000\u0000\u0182\u0184\u0003r9\u0000\u0183\u0182\u0001\u0000\u0000\u0000"+
		"\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0196\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0003Z-\u0000\u0189\u018a"+
		"\u0005\u007f\u0000\u0000\u018a\u018b\u0005F\u0000\u0000\u018b\u018e\u0005"+
		"G\u0000\u0000\u018c\u018d\u0005\f\u0000\u0000\u018d\u018f\u0003z=\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0005L\u0000\u0000\u0191"+
		"\u0197\u0001\u0000\u0000\u0000\u0192\u0197\u0003,\u0016\u0000\u0193\u0197"+
		"\u0003\b\u0004\u0000\u0194\u0197\u0003\n\u0005\u0000\u0195\u0197\u0005"+
		"L\u0000\u0000\u0196\u0188\u0001\u0000\u0000\u0000\u0196\u0192\u0001\u0000"+
		"\u0000\u0000\u0196\u0193\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u0017\u0001\u0000"+
		"\u0000\u0000\u0198\u019a\u0003r9\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0005?\u0000\u0000\u019f"+
		"\u01a1\u0005\u007f\u0000\u0000\u01a0\u01a2\u0003f3\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a6\u0003\u001a\r\u0000\u01a4\u01a5\u0005\u0018"+
		"\u0000\u0000\u01a5\u01a7\u0003j5\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0003 \u0010\u0000\u01a9\u0019\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0005F\u0000\u0000\u01ab\u01ad\u0003\u001c\u000e\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0005G\u0000\u0000\u01af\u001b\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b5\u0003\u001e\u000f\u0000\u01b1\u01b2\u0005"+
		"M\u0000\u0000\u01b2\u01b4\u0003\u001e\u000f\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u001d\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003t:\u0000"+
		"\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01c0\u0003Z-\u0000\u01bf\u01c1\u0005O\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003R)\u0000\u01c3\u001f\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c8\u0005H\u0000\u0000\u01c5\u01c7\u0003$\u0012\u0000"+
		"\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005I\u0000\u0000\u01cc!\u0001\u0000\u0000\u0000\u01cd\u01d1"+
		"\u0005H\u0000\u0000\u01ce\u01d0\u0003&\u0013\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005I\u0000"+
		"\u0000\u01d5#\u0001\u0000\u0000\u0000\u01d6\u01e3\u0005L\u0000\u0000\u01d7"+
		"\u01d9\u0005&\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01e3"+
		"\u0003~?\u0000\u01db\u01dd\u0003r9\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003(\u0014\u0000"+
		"\u01e2\u01d6\u0001\u0000\u0000\u0000\u01e2\u01d8\u0001\u0000\u0000\u0000"+
		"\u01e2\u01de\u0001\u0000\u0000\u0000\u01e3%\u0001\u0000\u0000\u0000\u01e4"+
		"\u01f5\u0005L\u0000\u0000\u01e5\u01e7\u0003r9\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01f2\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01f3\u0003"+
		",\u0016\u0000\u01ec\u01f3\u00034\u001a\u0000\u01ed\u01f3\u0003\b\u0004"+
		"\u0000\u01ee\u01f3\u0003\n\u0005\u0000\u01ef\u01f3\u0003\f\u0006\u0000"+
		"\u01f0\u01f3\u0003\u0018\f\u0000\u01f1\u01f3\u0003\u0012\t\u0000\u01f2"+
		"\u01eb\u0001\u0000\u0000\u0000\u01f2\u01ec\u0001\u0000\u0000\u0000\u01f2"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000\u01f2"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4"+
		"\u01e4\u0001\u0000\u0000\u0000\u01f4\u01e8\u0001\u0000\u0000\u0000\u01f5"+
		"\'\u0001\u0000\u0000\u0000\u01f6\u0201\u0003*\u0015\u0000\u01f7\u0201"+
		"\u00032\u0019\u0000\u01f8\u0201\u00036\u001b\u0000\u01f9\u0201\u00038"+
		"\u001c\u0000\u01fa\u0201\u0003:\u001d\u0000\u01fb\u0201\u0003\b\u0004"+
		"\u0000\u01fc\u0201\u0003\n\u0005\u0000\u01fd\u0201\u0003\f\u0006\u0000"+
		"\u01fe\u0201\u0003\u0018\f\u0000\u01ff\u0201\u0003\u0012\t\u0000\u0200"+
		"\u01f6\u0001\u0000\u0000\u0000\u0200\u01f7\u0001\u0000\u0000\u0000\u0200"+
		"\u01f8\u0001\u0000\u0000\u0000\u0200\u01f9\u0001\u0000\u0000\u0000\u0200"+
		"\u01fa\u0001\u0000\u0000\u0000\u0200\u01fb\u0001\u0000\u0000\u0000\u0200"+
		"\u01fc\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201"+
		")\u0001\u0000\u0000\u0000\u0202\u0203\u0003Z-\u0000\u0203\u0204\u0003"+
		"N\'\u0000\u0204\u0205\u0005L\u0000\u0000\u0205+\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0003Z-\u0000\u0207\u0208\u0003.\u0017\u0000\u0208\u0209"+
		"\u0005L\u0000\u0000\u0209-\u0001\u0000\u0000\u0000\u020a\u020f\u00030"+
		"\u0018\u0000\u020b\u020c\u0005M\u0000\u0000\u020c\u020e\u00030\u0018\u0000"+
		"\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000"+
		"\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210/\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005\u007f\u0000\u0000\u0213\u0214\u0005k\u0000\u0000\u0214\u0215"+
		"\u0003T*\u0000\u02151\u0001\u0000\u0000\u0000\u0216\u0217\u0003X,\u0000"+
		"\u0217\u0219\u0005\u007f\u0000\u0000\u0218\u021a\u0003f3\u0000\u0219\u0218"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0001\u0000\u0000\u0000\u021b\u021d\u0003B!\u0000\u021c\u021e\u0003p"+
		"8\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u0220\u0005-\u0000\u0000"+
		"\u0220\u0222\u0003l6\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0226"+
		"\u0003<\u001e\u0000\u0224\u0226\u0005L\u0000\u0000\u0225\u0223\u0001\u0000"+
		"\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u02263\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0003X,\u0000\u0228\u022a\u0005\u007f\u0000\u0000\u0229"+
		"\u022b\u0003f3\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022e\u0003"+
		"B!\u0000\u022d\u022f\u0003p8\u0000\u022e\u022d\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0005-\u0000\u0000\u0231\u0233\u0003l6\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0001\u0000\u0000\u0000\u0234\u0237\u0003<\u001e\u0000\u0235\u0237\u0005"+
		"L\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u02375\u0001\u0000\u0000\u0000\u0238\u0239\u0003f3\u0000"+
		"\u0239\u023a\u00032\u0019\u0000\u023a7\u0001\u0000\u0000\u0000\u023b\u023d"+
		"\u0005\u007f\u0000\u0000\u023c\u023e\u0003f3\u0000\u023d\u023c\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0242\u0003B!\u0000\u0240\u0241\u0005-\u0000\u0000"+
		"\u0241\u0243\u0003l6\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0003>\u001f\u0000\u02459\u0001\u0000\u0000\u0000\u0246\u0247\u0003f"+
		"3\u0000\u0247\u0248\u00038\u001c\u0000\u0248;\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0003~?\u0000\u024a=\u0001\u0000\u0000\u0000\u024b\u024d"+
		"\u0005H\u0000\u0000\u024c\u024e\u0003@ \u0000\u024d\u024c\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0252\u0001\u0000"+
		"\u0000\u0000\u024f\u0251\u0003\u0080@\u0000\u0250\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000"+
		"\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0005I\u0000\u0000"+
		"\u0256?\u0001\u0000\u0000\u0000\u0257\u0259\u0003`0\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0007\u0000\u0000\u0000\u025b\u0265"+
		"\u0003\u00deo\u0000\u025c\u025d\u0003\u00d2i\u0000\u025d\u025f\u0005N"+
		"\u0000\u0000\u025e\u0260\u0003`0\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0005(\u0000\u0000\u0262\u0263\u0003\u00deo\u0000\u0263\u0265"+
		"\u0001\u0000\u0000\u0000\u0264\u0258\u0001\u0000\u0000\u0000\u0264\u025c"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005L\u0000\u0000\u0267A\u0001\u0000\u0000\u0000\u0268\u026a\u0005F"+
		"\u0000\u0000\u0269\u026b\u0003D\"\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005G\u0000\u0000\u026dC\u0001\u0000\u0000\u0000\u026e"+
		"\u0271\u0003F#\u0000\u026f\u0270\u0005M\u0000\u0000\u0270\u0272\u0003"+
		"D\"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000"+
		"\u0000\u0000\u0272\u0281\u0001\u0000\u0000\u0000\u0273\u0278\u0003H$\u0000"+
		"\u0274\u0275\u0005M\u0000\u0000\u0275\u0277\u0003H$\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027d"+
		"\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0005M\u0000\u0000\u027c\u027e\u0003J%\u0000\u027d\u027b\u0001\u0000"+
		"\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0281\u0001\u0000"+
		"\u0000\u0000\u027f\u0281\u0003J%\u0000\u0280\u026e\u0001\u0000\u0000\u0000"+
		"\u0280\u0273\u0001\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000"+
		"\u0281E\u0001\u0000\u0000\u0000\u0282\u0284\u0003t:\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0283"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0288"+
		"\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028b"+
		"\u0003Z-\u0000\u0289\u028a\u0005\u007f\u0000\u0000\u028a\u028c\u0005N"+
		"\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0005+\u0000"+
		"\u0000\u028eG\u0001\u0000\u0000\u0000\u028f\u0291\u0003L&\u0000\u0290"+
		"\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292"+
		"\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0295\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0003Z-\u0000\u0296\u0297\u0003R)\u0000\u0297I\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0003L&\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a"+
		"\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b"+
		"\u029c\u0001\u0000\u0000\u0000\u029c\u029e\u0001\u0000\u0000\u0000\u029d"+
		"\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u0003Z-\u0000\u029f\u02a0\u0005"+
		"O\u0000\u0000\u02a0\u02a1\u0003R)\u0000\u02a1K\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a5\u0005\u0012\u0000\u0000\u02a3\u02a5\u0003t:\u0000\u02a4\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5M\u0001"+
		"\u0000\u0000\u0000\u02a6\u02ab\u0003P(\u0000\u02a7\u02a8\u0005M\u0000"+
		"\u0000\u02a8\u02aa\u0003P(\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02acO\u0001\u0000\u0000\u0000\u02ad\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b1\u0003R)\u0000\u02af\u02b0\u0005k"+
		"\u0000\u0000\u02b0\u02b2\u0003T*\u0000\u02b1\u02af\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2Q\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b5\u0005\u007f\u0000\u0000\u02b4\u02b6\u0003p8\u0000\u02b5\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6S\u0001\u0000"+
		"\u0000\u0000\u02b7\u02ba\u0003\u00a8T\u0000\u02b8\u02ba\u0003V+\u0000"+
		"\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000"+
		"\u02baU\u0001\u0000\u0000\u0000\u02bb\u02c7\u0005H\u0000\u0000\u02bc\u02c1"+
		"\u0003T*\u0000\u02bd\u02be\u0005M\u0000\u0000\u02be\u02c0\u0003T*\u0000"+
		"\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c6\u0005M\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7"+
		"\u02bc\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005I\u0000\u0000\u02caW\u0001"+
		"\u0000\u0000\u0000\u02cb\u02ce\u0003Z-\u0000\u02cc\u02ce\u00050\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ceY\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003t:\u0000\u02d0"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d8\u0003^/\u0000\u02d6\u02d8\u0003\\.\u0000\u02d7\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000"+
		"\u0000\u0000\u02d9\u02db\u0003p8\u0000\u02da\u02d9\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0001\u0000\u0000\u0000\u02db[\u0001\u0000\u0000\u0000\u02dc"+
		"\u02de\u0005\u007f\u0000\u0000\u02dd\u02df\u0003`0\u0000\u02de\u02dd\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02ed\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e4\u0005N\u0000\u0000\u02e1\u02e3\u0003t:"+
		"\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e9\u0005\u007f\u0000\u0000\u02e8\u02ea\u0003`0\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e0\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ee]\u0001\u0000\u0000\u0000\u02ef\u02ed"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f1\u0007\u0001\u0000\u0000\u02f1_\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0005m\u0000\u0000\u02f3\u02f4\u0003b1"+
		"\u0000\u02f4\u02f5\u0005l\u0000\u0000\u02f5a\u0001\u0000\u0000\u0000\u02f6"+
		"\u02fb\u0003d2\u0000\u02f7\u02f8\u0005M\u0000\u0000\u02f8\u02fa\u0003"+
		"d2\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fcc\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fe\u0305\u0003Z-\u0000\u02ff\u0302\u0005S\u0000\u0000\u0300\u0301"+
		"\u0007\u0002\u0000\u0000\u0301\u0303\u0003Z-\u0000\u0302\u0300\u0001\u0000"+
		"\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0305\u0001\u0000"+
		"\u0000\u0000\u0304\u02fe\u0001\u0000\u0000\u0000\u0304\u02ff\u0001\u0000"+
		"\u0000\u0000\u0305e\u0001\u0000\u0000\u0000\u0306\u0307\u0005m\u0000\u0000"+
		"\u0307\u030c\u0003h4\u0000\u0308\u0309\u0005M\u0000\u0000\u0309\u030b"+
		"\u0003h4\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030e\u0001\u0000"+
		"\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u030f\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0005l\u0000\u0000\u0310g\u0001\u0000\u0000\u0000"+
		"\u0311\u0313\u0003t:\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313\u0316"+
		"\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u0314"+
		"\u0001\u0000\u0000\u0000\u0317\u0321\u0005\u007f\u0000\u0000\u0318\u0319"+
		"\u0005\u0011\u0000\u0000\u0319\u031e\u0003Z-\u0000\u031a\u031b\u0005t"+
		"\u0000\u0000\u031b\u031d\u0003Z-\u0000\u031c\u031a\u0001\u0000\u0000\u0000"+
		"\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000"+
		"\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0318\u0001\u0000\u0000\u0000"+
		"\u0321\u0322\u0001\u0000\u0000\u0000\u0322i\u0001\u0000\u0000\u0000\u0323"+
		"\u0328\u0003Z-\u0000\u0324\u0325\u0005M\u0000\u0000\u0325\u0327\u0003"+
		"Z-\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000"+
		"\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u0329k\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000"+
		"\u032b\u0330\u0003n7\u0000\u032c\u032d\u0005M\u0000\u0000\u032d\u032f"+
		"\u0003n7\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032f\u0332\u0001\u0000"+
		"\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000"+
		"\u0000\u0000\u0331m\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000"+
		"\u0000\u0333\u0338\u0005\u007f\u0000\u0000\u0334\u0335\u0005N\u0000\u0000"+
		"\u0335\u0337\u0005\u007f\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000"+
		"\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0001\u0000\u0000\u0000\u0339o\u0001\u0000\u0000\u0000\u033a"+
		"\u0338\u0001\u0000\u0000\u0000\u033b\u033d\u0003t:\u0000\u033c\u033b\u0001"+
		"\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001"+
		"\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0341\u0001"+
		"\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0342\u0005"+
		"J\u0000\u0000\u0342\u0344\u0005K\u0000\u0000\u0343\u033e\u0001\u0000\u0000"+
		"\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346q\u0001\u0000\u0000\u0000"+
		"\u0347\u0357\u0003t:\u0000\u0348\u0357\u0005#\u0000\u0000\u0349\u0357"+
		"\u0005\"\u0000\u0000\u034a\u0357\u0005!\u0000\u0000\u034b\u0357\u0005"+
		"\u0001\u0000\u0000\u034c\u0357\u0005&\u0000\u0000\u034d\u0357\u0005\u0012"+
		"\u0000\u0000\u034e\u0357\u0005\'\u0000\u0000\u034f\u0357\u0005\f\u0000"+
		"\u0000\u0350\u0357\u0005*\u0000\u0000\u0351\u0357\u0005\u001e\u0000\u0000"+
		"\u0352\u0357\u0005.\u0000\u0000\u0353\u0357\u00051\u0000\u0000\u0354\u0357"+
		"\u0005@\u0000\u0000\u0355\u0357\u0005B\u0000\u0000\u0356\u0347\u0001\u0000"+
		"\u0000\u0000\u0356\u0348\u0001\u0000\u0000\u0000\u0356\u0349\u0001\u0000"+
		"\u0000\u0000\u0356\u034a\u0001\u0000\u0000\u0000\u0356\u034b\u0001\u0000"+
		"\u0000\u0000\u0356\u034c\u0001\u0000\u0000\u0000\u0356\u034d\u0001\u0000"+
		"\u0000\u0000\u0356\u034e\u0001\u0000\u0000\u0000\u0356\u034f\u0001\u0000"+
		"\u0000\u0000\u0356\u0350\u0001\u0000\u0000\u0000\u0356\u0351\u0001\u0000"+
		"\u0000\u0000\u0356\u0352\u0001\u0000\u0000\u0000\u0356\u0353\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0355\u0001\u0000"+
		"\u0000\u0000\u0357s\u0001\u0000\u0000\u0000\u0358\u0359\u0005P\u0000\u0000"+
		"\u0359\u0360\u0003n7\u0000\u035a\u035d\u0005F\u0000\u0000\u035b\u035e"+
		"\u0003v;\u0000\u035c\u035e\u0003z=\u0000\u035d\u035b\u0001\u0000\u0000"+
		"\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0361\u0005G\u0000\u0000"+
		"\u0360\u035a\u0001\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000"+
		"\u0361u\u0001\u0000\u0000\u0000\u0362\u0367\u0003x<\u0000\u0363\u0364"+
		"\u0005M\u0000\u0000\u0364\u0366\u0003x<\u0000\u0365\u0363\u0001\u0000"+
		"\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368w\u0001\u0000\u0000"+
		"\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u036a\u036b\u0005\u007f\u0000"+
		"\u0000\u036b\u036c\u0005k\u0000\u0000\u036c\u036d\u0003z=\u0000\u036d"+
		"y\u0001\u0000\u0000\u0000\u036e\u0372\u0003\u00b4Z\u0000\u036f\u0372\u0003"+
		"t:\u0000\u0370\u0372\u0003|>\u0000\u0371\u036e\u0001\u0000\u0000\u0000"+
		"\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000"+
		"\u0372{\u0001\u0000\u0000\u0000\u0373\u037f\u0005H\u0000\u0000\u0374\u0379"+
		"\u0003z=\u0000\u0375\u0376\u0005M\u0000\u0000\u0376\u0378\u0003z=\u0000"+
		"\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000\u0000\u0000"+
		"\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000"+
		"\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000\u0000"+
		"\u037c\u037e\u0005M\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d"+
		"\u037e\u0001\u0000\u0000\u0000\u037e\u0380\u0001\u0000\u0000\u0000\u037f"+
		"\u0374\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380"+
		"\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0005I\u0000\u0000\u0382}\u0001"+
		"\u0000\u0000\u0000\u0383\u0387\u0005H\u0000\u0000\u0384\u0386\u0003\u0080"+
		"@\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000"+
		"\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000"+
		"\u0000\u0388\u038a\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0005I\u0000\u0000\u038b\u007f\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u0003\u0084B\u0000\u038d\u038e\u0005L\u0000\u0000\u038e\u0392"+
		"\u0001\u0000\u0000\u0000\u038f\u0392\u0003\u0082A\u0000\u0390\u0392\u0003"+
		"\u0088D\u0000\u0391\u038c\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0392\u0081\u0001\u0000"+
		"\u0000\u0000\u0393\u0398\u0003\b\u0004\u0000\u0394\u0398\u0003\n\u0005"+
		"\u0000\u0395\u0398\u0003\f\u0006\u0000\u0396\u0398\u0003\u0018\f\u0000"+
		"\u0397\u0393\u0001\u0000\u0000\u0000\u0397\u0394\u0001\u0000\u0000\u0000"+
		"\u0397\u0395\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000"+
		"\u0398\u0083\u0001\u0000\u0000\u0000\u0399\u039b\u0003L&\u0000\u039a\u0399"+
		"\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000\u0000\u0000\u039c\u039a"+
		"\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039f"+
		"\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u03a0"+
		"\u0003\u0086C\u0000\u03a0\u03a1\u0003N\'\u0000\u03a1\u0085\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a5\u0003Z-\u0000\u03a3\u03a5\u0005=\u0000\u0000"+
		"\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a5\u0087\u0001\u0000\u0000\u0000\u03a6\u040d\u0003~?\u0000\u03a7\u03a8"+
		"\u0005\u0002\u0000\u0000\u03a8\u03ab\u0003\u00a8T\u0000\u03a9\u03aa\u0005"+
		"R\u0000\u0000\u03aa\u03ac\u0003\u00a8T\u0000\u03ab\u03a9\u0001\u0000\u0000"+
		"\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ae\u0005L\u0000\u0000\u03ae\u040d\u0001\u0000\u0000\u0000"+
		"\u03af\u03b0\u0005\u0017\u0000\u0000\u03b0\u03b1\u0005F\u0000\u0000\u03b1"+
		"\u03b2\u0003\u00a8T\u0000\u03b2\u03b3\u0005G\u0000\u0000\u03b3\u03b6\u0003"+
		"\u0088D\u0000\u03b4\u03b5\u0005\u000f\u0000\u0000\u03b5\u03b7\u0003\u0088"+
		"D\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7\u040d\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u0015\u0000"+
		"\u0000\u03b9\u03ba\u0005F\u0000\u0000\u03ba\u03bb\u0003\u008cF\u0000\u03bb"+
		"\u03bc\u0005G\u0000\u0000\u03bc\u03bd\u0003\u0088D\u0000\u03bd\u040d\u0001"+
		"\u0000\u0000\u0000\u03be\u03bf\u00052\u0000\u0000\u03bf\u03c0\u0005F\u0000"+
		"\u0000\u03c0\u03c1\u0003\u00a8T\u0000\u03c1\u03c2\u0005G\u0000\u0000\u03c2"+
		"\u03c3\u0003\u0088D\u0000\u03c3\u040d\u0001\u0000\u0000\u0000\u03c4\u03c5"+
		"\u0005\r\u0000\u0000\u03c5\u03c6\u0003\u0088D\u0000\u03c6\u03c7\u0005"+
		"2\u0000\u0000\u03c7\u03c8\u0005F\u0000\u0000\u03c8\u03c9\u0003\u00a8T"+
		"\u0000\u03c9\u03ca\u0005G\u0000\u0000\u03ca\u03cb\u0005L\u0000\u0000\u03cb"+
		"\u040d\u0001\u0000\u0000\u0000\u03cc\u03ce\u0005/\u0000\u0000\u03cd\u03cf"+
		"\u0003\u0094J\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d4\u0003"+
		"~?\u0000\u03d1\u03d3\u0003\u009aM\u0000\u03d2\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d9\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005\u0013\u0000"+
		"\u0000\u03d8\u03da\u0003~?\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9"+
		"\u03da\u0001\u0000\u0000\u0000\u03da\u040d\u0001\u0000\u0000\u0000\u03db"+
		"\u03dc\u0005)\u0000\u0000\u03dc\u03dd\u0005F\u0000\u0000\u03dd\u03de\u0003"+
		"\u00a8T\u0000\u03de\u03df\u0005G\u0000\u0000\u03df\u03e3\u0005H\u0000"+
		"\u0000\u03e0\u03e2\u0003\u00a0P\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005I\u0000\u0000\u03e7"+
		"\u040d\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005*\u0000\u0000\u03e9\u03ea"+
		"\u0005F\u0000\u0000\u03ea\u03eb\u0003\u00a8T\u0000\u03eb\u03ec\u0005G"+
		"\u0000\u0000\u03ec\u03ed\u0003~?\u0000\u03ed\u040d\u0001\u0000\u0000\u0000"+
		"\u03ee\u03f0\u0005$\u0000\u0000\u03ef\u03f1\u0003\u00a8T\u0000\u03f0\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f2\u040d\u0005L\u0000\u0000\u03f3\u03f4\u0005"+
		",\u0000\u0000\u03f4\u03f5\u0003\u00a8T\u0000\u03f5\u03f6\u0005L\u0000"+
		"\u0000\u03f6\u040d\u0001\u0000\u0000\u0000\u03f7\u03f9\u0005\u0004\u0000"+
		"\u0000\u03f8\u03fa\u0005\u007f\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fb\u040d\u0005L\u0000\u0000\u03fc\u03fe\u0005\u000b\u0000\u0000"+
		"\u03fd\u03ff\u0005\u007f\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000"+
		"\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000"+
		"\u0400\u040d\u0005L\u0000\u0000\u0401\u0402\u0005>\u0000\u0000\u0402\u0403"+
		"\u0003\u00a8T\u0000\u0403\u0404\u0005L\u0000\u0000\u0404\u040d\u0001\u0000"+
		"\u0000\u0000\u0405\u040d\u0005L\u0000\u0000\u0406\u0407\u0003\u00a6S\u0000"+
		"\u0407\u0408\u0005L\u0000\u0000\u0408\u040d\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0005\u007f\u0000\u0000\u040a\u040b\u0005R\u0000\u0000\u040b\u040d"+
		"\u0003\u0088D\u0000\u040c\u03a6\u0001\u0000\u0000\u0000\u040c\u03a7\u0001"+
		"\u0000\u0000\u0000\u040c\u03af\u0001\u0000\u0000\u0000\u040c\u03b8\u0001"+
		"\u0000\u0000\u0000\u040c\u03be\u0001\u0000\u0000\u0000\u040c\u03c4\u0001"+
		"\u0000\u0000\u0000\u040c\u03cc\u0001\u0000\u0000\u0000\u040c\u03db\u0001"+
		"\u0000\u0000\u0000\u040c\u03e8\u0001\u0000\u0000\u0000\u040c\u03ee\u0001"+
		"\u0000\u0000\u0000\u040c\u03f3\u0001\u0000\u0000\u0000\u040c\u03f7\u0001"+
		"\u0000\u0000\u0000\u040c\u03fc\u0001\u0000\u0000\u0000\u040c\u0401\u0001"+
		"\u0000\u0000\u0000\u040c\u0405\u0001\u0000\u0000\u0000\u040c\u0406\u0001"+
		"\u0000\u0000\u0000\u040c\u0409\u0001\u0000\u0000\u0000\u040d\u0089\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0003\u0084B\u0000\u040f\u0410\u0005L\u0000"+
		"\u0000\u0410\u008b\u0001\u0000\u0000\u0000\u0411\u041e\u0003\u008eG\u0000"+
		"\u0412\u0414\u0003\u0090H\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0413"+
		"\u0414\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415"+
		"\u0417\u0005L\u0000\u0000\u0416\u0418\u0003\u00a8T\u0000\u0417\u0416\u0001"+
		"\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0001"+
		"\u0000\u0000\u0000\u0419\u041b\u0005L\u0000\u0000\u041a\u041c\u0003\u0092"+
		"I\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000"+
		"\u0000\u041c\u041e\u0001\u0000\u0000\u0000\u041d\u0411\u0001\u0000\u0000"+
		"\u0000\u041d\u0413\u0001\u0000\u0000\u0000\u041e\u008d\u0001\u0000\u0000"+
		"\u0000\u041f\u0421\u0003L&\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421"+
		"\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422"+
		"\u0423\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424"+
		"\u0422\u0001\u0000\u0000\u0000\u0425\u0426\u0003\u0086C\u0000\u0426\u0427"+
		"\u0003R)\u0000\u0427\u0428\u0005R\u0000\u0000\u0428\u0429\u0003\u00a8"+
		"T\u0000\u0429\u008f\u0001\u0000\u0000\u0000\u042a\u042d\u0003\u0084B\u0000"+
		"\u042b\u042d\u0003\u0092I\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c"+
		"\u042b\u0001\u0000\u0000\u0000\u042d\u0091\u0001\u0000\u0000\u0000\u042e"+
		"\u0433\u0003\u00a6S\u0000\u042f\u0430\u0005M\u0000\u0000\u0430\u0432\u0003"+
		"\u00a6S\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u0435\u0001\u0000"+
		"\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000"+
		"\u0000\u0000\u0434\u0093\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000"+
		"\u0000\u0000\u0436\u0437\u0005F\u0000\u0000\u0437\u0439\u0003\u0096K\u0000"+
		"\u0438\u043a\u0005L\u0000\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u0439"+
		"\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b"+
		"\u043c\u0005G\u0000\u0000\u043c\u0095\u0001\u0000\u0000\u0000\u043d\u0442"+
		"\u0003\u0098L\u0000\u043e\u043f\u0005L\u0000\u0000\u043f\u0441\u0003\u0098"+
		"L\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000\u0000"+
		"\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000"+
		"\u0000\u0443\u0097\u0001\u0000\u0000\u0000\u0444\u0442\u0001\u0000\u0000"+
		"\u0000\u0445\u0447\u0003L&\u0000\u0446\u0445\u0001\u0000\u0000\u0000\u0447"+
		"\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0001\u0000\u0000\u0000\u0449\u044b\u0001\u0000\u0000\u0000\u044a"+
		"\u0448\u0001\u0000\u0000\u0000\u044b\u044c\u0003\u0086C\u0000\u044c\u044d"+
		"\u0003R)\u0000\u044d\u044e\u0005k\u0000\u0000\u044e\u044f\u0003\u00a8"+
		"T\u0000\u044f\u0452\u0001\u0000\u0000\u0000\u0450\u0452\u0003n7\u0000"+
		"\u0451\u0448\u0001\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000"+
		"\u0452\u0099\u0001\u0000\u0000\u0000\u0453\u0454\u0005\u0007\u0000\u0000"+
		"\u0454\u0455\u0005F\u0000\u0000\u0455\u0456\u0003\u009cN\u0000\u0456\u0457"+
		"\u0005G\u0000\u0000\u0457\u0458\u0003~?\u0000\u0458\u009b\u0001\u0000"+
		"\u0000\u0000\u0459\u045b\u0003L&\u0000\u045a\u0459\u0001\u0000\u0000\u0000"+
		"\u045b\u045e\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000"+
		"\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045f\u0001\u0000\u0000\u0000"+
		"\u045e\u045c\u0001\u0000\u0000\u0000\u045f\u0460\u0003\u009eO\u0000\u0460"+
		"\u0461\u0005\u007f\u0000\u0000\u0461\u009d\u0001\u0000\u0000\u0000\u0462"+
		"\u0467\u0003n7\u0000\u0463\u0464\u0005u\u0000\u0000\u0464\u0466\u0003"+
		"n7\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0001\u0000\u0000"+
		"\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000"+
		"\u0000\u0468\u009f\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000"+
		"\u0000\u046a\u046c\u0003\u00a2Q\u0000\u046b\u046a\u0001\u0000\u0000\u0000"+
		"\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000\u0000"+
		"\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0472\u0001\u0000\u0000\u0000"+
		"\u046f\u0471\u0003\u0080@\u0000\u0470\u046f\u0001\u0000\u0000\u0000\u0471"+
		"\u0474\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000\u0000\u0000\u0472"+
		"\u0473\u0001\u0000\u0000\u0000\u0473\u00a1\u0001\u0000\u0000\u0000\u0474"+
		"\u0472\u0001\u0000\u0000\u0000\u0475\u0480\u0005\u0006\u0000\u0000\u0476"+
		"\u047b\u0003\u00a4R\u0000\u0477\u0478\u0005M\u0000\u0000\u0478\u047a\u0003"+
		"\u00a4R\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u047a\u047d\u0001\u0000"+
		"\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000"+
		"\u0000\u0000\u047c\u0481\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000"+
		"\u0000\u0000\u047e\u0481\u0005C\u0000\u0000\u047f\u0481\u0005\f\u0000"+
		"\u0000\u0480\u0476\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000\u0000"+
		"\u0000\u0480\u047f\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000"+
		"\u0000\u0482\u0486\u0005R\u0000\u0000\u0483\u0484\u0005\f\u0000\u0000"+
		"\u0484\u0486\u0005R\u0000\u0000\u0485\u0475\u0001\u0000\u0000\u0000\u0485"+
		"\u0483\u0001\u0000\u0000\u0000\u0486\u00a3\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0003\u00a8T\u0000\u0488\u00a5\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0003\u00a8T\u0000\u048a\u00a7\u0001\u0000\u0000\u0000\u048b\u048e\u0003"+
		"\u00aaU\u0000\u048c\u048e\u0003\u00b0X\u0000\u048d\u048b\u0001\u0000\u0000"+
		"\u0000\u048d\u048c\u0001\u0000\u0000\u0000\u048e\u00a9\u0001\u0000\u0000"+
		"\u0000\u048f\u0490\u0003\u00acV\u0000\u0490\u0493\u0005T\u0000\u0000\u0491"+
		"\u0494\u0003\u00a8T\u0000\u0492\u0494\u0003~?\u0000\u0493\u0491\u0001"+
		"\u0000\u0000\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0494\u00ab\u0001"+
		"\u0000\u0000\u0000\u0495\u04a1\u0005\u007f\u0000\u0000\u0496\u0498\u0005"+
		"F\u0000\u0000\u0497\u0499\u0003D\"\u0000\u0498\u0497\u0001\u0000\u0000"+
		"\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000"+
		"\u0000\u049a\u04a1\u0005G\u0000\u0000\u049b\u049d\u0005F\u0000\u0000\u049c"+
		"\u049e\u0003\u00aeW\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049d\u049e"+
		"\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04a1"+
		"\u0005G\u0000\u0000\u04a0\u0495\u0001\u0000\u0000\u0000\u04a0\u0496\u0001"+
		"\u0000\u0000\u0000\u04a0\u049b\u0001\u0000\u0000\u0000\u04a1\u00ad\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a7\u0005\u007f\u0000\u0000\u04a3\u04a4\u0005"+
		"M\u0000\u0000\u04a4\u04a6\u0005\u007f\u0000\u0000\u04a5\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000\u04a7\u04a5\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u00af\u0001\u0000"+
		"\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa\u04ae\u0003\u00b4"+
		"Z\u0000\u04ab\u04ac\u0003\u00b2Y\u0000\u04ac\u04ad\u0003\u00a8T\u0000"+
		"\u04ad\u04af\u0001\u0000\u0000\u0000\u04ae\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u00b1\u0001\u0000\u0000\u0000"+
		"\u04b0\u04b1\u0007\u0003\u0000\u0000\u04b1\u00b3\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b8\u0003\u00b6[\u0000\u04b3\u04b4\u0005S\u0000\u0000\u04b4\u04b5"+
		"\u0003\u00a8T\u0000\u04b5\u04b6\u0005R\u0000\u0000\u04b6\u04b7\u0003\u00b4"+
		"Z\u0000\u04b7\u04b9\u0001\u0000\u0000\u0000\u04b8\u04b3\u0001\u0000\u0000"+
		"\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u00b5\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bf\u0003\u00b8\\\u0000\u04bb\u04bc\u0005j\u0000\u0000"+
		"\u04bc\u04be\u0003\u00b8\\\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04be"+
		"\u04c1\u0001\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04bf"+
		"\u04c0\u0001\u0000\u0000\u0000\u04c0\u00b7\u0001\u0000\u0000\u0000\u04c1"+
		"\u04bf\u0001\u0000\u0000\u0000\u04c2\u04c7\u0003\u00ba]\u0000\u04c3\u04c4"+
		"\u0005i\u0000\u0000\u04c4\u04c6\u0003\u00ba]\u0000\u04c5\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c9\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u00b9\u0001\u0000"+
		"\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04ca\u04cf\u0003\u00bc"+
		"^\u0000\u04cb\u04cc\u0005u\u0000\u0000\u04cc\u04ce\u0003\u00bc^\u0000"+
		"\u04cd\u04cb\u0001\u0000\u0000\u0000\u04ce\u04d1\u0001\u0000\u0000\u0000"+
		"\u04cf\u04cd\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d0\u00bb\u0001\u0000\u0000\u0000\u04d1\u04cf\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d7\u0003\u00be_\u0000\u04d3\u04d4\u0005v\u0000\u0000\u04d4\u04d6"+
		"\u0003\u00be_\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d9\u0001"+
		"\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d7\u04d8\u0001"+
		"\u0000\u0000\u0000\u04d8\u00bd\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001"+
		"\u0000\u0000\u0000\u04da\u04df\u0003\u00c0`\u0000\u04db\u04dc\u0005t\u0000"+
		"\u0000\u04dc\u04de\u0003\u00c0`\u0000\u04dd\u04db\u0001\u0000\u0000\u0000"+
		"\u04de\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000"+
		"\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u00bf\u0001\u0000\u0000\u0000"+
		"\u04e1\u04df\u0001\u0000\u0000\u0000\u04e2\u04e7\u0003\u00c2a\u0000\u04e3"+
		"\u04e4\u0007\u0004\u0000\u0000\u04e4\u04e6\u0003\u00c2a\u0000\u04e5\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u00c1"+
		"\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea\u04f1"+
		"\u0003\u00c6c\u0000\u04eb\u04ec\u0007\u0005\u0000\u0000\u04ec\u04f0\u0003"+
		"\u00c6c\u0000\u04ed\u04ee\u0005\u001a\u0000\u0000\u04ee\u04f0\u0003\u00c4"+
		"b\u0000\u04ef\u04eb\u0001\u0000\u0000\u0000\u04ef\u04ed\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f3\u0001\u0000\u0000\u0000\u04f1\u04ef\u0001\u0000\u0000"+
		"\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u00c3\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f1\u0001\u0000\u0000\u0000\u04f4\u04f6\u0003Z-\u0000\u04f5"+
		"\u04f7\u0005\u007f\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f7\u00c5\u0001\u0000\u0000\u0000\u04f8"+
		"\u04fd\u0003\u00c8d\u0000\u04f9\u04fa\u0007\u0006\u0000\u0000\u04fa\u04fc"+
		"\u0003\u00c8d\u0000\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fc\u04ff\u0001"+
		"\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001"+
		"\u0000\u0000\u0000\u04fe\u00c7\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001"+
		"\u0000\u0000\u0000\u0500\u0505\u0003\u00cae\u0000\u0501\u0502\u0007\u0007"+
		"\u0000\u0000\u0502\u0504\u0003\u00cae\u0000\u0503\u0501\u0001\u0000\u0000"+
		"\u0000\u0504\u0507\u0001\u0000\u0000\u0000\u0505\u0503\u0001\u0000\u0000"+
		"\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u00c9\u0001\u0000\u0000"+
		"\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0508\u050d\u0003\u00ccf\u0000"+
		"\u0509\u050a\u0007\b\u0000\u0000\u050a\u050c\u0003\u00ccf\u0000\u050b"+
		"\u0509\u0001\u0000\u0000\u0000\u050c\u050f\u0001\u0000\u0000\u0000\u050d"+
		"\u050b\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e"+
		"\u00cb\u0001\u0000\u0000\u0000\u050f\u050d\u0001\u0000\u0000\u0000\u0510"+
		"\u0511\u0007\t\u0000\u0000\u0511\u0519\u0003\u00ccf\u0000\u0512\u0513"+
		"\u0005F\u0000\u0000\u0513\u0514\u0003Z-\u0000\u0514\u0515\u0005G\u0000"+
		"\u0000\u0515\u0516\u0003\u00ccf\u0000\u0516\u0519\u0001\u0000\u0000\u0000"+
		"\u0517\u0519\u0003\u00ceg\u0000\u0518\u0510\u0001\u0000\u0000\u0000\u0518"+
		"\u0512\u0001\u0000\u0000\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0519"+
		"\u00cd\u0001\u0000\u0000\u0000\u051a\u0520\u0003\u00d2i\u0000\u051b\u051f"+
		"\u0003\u00d0h\u0000\u051c\u051f\u0005c\u0000\u0000\u051d\u051f\u0005d"+
		"\u0000\u0000\u051e\u051b\u0001\u0000\u0000\u0000\u051e\u051c\u0001\u0000"+
		"\u0000\u0000\u051e\u051d\u0001\u0000\u0000\u0000\u051f\u0522\u0001\u0000"+
		"\u0000\u0000\u0520\u051e\u0001\u0000\u0000\u0000\u0520\u0521\u0001\u0000"+
		"\u0000\u0000\u0521\u00cf\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000"+
		"\u0000\u0000\u0523\u0524\u0005N\u0000\u0000\u0524\u0526\u0005\u007f\u0000"+
		"\u0000\u0525\u0527\u0003\u00deo\u0000\u0526\u0525\u0001\u0000\u0000\u0000"+
		"\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u0538\u0001\u0000\u0000\u0000"+
		"\u0528\u0529\u0005N\u0000\u0000\u0529\u0538\u0005+\u0000\u0000\u052a\u052b"+
		"\u0005N\u0000\u0000\u052b\u0538\u0005(\u0000\u0000\u052c\u052d\u0005N"+
		"\u0000\u0000\u052d\u052f\u0005\u001f\u0000\u0000\u052e\u0530\u0003`0\u0000"+
		"\u052f\u052e\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000"+
		"\u0530\u0531\u0001\u0000\u0000\u0000\u0531\u0538\u0003\u00dam\u0000\u0532"+
		"\u0533\u0005J\u0000\u0000\u0533\u0534\u0003\u00a8T\u0000\u0534\u0535\u0005"+
		"K\u0000\u0000\u0535\u0538\u0001\u0000\u0000\u0000\u0536\u0538\u0003\u00de"+
		"o\u0000\u0537\u0523\u0001\u0000\u0000\u0000\u0537\u0528\u0001\u0000\u0000"+
		"\u0000\u0537\u052a\u0001\u0000\u0000\u0000\u0537\u052c\u0001\u0000\u0000"+
		"\u0000\u0537\u0532\u0001\u0000\u0000\u0000\u0537\u0536\u0001\u0000\u0000"+
		"\u0000\u0538\u00d1\u0001\u0000\u0000\u0000\u0539\u054c\u0003\u00e0p\u0000"+
		"\u053a\u054c\u0005+\u0000\u0000\u053b\u054c\u0005(\u0000\u0000\u053c\u054c"+
		"\u0005\u007f\u0000\u0000\u053d\u053e\u0005F\u0000\u0000\u053e\u053f\u0003"+
		"\u00a8T\u0000\u053f\u0540\u0005G\u0000\u0000\u0540\u054c\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0005\u001f\u0000\u0000\u0542\u054c\u0003\u00d4j\u0000"+
		"\u0543\u0544\u0003Z-\u0000\u0544\u0545\u0005N\u0000\u0000\u0545\u0546"+
		"\u0005\t\u0000\u0000\u0546\u054c\u0001\u0000\u0000\u0000\u0547\u0548\u0005"+
		"0\u0000\u0000\u0548\u0549\u0005N\u0000\u0000\u0549\u054c\u0005\t\u0000"+
		"\u0000\u054a\u054c\u0003n7\u0000\u054b\u0539\u0001\u0000\u0000\u0000\u054b"+
		"\u053a\u0001\u0000\u0000\u0000\u054b\u053b\u0001\u0000\u0000\u0000\u054b"+
		"\u053c\u0001\u0000\u0000\u0000\u054b\u053d\u0001\u0000\u0000\u0000\u054b"+
		"\u0541\u0001\u0000\u0000\u0000\u054b\u0543\u0001\u0000\u0000\u0000\u054b"+
		"\u0547\u0001\u0000\u0000\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054c"+
		"\u00d3\u0001\u0000\u0000\u0000\u054d\u054f\u0003`0\u0000\u054e\u054d\u0001"+
		"\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0001"+
		"\u0000\u0000\u0000\u0550\u0553\u0003\u00d6k\u0000\u0551\u0553\u0003^/"+
		"\u0000\u0552\u054e\u0001\u0000\u0000\u0000\u0552\u0551\u0001\u0000\u0000"+
		"\u0000\u0553\u0559\u0001\u0000\u0000\u0000\u0554\u0556\u0003\u00deo\u0000"+
		"\u0555\u0557\u0003 \u0010\u0000\u0556\u0555\u0001\u0000\u0000\u0000\u0556"+
		"\u0557\u0001\u0000\u0000\u0000\u0557\u055a\u0001\u0000\u0000\u0000\u0558"+
		"\u055a\u0003\u00dcn\u0000\u0559\u0554\u0001\u0000\u0000\u0000\u0559\u0558"+
		"\u0001\u0000\u0000\u0000\u055a\u00d5\u0001\u0000\u0000\u0000\u055b\u055d"+
		"\u0005\u007f\u0000\u0000\u055c\u055e\u0003\u00d8l\u0000\u055d\u055c\u0001"+
		"\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e\u0566\u0001"+
		"\u0000\u0000\u0000\u055f\u0560\u0005N\u0000\u0000\u0560\u0562\u0005\u007f"+
		"\u0000\u0000\u0561\u0563\u0003\u00d8l\u0000\u0562\u0561\u0001\u0000\u0000"+
		"\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0565\u0001\u0000\u0000"+
		"\u0000\u0564\u055f\u0001\u0000\u0000\u0000\u0565\u0568\u0001\u0000\u0000"+
		"\u0000\u0566\u0564\u0001\u0000\u0000\u0000\u0566\u0567\u0001\u0000\u0000"+
		"\u0000\u0567\u00d7\u0001\u0000\u0000\u0000\u0568\u0566\u0001\u0000\u0000"+
		"\u0000\u0569\u056a\u0005m\u0000\u0000\u056a\u056d\u0005l\u0000\u0000\u056b"+
		"\u056d\u0003`0\u0000\u056c\u0569\u0001\u0000\u0000\u0000\u056c\u056b\u0001"+
		"\u0000\u0000\u0000\u056d\u00d9\u0001\u0000\u0000\u0000\u056e\u0570\u0005"+
		"\u007f\u0000\u0000\u056f\u0571\u0003\u00d8l\u0000\u0570\u056f\u0001\u0000"+
		"\u0000\u0000\u0570\u0571\u0001\u0000\u0000\u0000\u0571\u0576\u0001\u0000"+
		"\u0000\u0000\u0572\u0574\u0003\u00deo\u0000\u0573\u0575\u0003 \u0010\u0000"+
		"\u0574\u0573\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000"+
		"\u0575\u0577\u0001\u0000\u0000\u0000\u0576\u0572\u0001\u0000\u0000\u0000"+
		"\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u00db\u0001\u0000\u0000\u0000"+
		"\u0578\u0579\u0005J\u0000\u0000\u0579\u057a\u0003\u00a8T\u0000\u057a\u057b"+
		"\u0005K\u0000\u0000\u057b\u057d\u0001\u0000\u0000\u0000\u057c\u0578\u0001"+
		"\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u057c\u0001"+
		"\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0581\u0001"+
		"\u0000\u0000\u0000\u0580\u0582\u0003p8\u0000\u0581\u0580\u0001\u0000\u0000"+
		"\u0000\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u0587\u0001\u0000\u0000"+
		"\u0000\u0583\u0584\u0003p8\u0000\u0584\u0585\u0003V+\u0000\u0585\u0587"+
		"\u0001\u0000\u0000\u0000\u0586\u057c\u0001\u0000\u0000\u0000\u0586\u0583"+
		"\u0001\u0000\u0000\u0000\u0587\u00dd\u0001\u0000\u0000\u0000\u0588\u058a"+
		"\u0005F\u0000\u0000\u0589\u058b\u0003\u0092I\u0000\u058a\u0589\u0001\u0000"+
		"\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058c\u0001\u0000"+
		"\u0000\u0000\u058c\u058d\u0005G\u0000\u0000\u058d\u00df\u0001\u0000\u0000"+
		"\u0000\u058e\u058f\u0007\n\u0000\u0000\u058f\u00e1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00e3\u00e8\u00ed\u00ef\u00f7\u0100\u0105\u010e\u0113\u0119\u011d"+
		"\u0121\u0125\u012c\u0132\u0136\u013a\u0141\u0148\u014c\u014f\u0154\u015e"+
		"\u0164\u0169\u016c\u0171\u017d\u0185\u018e\u0196\u019b\u01a1\u01a6\u01ac"+
		"\u01b5\u01bb\u01c0\u01c8\u01d1\u01d8\u01de\u01e2\u01e8\u01f2\u01f4\u0200"+
		"\u020f\u0219\u021d\u0221\u0225\u022a\u022e\u0232\u0236\u023d\u0242\u024d"+
		"\u0252\u0258\u025f\u0264\u026a\u0271\u0278\u027d\u0280\u0285\u028b\u0292"+
		"\u029b\u02a4\u02ab\u02b1\u02b5\u02b9\u02c1\u02c5\u02c7\u02cd\u02d2\u02d7"+
		"\u02da\u02de\u02e4\u02e9\u02ed\u02fb\u0302\u0304\u030c\u0314\u031e\u0321"+
		"\u0328\u0330\u0338\u033e\u0345\u0356\u035d\u0360\u0367\u0371\u0379\u037d"+
		"\u037f\u0387\u0391\u0397\u039c\u03a4\u03ab\u03b6\u03ce\u03d4\u03d9\u03e3"+
		"\u03f0\u03f9\u03fe\u040c\u0413\u0417\u041b\u041d\u0422\u042c\u0433\u0439"+
		"\u0442\u0448\u0451\u045c\u0467\u046d\u0472\u047b\u0480\u0485\u048d\u0493"+
		"\u0498\u049d\u04a0\u04a7\u04ae\u04b8\u04bf\u04c7\u04cf\u04d7\u04df\u04e7"+
		"\u04ef\u04f1\u04f6\u04fd\u0505\u050d\u0518\u051e\u0520\u0526\u052f\u0537"+
		"\u054b\u054e\u0552\u0556\u0559\u055d\u0562\u0566\u056c\u0570\u0574\u0576"+
		"\u057e\u0581\u0586\u058a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}