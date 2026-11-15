// Generated from SpringJavaParser.g4 by ANTLR 4.13.2
package springjava;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SpringJavaParser extends Parser {
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
		WHILE=50, VAR=51, YIELD=52, RECORD=53, SEALED=54, PERMITS=55, NON_SEALED=56, 
		NULL=57, TRUE=58, FALSE=59, LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, 
		LBRACK=64, RBRACK=65, SEMI=66, COMMA=67, DOT=68, ELLIPSIS=69, AT=70, COLONCOLON=71, 
		COLON=72, QUESTION=73, ARROW=74, LSHIFT_ASSIGN=75, ADD_ASSIGN=76, SUB_ASSIGN=77, 
		MUL_ASSIGN=78, DIV_ASSIGN=79, AND_ASSIGN=80, OR_ASSIGN=81, XOR_ASSIGN=82, 
		MOD_ASSIGN=83, LSHIFT=84, INC=85, DEC=86, EQUAL=87, NOTEQUAL=88, LE=89, 
		GE=90, AND=91, OR=92, ASSIGN=93, GT=94, LT=95, NOT=96, TILDE=97, ADD=98, 
		SUB=99, MUL=100, DIV=101, BITAND=102, BITOR=103, CARET=104, MOD=105, FloatingPointLiteral=106, 
		IntegerLiteral=107, CharacterLiteral=108, TextBlock=109, StringLiteral=110, 
		SPRING_SPRING_BOOT_APPLICATION=111, SPRING_ENABLE_AUTO_CONFIGURATION=112, 
		SPRING_COMPONENT_SCAN=113, SPRING_CONFIGURATION=114, SPRING_BEAN=115, 
		SPRING_COMPONENT=116, SPRING_SERVICE=117, SPRING_REPOSITORY=118, SPRING_CONTROLLER=119, 
		SPRING_REST_CONTROLLER=120, SPRING_AUTOWIRED=121, SPRING_QUALIFIER=122, 
		SPRING_PRIMARY=123, SPRING_LAZY=124, SPRING_VALUE=125, SPRING_SCOPE=126, 
		SPRING_DEPENDS_ON=127, SPRING_REQUEST_MAPPING=128, SPRING_GET_MAPPING=129, 
		SPRING_POST_MAPPING=130, SPRING_PUT_MAPPING=131, SPRING_PATCH_MAPPING=132, 
		SPRING_DELETE_MAPPING=133, SPRING_REQUEST_PARAM=134, SPRING_PATH_VARIABLE=135, 
		SPRING_REQUEST_BODY=136, SPRING_RESPONSE_BODY=137, SPRING_MODEL_ATTRIBUTE=138, 
		SPRING_REQUEST_HEADER=139, SPRING_COOKIE_VALUE=140, SPRING_SESSION_ATTRIBUTE=141, 
		SPRING_REQUEST_ATTRIBUTE=142, SPRING_MATRIX_VARIABLE=143, SPRING_CROSS_ORIGIN=144, 
		SPRING_EXCEPTION_HANDLER=145, SPRING_CONTROLLER_ADVICE=146, SPRING_REST_CONTROLLER_ADVICE=147, 
		SPRING_INIT_BINDER=148, SPRING_RESPONSE_STATUS=149, SPRING_VALIDATED=150, 
		SPRING_VALID=151, SPRING_TRANSACTIONAL=152, SPRING_ASYNC=153, SPRING_SCHEDULED=154, 
		SPRING_ENABLE_SCHEDULING=155, SPRING_CACHEABLE=156, SPRING_CACHE_PUT=157, 
		SPRING_CACHE_EVICT=158, SPRING_ENABLE_CACHING=159, SPRING_PROFILE=160, 
		SPRING_PROPERTY_SOURCE=161, SPRING_IMPORT=162, SPRING_IMPORT_RESOURCE=163, 
		SPRING_CONFIGURATION_PROPERTIES=164, SPRING_ENABLE_CONFIGURATION_PROPERTIES=165, 
		SPRING_CONDITIONAL_ON_PROPERTY=166, SPRING_CONDITIONAL_ON_CLASS=167, SPRING_CONDITIONAL_ON_MISSING_BEAN=168, 
		SPRING_SPRING_BOOT_TEST=169, SPRING_WEB_MVC_TEST=170, SPRING_DATA_JPA_TEST=171, 
		SPRING_MOCK_BEAN=172, SPRING_TEST_CONFIGURATION=173, SPRING_ORDER=174, 
		SPRING_PRE_AUTHORIZE=175, SPRING_SECURED=176, SPRING_ENABLE_METHOD_SECURITY=177, 
		SPRING_ENABLE_WEB_SECURITY=178, SPRING_ENABLE_GLOBAL_METHOD_SECURITY=179, 
		Identifier=180, LINE_COMMENT=181, BLOCK_COMMENT=182, WS=183;
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
		RULE_primitiveType = 47, RULE_typeArguments = 48, RULE_typeArgumentsOrDiamond = 49, 
		RULE_typeArgumentList = 50, RULE_typeArgument = 51, RULE_typeParameters = 52, 
		RULE_typeParameter = 53, RULE_typeList = 54, RULE_qualifiedNameList = 55, 
		RULE_qualifiedName = 56, RULE_identifier = 57, RULE_dims = 58, RULE_modifier = 59, 
		RULE_annotation = 60, RULE_springAnnotationName = 61, RULE_elementValuePairs = 62, 
		RULE_elementValuePair = 63, RULE_elementValue = 64, RULE_elementValueArrayInitializer = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localTypeDeclaration = 68, 
		RULE_localVariableDeclaration = 69, RULE_localVariableType = 70, RULE_statement = 71, 
		RULE_localVariableDeclarationStatement = 72, RULE_forControl = 73, RULE_enhancedForControl = 74, 
		RULE_forInit = 75, RULE_expressionList = 76, RULE_resourceSpecification = 77, 
		RULE_resourceList = 78, RULE_resource = 79, RULE_catchClause = 80, RULE_catchFormalParameter = 81, 
		RULE_catchType = 82, RULE_switchBlockStatementGroup = 83, RULE_switchLabel = 84, 
		RULE_constantExpression = 85, RULE_statementExpression = 86, RULE_expression = 87, 
		RULE_lambdaExpression = 88, RULE_lambdaParameters = 89, RULE_inferredFormalParameterList = 90, 
		RULE_assignmentExpression = 91, RULE_assignmentOperator = 92, RULE_conditionalExpression = 93, 
		RULE_conditionalOrExpression = 94, RULE_conditionalAndExpression = 95, 
		RULE_inclusiveOrExpression = 96, RULE_exclusiveOrExpression = 97, RULE_andExpression = 98, 
		RULE_equalityExpression = 99, RULE_relationalExpression = 100, RULE_patternOrType = 101, 
		RULE_shiftExpression = 102, RULE_shiftOp = 103, RULE_additiveExpression = 104, 
		RULE_multiplicativeExpression = 105, RULE_unaryExpression = 106, RULE_postfixExpression = 107, 
		RULE_selector = 108, RULE_primary = 109, RULE_creator = 110, RULE_createdName = 111, 
		RULE_innerCreator = 112, RULE_arrayCreatorRest = 113, RULE_arguments = 114, 
		RULE_springApplicationUnit = 115, RULE_springAnnotatedTypeDeclaration = 116, 
		RULE_springControllerClass = 117, RULE_springControllerMethod = 118, RULE_springBeanMethod = 119, 
		RULE_springDependencyInjectionField = 120, RULE_springRequestMapping = 121, 
		RULE_springRequestParameter = 122, RULE_springConfigurationClass = 123, 
		RULE_literal = 124;
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
			"classOrInterfaceType", "primitiveType", "typeArguments", "typeArgumentsOrDiamond", 
			"typeArgumentList", "typeArgument", "typeParameters", "typeParameter", 
			"typeList", "qualifiedNameList", "qualifiedName", "identifier", "dims", 
			"modifier", "annotation", "springAnnotationName", "elementValuePairs", 
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
			"patternOrType", "shiftExpression", "shiftOp", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "postfixExpression", "selector", 
			"primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"arguments", "springApplicationUnit", "springAnnotatedTypeDeclaration", 
			"springControllerClass", "springControllerMethod", "springBeanMethod", 
			"springDependencyInjectionField", "springRequestMapping", "springRequestParameter", 
			"springConfigurationClass", "literal"
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
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'var'", "'yield'", 
			"'record'", "'sealed'", "'permits'", "'non-sealed'", "'null'", "'true'", 
			"'false'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'...'", "'@'", "'::'", "':'", "'?'", "'->'", "'<<='", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<'", "'++'", "'--'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'='", "'>'", "'<'", 
			"'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			null, null, null, null, null, "'SpringBootApplication'", "'EnableAutoConfiguration'", 
			"'ComponentScan'", "'Configuration'", "'Bean'", "'Component'", "'Service'", 
			"'Repository'", "'Controller'", "'RestController'", "'Autowired'", "'Qualifier'", 
			"'Primary'", "'Lazy'", "'Value'", "'Scope'", "'DependsOn'", "'RequestMapping'", 
			"'GetMapping'", "'PostMapping'", "'PutMapping'", "'PatchMapping'", "'DeleteMapping'", 
			"'RequestParam'", "'PathVariable'", "'RequestBody'", "'ResponseBody'", 
			"'ModelAttribute'", "'RequestHeader'", "'CookieValue'", "'SessionAttribute'", 
			"'RequestAttribute'", "'MatrixVariable'", "'CrossOrigin'", "'ExceptionHandler'", 
			"'ControllerAdvice'", "'RestControllerAdvice'", "'InitBinder'", "'ResponseStatus'", 
			"'Validated'", "'Valid'", "'Transactional'", "'Async'", "'Scheduled'", 
			"'EnableScheduling'", "'Cacheable'", "'CachePut'", "'CacheEvict'", "'EnableCaching'", 
			"'Profile'", "'PropertySource'", "'Import'", "'ImportResource'", "'ConfigurationProperties'", 
			"'EnableConfigurationProperties'", "'ConditionalOnProperty'", "'ConditionalOnClass'", 
			"'ConditionalOnMissingBean'", "'SpringBootTest'", "'WebMvcTest'", "'DataJpaTest'", 
			"'MockBean'", "'TestConfiguration'", "'Order'", "'PreAuthorize'", "'Secured'", 
			"'EnableMethodSecurity'", "'EnableWebSecurity'", "'EnableGlobalMethodSecurity'"
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
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "VAR", "YIELD", 
			"RECORD", "SEALED", "PERMITS", "NON_SEALED", "NULL", "TRUE", "FALSE", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ELLIPSIS", "AT", "COLONCOLON", "COLON", "QUESTION", "ARROW", 
			"LSHIFT_ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT", "INC", 
			"DEC", "EQUAL", "NOTEQUAL", "LE", "GE", "AND", "OR", "ASSIGN", "GT", 
			"LT", "NOT", "TILDE", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "FloatingPointLiteral", "IntegerLiteral", "CharacterLiteral", 
			"TextBlock", "StringLiteral", "SPRING_SPRING_BOOT_APPLICATION", "SPRING_ENABLE_AUTO_CONFIGURATION", 
			"SPRING_COMPONENT_SCAN", "SPRING_CONFIGURATION", "SPRING_BEAN", "SPRING_COMPONENT", 
			"SPRING_SERVICE", "SPRING_REPOSITORY", "SPRING_CONTROLLER", "SPRING_REST_CONTROLLER", 
			"SPRING_AUTOWIRED", "SPRING_QUALIFIER", "SPRING_PRIMARY", "SPRING_LAZY", 
			"SPRING_VALUE", "SPRING_SCOPE", "SPRING_DEPENDS_ON", "SPRING_REQUEST_MAPPING", 
			"SPRING_GET_MAPPING", "SPRING_POST_MAPPING", "SPRING_PUT_MAPPING", "SPRING_PATCH_MAPPING", 
			"SPRING_DELETE_MAPPING", "SPRING_REQUEST_PARAM", "SPRING_PATH_VARIABLE", 
			"SPRING_REQUEST_BODY", "SPRING_RESPONSE_BODY", "SPRING_MODEL_ATTRIBUTE", 
			"SPRING_REQUEST_HEADER", "SPRING_COOKIE_VALUE", "SPRING_SESSION_ATTRIBUTE", 
			"SPRING_REQUEST_ATTRIBUTE", "SPRING_MATRIX_VARIABLE", "SPRING_CROSS_ORIGIN", 
			"SPRING_EXCEPTION_HANDLER", "SPRING_CONTROLLER_ADVICE", "SPRING_REST_CONTROLLER_ADVICE", 
			"SPRING_INIT_BINDER", "SPRING_RESPONSE_STATUS", "SPRING_VALIDATED", "SPRING_VALID", 
			"SPRING_TRANSACTIONAL", "SPRING_ASYNC", "SPRING_SCHEDULED", "SPRING_ENABLE_SCHEDULING", 
			"SPRING_CACHEABLE", "SPRING_CACHE_PUT", "SPRING_CACHE_EVICT", "SPRING_ENABLE_CACHING", 
			"SPRING_PROFILE", "SPRING_PROPERTY_SOURCE", "SPRING_IMPORT", "SPRING_IMPORT_RESOURCE", 
			"SPRING_CONFIGURATION_PROPERTIES", "SPRING_ENABLE_CONFIGURATION_PROPERTIES", 
			"SPRING_CONDITIONAL_ON_PROPERTY", "SPRING_CONDITIONAL_ON_CLASS", "SPRING_CONDITIONAL_ON_MISSING_BEAN", 
			"SPRING_SPRING_BOOT_TEST", "SPRING_WEB_MVC_TEST", "SPRING_DATA_JPA_TEST", 
			"SPRING_MOCK_BEAN", "SPRING_TEST_CONFIGURATION", "SPRING_ORDER", "SPRING_PRE_AUTHORIZE", 
			"SPRING_SECURED", "SPRING_ENABLE_METHOD_SECURITY", "SPRING_ENABLE_WEB_SECURITY", 
			"SPRING_ENABLE_GLOBAL_METHOD_SECURITY", "Identifier", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "SpringJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpringJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpringJavaParser.EOF, 0); }
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
		public List<TerminalNode> SEMI() { return getTokens(SpringJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SpringJavaParser.SEMI, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(250);
				packageDeclaration();
				}
				break;
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(253);
				importDeclaration();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99717794652033538L) != 0) || _la==SEMI || _la==AT) {
				{
				setState(261);
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
					setState(259);
					typeDeclaration();
					}
					break;
				case SEMI:
					{
					setState(260);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
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
		public TerminalNode PACKAGE() { return getToken(SpringJavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
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
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(268);
				annotation();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(PACKAGE);
			setState(275);
			qualifiedName();
			setState(276);
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
		public TerminalNode IMPORT() { return getToken(SpringJavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(SpringJavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(SpringJavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(SpringJavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IMPORT);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(279);
				match(STATIC);
				}
			}

			setState(282);
			qualifiedName();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(283);
				match(DOT);
				setState(284);
				match(MUL);
				}
			}

			setState(287);
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
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
		public TerminalNode CLASS() { return getToken(SpringJavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public TerminalNode EXTENDS() { return getToken(SpringJavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(SpringJavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(SpringJavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90710595128791042L) != 0) || _la==AT) {
				{
				{
				setState(296);
				modifier();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(CLASS);
			setState(303);
			identifier();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(304);
				typeParameters();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(307);
				match(EXTENDS);
				setState(308);
				typeType();
				}
			}

			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(311);
				match(IMPLEMENTS);
				setState(312);
				typeList();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(315);
				match(PERMITS);
				setState(316);
				typeList();
				}
			}

			setState(319);
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
		public TerminalNode INTERFACE() { return getToken(SpringJavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public TerminalNode EXTENDS() { return getToken(SpringJavaParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(SpringJavaParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90710595128791042L) != 0) || _la==AT) {
				{
				{
				setState(321);
				modifier();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(INTERFACE);
			setState(328);
			identifier();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(329);
				typeParameters();
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(332);
				match(EXTENDS);
				setState(333);
				typeList();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(336);
				match(PERMITS);
				setState(337);
				typeList();
				}
			}

			setState(340);
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
		public TerminalNode ENUM() { return getToken(SpringJavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(SpringJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SpringJavaParser.COMMA, 0); }
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
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90710595128791042L) != 0) || _la==AT) {
				{
				{
				setState(342);
				modifier();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(ENUM);
			setState(349);
			identifier();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(350);
				match(IMPLEMENTS);
				setState(351);
				typeList();
				}
			}

			setState(354);
			match(LBRACE);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(355);
				enumConstants();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(358);
				match(COMMA);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754469622627259178L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -35183835217903L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(361);
				classBodyDeclaration();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			enumConstant();
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					match(COMMA);
					setState(371);
					enumConstant();
					}
					} 
				}
				setState(376);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(377);
				annotation();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			identifier();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(384);
				arguments();
				}
			}

			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(387);
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
		public TerminalNode AT() { return getToken(SpringJavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(SpringJavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					modifier();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(396);
			match(AT);
			setState(397);
			match(INTERFACE);
			setState(398);
			identifier();
			setState(399);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
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
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LBRACE);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142502129223095082L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -35184372088815L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(402);
				annotationTypeMemberDeclaration();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
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
		public TerminalNode DEFAULT() { return getToken(SpringJavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotationTypeMemberDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					modifier();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(416);
				typeType();
				setState(417);
				identifier();
				setState(418);
				match(LPAREN);
				setState(419);
				match(RPAREN);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(420);
					match(DEFAULT);
					setState(421);
					elementValue();
					}
				}

				setState(424);
				match(SEMI);
				}
				break;
			case 2:
				{
				setState(426);
				constantDeclaration();
				}
				break;
			case 3:
				{
				setState(427);
				classDeclaration();
				}
				break;
			case 4:
				{
				setState(428);
				interfaceDeclaration();
				}
				break;
			case 5:
				{
				setState(429);
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
		public TerminalNode RECORD() { return getToken(SpringJavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public TerminalNode IMPLEMENTS() { return getToken(SpringJavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90710595128791042L) != 0) || _la==AT) {
				{
				{
				setState(432);
				modifier();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(RECORD);
			setState(439);
			identifier();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(440);
				typeParameters();
				}
			}

			setState(443);
			recordHeader();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(444);
				match(IMPLEMENTS);
				setState(445);
				typeList();
				}
			}

			setState(448);
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
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(LPAREN);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805932335350056L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -2199023255551L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
				{
				setState(451);
				recordComponentList();
				}
			}

			setState(454);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			recordComponent();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				recordComponent();
				}
				}
				setState(463);
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
		public TerminalNode ELLIPSIS() { return getToken(SpringJavaParser.ELLIPSIS, 0); }
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_recordComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					annotation();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(470);
			typeType();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(471);
				match(ELLIPSIS);
				}
			}

			setState(474);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LBRACE);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4754469622627259178L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -35183835217903L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(477);
				classBodyDeclaration();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
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
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LBRACE);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142783604199871274L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -35184372088815L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(486);
				interfaceBodyDeclaration();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(SpringJavaParser.STATIC, 0); }
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(495);
					match(STATIC);
					}
				}

				setState(498);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						modifier();
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(505);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
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
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
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
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(509);
						modifier();
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(515);
					constantDeclaration();
					}
					break;
				case 2:
					{
					setState(516);
					interfaceMethodDeclaration();
					}
					break;
				case 3:
					{
					setState(517);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(518);
					interfaceDeclaration();
					}
					break;
				case 5:
					{
					setState(519);
					enumDeclaration();
					}
					break;
				case 6:
					{
					setState(520);
					recordDeclaration();
					}
					break;
				case 7:
					{
					setState(521);
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
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				genericMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				enumDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(534);
				recordDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(535);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			typeType();
			setState(539);
			variableDeclarators();
			setState(540);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			typeType();
			setState(543);
			constantDeclarators();
			setState(544);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public ConstantDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarators; }
	}

	public final ConstantDeclaratorsContext constantDeclarators() throws RecognitionException {
		ConstantDeclaratorsContext _localctx = new ConstantDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			constantDeclarator();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(547);
				match(COMMA);
				setState(548);
				constantDeclarator();
				}
				}
				setState(553);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SpringJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			identifier();
			setState(555);
			match(ASSIGN);
			setState(556);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(SpringJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			typeTypeOrVoid();
			setState(559);
			identifier();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(560);
				typeParameters();
				}
			}

			setState(563);
			formalParameters();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(564);
				dims();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(567);
				match(THROWS);
				setState(568);
				qualifiedNameList();
				}
			}

			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(571);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(572);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(SpringJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			typeTypeOrVoid();
			setState(576);
			identifier();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(577);
				typeParameters();
				}
			}

			setState(580);
			formalParameters();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(581);
				dims();
				}
			}

			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(584);
				match(THROWS);
				setState(585);
				qualifiedNameList();
				}
			}

			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(588);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(589);
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
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			typeParameters();
			setState(593);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(SpringJavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			identifier();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(596);
				typeParameters();
				}
			}

			setState(599);
			formalParameters();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(600);
				match(THROWS);
				setState(601);
				qualifiedNameList();
				}
			}

			setState(604);
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
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			typeParameters();
			setState(607);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
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
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(LBRACE);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(612);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917493838851701566L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1083403927535L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(615);
				blockStatement();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SpringJavaParser.DOT, 0); }
		public TerminalNode SUPER() { return getToken(SpringJavaParser.SUPER, 0); }
		public TerminalNode THIS() { return getToken(SpringJavaParser.THIS, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_explicitConstructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(623);
					typeArguments();
					}
				}

				setState(626);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(627);
				arguments();
				}
				break;
			case 2:
				{
				setState(628);
				primary();
				setState(629);
				match(DOT);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(630);
					typeArguments();
					}
				}

				setState(633);
				match(SUPER);
				setState(634);
				arguments();
				}
				break;
			}
			setState(638);
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
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LPAREN);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805932335612200L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -2199023255551L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
				{
				setState(641);
				formalParameterList();
				}
			}

			setState(644);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				receiverParameter();
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(647);
					match(COMMA);
					setState(648);
					formalParameterList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				formalParameter();
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(652);
						match(COMMA);
						setState(653);
						formalParameter();
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(659);
					match(COMMA);
					setState(660);
					lastFormalParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
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
		public TerminalNode THIS() { return getToken(SpringJavaParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SpringJavaParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_receiverParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					annotation();
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(672);
			typeType();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 63L) != 0)) {
				{
				setState(673);
				identifier();
				setState(674);
				match(DOT);
				}
			}

			setState(678);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					variableModifier();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(686);
			typeType();
			setState(687);
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
		public TerminalNode ELLIPSIS() { return getToken(SpringJavaParser.ELLIPSIS, 0); }
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
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(689);
					variableModifier();
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(695);
			typeType();
			setState(696);
			match(ELLIPSIS);
			setState(697);
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
		public TerminalNode FINAL() { return getToken(SpringJavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableModifier);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			variableDeclarator();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(704);
				match(COMMA);
				setState(705);
				variableDeclarator();
				}
				}
				setState(710);
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
		public TerminalNode ASSIGN() { return getToken(SpringJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			variableDeclaratorId();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(712);
				match(ASSIGN);
				setState(713);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			identifier();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(717);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableInitializer);
		try {
			setState(722);
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
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
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
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(LBRACE);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6843511144629420328L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
				{
				setState(725);
				variableInitializer();
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						match(COMMA);
						setState(727);
						variableInitializer();
						}
						} 
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(733);
					match(COMMA);
					}
				}

				}
			}

			setState(738);
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
		public TerminalNode VOID() { return getToken(SpringJavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeTypeOrVoid);
		try {
			setState(742);
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
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
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
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(744);
				annotation();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
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
				setState(750);
				primitiveType();
				}
				break;
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				{
				setState(751);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(754);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SpringJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SpringJavaParser.DOT, i);
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
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classOrInterfaceType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			identifier();
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(758);
				typeArguments();
				}
				break;
			}
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761);
					match(DOT);
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(762);
						annotation();
						}
						}
						setState(767);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(768);
					identifier();
					setState(770);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(769);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(776);
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
		public TerminalNode BOOLEAN() { return getToken(SpringJavaParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(SpringJavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(SpringJavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(SpringJavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(SpringJavaParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(SpringJavaParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(SpringJavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SpringJavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		public TerminalNode LT() { return getToken(SpringJavaParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(SpringJavaParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(LT);
			setState(780);
			typeArgumentList();
			setState(781);
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
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SpringJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(SpringJavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeArgumentsOrDiamond);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(LT);
				setState(784);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
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
	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			typeArgument();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(789);
				match(COMMA);
				setState(790);
				typeArgument();
				}
				}
				setState(795);
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
		public TerminalNode QUESTION() { return getToken(SpringJavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(SpringJavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(SpringJavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeArgument);
		int _la;
		try {
			setState(802);
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
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(QUESTION);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(798);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(799);
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
		public TerminalNode LT() { return getToken(SpringJavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(SpringJavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LT);
			setState(805);
			typeParameter();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(806);
				match(COMMA);
				setState(807);
				typeParameter();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SpringJavaParser.EXTENDS, 0); }
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(SpringJavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(SpringJavaParser.BITAND, i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(815);
				annotation();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			identifier();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(822);
				match(EXTENDS);
				setState(823);
				typeType();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(824);
					match(BITAND);
					setState(825);
					typeType();
					}
					}
					setState(830);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			typeType();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(834);
				match(COMMA);
				setState(835);
				typeType();
				}
				}
				setState(840);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			qualifiedName();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(842);
				match(COMMA);
				setState(843);
				qualifiedName();
				}
				}
				setState(848);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SpringJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SpringJavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			identifier();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(850);
					match(DOT);
					setState(851);
					identifier();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SpringJavaParser.Identifier, 0); }
		public TerminalNode VAR() { return getToken(SpringJavaParser.VAR, 0); }
		public TerminalNode YIELD() { return getToken(SpringJavaParser.YIELD, 0); }
		public TerminalNode RECORD() { return getToken(SpringJavaParser.RECORD, 0); }
		public TerminalNode SEALED() { return getToken(SpringJavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(SpringJavaParser.PERMITS, 0); }
		public SpringAnnotationNameContext springAnnotationName() {
			return getRuleContext(SpringAnnotationNameContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifier);
		try {
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(Identifier);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(VAR);
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(YIELD);
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				match(RECORD);
				}
				break;
			case SEALED:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				match(SEALED);
				}
				break;
			case PERMITS:
				enterOuterAlt(_localctx, 6);
				{
				setState(862);
				match(PERMITS);
				}
				break;
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
				enterOuterAlt(_localctx, 7);
				{
				setState(863);
				springAnnotationName();
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
	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(SpringJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SpringJavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SpringJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SpringJavaParser.RBRACK, i);
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
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(866);
						annotation();
						}
						}
						setState(871);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(872);
					match(LBRACK);
					setState(873);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(876); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		public TerminalNode PUBLIC() { return getToken(SpringJavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(SpringJavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(SpringJavaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(SpringJavaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(SpringJavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(SpringJavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(SpringJavaParser.STRICTFP, 0); }
		public TerminalNode DEFAULT() { return getToken(SpringJavaParser.DEFAULT, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(SpringJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(SpringJavaParser.NATIVE, 0); }
		public TerminalNode TRANSIENT() { return getToken(SpringJavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(SpringJavaParser.VOLATILE, 0); }
		public TerminalNode SEALED() { return getToken(SpringJavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(SpringJavaParser.NON_SEALED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_modifier);
		try {
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(884);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(885);
				match(STRICTFP);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 9);
				{
				setState(886);
				match(DEFAULT);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(887);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(888);
				match(NATIVE);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(889);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 13);
				{
				setState(890);
				match(VOLATILE);
				}
				break;
			case SEALED:
				enterOuterAlt(_localctx, 14);
				{
				setState(891);
				match(SEALED);
				}
				break;
			case NON_SEALED:
				enterOuterAlt(_localctx, 15);
				{
				setState(892);
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
		public TerminalNode AT() { return getToken(SpringJavaParser.AT, 0); }
		public SpringAnnotationNameContext springAnnotationName() {
			return getRuleContext(SpringAnnotationNameContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
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
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(AT);
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(896);
				springAnnotationName();
				}
				break;
			case 2:
				{
				setState(897);
				qualifiedName();
				}
				break;
			}
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(900);
				match(LPAREN);
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(901);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(902);
					elementValue();
					}
					break;
				}
				setState(905);
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
	public static class SpringAnnotationNameContext extends ParserRuleContext {
		public TerminalNode SPRING_SPRING_BOOT_APPLICATION() { return getToken(SpringJavaParser.SPRING_SPRING_BOOT_APPLICATION, 0); }
		public TerminalNode SPRING_ENABLE_AUTO_CONFIGURATION() { return getToken(SpringJavaParser.SPRING_ENABLE_AUTO_CONFIGURATION, 0); }
		public TerminalNode SPRING_COMPONENT_SCAN() { return getToken(SpringJavaParser.SPRING_COMPONENT_SCAN, 0); }
		public TerminalNode SPRING_CONFIGURATION() { return getToken(SpringJavaParser.SPRING_CONFIGURATION, 0); }
		public TerminalNode SPRING_BEAN() { return getToken(SpringJavaParser.SPRING_BEAN, 0); }
		public TerminalNode SPRING_COMPONENT() { return getToken(SpringJavaParser.SPRING_COMPONENT, 0); }
		public TerminalNode SPRING_SERVICE() { return getToken(SpringJavaParser.SPRING_SERVICE, 0); }
		public TerminalNode SPRING_REPOSITORY() { return getToken(SpringJavaParser.SPRING_REPOSITORY, 0); }
		public TerminalNode SPRING_CONTROLLER() { return getToken(SpringJavaParser.SPRING_CONTROLLER, 0); }
		public TerminalNode SPRING_REST_CONTROLLER() { return getToken(SpringJavaParser.SPRING_REST_CONTROLLER, 0); }
		public TerminalNode SPRING_AUTOWIRED() { return getToken(SpringJavaParser.SPRING_AUTOWIRED, 0); }
		public TerminalNode SPRING_QUALIFIER() { return getToken(SpringJavaParser.SPRING_QUALIFIER, 0); }
		public TerminalNode SPRING_PRIMARY() { return getToken(SpringJavaParser.SPRING_PRIMARY, 0); }
		public TerminalNode SPRING_LAZY() { return getToken(SpringJavaParser.SPRING_LAZY, 0); }
		public TerminalNode SPRING_VALUE() { return getToken(SpringJavaParser.SPRING_VALUE, 0); }
		public TerminalNode SPRING_SCOPE() { return getToken(SpringJavaParser.SPRING_SCOPE, 0); }
		public TerminalNode SPRING_DEPENDS_ON() { return getToken(SpringJavaParser.SPRING_DEPENDS_ON, 0); }
		public TerminalNode SPRING_REQUEST_MAPPING() { return getToken(SpringJavaParser.SPRING_REQUEST_MAPPING, 0); }
		public TerminalNode SPRING_GET_MAPPING() { return getToken(SpringJavaParser.SPRING_GET_MAPPING, 0); }
		public TerminalNode SPRING_POST_MAPPING() { return getToken(SpringJavaParser.SPRING_POST_MAPPING, 0); }
		public TerminalNode SPRING_PUT_MAPPING() { return getToken(SpringJavaParser.SPRING_PUT_MAPPING, 0); }
		public TerminalNode SPRING_PATCH_MAPPING() { return getToken(SpringJavaParser.SPRING_PATCH_MAPPING, 0); }
		public TerminalNode SPRING_DELETE_MAPPING() { return getToken(SpringJavaParser.SPRING_DELETE_MAPPING, 0); }
		public TerminalNode SPRING_REQUEST_PARAM() { return getToken(SpringJavaParser.SPRING_REQUEST_PARAM, 0); }
		public TerminalNode SPRING_PATH_VARIABLE() { return getToken(SpringJavaParser.SPRING_PATH_VARIABLE, 0); }
		public TerminalNode SPRING_REQUEST_BODY() { return getToken(SpringJavaParser.SPRING_REQUEST_BODY, 0); }
		public TerminalNode SPRING_RESPONSE_BODY() { return getToken(SpringJavaParser.SPRING_RESPONSE_BODY, 0); }
		public TerminalNode SPRING_MODEL_ATTRIBUTE() { return getToken(SpringJavaParser.SPRING_MODEL_ATTRIBUTE, 0); }
		public TerminalNode SPRING_REQUEST_HEADER() { return getToken(SpringJavaParser.SPRING_REQUEST_HEADER, 0); }
		public TerminalNode SPRING_COOKIE_VALUE() { return getToken(SpringJavaParser.SPRING_COOKIE_VALUE, 0); }
		public TerminalNode SPRING_SESSION_ATTRIBUTE() { return getToken(SpringJavaParser.SPRING_SESSION_ATTRIBUTE, 0); }
		public TerminalNode SPRING_REQUEST_ATTRIBUTE() { return getToken(SpringJavaParser.SPRING_REQUEST_ATTRIBUTE, 0); }
		public TerminalNode SPRING_MATRIX_VARIABLE() { return getToken(SpringJavaParser.SPRING_MATRIX_VARIABLE, 0); }
		public TerminalNode SPRING_CROSS_ORIGIN() { return getToken(SpringJavaParser.SPRING_CROSS_ORIGIN, 0); }
		public TerminalNode SPRING_EXCEPTION_HANDLER() { return getToken(SpringJavaParser.SPRING_EXCEPTION_HANDLER, 0); }
		public TerminalNode SPRING_CONTROLLER_ADVICE() { return getToken(SpringJavaParser.SPRING_CONTROLLER_ADVICE, 0); }
		public TerminalNode SPRING_REST_CONTROLLER_ADVICE() { return getToken(SpringJavaParser.SPRING_REST_CONTROLLER_ADVICE, 0); }
		public TerminalNode SPRING_INIT_BINDER() { return getToken(SpringJavaParser.SPRING_INIT_BINDER, 0); }
		public TerminalNode SPRING_RESPONSE_STATUS() { return getToken(SpringJavaParser.SPRING_RESPONSE_STATUS, 0); }
		public TerminalNode SPRING_VALIDATED() { return getToken(SpringJavaParser.SPRING_VALIDATED, 0); }
		public TerminalNode SPRING_VALID() { return getToken(SpringJavaParser.SPRING_VALID, 0); }
		public TerminalNode SPRING_TRANSACTIONAL() { return getToken(SpringJavaParser.SPRING_TRANSACTIONAL, 0); }
		public TerminalNode SPRING_ASYNC() { return getToken(SpringJavaParser.SPRING_ASYNC, 0); }
		public TerminalNode SPRING_SCHEDULED() { return getToken(SpringJavaParser.SPRING_SCHEDULED, 0); }
		public TerminalNode SPRING_ENABLE_SCHEDULING() { return getToken(SpringJavaParser.SPRING_ENABLE_SCHEDULING, 0); }
		public TerminalNode SPRING_CACHEABLE() { return getToken(SpringJavaParser.SPRING_CACHEABLE, 0); }
		public TerminalNode SPRING_CACHE_PUT() { return getToken(SpringJavaParser.SPRING_CACHE_PUT, 0); }
		public TerminalNode SPRING_CACHE_EVICT() { return getToken(SpringJavaParser.SPRING_CACHE_EVICT, 0); }
		public TerminalNode SPRING_ENABLE_CACHING() { return getToken(SpringJavaParser.SPRING_ENABLE_CACHING, 0); }
		public TerminalNode SPRING_PROFILE() { return getToken(SpringJavaParser.SPRING_PROFILE, 0); }
		public TerminalNode SPRING_PROPERTY_SOURCE() { return getToken(SpringJavaParser.SPRING_PROPERTY_SOURCE, 0); }
		public TerminalNode SPRING_IMPORT() { return getToken(SpringJavaParser.SPRING_IMPORT, 0); }
		public TerminalNode SPRING_IMPORT_RESOURCE() { return getToken(SpringJavaParser.SPRING_IMPORT_RESOURCE, 0); }
		public TerminalNode SPRING_CONFIGURATION_PROPERTIES() { return getToken(SpringJavaParser.SPRING_CONFIGURATION_PROPERTIES, 0); }
		public TerminalNode SPRING_ENABLE_CONFIGURATION_PROPERTIES() { return getToken(SpringJavaParser.SPRING_ENABLE_CONFIGURATION_PROPERTIES, 0); }
		public TerminalNode SPRING_CONDITIONAL_ON_PROPERTY() { return getToken(SpringJavaParser.SPRING_CONDITIONAL_ON_PROPERTY, 0); }
		public TerminalNode SPRING_CONDITIONAL_ON_CLASS() { return getToken(SpringJavaParser.SPRING_CONDITIONAL_ON_CLASS, 0); }
		public TerminalNode SPRING_CONDITIONAL_ON_MISSING_BEAN() { return getToken(SpringJavaParser.SPRING_CONDITIONAL_ON_MISSING_BEAN, 0); }
		public TerminalNode SPRING_SPRING_BOOT_TEST() { return getToken(SpringJavaParser.SPRING_SPRING_BOOT_TEST, 0); }
		public TerminalNode SPRING_WEB_MVC_TEST() { return getToken(SpringJavaParser.SPRING_WEB_MVC_TEST, 0); }
		public TerminalNode SPRING_DATA_JPA_TEST() { return getToken(SpringJavaParser.SPRING_DATA_JPA_TEST, 0); }
		public TerminalNode SPRING_MOCK_BEAN() { return getToken(SpringJavaParser.SPRING_MOCK_BEAN, 0); }
		public TerminalNode SPRING_TEST_CONFIGURATION() { return getToken(SpringJavaParser.SPRING_TEST_CONFIGURATION, 0); }
		public TerminalNode SPRING_ORDER() { return getToken(SpringJavaParser.SPRING_ORDER, 0); }
		public TerminalNode SPRING_PRE_AUTHORIZE() { return getToken(SpringJavaParser.SPRING_PRE_AUTHORIZE, 0); }
		public TerminalNode SPRING_SECURED() { return getToken(SpringJavaParser.SPRING_SECURED, 0); }
		public TerminalNode SPRING_ENABLE_METHOD_SECURITY() { return getToken(SpringJavaParser.SPRING_ENABLE_METHOD_SECURITY, 0); }
		public TerminalNode SPRING_ENABLE_WEB_SECURITY() { return getToken(SpringJavaParser.SPRING_ENABLE_WEB_SECURITY, 0); }
		public TerminalNode SPRING_ENABLE_GLOBAL_METHOD_SECURITY() { return getToken(SpringJavaParser.SPRING_ENABLE_GLOBAL_METHOD_SECURITY, 0); }
		public SpringAnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springAnnotationName; }
	}

	public final SpringAnnotationNameContext springAnnotationName() throws RecognitionException {
		SpringAnnotationNameContext _localctx = new SpringAnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_springAnnotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 31L) != 0)) ) {
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
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			elementValuePair();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(911);
				match(COMMA);
				setState(912);
				elementValuePair();
				}
				}
				setState(917);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SpringJavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			identifier();
			setState(919);
			match(ASSIGN);
			setState(920);
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
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValue);
		try {
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(LBRACE);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6843511144629420328L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
				{
				setState(928);
				elementValue();
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(929);
						match(COMMA);
						setState(930);
						elementValue();
						}
						} 
					}
					setState(935);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(936);
					match(COMMA);
					}
				}

				}
			}

			setState(941);
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
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(LBRACE);
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917493838851701566L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1083403927535L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 2251799813685247L) != 0)) {
				{
				{
				setState(944);
				blockStatement();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(950);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				localVariableDeclaration();
				setState(953);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				localTypeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(956);
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
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localTypeDeclaration);
		try {
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(965);
					variableModifier();
					}
					} 
				}
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(971);
			localVariableType();
			setState(972);
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
		public TerminalNode VAR() { return getToken(SpringJavaParser.VAR, 0); }
		public LocalVariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableType; }
	}

	public final LocalVariableTypeContext localVariableType() throws RecognitionException {
		LocalVariableTypeContext _localctx = new LocalVariableTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableType);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(VAR);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends StatementContext {
		public TerminalNode TRY() { return getToken(SpringJavaParser.TRY, 0); }
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
		public TerminalNode FINALLY() { return getToken(SpringJavaParser.FINALLY, 0); }
		public TryStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends StatementContext {
		public TerminalNode THROW() { return getToken(SpringJavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ThrowStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(SpringJavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(SpringJavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(SpringJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SpringJavaParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(SpringJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(SpringJavaParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SpringJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SpringJavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SynchronizedStatementContext extends StatementContext {
		public TerminalNode SYNCHRONIZED() { return getToken(SpringJavaParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(SpringJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertStatementContext extends StatementContext {
		public TerminalNode ASSERT() { return getToken(SpringJavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(SpringJavaParser.COLON, 0); }
		public AssertStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpringJavaParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends StatementContext {
		public TerminalNode DO() { return getToken(SpringJavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SpringJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(SpringJavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatementContext extends StatementContext {
		public TerminalNode YIELD() { return getToken(SpringJavaParser.YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public YieldStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new BlockStatementAltContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				block();
				}
				break;
			case 2:
				_localctx = new AssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(ASSERT);
				setState(980);
				expression();
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(981);
					match(COLON);
					setState(982);
					expression();
					}
				}

				setState(985);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				match(IF);
				setState(988);
				match(LPAREN);
				setState(989);
				expression();
				setState(990);
				match(RPAREN);
				setState(991);
				statement();
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(992);
					match(ELSE);
					setState(993);
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
				setState(996);
				match(FOR);
				setState(997);
				match(LPAREN);
				setState(998);
				forControl();
				setState(999);
				match(RPAREN);
				setState(1000);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				match(WHILE);
				setState(1003);
				match(LPAREN);
				setState(1004);
				expression();
				setState(1005);
				match(RPAREN);
				setState(1006);
				statement();
				}
				break;
			case 6:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1008);
				match(DO);
				setState(1009);
				statement();
				setState(1010);
				match(WHILE);
				setState(1011);
				match(LPAREN);
				setState(1012);
				expression();
				setState(1013);
				match(RPAREN);
				setState(1014);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1016);
				match(TRY);
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1017);
					resourceSpecification();
					}
				}

				setState(1020);
				block();
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1021);
					catchClause();
					}
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1027);
					match(FINALLY);
					setState(1028);
					block();
					}
				}

				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1031);
				match(SWITCH);
				setState(1032);
				match(LPAREN);
				setState(1033);
				expression();
				setState(1034);
				match(RPAREN);
				setState(1035);
				match(LBRACE);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1036);
					switchBlockStatementGroup();
					}
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1042);
				match(RBRACE);
				}
				break;
			case 9:
				_localctx = new SynchronizedStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1044);
				match(SYNCHRONIZED);
				setState(1045);
				match(LPAREN);
				setState(1046);
				expression();
				setState(1047);
				match(RPAREN);
				setState(1048);
				block();
				}
				break;
			case 10:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1050);
				match(RETURN);
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2231825126202032424L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
					{
					setState(1051);
					expression();
					}
				}

				setState(1054);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1055);
				match(THROW);
				setState(1056);
				expression();
				setState(1057);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1059);
				match(BREAK);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 63L) != 0)) {
					{
					setState(1060);
					identifier();
					}
				}

				setState(1063);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1064);
				match(CONTINUE);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 63L) != 0)) {
					{
					setState(1065);
					identifier();
					}
				}

				setState(1068);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1069);
				match(YIELD);
				setState(1070);
				expression();
				setState(1071);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1073);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1074);
				statementExpression();
				setState(1075);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1077);
				identifier();
				setState(1078);
				match(COLON);
				setState(1079);
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
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			localVariableDeclaration();
			setState(1084);
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
		public List<TerminalNode> SEMI() { return getTokens(SpringJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SpringJavaParser.SEMI, i);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forControl);
		int _la;
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2231825126202294568L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
					{
					setState(1087);
					forInit();
					}
				}

				setState(1090);
				match(SEMI);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2231825126202032424L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
					{
					setState(1091);
					expression();
					}
				}

				setState(1094);
				match(SEMI);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2231825126202032424L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
					{
					setState(1095);
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
		public TerminalNode COLON() { return getToken(SpringJavaParser.COLON, 0); }
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
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1100);
					variableModifier();
					}
					} 
				}
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1106);
			localVariableType();
			setState(1107);
			variableDeclaratorId();
			setState(1108);
			match(COLON);
			setState(1109);
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_forInit);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
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
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			statementExpression();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1116);
				match(COMMA);
				setState(1117);
				statementExpression();
				}
				}
				setState(1122);
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
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(SpringJavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(LPAREN);
			setState(1124);
			resourceList();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1125);
				match(SEMI);
				}
			}

			setState(1128);
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
		public List<TerminalNode> SEMI() { return getTokens(SpringJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SpringJavaParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			resource();
			setState(1135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1131);
					match(SEMI);
					setState(1132);
					resource();
					}
					} 
				}
				setState(1137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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
		public TerminalNode ASSIGN() { return getToken(SpringJavaParser.ASSIGN, 0); }
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
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_resource);
		try {
			int _alt;
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1138);
						variableModifier();
						}
						} 
					}
					setState(1143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				setState(1144);
				localVariableType();
				setState(1145);
				variableDeclaratorId();
				setState(1146);
				match(ASSIGN);
				setState(1147);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
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
		public TerminalNode CATCH() { return getToken(SpringJavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(CATCH);
			setState(1153);
			match(LPAREN);
			setState(1154);
			catchFormalParameter();
			setState(1155);
			match(RPAREN);
			setState(1156);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1158);
				variableModifier();
				}
				}
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1164);
			catchType();
			setState(1165);
			identifier();
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
		public List<TerminalNode> BITOR() { return getTokens(SpringJavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(SpringJavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			qualifiedName();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1168);
				match(BITOR);
				setState(1169);
				qualifiedName();
				}
				}
				setState(1174);
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1175);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1180);
					blockStatement();
					}
					} 
				}
				setState(1185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
		public TerminalNode CASE() { return getToken(SpringJavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(SpringJavaParser.COLON, 0); }
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public TerminalNode NULL() { return getToken(SpringJavaParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SpringJavaParser.DEFAULT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_switchLabel);
		int _la;
		try {
			setState(1202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				match(CASE);
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1187);
					constantExpression();
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1188);
						match(COMMA);
						setState(1189);
						constantExpression();
						}
						}
						setState(1194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1195);
					match(NULL);
					}
					break;
				case 3:
					{
					setState(1196);
					match(DEFAULT);
					}
					break;
				}
				setState(1199);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(DEFAULT);
				setState(1201);
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
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
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_expression);
		try {
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
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
		public TerminalNode ARROW() { return getToken(SpringJavaParser.ARROW, 0); }
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
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			lambdaParameters();
			setState(1213);
			match(ARROW);
			setState(1216);
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
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
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
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				{
				setState(1214);
				expression();
				}
				break;
			case LBRACE:
				{
				setState(1215);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
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
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaParameters);
		int _la;
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				match(LPAREN);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805932335612200L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -2199023255551L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
					{
					setState(1220);
					formalParameterList();
					}
				}

				setState(1223);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224);
				match(LPAREN);
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 63L) != 0)) {
					{
					setState(1225);
					inferredFormalParameterList();
					}
				}

				setState(1228);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpringJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpringJavaParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			identifier();
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1232);
				match(COMMA);
				setState(1233);
				identifier();
				}
				}
				setState(1238);
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
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			conditionalExpression();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 786943L) != 0)) {
				{
				setState(1240);
				assignmentOperator();
				setState(1241);
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
		public TerminalNode ASSIGN() { return getToken(SpringJavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(SpringJavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(SpringJavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(SpringJavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SpringJavaParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(SpringJavaParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(SpringJavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(SpringJavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(SpringJavaParser.XOR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(SpringJavaParser.LSHIFT_ASSIGN, 0); }
		public List<TerminalNode> GT() { return getTokens(SpringJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SpringJavaParser.GT, i);
		}
		public TerminalNode GE() { return getToken(SpringJavaParser.GE, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assignmentOperator);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				match(ADD_ASSIGN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(SUB_ASSIGN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1248);
				match(MUL_ASSIGN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1249);
				match(DIV_ASSIGN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1250);
				match(MOD_ASSIGN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1251);
				match(AND_ASSIGN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1252);
				match(OR_ASSIGN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1253);
				match(XOR_ASSIGN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1254);
				match(LSHIFT_ASSIGN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1255);
				match(GT);
				setState(1256);
				match(GE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1257);
				match(GT);
				setState(1258);
				match(GT);
				setState(1259);
				match(GE);
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(SpringJavaParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SpringJavaParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			conditionalOrExpression();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1263);
				match(QUESTION);
				setState(1264);
				expression();
				setState(1265);
				match(COLON);
				setState(1266);
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
		public List<TerminalNode> OR() { return getTokens(SpringJavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SpringJavaParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			conditionalAndExpression();
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1271);
				match(OR);
				setState(1272);
				conditionalAndExpression();
				}
				}
				setState(1277);
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
		public List<TerminalNode> AND() { return getTokens(SpringJavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SpringJavaParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			inclusiveOrExpression();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1279);
				match(AND);
				setState(1280);
				inclusiveOrExpression();
				}
				}
				setState(1285);
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
		public List<TerminalNode> BITOR() { return getTokens(SpringJavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(SpringJavaParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			exclusiveOrExpression();
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1287);
				match(BITOR);
				setState(1288);
				exclusiveOrExpression();
				}
				}
				setState(1293);
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
		public List<TerminalNode> CARET() { return getTokens(SpringJavaParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(SpringJavaParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			andExpression();
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1295);
				match(CARET);
				setState(1296);
				andExpression();
				}
				}
				setState(1301);
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
		public List<TerminalNode> BITAND() { return getTokens(SpringJavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(SpringJavaParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			equalityExpression();
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1303);
				match(BITAND);
				setState(1304);
				equalityExpression();
				}
				}
				setState(1309);
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
		public List<TerminalNode> EQUAL() { return getTokens(SpringJavaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SpringJavaParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(SpringJavaParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(SpringJavaParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			relationalExpression();
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1311);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1312);
				relationalExpression();
				}
				}
				setState(1317);
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
		public List<TerminalNode> INSTANCEOF() { return getTokens(SpringJavaParser.INSTANCEOF); }
		public TerminalNode INSTANCEOF(int i) {
			return getToken(SpringJavaParser.INSTANCEOF, i);
		}
		public List<PatternOrTypeContext> patternOrType() {
			return getRuleContexts(PatternOrTypeContext.class);
		}
		public PatternOrTypeContext patternOrType(int i) {
			return getRuleContext(PatternOrTypeContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(SpringJavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SpringJavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(SpringJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SpringJavaParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(SpringJavaParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(SpringJavaParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(SpringJavaParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(SpringJavaParser.GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			shiftExpression();
			setState(1325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1323);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LE:
					case GE:
					case GT:
					case LT:
						{
						setState(1319);
						_la = _input.LA(1);
						if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 99L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1320);
						shiftExpression();
						}
						break;
					case INSTANCEOF:
						{
						setState(1321);
						match(INSTANCEOF);
						setState(1322);
						patternOrType();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PatternOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternOrType; }
	}

	public final PatternOrTypeContext patternOrType() throws RecognitionException {
		PatternOrTypeContext _localctx = new PatternOrTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_patternOrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			typeType();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & -1L) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & 63L) != 0)) {
				{
				setState(1329);
				identifier();
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
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			additiveExpression();
			setState(1338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1333);
					shiftOp();
					setState(1334);
					additiveExpression();
					}
					} 
				}
				setState(1340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
	public static class ShiftOpContext extends ParserRuleContext {
		public TerminalNode LSHIFT() { return getToken(SpringJavaParser.LSHIFT, 0); }
		public List<TerminalNode> GT() { return getTokens(SpringJavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SpringJavaParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_shiftOp);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				match(LSHIFT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				match(GT);
				setState(1343);
				match(GT);
				setState(1344);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
				match(GT);
				setState(1346);
				match(GT);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(SpringJavaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(SpringJavaParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(SpringJavaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(SpringJavaParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			multiplicativeExpression();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1350);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1351);
				multiplicativeExpression();
				}
				}
				setState(1356);
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
		public List<TerminalNode> MUL() { return getTokens(SpringJavaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(SpringJavaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SpringJavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SpringJavaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SpringJavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SpringJavaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			unaryExpression();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 35L) != 0)) {
				{
				{
				setState(1358);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1359);
				unaryExpression();
				}
				}
				setState(1364);
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
		public TerminalNode ADD() { return getToken(SpringJavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SpringJavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(SpringJavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SpringJavaParser.DEC, 0); }
		public TerminalNode NOT() { return getToken(SpringJavaParser.NOT, 0); }
		public TerminalNode TILDE() { return getToken(SpringJavaParser.TILDE, 0); }
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_unaryExpression);
		int _la;
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 30723L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1366);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1367);
				match(LPAREN);
				setState(1368);
				typeType();
				setState(1369);
				match(RPAREN);
				setState(1370);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1372);
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
		public List<TerminalNode> INC() { return getTokens(SpringJavaParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(SpringJavaParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(SpringJavaParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(SpringJavaParser.DEC, i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			primary();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 100665617L) != 0)) {
				{
				setState(1379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
				case LBRACK:
				case DOT:
				case COLONCOLON:
					{
					setState(1376);
					selector();
					}
					break;
				case INC:
					{
					setState(1377);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(1378);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1383);
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
		public TerminalNode DOT() { return getToken(SpringJavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(SpringJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(SpringJavaParser.SUPER, 0); }
		public TerminalNode NEW() { return getToken(SpringJavaParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SpringJavaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SpringJavaParser.RBRACK, 0); }
		public TerminalNode COLONCOLON() { return getToken(SpringJavaParser.COLONCOLON, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_selector);
		int _la;
		try {
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				match(DOT);
				setState(1385);
				identifier();
				setState(1387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1386);
					arguments();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				match(DOT);
				setState(1390);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				match(DOT);
				setState(1392);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1393);
				match(DOT);
				setState(1394);
				match(NEW);
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1395);
					typeArguments();
					}
				}

				setState(1398);
				innerCreator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1399);
				match(LBRACK);
				setState(1400);
				expression();
				setState(1401);
				match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1403);
				match(COLONCOLON);
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1404);
					typeArguments();
					}
				}

				setState(1409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case SPRING_SPRING_BOOT_APPLICATION:
				case SPRING_ENABLE_AUTO_CONFIGURATION:
				case SPRING_COMPONENT_SCAN:
				case SPRING_CONFIGURATION:
				case SPRING_BEAN:
				case SPRING_COMPONENT:
				case SPRING_SERVICE:
				case SPRING_REPOSITORY:
				case SPRING_CONTROLLER:
				case SPRING_REST_CONTROLLER:
				case SPRING_AUTOWIRED:
				case SPRING_QUALIFIER:
				case SPRING_PRIMARY:
				case SPRING_LAZY:
				case SPRING_VALUE:
				case SPRING_SCOPE:
				case SPRING_DEPENDS_ON:
				case SPRING_REQUEST_MAPPING:
				case SPRING_GET_MAPPING:
				case SPRING_POST_MAPPING:
				case SPRING_PUT_MAPPING:
				case SPRING_PATCH_MAPPING:
				case SPRING_DELETE_MAPPING:
				case SPRING_REQUEST_PARAM:
				case SPRING_PATH_VARIABLE:
				case SPRING_REQUEST_BODY:
				case SPRING_RESPONSE_BODY:
				case SPRING_MODEL_ATTRIBUTE:
				case SPRING_REQUEST_HEADER:
				case SPRING_COOKIE_VALUE:
				case SPRING_SESSION_ATTRIBUTE:
				case SPRING_REQUEST_ATTRIBUTE:
				case SPRING_MATRIX_VARIABLE:
				case SPRING_CROSS_ORIGIN:
				case SPRING_EXCEPTION_HANDLER:
				case SPRING_CONTROLLER_ADVICE:
				case SPRING_REST_CONTROLLER_ADVICE:
				case SPRING_INIT_BINDER:
				case SPRING_RESPONSE_STATUS:
				case SPRING_VALIDATED:
				case SPRING_VALID:
				case SPRING_TRANSACTIONAL:
				case SPRING_ASYNC:
				case SPRING_SCHEDULED:
				case SPRING_ENABLE_SCHEDULING:
				case SPRING_CACHEABLE:
				case SPRING_CACHE_PUT:
				case SPRING_CACHE_EVICT:
				case SPRING_ENABLE_CACHING:
				case SPRING_PROFILE:
				case SPRING_PROPERTY_SOURCE:
				case SPRING_IMPORT:
				case SPRING_IMPORT_RESOURCE:
				case SPRING_CONFIGURATION_PROPERTIES:
				case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
				case SPRING_CONDITIONAL_ON_PROPERTY:
				case SPRING_CONDITIONAL_ON_CLASS:
				case SPRING_CONDITIONAL_ON_MISSING_BEAN:
				case SPRING_SPRING_BOOT_TEST:
				case SPRING_WEB_MVC_TEST:
				case SPRING_DATA_JPA_TEST:
				case SPRING_MOCK_BEAN:
				case SPRING_TEST_CONFIGURATION:
				case SPRING_ORDER:
				case SPRING_PRE_AUTHORIZE:
				case SPRING_SECURED:
				case SPRING_ENABLE_METHOD_SECURITY:
				case SPRING_ENABLE_WEB_SECURITY:
				case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
				case Identifier:
					{
					setState(1407);
					identifier();
					}
					break;
				case NEW:
					{
					setState(1408);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1411);
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
		public TerminalNode THIS() { return getToken(SpringJavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(SpringJavaParser.SUPER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public TerminalNode NEW() { return getToken(SpringJavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SpringJavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(SpringJavaParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(SpringJavaParser.VOID, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_primary);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1416);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1417);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1418);
				match(LPAREN);
				setState(1419);
				expression();
				setState(1420);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1422);
				match(NEW);
				setState(1423);
				creator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1424);
				typeType();
				setState(1425);
				match(DOT);
				setState(1426);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1428);
				match(VOID);
				setState(1429);
				match(DOT);
				setState(1430);
				match(CLASS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1431);
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
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_creator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case LT:
			case SPRING_SPRING_BOOT_APPLICATION:
			case SPRING_ENABLE_AUTO_CONFIGURATION:
			case SPRING_COMPONENT_SCAN:
			case SPRING_CONFIGURATION:
			case SPRING_BEAN:
			case SPRING_COMPONENT:
			case SPRING_SERVICE:
			case SPRING_REPOSITORY:
			case SPRING_CONTROLLER:
			case SPRING_REST_CONTROLLER:
			case SPRING_AUTOWIRED:
			case SPRING_QUALIFIER:
			case SPRING_PRIMARY:
			case SPRING_LAZY:
			case SPRING_VALUE:
			case SPRING_SCOPE:
			case SPRING_DEPENDS_ON:
			case SPRING_REQUEST_MAPPING:
			case SPRING_GET_MAPPING:
			case SPRING_POST_MAPPING:
			case SPRING_PUT_MAPPING:
			case SPRING_PATCH_MAPPING:
			case SPRING_DELETE_MAPPING:
			case SPRING_REQUEST_PARAM:
			case SPRING_PATH_VARIABLE:
			case SPRING_REQUEST_BODY:
			case SPRING_RESPONSE_BODY:
			case SPRING_MODEL_ATTRIBUTE:
			case SPRING_REQUEST_HEADER:
			case SPRING_COOKIE_VALUE:
			case SPRING_SESSION_ATTRIBUTE:
			case SPRING_REQUEST_ATTRIBUTE:
			case SPRING_MATRIX_VARIABLE:
			case SPRING_CROSS_ORIGIN:
			case SPRING_EXCEPTION_HANDLER:
			case SPRING_CONTROLLER_ADVICE:
			case SPRING_REST_CONTROLLER_ADVICE:
			case SPRING_INIT_BINDER:
			case SPRING_RESPONSE_STATUS:
			case SPRING_VALIDATED:
			case SPRING_VALID:
			case SPRING_TRANSACTIONAL:
			case SPRING_ASYNC:
			case SPRING_SCHEDULED:
			case SPRING_ENABLE_SCHEDULING:
			case SPRING_CACHEABLE:
			case SPRING_CACHE_PUT:
			case SPRING_CACHE_EVICT:
			case SPRING_ENABLE_CACHING:
			case SPRING_PROFILE:
			case SPRING_PROPERTY_SOURCE:
			case SPRING_IMPORT:
			case SPRING_IMPORT_RESOURCE:
			case SPRING_CONFIGURATION_PROPERTIES:
			case SPRING_ENABLE_CONFIGURATION_PROPERTIES:
			case SPRING_CONDITIONAL_ON_PROPERTY:
			case SPRING_CONDITIONAL_ON_CLASS:
			case SPRING_CONDITIONAL_ON_MISSING_BEAN:
			case SPRING_SPRING_BOOT_TEST:
			case SPRING_WEB_MVC_TEST:
			case SPRING_DATA_JPA_TEST:
			case SPRING_MOCK_BEAN:
			case SPRING_TEST_CONFIGURATION:
			case SPRING_ORDER:
			case SPRING_PRE_AUTHORIZE:
			case SPRING_SECURED:
			case SPRING_ENABLE_METHOD_SECURITY:
			case SPRING_ENABLE_WEB_SECURITY:
			case SPRING_ENABLE_GLOBAL_METHOD_SECURITY:
			case Identifier:
				{
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1434);
					typeArguments();
					}
				}

				setState(1437);
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
				setState(1438);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1441);
				arguments();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1442);
					classBody();
					}
				}

				}
				break;
			case LBRACK:
			case AT:
				{
				setState(1445);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SpringJavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SpringJavaParser.DOT, i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_createdName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			identifier();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1449);
				typeArgumentsOrDiamond();
				}
			}

			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1452);
				match(DOT);
				setState(1453);
				identifier();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1454);
					typeArgumentsOrDiamond();
					}
				}

				}
				}
				setState(1461);
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
	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			identifier();
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1463);
				typeArgumentsOrDiamond();
				}
				break;
			}
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1466);
				arguments();
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1467);
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
		public List<TerminalNode> LBRACK() { return getTokens(SpringJavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SpringJavaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SpringJavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SpringJavaParser.RBRACK, i);
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
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_arrayCreatorRest);
		try {
			int _alt;
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1472);
						match(LBRACK);
						setState(1473);
						expression();
						setState(1474);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1478); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1480);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				dims();
				setState(1484);
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
		public TerminalNode LPAREN() { return getToken(SpringJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SpringJavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(LPAREN);
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2231825126202032424L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & -67712745471L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 140737488355327L) != 0)) {
				{
				setState(1489);
				expressionList();
				}
			}

			setState(1492);
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
	public static class SpringApplicationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpringJavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<SpringAnnotatedTypeDeclarationContext> springAnnotatedTypeDeclaration() {
			return getRuleContexts(SpringAnnotatedTypeDeclarationContext.class);
		}
		public SpringAnnotatedTypeDeclarationContext springAnnotatedTypeDeclaration(int i) {
			return getRuleContext(SpringAnnotatedTypeDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SpringJavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SpringJavaParser.SEMI, i);
		}
		public SpringApplicationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springApplicationUnit; }
	}

	public final SpringApplicationUnitContext springApplicationUnit() throws RecognitionException {
		SpringApplicationUnitContext _localctx = new SpringApplicationUnitContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_springApplicationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1494);
				packageDeclaration();
				}
				break;
			}
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(1497);
				importDeclaration();
				}
				}
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 99717794652033538L) != 0) || _la==SEMI || _la==AT) {
				{
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1503);
					springAnnotatedTypeDeclaration();
					}
					break;
				case 2:
					{
					setState(1504);
					typeDeclaration();
					}
					break;
				case 3:
					{
					setState(1505);
					match(SEMI);
					}
					break;
				}
				}
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1511);
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
	public static class SpringAnnotatedTypeDeclarationContext extends ParserRuleContext {
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringAnnotatedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springAnnotatedTypeDeclaration; }
	}

	public final SpringAnnotatedTypeDeclarationContext springAnnotatedTypeDeclaration() throws RecognitionException {
		SpringAnnotatedTypeDeclarationContext _localctx = new SpringAnnotatedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_springAnnotatedTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1514); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1513);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1516); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1518);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(1519);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(1520);
				enumDeclaration();
				}
				break;
			case 4:
				{
				setState(1521);
				recordDeclaration();
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
	public static class SpringControllerClassContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringControllerClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springControllerClass; }
	}

	public final SpringControllerClassContext springControllerClass() throws RecognitionException {
		SpringControllerClassContext _localctx = new SpringControllerClassContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_springControllerClass);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1524);
					annotation();
					}
					} 
				}
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1530);
			classDeclaration();
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
	public static class SpringControllerMethodContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringControllerMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springControllerMethod; }
	}

	public final SpringControllerMethodContext springControllerMethod() throws RecognitionException {
		SpringControllerMethodContext _localctx = new SpringControllerMethodContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_springControllerMethod);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1532);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1537);
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
	public static class SpringBeanMethodContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringBeanMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springBeanMethod; }
	}

	public final SpringBeanMethodContext springBeanMethod() throws RecognitionException {
		SpringBeanMethodContext _localctx = new SpringBeanMethodContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_springBeanMethod);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1540); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1539);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1542); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1544);
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
	public static class SpringDependencyInjectionFieldContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringDependencyInjectionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springDependencyInjectionField; }
	}

	public final SpringDependencyInjectionFieldContext springDependencyInjectionField() throws RecognitionException {
		SpringDependencyInjectionFieldContext _localctx = new SpringDependencyInjectionFieldContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_springDependencyInjectionField);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1546);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1549); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1551);
			fieldDeclaration();
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
	public static class SpringRequestMappingContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public SpringRequestMappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springRequestMapping; }
	}

	public final SpringRequestMappingContext springRequestMapping() throws RecognitionException {
		SpringRequestMappingContext _localctx = new SpringRequestMappingContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_springRequestMapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			annotation();
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
	public static class SpringRequestParameterContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public SpringRequestParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springRequestParameter; }
	}

	public final SpringRequestParameterContext springRequestParameter() throws RecognitionException {
		SpringRequestParameterContext _localctx = new SpringRequestParameterContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_springRequestParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			annotation();
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
	public static class SpringConfigurationClassContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SpringConfigurationClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springConfigurationClass; }
	}

	public final SpringConfigurationClassContext springConfigurationClass() throws RecognitionException {
		SpringConfigurationClassContext _localctx = new SpringConfigurationClassContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_springConfigurationClass);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1557);
					annotation();
					}
					} 
				}
				setState(1562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			setState(1563);
			classDeclaration();
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
		public TerminalNode IntegerLiteral() { return getToken(SpringJavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SpringJavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SpringJavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SpringJavaParser.StringLiteral, 0); }
		public TerminalNode TextBlock() { return getToken(SpringJavaParser.TextBlock, 0); }
		public TerminalNode TRUE() { return getToken(SpringJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SpringJavaParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SpringJavaParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 17451448556060679L) != 0)) ) {
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
		"\u0004\u0001\u00b7\u0620\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0001\u0000\u0003\u0000\u00fc\b\u0000\u0001\u0000\u0005\u0000\u00ff"+
		"\b\u0000\n\u0000\f\u0000\u0102\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0106\b\u0000\n\u0000\f\u0000\u0109\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001\u010e\b\u0001\n\u0001\f\u0001\u0111\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0119\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u011e\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0127\b\u0003\u0001\u0004\u0005\u0004\u012a"+
		"\b\u0004\n\u0004\f\u0004\u012d\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0132\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0136\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u013a\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u013e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u0005\u0143\b\u0005\n\u0005\f\u0005\u0146\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u014b\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u014f\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0153\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u0158\b\u0006\n\u0006\f\u0006"+
		"\u015b\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0161\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0165\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0168\b\u0006\u0001\u0006\u0005\u0006\u016b\b\u0006"+
		"\n\u0006\f\u0006\u016e\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0175\b\u0007\n\u0007\f\u0007\u0178\t\u0007"+
		"\u0001\b\u0005\b\u017b\b\b\n\b\f\b\u017e\t\b\u0001\b\u0001\b\u0003\b\u0182"+
		"\b\b\u0001\b\u0003\b\u0185\b\b\u0001\t\u0005\t\u0188\b\t\n\t\f\t\u018b"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0194"+
		"\b\n\n\n\f\n\u0197\t\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u019c\b"+
		"\u000b\n\u000b\f\u000b\u019f\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a7\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01af\b\u000b\u0001\f\u0005\f\u01b2\b\f\n\f\f\f\u01b5\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u01ba\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u01bf\b\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u01c5\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01cc\b\u000e\n\u000e\f\u000e"+
		"\u01cf\t\u000e\u0001\u000f\u0005\u000f\u01d2\b\u000f\n\u000f\f\u000f\u01d5"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01d9\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u01df\b\u0010\n\u0010"+
		"\f\u0010\u01e2\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u01e8\b\u0011\n\u0011\f\u0011\u01eb\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01f1\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u01f5\b\u0012\n\u0012\f\u0012\u01f8\t\u0012\u0001\u0012"+
		"\u0003\u0012\u01fb\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01ff\b"+
		"\u0013\n\u0013\f\u0013\u0202\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u020b\b\u0013"+
		"\u0003\u0013\u020d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0219\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0226\b\u0017\n\u0017\f\u0017\u0229\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0232\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0236"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023a\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u023e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0243\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0247\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u024b\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u024f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0256\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u025b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0266\b\u001f\u0001\u001f\u0005\u001f\u0269\b\u001f\n\u001f\f\u001f"+
		"\u026c\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u0271\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0278\b \u0001 \u0001 \u0001 \u0003 \u027d"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0003!\u0283\b!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u028a\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u028f"+
		"\b\"\n\"\f\"\u0292\t\"\u0001\"\u0001\"\u0003\"\u0296\b\"\u0001\"\u0003"+
		"\"\u0299\b\"\u0001#\u0005#\u029c\b#\n#\f#\u029f\t#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u02a5\b#\u0001#\u0001#\u0001$\u0005$\u02aa\b$\n$\f$\u02ad"+
		"\t$\u0001$\u0001$\u0001$\u0001%\u0005%\u02b3\b%\n%\f%\u02b6\t%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u02be\b&\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u02c3\b\'\n\'\f\'\u02c6\t\'\u0001(\u0001(\u0001(\u0003(\u02cb"+
		"\b(\u0001)\u0001)\u0003)\u02cf\b)\u0001*\u0001*\u0003*\u02d3\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u02d9\b+\n+\f+\u02dc\t+\u0001+\u0003+\u02df"+
		"\b+\u0003+\u02e1\b+\u0001+\u0001+\u0001,\u0001,\u0003,\u02e7\b,\u0001"+
		"-\u0005-\u02ea\b-\n-\f-\u02ed\t-\u0001-\u0001-\u0003-\u02f1\b-\u0001-"+
		"\u0003-\u02f4\b-\u0001.\u0001.\u0003.\u02f8\b.\u0001.\u0001.\u0005.\u02fc"+
		"\b.\n.\f.\u02ff\t.\u0001.\u0001.\u0003.\u0303\b.\u0005.\u0305\b.\n.\f"+
		".\u0308\t.\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00031\u0313\b1\u00012\u00012\u00012\u00052\u0318\b2\n2\f2\u031b\t2"+
		"\u00013\u00013\u00013\u00013\u00033\u0321\b3\u00033\u0323\b3\u00014\u0001"+
		"4\u00014\u00014\u00054\u0329\b4\n4\f4\u032c\t4\u00014\u00014\u00015\u0005"+
		"5\u0331\b5\n5\f5\u0334\t5\u00015\u00015\u00015\u00015\u00015\u00055\u033b"+
		"\b5\n5\f5\u033e\t5\u00035\u0340\b5\u00016\u00016\u00016\u00056\u0345\b"+
		"6\n6\f6\u0348\t6\u00017\u00017\u00017\u00057\u034d\b7\n7\f7\u0350\t7\u0001"+
		"8\u00018\u00018\u00058\u0355\b8\n8\f8\u0358\t8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u0361\b9\u0001:\u0005:\u0364\b:\n:\f:\u0367"+
		"\t:\u0001:\u0001:\u0004:\u036b\b:\u000b:\f:\u036c\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u037e\b;\u0001<\u0001<\u0001<\u0003<\u0383\b<\u0001"+
		"<\u0001<\u0001<\u0003<\u0388\b<\u0001<\u0003<\u038b\b<\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0005>\u0392\b>\n>\f>\u0395\t>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0003@\u039e\b@\u0001A\u0001A\u0001A\u0001A\u0005"+
		"A\u03a4\bA\nA\fA\u03a7\tA\u0001A\u0003A\u03aa\bA\u0003A\u03ac\bA\u0001"+
		"A\u0001A\u0001B\u0001B\u0005B\u03b2\bB\nB\fB\u03b5\tB\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u03be\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u03c4\bD\u0001E\u0005E\u03c7\bE\nE\fE\u03ca\tE\u0001E\u0001E"+
		"\u0001E\u0001F\u0001F\u0003F\u03d1\bF\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u03d8\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u03e3\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03fb\bG\u0001G\u0001G\u0005"+
		"G\u03ff\bG\nG\fG\u0402\tG\u0001G\u0001G\u0003G\u0406\bG\u0001G\u0001G"+
		"\u0001G\u0001G\u0001G\u0001G\u0005G\u040e\bG\nG\fG\u0411\tG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u041d"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u0426\bG\u0001"+
		"G\u0001G\u0001G\u0003G\u042b\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u043a\bG\u0001"+
		"H\u0001H\u0001H\u0001I\u0001I\u0003I\u0441\bI\u0001I\u0001I\u0003I\u0445"+
		"\bI\u0001I\u0001I\u0003I\u0449\bI\u0003I\u044b\bI\u0001J\u0005J\u044e"+
		"\bJ\nJ\fJ\u0451\tJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0003"+
		"K\u045a\bK\u0001L\u0001L\u0001L\u0005L\u045f\bL\nL\fL\u0462\tL\u0001M"+
		"\u0001M\u0001M\u0003M\u0467\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0005"+
		"N\u046e\bN\nN\fN\u0471\tN\u0001O\u0005O\u0474\bO\nO\fO\u0477\tO\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u047f\bO\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001Q\u0005Q\u0488\bQ\nQ\fQ\u048b\tQ\u0001Q\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0005R\u0493\bR\nR\fR\u0496\tR\u0001S\u0004"+
		"S\u0499\bS\u000bS\fS\u049a\u0001S\u0005S\u049e\bS\nS\fS\u04a1\tS\u0001"+
		"T\u0001T\u0001T\u0001T\u0005T\u04a7\bT\nT\fT\u04aa\tT\u0001T\u0001T\u0003"+
		"T\u04ae\bT\u0001T\u0001T\u0001T\u0003T\u04b3\bT\u0001U\u0001U\u0001V\u0001"+
		"V\u0001W\u0001W\u0003W\u04bb\bW\u0001X\u0001X\u0001X\u0001X\u0003X\u04c1"+
		"\bX\u0001Y\u0001Y\u0001Y\u0003Y\u04c6\bY\u0001Y\u0001Y\u0001Y\u0003Y\u04cb"+
		"\bY\u0001Y\u0003Y\u04ce\bY\u0001Z\u0001Z\u0001Z\u0005Z\u04d3\bZ\nZ\fZ"+
		"\u04d6\tZ\u0001[\u0001[\u0001[\u0001[\u0003[\u04dc\b[\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u04ed\b\\\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0003]\u04f5\b]\u0001^\u0001^\u0001^\u0005^\u04fa"+
		"\b^\n^\f^\u04fd\t^\u0001_\u0001_\u0001_\u0005_\u0502\b_\n_\f_\u0505\t"+
		"_\u0001`\u0001`\u0001`\u0005`\u050a\b`\n`\f`\u050d\t`\u0001a\u0001a\u0001"+
		"a\u0005a\u0512\ba\na\fa\u0515\ta\u0001b\u0001b\u0001b\u0005b\u051a\bb"+
		"\nb\fb\u051d\tb\u0001c\u0001c\u0001c\u0005c\u0522\bc\nc\fc\u0525\tc\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0005d\u052c\bd\nd\fd\u052f\td\u0001e\u0001"+
		"e\u0003e\u0533\be\u0001f\u0001f\u0001f\u0001f\u0005f\u0539\bf\nf\ff\u053c"+
		"\tf\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0003g\u0544\bg\u0001h\u0001"+
		"h\u0001h\u0005h\u0549\bh\nh\fh\u054c\th\u0001i\u0001i\u0001i\u0005i\u0551"+
		"\bi\ni\fi\u0554\ti\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0003j\u055e\bj\u0001k\u0001k\u0001k\u0001k\u0005k\u0564\bk\nk\fk\u0567"+
		"\tk\u0001l\u0001l\u0001l\u0003l\u056c\bl\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0003l\u0575\bl\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0003l\u057e\bl\u0001l\u0001l\u0003l\u0582\bl\u0001l\u0003l\u0585"+
		"\bl\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u0599"+
		"\bm\u0001n\u0003n\u059c\bn\u0001n\u0001n\u0003n\u05a0\bn\u0001n\u0001"+
		"n\u0003n\u05a4\bn\u0001n\u0003n\u05a7\bn\u0001o\u0001o\u0003o\u05ab\b"+
		"o\u0001o\u0001o\u0001o\u0003o\u05b0\bo\u0005o\u05b2\bo\no\fo\u05b5\to"+
		"\u0001p\u0001p\u0003p\u05b9\bp\u0001p\u0001p\u0003p\u05bd\bp\u0003p\u05bf"+
		"\bp\u0001q\u0001q\u0001q\u0001q\u0004q\u05c5\bq\u000bq\fq\u05c6\u0001"+
		"q\u0003q\u05ca\bq\u0001q\u0001q\u0001q\u0003q\u05cf\bq\u0001r\u0001r\u0003"+
		"r\u05d3\br\u0001r\u0001r\u0001s\u0003s\u05d8\bs\u0001s\u0005s\u05db\b"+
		"s\ns\fs\u05de\ts\u0001s\u0001s\u0001s\u0005s\u05e3\bs\ns\fs\u05e6\ts\u0001"+
		"s\u0001s\u0001t\u0004t\u05eb\bt\u000bt\ft\u05ec\u0001t\u0001t\u0001t\u0001"+
		"t\u0003t\u05f3\bt\u0001u\u0005u\u05f6\bu\nu\fu\u05f9\tu\u0001u\u0001u"+
		"\u0001v\u0004v\u05fe\bv\u000bv\fv\u05ff\u0001v\u0001v\u0001w\u0004w\u0605"+
		"\bw\u000bw\fw\u0606\u0001w\u0001w\u0001x\u0004x\u060c\bx\u000bx\fx\u060d"+
		"\u0001x\u0001x\u0001y\u0001y\u0001z\u0001z\u0001{\u0005{\u0617\b{\n{\f"+
		"{\u061a\t{\u0001{\u0001{\u0001|\u0001|\u0001|\u0000\u0000}\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u0000\n\u0002\u0000"+
		"((++\b\u0000\u0003\u0003\u0005\u0005\b\b\u000e\u000e\u0014\u0014\u001b"+
		"\u001b\u001d\u001d%%\u0002\u0000\u0011\u0011((\u0001\u0000o\u00b3\u0001"+
		"\u0000WX\u0002\u0000YZ^_\u0001\u0000bc\u0002\u0000deii\u0002\u0000UV`"+
		"c\u0002\u00009;jn\u06c3\u0000\u00fb\u0001\u0000\u0000\u0000\u0002\u010f"+
		"\u0001\u0000\u0000\u0000\u0004\u0116\u0001\u0000\u0000\u0000\u0006\u0126"+
		"\u0001\u0000\u0000\u0000\b\u012b\u0001\u0000\u0000\u0000\n\u0144\u0001"+
		"\u0000\u0000\u0000\f\u0159\u0001\u0000\u0000\u0000\u000e\u0171\u0001\u0000"+
		"\u0000\u0000\u0010\u017c\u0001\u0000\u0000\u0000\u0012\u0189\u0001\u0000"+
		"\u0000\u0000\u0014\u0191\u0001\u0000\u0000\u0000\u0016\u019d\u0001\u0000"+
		"\u0000\u0000\u0018\u01b3\u0001\u0000\u0000\u0000\u001a\u01c2\u0001\u0000"+
		"\u0000\u0000\u001c\u01c8\u0001\u0000\u0000\u0000\u001e\u01d3\u0001\u0000"+
		"\u0000\u0000 \u01dc\u0001\u0000\u0000\u0000\"\u01e5\u0001\u0000\u0000"+
		"\u0000$\u01fa\u0001\u0000\u0000\u0000&\u020c\u0001\u0000\u0000\u0000("+
		"\u0218\u0001\u0000\u0000\u0000*\u021a\u0001\u0000\u0000\u0000,\u021e\u0001"+
		"\u0000\u0000\u0000.\u0222\u0001\u0000\u0000\u00000\u022a\u0001\u0000\u0000"+
		"\u00002\u022e\u0001\u0000\u0000\u00004\u023f\u0001\u0000\u0000\u00006"+
		"\u0250\u0001\u0000\u0000\u00008\u0253\u0001\u0000\u0000\u0000:\u025e\u0001"+
		"\u0000\u0000\u0000<\u0261\u0001\u0000\u0000\u0000>\u0263\u0001\u0000\u0000"+
		"\u0000@\u027c\u0001\u0000\u0000\u0000B\u0280\u0001\u0000\u0000\u0000D"+
		"\u0298\u0001\u0000\u0000\u0000F\u029d\u0001\u0000\u0000\u0000H\u02ab\u0001"+
		"\u0000\u0000\u0000J\u02b4\u0001\u0000\u0000\u0000L\u02bd\u0001\u0000\u0000"+
		"\u0000N\u02bf\u0001\u0000\u0000\u0000P\u02c7\u0001\u0000\u0000\u0000R"+
		"\u02cc\u0001\u0000\u0000\u0000T\u02d2\u0001\u0000\u0000\u0000V\u02d4\u0001"+
		"\u0000\u0000\u0000X\u02e6\u0001\u0000\u0000\u0000Z\u02eb\u0001\u0000\u0000"+
		"\u0000\\\u02f5\u0001\u0000\u0000\u0000^\u0309\u0001\u0000\u0000\u0000"+
		"`\u030b\u0001\u0000\u0000\u0000b\u0312\u0001\u0000\u0000\u0000d\u0314"+
		"\u0001\u0000\u0000\u0000f\u0322\u0001\u0000\u0000\u0000h\u0324\u0001\u0000"+
		"\u0000\u0000j\u0332\u0001\u0000\u0000\u0000l\u0341\u0001\u0000\u0000\u0000"+
		"n\u0349\u0001\u0000\u0000\u0000p\u0351\u0001\u0000\u0000\u0000r\u0360"+
		"\u0001\u0000\u0000\u0000t\u036a\u0001\u0000\u0000\u0000v\u037d\u0001\u0000"+
		"\u0000\u0000x\u037f\u0001\u0000\u0000\u0000z\u038c\u0001\u0000\u0000\u0000"+
		"|\u038e\u0001\u0000\u0000\u0000~\u0396\u0001\u0000\u0000\u0000\u0080\u039d"+
		"\u0001\u0000\u0000\u0000\u0082\u039f\u0001\u0000\u0000\u0000\u0084\u03af"+
		"\u0001\u0000\u0000\u0000\u0086\u03bd\u0001\u0000\u0000\u0000\u0088\u03c3"+
		"\u0001\u0000\u0000\u0000\u008a\u03c8\u0001\u0000\u0000\u0000\u008c\u03d0"+
		"\u0001\u0000\u0000\u0000\u008e\u0439\u0001\u0000\u0000\u0000\u0090\u043b"+
		"\u0001\u0000\u0000\u0000\u0092\u044a\u0001\u0000\u0000\u0000\u0094\u044f"+
		"\u0001\u0000\u0000\u0000\u0096\u0459\u0001\u0000\u0000\u0000\u0098\u045b"+
		"\u0001\u0000\u0000\u0000\u009a\u0463\u0001\u0000\u0000\u0000\u009c\u046a"+
		"\u0001\u0000\u0000\u0000\u009e\u047e\u0001\u0000\u0000\u0000\u00a0\u0480"+
		"\u0001\u0000\u0000\u0000\u00a2\u0489\u0001\u0000\u0000\u0000\u00a4\u048f"+
		"\u0001\u0000\u0000\u0000\u00a6\u0498\u0001\u0000\u0000\u0000\u00a8\u04b2"+
		"\u0001\u0000\u0000\u0000\u00aa\u04b4\u0001\u0000\u0000\u0000\u00ac\u04b6"+
		"\u0001\u0000\u0000\u0000\u00ae\u04ba\u0001\u0000\u0000\u0000\u00b0\u04bc"+
		"\u0001\u0000\u0000\u0000\u00b2\u04cd\u0001\u0000\u0000\u0000\u00b4\u04cf"+
		"\u0001\u0000\u0000\u0000\u00b6\u04d7\u0001\u0000\u0000\u0000\u00b8\u04ec"+
		"\u0001\u0000\u0000\u0000\u00ba\u04ee\u0001\u0000\u0000\u0000\u00bc\u04f6"+
		"\u0001\u0000\u0000\u0000\u00be\u04fe\u0001\u0000\u0000\u0000\u00c0\u0506"+
		"\u0001\u0000\u0000\u0000\u00c2\u050e\u0001\u0000\u0000\u0000\u00c4\u0516"+
		"\u0001\u0000\u0000\u0000\u00c6\u051e\u0001\u0000\u0000\u0000\u00c8\u0526"+
		"\u0001\u0000\u0000\u0000\u00ca\u0530\u0001\u0000\u0000\u0000\u00cc\u0534"+
		"\u0001\u0000\u0000\u0000\u00ce\u0543\u0001\u0000\u0000\u0000\u00d0\u0545"+
		"\u0001\u0000\u0000\u0000\u00d2\u054d\u0001\u0000\u0000\u0000\u00d4\u055d"+
		"\u0001\u0000\u0000\u0000\u00d6\u055f\u0001\u0000\u0000\u0000\u00d8\u0584"+
		"\u0001\u0000\u0000\u0000\u00da\u0598\u0001\u0000\u0000\u0000\u00dc\u059f"+
		"\u0001\u0000\u0000\u0000\u00de\u05a8\u0001\u0000\u0000\u0000\u00e0\u05b6"+
		"\u0001\u0000\u0000\u0000\u00e2\u05ce\u0001\u0000\u0000\u0000\u00e4\u05d0"+
		"\u0001\u0000\u0000\u0000\u00e6\u05d7\u0001\u0000\u0000\u0000\u00e8\u05ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u05f7\u0001\u0000\u0000\u0000\u00ec\u05fd"+
		"\u0001\u0000\u0000\u0000\u00ee\u0604\u0001\u0000\u0000\u0000\u00f0\u060b"+
		"\u0001\u0000\u0000\u0000\u00f2\u0611\u0001\u0000\u0000\u0000\u00f4\u0613"+
		"\u0001\u0000\u0000\u0000\u00f6\u0618\u0001\u0000\u0000\u0000\u00f8\u061d"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0100"+
		"\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u0004\u0002\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0107"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0003\u0006\u0003\u0000\u0104\u0106\u0005B\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005\u0000\u0000\u0001\u010b\u0001\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0003x<\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005 \u0000\u0000"+
		"\u0113\u0114\u0003p8\u0000\u0114\u0115\u0005B\u0000\u0000\u0115\u0003"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0005\u0019\u0000\u0000\u0117\u0119"+
		"\u0005&\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0003"+
		"p8\u0000\u011b\u011c\u0005D\u0000\u0000\u011c\u011e\u0005d\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005B\u0000\u0000\u0120"+
		"\u0005\u0001\u0000\u0000\u0000\u0121\u0127\u0003\b\u0004\u0000\u0122\u0127"+
		"\u0003\n\u0005\u0000\u0123\u0127\u0003\f\u0006\u0000\u0124\u0127\u0003"+
		"\u0012\t\u0000\u0125\u0127\u0003\u0018\f\u0000\u0126\u0121\u0001\u0000"+
		"\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0007\u0001\u0000\u0000\u0000\u0128\u012a\u0003v;\u0000"+
		"\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\t\u0000\u0000\u012f\u0131\u0003r9\u0000\u0130\u0132"+
		"\u0003h4\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0011"+
		"\u0000\u0000\u0134\u0136\u0003Z-\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\u0018\u0000\u0000\u0138\u013a\u0003l6\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u00057\u0000\u0000\u013c\u013e\u0003"+
		"l6\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0003 \u0010\u0000"+
		"\u0140\t\u0001\u0000\u0000\u0000\u0141\u0143\u0003v;\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0005\u001c\u0000\u0000\u0148\u014a\u0003r9\u0000\u0149\u014b\u0003h"+
		"4\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0011\u0000"+
		"\u0000\u014d\u014f\u0003l6\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u00057\u0000\u0000\u0151\u0153\u0003l6\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0003\"\u0011\u0000\u0155\u000b\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0003v;\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0010\u0000\u0000"+
		"\u015d\u0160\u0003r9\u0000\u015e\u015f\u0005\u0018\u0000\u0000\u015f\u0161"+
		"\u0003l6\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0005>\u0000"+
		"\u0000\u0163\u0165\u0003\u000e\u0007\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000"+
		"\u0000\u0166\u0168\u0005C\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016c\u0001\u0000\u0000\u0000"+
		"\u0169\u016b\u0003$\u0012\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0005?\u0000\u0000\u0170\r"+
		"\u0001\u0000\u0000\u0000\u0171\u0176\u0003\u0010\b\u0000\u0172\u0173\u0005"+
		"C\u0000\u0000\u0173\u0175\u0003\u0010\b\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u000f\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017b\u0003x<\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0181\u0003r9\u0000\u0180\u0182\u0003\u00e4r\u0000\u0181\u0180"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184"+
		"\u0001\u0000\u0000\u0000\u0183\u0185\u0003 \u0010\u0000\u0184\u0183\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0011\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0003v;\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005F\u0000\u0000"+
		"\u018d\u018e\u0005\u001c\u0000\u0000\u018e\u018f\u0003r9\u0000\u018f\u0190"+
		"\u0003\u0014\n\u0000\u0190\u0013\u0001\u0000\u0000\u0000\u0191\u0195\u0005"+
		">\u0000\u0000\u0192\u0194\u0003\u0016\u000b\u0000\u0193\u0192\u0001\u0000"+
		"\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005?\u0000"+
		"\u0000\u0199\u0015\u0001\u0000\u0000\u0000\u019a\u019c\u0003v;\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u01ae\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0003Z-\u0000\u01a1\u01a2\u0003r9\u0000\u01a2\u01a3\u0005<\u0000"+
		"\u0000\u01a3\u01a6\u0005=\u0000\u0000\u01a4\u01a5\u0005\f\u0000\u0000"+
		"\u01a5\u01a7\u0003\u0080@\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005B\u0000\u0000\u01a9\u01af\u0001\u0000\u0000\u0000\u01aa\u01af"+
		"\u0003,\u0016\u0000\u01ab\u01af\u0003\b\u0004\u0000\u01ac\u01af\u0003"+
		"\n\u0005\u0000\u01ad\u01af\u0005B\u0000\u0000\u01ae\u01a0\u0001\u0000"+
		"\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u0017\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003v;\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u00055\u0000\u0000\u01b7\u01b9\u0003r9\u0000\u01b8\u01ba"+
		"\u0003h4\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01be\u0003\u001a"+
		"\r\u0000\u01bc\u01bd\u0005\u0018\u0000\u0000\u01bd\u01bf\u0003l6\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003 \u0010\u0000\u01c1"+
		"\u0019\u0001\u0000\u0000\u0000\u01c2\u01c4\u0005<\u0000\u0000\u01c3\u01c5"+
		"\u0003\u001c\u000e\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0005=\u0000\u0000\u01c7\u001b\u0001\u0000\u0000\u0000\u01c8\u01cd\u0003"+
		"\u001e\u000f\u0000\u01c9\u01ca\u0005C\u0000\u0000\u01ca\u01cc\u0003\u001e"+
		"\u000f\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u001d\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d2\u0003x<\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d8\u0003Z-\u0000\u01d7\u01d9"+
		"\u0005E\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0003"+
		"R)\u0000\u01db\u001f\u0001\u0000\u0000\u0000\u01dc\u01e0\u0005>\u0000"+
		"\u0000\u01dd\u01df\u0003$\u0012\u0000\u01de\u01dd\u0001\u0000\u0000\u0000"+
		"\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005?\u0000\u0000\u01e4"+
		"!\u0001\u0000\u0000\u0000\u01e5\u01e9\u0005>\u0000\u0000\u01e6\u01e8\u0003"+
		"&\u0013\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000"+
		"\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005?\u0000\u0000\u01ed#\u0001\u0000\u0000\u0000"+
		"\u01ee\u01fb\u0005B\u0000\u0000\u01ef\u01f1\u0005&\u0000\u0000\u01f0\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2\u01fb\u0003\u0084B\u0000\u01f3\u01f5\u0003"+
		"v;\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fb\u0003(\u0014\u0000\u01fa\u01ee\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f0\u0001\u0000\u0000\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000"+
		"\u01fb%\u0001\u0000\u0000\u0000\u01fc\u020d\u0005B\u0000\u0000\u01fd\u01ff"+
		"\u0003v;\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000"+
		"\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u020a\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0203\u020b\u0003,\u0016\u0000\u0204\u020b\u00034\u001a\u0000"+
		"\u0205\u020b\u0003\b\u0004\u0000\u0206\u020b\u0003\n\u0005\u0000\u0207"+
		"\u020b\u0003\f\u0006\u0000\u0208\u020b\u0003\u0018\f\u0000\u0209\u020b"+
		"\u0003\u0012\t\u0000\u020a\u0203\u0001\u0000\u0000\u0000\u020a\u0204\u0001"+
		"\u0000\u0000\u0000\u020a\u0205\u0001\u0000\u0000\u0000\u020a\u0206\u0001"+
		"\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020d\u0001"+
		"\u0000\u0000\u0000\u020c\u01fc\u0001\u0000\u0000\u0000\u020c\u0200\u0001"+
		"\u0000\u0000\u0000\u020d\'\u0001\u0000\u0000\u0000\u020e\u0219\u0003*"+
		"\u0015\u0000\u020f\u0219\u00032\u0019\u0000\u0210\u0219\u00036\u001b\u0000"+
		"\u0211\u0219\u00038\u001c\u0000\u0212\u0219\u0003:\u001d\u0000\u0213\u0219"+
		"\u0003\b\u0004\u0000\u0214\u0219\u0003\n\u0005\u0000\u0215\u0219\u0003"+
		"\f\u0006\u0000\u0216\u0219\u0003\u0018\f\u0000\u0217\u0219\u0003\u0012"+
		"\t\u0000\u0218\u020e\u0001\u0000\u0000\u0000\u0218\u020f\u0001\u0000\u0000"+
		"\u0000\u0218\u0210\u0001\u0000\u0000\u0000\u0218\u0211\u0001\u0000\u0000"+
		"\u0000\u0218\u0212\u0001\u0000\u0000\u0000\u0218\u0213\u0001\u0000\u0000"+
		"\u0000\u0218\u0214\u0001\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0217\u0001\u0000\u0000"+
		"\u0000\u0219)\u0001\u0000\u0000\u0000\u021a\u021b\u0003Z-\u0000\u021b"+
		"\u021c\u0003N\'\u0000\u021c\u021d\u0005B\u0000\u0000\u021d+\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0003Z-\u0000\u021f\u0220\u0003.\u0017\u0000"+
		"\u0220\u0221\u0005B\u0000\u0000\u0221-\u0001\u0000\u0000\u0000\u0222\u0227"+
		"\u00030\u0018\u0000\u0223\u0224\u0005C\u0000\u0000\u0224\u0226\u00030"+
		"\u0018\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000"+
		"\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228/\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0003r9\u0000\u022b\u022c\u0005]\u0000\u0000\u022c"+
		"\u022d\u0003T*\u0000\u022d1\u0001\u0000\u0000\u0000\u022e\u022f\u0003"+
		"X,\u0000\u022f\u0231\u0003r9\u0000\u0230\u0232\u0003h4\u0000\u0231\u0230"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0001\u0000\u0000\u0000\u0233\u0235\u0003B!\u0000\u0234\u0236\u0003t"+
		":\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0005-\u0000\u0000"+
		"\u0238\u023a\u0003n7\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u023e"+
		"\u0003<\u001e\u0000\u023c\u023e\u0005B\u0000\u0000\u023d\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e3\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0003X,\u0000\u0240\u0242\u0003r9\u0000\u0241\u0243"+
		"\u0003h4\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0003B!\u0000"+
		"\u0245\u0247\u0003t:\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0005-\u0000\u0000\u0249\u024b\u0003n7\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000"+
		"\u0000\u0000\u024c\u024f\u0003<\u001e\u0000\u024d\u024f\u0005B\u0000\u0000"+
		"\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000"+
		"\u024f5\u0001\u0000\u0000\u0000\u0250\u0251\u0003h4\u0000\u0251\u0252"+
		"\u00032\u0019\u0000\u02527\u0001\u0000\u0000\u0000\u0253\u0255\u0003r"+
		"9\u0000\u0254\u0256\u0003h4\u0000\u0255\u0254\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000"+
		"\u0257\u025a\u0003B!\u0000\u0258\u0259\u0005-\u0000\u0000\u0259\u025b"+
		"\u0003n7\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0003>\u001f"+
		"\u0000\u025d9\u0001\u0000\u0000\u0000\u025e\u025f\u0003h4\u0000\u025f"+
		"\u0260\u00038\u001c\u0000\u0260;\u0001\u0000\u0000\u0000\u0261\u0262\u0003"+
		"\u0084B\u0000\u0262=\u0001\u0000\u0000\u0000\u0263\u0265\u0005>\u0000"+
		"\u0000\u0264\u0266\u0003@ \u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0001\u0000\u0000\u0000\u0266\u026a\u0001\u0000\u0000\u0000\u0267"+
		"\u0269\u0003\u0086C\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u026c"+
		"\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u026a"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0005?\u0000\u0000\u026e?\u0001\u0000"+
		"\u0000\u0000\u026f\u0271\u0003`0\u0000\u0270\u026f\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0007\u0000\u0000\u0000\u0273\u027d\u0003\u00e4r\u0000\u0274"+
		"\u0275\u0003\u00dam\u0000\u0275\u0277\u0005D\u0000\u0000\u0276\u0278\u0003"+
		"`0\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0005(\u0000\u0000"+
		"\u027a\u027b\u0003\u00e4r\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c"+
		"\u0270\u0001\u0000\u0000\u0000\u027c\u0274\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0005B\u0000\u0000\u027fA\u0001"+
		"\u0000\u0000\u0000\u0280\u0282\u0005<\u0000\u0000\u0281\u0283\u0003D\""+
		"\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0005=\u0000\u0000"+
		"\u0285C\u0001\u0000\u0000\u0000\u0286\u0289\u0003F#\u0000\u0287\u0288"+
		"\u0005C\u0000\u0000\u0288\u028a\u0003D\"\u0000\u0289\u0287\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u0299\u0001\u0000"+
		"\u0000\u0000\u028b\u0290\u0003H$\u0000\u028c\u028d\u0005C\u0000\u0000"+
		"\u028d\u028f\u0003H$\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0292"+
		"\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0001\u0000\u0000\u0000\u0291\u0295\u0001\u0000\u0000\u0000\u0292\u0290"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005C\u0000\u0000\u0294\u0296\u0003"+
		"J%\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297\u0299\u0003J%\u0000\u0298"+
		"\u0286\u0001\u0000\u0000\u0000\u0298\u028b\u0001\u0000\u0000\u0000\u0298"+
		"\u0297\u0001\u0000\u0000\u0000\u0299E\u0001\u0000\u0000\u0000\u029a\u029c"+
		"\u0003x<\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a4\u0003Z-\u0000\u02a1\u02a2\u0003r9\u0000\u02a2"+
		"\u02a3\u0005D\u0000\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005+\u0000\u0000\u02a7G\u0001\u0000"+
		"\u0000\u0000\u02a8\u02aa\u0003L&\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02af\u0003Z-\u0000\u02af\u02b0"+
		"\u0003R)\u0000\u02b0I\u0001\u0000\u0000\u0000\u02b1\u02b3\u0003L&\u0000"+
		"\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\u0003Z-\u0000\u02b8\u02b9\u0005E\u0000\u0000\u02b9\u02ba"+
		"\u0003R)\u0000\u02baK\u0001\u0000\u0000\u0000\u02bb\u02be\u0005\u0012"+
		"\u0000\u0000\u02bc\u02be\u0003x<\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bc\u0001\u0000\u0000\u0000\u02beM\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c4\u0003P(\u0000\u02c0\u02c1\u0005C\u0000\u0000\u02c1\u02c3\u0003"+
		"P(\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c5O\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c7\u02ca\u0003R)\u0000\u02c8\u02c9\u0005]\u0000\u0000\u02c9\u02cb"+
		"\u0003T*\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000"+
		"\u0000\u0000\u02cbQ\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003r9\u0000"+
		"\u02cd\u02cf\u0003t:\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cfS\u0001\u0000\u0000\u0000\u02d0\u02d3\u0003"+
		"\u00aeW\u0000\u02d1\u02d3\u0003V+\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3U\u0001\u0000\u0000\u0000"+
		"\u02d4\u02e0\u0005>\u0000\u0000\u02d5\u02da\u0003T*\u0000\u02d6\u02d7"+
		"\u0005C\u0000\u0000\u02d7\u02d9\u0003T*\u0000\u02d8\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02de\u0001\u0000"+
		"\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd\u02df\u0005C\u0000"+
		"\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000"+
		"\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02d5\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0005?\u0000\u0000\u02e3W\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e7\u0003Z-\u0000\u02e5\u02e7\u00050\u0000\u0000\u02e6\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e7Y\u0001\u0000"+
		"\u0000\u0000\u02e8\u02ea\u0003x<\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000"+
		"\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02f0\u0001\u0000\u0000\u0000"+
		"\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f1\u0003^/\u0000\u02ef\u02f1"+
		"\u0003\\.\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f3\u0001\u0000\u0000\u0000\u02f2\u02f4\u0003"+
		"t:\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f4[\u0001\u0000\u0000\u0000\u02f5\u02f7\u0003r9\u0000\u02f6"+
		"\u02f8\u0003`0\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f8\u0306\u0001\u0000\u0000\u0000\u02f9\u02fd\u0005"+
		"D\u0000\u0000\u02fa\u02fc\u0003x<\u0000\u02fb\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u0300\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0302\u0003r9\u0000\u0301"+
		"\u0303\u0003`0\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001"+
		"\u0000\u0000\u0000\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u02f9\u0001"+
		"\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307]\u0001\u0000"+
		"\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0007\u0001"+
		"\u0000\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u030c\u0005_\u0000\u0000"+
		"\u030c\u030d\u0003d2\u0000\u030d\u030e\u0005^\u0000\u0000\u030ea\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0005_\u0000\u0000\u0310\u0313\u0005^\u0000"+
		"\u0000\u0311\u0313\u0003`0\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0312"+
		"\u0311\u0001\u0000\u0000\u0000\u0313c\u0001\u0000\u0000\u0000\u0314\u0319"+
		"\u0003f3\u0000\u0315\u0316\u0005C\u0000\u0000\u0316\u0318\u0003f3\u0000"+
		"\u0317\u0315\u0001\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000"+
		"\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000"+
		"\u031ae\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c"+
		"\u0323\u0003Z-\u0000\u031d\u0320\u0005I\u0000\u0000\u031e\u031f\u0007"+
		"\u0002\u0000\u0000\u031f\u0321\u0003Z-\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000"+
		"\u0000\u0322\u031c\u0001\u0000\u0000\u0000\u0322\u031d\u0001\u0000\u0000"+
		"\u0000\u0323g\u0001\u0000\u0000\u0000\u0324\u0325\u0005_\u0000\u0000\u0325"+
		"\u032a\u0003j5\u0000\u0326\u0327\u0005C\u0000\u0000\u0327\u0329\u0003"+
		"j5\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000"+
		"\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0005^\u0000\u0000\u032ei\u0001\u0000\u0000\u0000\u032f"+
		"\u0331\u0003x<\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0331\u0334\u0001"+
		"\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332\u0333\u0001"+
		"\u0000\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u0332\u0001"+
		"\u0000\u0000\u0000\u0335\u033f\u0003r9\u0000\u0336\u0337\u0005\u0011\u0000"+
		"\u0000\u0337\u033c\u0003Z-\u0000\u0338\u0339\u0005f\u0000\u0000\u0339"+
		"\u033b\u0003Z-\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033e\u0001"+
		"\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001"+
		"\u0000\u0000\u0000\u033f\u0336\u0001\u0000\u0000\u0000\u033f\u0340\u0001"+
		"\u0000\u0000\u0000\u0340k\u0001\u0000\u0000\u0000\u0341\u0346\u0003Z-"+
		"\u0000\u0342\u0343\u0005C\u0000\u0000\u0343\u0345\u0003Z-\u0000\u0344"+
		"\u0342\u0001\u0000\u0000\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346"+
		"\u0344\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347"+
		"m\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034e"+
		"\u0003p8\u0000\u034a\u034b\u0005C\u0000\u0000\u034b\u034d\u0003p8\u0000"+
		"\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u0350\u0001\u0000\u0000\u0000"+
		"\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034fo\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351"+
		"\u0356\u0003r9\u0000\u0352\u0353\u0005D\u0000\u0000\u0353\u0355\u0003"+
		"r9\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000\u0000"+
		"\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000"+
		"\u0000\u0357q\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000"+
		"\u0359\u0361\u0005\u00b4\u0000\u0000\u035a\u0361\u00053\u0000\u0000\u035b"+
		"\u0361\u00054\u0000\u0000\u035c\u0361\u00055\u0000\u0000\u035d\u0361\u0005"+
		"6\u0000\u0000\u035e\u0361\u00057\u0000\u0000\u035f\u0361\u0003z=\u0000"+
		"\u0360\u0359\u0001\u0000\u0000\u0000\u0360\u035a\u0001\u0000\u0000\u0000"+
		"\u0360\u035b\u0001\u0000\u0000\u0000\u0360\u035c\u0001\u0000\u0000\u0000"+
		"\u0360\u035d\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000"+
		"\u0360\u035f\u0001\u0000\u0000\u0000\u0361s\u0001\u0000\u0000\u0000\u0362"+
		"\u0364\u0003x<\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0364\u0367\u0001"+
		"\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366\u0368\u0001\u0000\u0000\u0000\u0367\u0365\u0001"+
		"\u0000\u0000\u0000\u0368\u0369\u0005@\u0000\u0000\u0369\u036b\u0005A\u0000"+
		"\u0000\u036a\u0365\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000"+
		"\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000"+
		"\u0000\u036du\u0001\u0000\u0000\u0000\u036e\u037e\u0003x<\u0000\u036f"+
		"\u037e\u0005#\u0000\u0000\u0370\u037e\u0005\"\u0000\u0000\u0371\u037e"+
		"\u0005!\u0000\u0000\u0372\u037e\u0005\u0001\u0000\u0000\u0373\u037e\u0005"+
		"&\u0000\u0000\u0374\u037e\u0005\u0012\u0000\u0000\u0375\u037e\u0005\'"+
		"\u0000\u0000\u0376\u037e\u0005\f\u0000\u0000\u0377\u037e\u0005*\u0000"+
		"\u0000\u0378\u037e\u0005\u001e\u0000\u0000\u0379\u037e\u0005.\u0000\u0000"+
		"\u037a\u037e\u00051\u0000\u0000\u037b\u037e\u00056\u0000\u0000\u037c\u037e"+
		"\u00058\u0000\u0000\u037d\u036e\u0001\u0000\u0000\u0000\u037d\u036f\u0001"+
		"\u0000\u0000\u0000\u037d\u0370\u0001\u0000\u0000\u0000\u037d\u0371\u0001"+
		"\u0000\u0000\u0000\u037d\u0372\u0001\u0000\u0000\u0000\u037d\u0373\u0001"+
		"\u0000\u0000\u0000\u037d\u0374\u0001\u0000\u0000\u0000\u037d\u0375\u0001"+
		"\u0000\u0000\u0000\u037d\u0376\u0001\u0000\u0000\u0000\u037d\u0377\u0001"+
		"\u0000\u0000\u0000\u037d\u0378\u0001\u0000\u0000\u0000\u037d\u0379\u0001"+
		"\u0000\u0000\u0000\u037d\u037a\u0001\u0000\u0000\u0000\u037d\u037b\u0001"+
		"\u0000\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037ew\u0001\u0000"+
		"\u0000\u0000\u037f\u0382\u0005F\u0000\u0000\u0380\u0383\u0003z=\u0000"+
		"\u0381\u0383\u0003p8\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0381"+
		"\u0001\u0000\u0000\u0000\u0383\u038a\u0001\u0000\u0000\u0000\u0384\u0387"+
		"\u0005<\u0000\u0000\u0385\u0388\u0003|>\u0000\u0386\u0388\u0003\u0080"+
		"@\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0386\u0001\u0000\u0000"+
		"\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000"+
		"\u0000\u0389\u038b\u0005=\u0000\u0000\u038a\u0384\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0001\u0000\u0000\u0000\u038by\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0007\u0003\u0000\u0000\u038d{\u0001\u0000\u0000\u0000\u038e\u0393"+
		"\u0003~?\u0000\u038f\u0390\u0005C\u0000\u0000\u0390\u0392\u0003~?\u0000"+
		"\u0391\u038f\u0001\u0000\u0000\u0000\u0392\u0395\u0001\u0000\u0000\u0000"+
		"\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000"+
		"\u0394}\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0396"+
		"\u0397\u0003r9\u0000\u0397\u0398\u0005]\u0000\u0000\u0398\u0399\u0003"+
		"\u0080@\u0000\u0399\u007f\u0001\u0000\u0000\u0000\u039a\u039e\u0003\u00ba"+
		"]\u0000\u039b\u039e\u0003x<\u0000\u039c\u039e\u0003\u0082A\u0000\u039d"+
		"\u039a\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039d"+
		"\u039c\u0001\u0000\u0000\u0000\u039e\u0081\u0001\u0000\u0000\u0000\u039f"+
		"\u03ab\u0005>\u0000\u0000\u03a0\u03a5\u0003\u0080@\u0000\u03a1\u03a2\u0005"+
		"C\u0000\u0000\u03a2\u03a4\u0003\u0080@\u0000\u03a3\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a4\u03a7\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a8\u03aa\u0005C\u0000\u0000"+
		"\u03a9\u03a8\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ac\u0001\u0000\u0000\u0000\u03ab\u03a0\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0005?\u0000\u0000\u03ae\u0083\u0001\u0000\u0000\u0000\u03af"+
		"\u03b3\u0005>\u0000\u0000\u03b0\u03b2\u0003\u0086C\u0000\u03b1\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005"+
		"?\u0000\u0000\u03b7\u0085\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003\u008a"+
		"E\u0000\u03b9\u03ba\u0005B\u0000\u0000\u03ba\u03be\u0001\u0000\u0000\u0000"+
		"\u03bb\u03be\u0003\u0088D\u0000\u03bc\u03be\u0003\u008eG\u0000\u03bd\u03b8"+
		"\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03bc"+
		"\u0001\u0000\u0000\u0000\u03be\u0087\u0001\u0000\u0000\u0000\u03bf\u03c4"+
		"\u0003\b\u0004\u0000\u03c0\u03c4\u0003\n\u0005\u0000\u03c1\u03c4\u0003"+
		"\f\u0006\u0000\u03c2\u03c4\u0003\u0018\f\u0000\u03c3\u03bf\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c4\u0089\u0001\u0000"+
		"\u0000\u0000\u03c5\u03c7\u0003L&\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c7\u03ca\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb\u03cc\u0003\u008cF\u0000\u03cc"+
		"\u03cd\u0003N\'\u0000\u03cd\u008b\u0001\u0000\u0000\u0000\u03ce\u03d1"+
		"\u0003Z-\u0000\u03cf\u03d1\u00053\u0000\u0000\u03d0\u03ce\u0001\u0000"+
		"\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u008d\u0001\u0000"+
		"\u0000\u0000\u03d2\u043a\u0003\u0084B\u0000\u03d3\u03d4\u0005\u0002\u0000"+
		"\u0000\u03d4\u03d7\u0003\u00aeW\u0000\u03d5\u03d6\u0005H\u0000\u0000\u03d6"+
		"\u03d8\u0003\u00aeW\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d7\u03d8"+
		"\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03da"+
		"\u0005B\u0000\u0000\u03da\u043a\u0001\u0000\u0000\u0000\u03db\u03dc\u0005"+
		"\u0017\u0000\u0000\u03dc\u03dd\u0005<\u0000\u0000\u03dd\u03de\u0003\u00ae"+
		"W\u0000\u03de\u03df\u0005=\u0000\u0000\u03df\u03e2\u0003\u008eG\u0000"+
		"\u03e0\u03e1\u0005\u000f\u0000\u0000\u03e1\u03e3\u0003\u008eG\u0000\u03e2"+
		"\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3"+
		"\u043a\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\u0015\u0000\u0000\u03e5"+
		"\u03e6\u0005<\u0000\u0000\u03e6\u03e7\u0003\u0092I\u0000\u03e7\u03e8\u0005"+
		"=\u0000\u0000\u03e8\u03e9\u0003\u008eG\u0000\u03e9\u043a\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u00052\u0000\u0000\u03eb\u03ec\u0005<\u0000\u0000\u03ec"+
		"\u03ed\u0003\u00aeW\u0000\u03ed\u03ee\u0005=\u0000\u0000\u03ee\u03ef\u0003"+
		"\u008eG\u0000\u03ef\u043a\u0001\u0000\u0000\u0000\u03f0\u03f1\u0005\r"+
		"\u0000\u0000\u03f1\u03f2\u0003\u008eG\u0000\u03f2\u03f3\u00052\u0000\u0000"+
		"\u03f3\u03f4\u0005<\u0000\u0000\u03f4\u03f5\u0003\u00aeW\u0000\u03f5\u03f6"+
		"\u0005=\u0000\u0000\u03f6\u03f7\u0005B\u0000\u0000\u03f7\u043a\u0001\u0000"+
		"\u0000\u0000\u03f8\u03fa\u0005/\u0000\u0000\u03f9\u03fb\u0003\u009aM\u0000"+
		"\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u0400\u0003\u0084B\u0000\u03fd"+
		"\u03ff\u0003\u00a0P\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff\u0402"+
		"\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401"+
		"\u0001\u0000\u0000\u0000\u0401\u0405\u0001\u0000\u0000\u0000\u0402\u0400"+
		"\u0001\u0000\u0000\u0000\u0403\u0404\u0005\u0013\u0000\u0000\u0404\u0406"+
		"\u0003\u0084B\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0405\u0406\u0001"+
		"\u0000\u0000\u0000\u0406\u043a\u0001\u0000\u0000\u0000\u0407\u0408\u0005"+
		")\u0000\u0000\u0408\u0409\u0005<\u0000\u0000\u0409\u040a\u0003\u00aeW"+
		"\u0000\u040a\u040b\u0005=\u0000\u0000\u040b\u040f\u0005>\u0000\u0000\u040c"+
		"\u040e\u0003\u00a6S\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u0411"+
		"\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u040f"+
		"\u0001\u0000\u0000\u0000\u0412\u0413\u0005?\u0000\u0000\u0413\u043a\u0001"+
		"\u0000\u0000\u0000\u0414\u0415\u0005*\u0000\u0000\u0415\u0416\u0005<\u0000"+
		"\u0000\u0416\u0417\u0003\u00aeW\u0000\u0417\u0418\u0005=\u0000\u0000\u0418"+
		"\u0419\u0003\u0084B\u0000\u0419\u043a\u0001\u0000\u0000\u0000\u041a\u041c"+
		"\u0005$\u0000\u0000\u041b\u041d\u0003\u00aeW\u0000\u041c\u041b\u0001\u0000"+
		"\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000"+
		"\u0000\u0000\u041e\u043a\u0005B\u0000\u0000\u041f\u0420\u0005,\u0000\u0000"+
		"\u0420\u0421\u0003\u00aeW\u0000\u0421\u0422\u0005B\u0000\u0000\u0422\u043a"+
		"\u0001\u0000\u0000\u0000\u0423\u0425\u0005\u0004\u0000\u0000\u0424\u0426"+
		"\u0003r9\u0000\u0425\u0424\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u043a\u0005B\u0000"+
		"\u0000\u0428\u042a\u0005\u000b\u0000\u0000\u0429\u042b\u0003r9\u0000\u042a"+
		"\u0429\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u043a\u0005B\u0000\u0000\u042d\u042e"+
		"\u00054\u0000\u0000\u042e\u042f\u0003\u00aeW\u0000\u042f\u0430\u0005B"+
		"\u0000\u0000\u0430\u043a\u0001\u0000\u0000\u0000\u0431\u043a\u0005B\u0000"+
		"\u0000\u0432\u0433\u0003\u00acV\u0000\u0433\u0434\u0005B\u0000\u0000\u0434"+
		"\u043a\u0001\u0000\u0000\u0000\u0435\u0436\u0003r9\u0000\u0436\u0437\u0005"+
		"H\u0000\u0000\u0437\u0438\u0003\u008eG\u0000\u0438\u043a\u0001\u0000\u0000"+
		"\u0000\u0439\u03d2\u0001\u0000\u0000\u0000\u0439\u03d3\u0001\u0000\u0000"+
		"\u0000\u0439\u03db\u0001\u0000\u0000\u0000\u0439\u03e4\u0001\u0000\u0000"+
		"\u0000\u0439\u03ea\u0001\u0000\u0000\u0000\u0439\u03f0\u0001\u0000\u0000"+
		"\u0000\u0439\u03f8\u0001\u0000\u0000\u0000\u0439\u0407\u0001\u0000\u0000"+
		"\u0000\u0439\u0414\u0001\u0000\u0000\u0000\u0439\u041a\u0001\u0000\u0000"+
		"\u0000\u0439\u041f\u0001\u0000\u0000\u0000\u0439\u0423\u0001\u0000\u0000"+
		"\u0000\u0439\u0428\u0001\u0000\u0000\u0000\u0439\u042d\u0001\u0000\u0000"+
		"\u0000\u0439\u0431\u0001\u0000\u0000\u0000\u0439\u0432\u0001\u0000\u0000"+
		"\u0000\u0439\u0435\u0001\u0000\u0000\u0000\u043a\u008f\u0001\u0000\u0000"+
		"\u0000\u043b\u043c\u0003\u008aE\u0000\u043c\u043d\u0005B\u0000\u0000\u043d"+
		"\u0091\u0001\u0000\u0000\u0000\u043e\u044b\u0003\u0094J\u0000\u043f\u0441"+
		"\u0003\u0096K\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441\u0001"+
		"\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0444\u0005"+
		"B\u0000\u0000\u0443\u0445\u0003\u00aeW\u0000\u0444\u0443\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"+
		"\u0000\u0446\u0448\u0005B\u0000\u0000\u0447\u0449\u0003\u0098L\u0000\u0448"+
		"\u0447\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449"+
		"\u044b\u0001\u0000\u0000\u0000\u044a\u043e\u0001\u0000\u0000\u0000\u044a"+
		"\u0440\u0001\u0000\u0000\u0000\u044b\u0093\u0001\u0000\u0000\u0000\u044c"+
		"\u044e\u0003L&\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044e\u0451\u0001"+
		"\u0000\u0000\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u044f\u0450\u0001"+
		"\u0000\u0000\u0000\u0450\u0452\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0452\u0453\u0003\u008cF\u0000\u0453\u0454\u0003R)"+
		"\u0000\u0454\u0455\u0005H\u0000\u0000\u0455\u0456\u0003\u00aeW\u0000\u0456"+
		"\u0095\u0001\u0000\u0000\u0000\u0457\u045a\u0003\u008aE\u0000\u0458\u045a"+
		"\u0003\u0098L\u0000\u0459\u0457\u0001\u0000\u0000\u0000\u0459\u0458\u0001"+
		"\u0000\u0000\u0000\u045a\u0097\u0001\u0000\u0000\u0000\u045b\u0460\u0003"+
		"\u00acV\u0000\u045c\u045d\u0005C\u0000\u0000\u045d\u045f\u0003\u00acV"+
		"\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045f\u0462\u0001\u0000\u0000"+
		"\u0000\u0460\u045e\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000"+
		"\u0000\u0461\u0099\u0001\u0000\u0000\u0000\u0462\u0460\u0001\u0000\u0000"+
		"\u0000\u0463\u0464\u0005<\u0000\u0000\u0464\u0466\u0003\u009cN\u0000\u0465"+
		"\u0467\u0005B\u0000\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0469"+
		"\u0005=\u0000\u0000\u0469\u009b\u0001\u0000\u0000\u0000\u046a\u046f\u0003"+
		"\u009eO\u0000\u046b\u046c\u0005B\u0000\u0000\u046c\u046e\u0003\u009eO"+
		"\u0000\u046d\u046b\u0001\u0000\u0000\u0000\u046e\u0471\u0001\u0000\u0000"+
		"\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000"+
		"\u0000\u0470\u009d\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000\u0000"+
		"\u0000\u0472\u0474\u0003L&\u0000\u0473\u0472\u0001\u0000\u0000\u0000\u0474"+
		"\u0477\u0001\u0000\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475"+
		"\u0476\u0001\u0000\u0000\u0000\u0476\u0478\u0001\u0000\u0000\u0000\u0477"+
		"\u0475\u0001\u0000\u0000\u0000\u0478\u0479\u0003\u008cF\u0000\u0479\u047a"+
		"\u0003R)\u0000\u047a\u047b\u0005]\u0000\u0000\u047b\u047c\u0003\u00ae"+
		"W\u0000\u047c\u047f\u0001\u0000\u0000\u0000\u047d\u047f\u0003p8\u0000"+
		"\u047e\u0475\u0001\u0000\u0000\u0000\u047e\u047d\u0001\u0000\u0000\u0000"+
		"\u047f\u009f\u0001\u0000\u0000\u0000\u0480\u0481\u0005\u0007\u0000\u0000"+
		"\u0481\u0482\u0005<\u0000\u0000\u0482\u0483\u0003\u00a2Q\u0000\u0483\u0484"+
		"\u0005=\u0000\u0000\u0484\u0485\u0003\u0084B\u0000\u0485\u00a1\u0001\u0000"+
		"\u0000\u0000\u0486\u0488\u0003L&\u0000\u0487\u0486\u0001\u0000\u0000\u0000"+
		"\u0488\u048b\u0001\u0000\u0000\u0000\u0489\u0487\u0001\u0000\u0000\u0000"+
		"\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048c\u0001\u0000\u0000\u0000"+
		"\u048b\u0489\u0001\u0000\u0000\u0000\u048c\u048d\u0003\u00a4R\u0000\u048d"+
		"\u048e\u0003r9\u0000\u048e\u00a3\u0001\u0000\u0000\u0000\u048f\u0494\u0003"+
		"p8\u0000\u0490\u0491\u0005g\u0000\u0000\u0491\u0493\u0003p8\u0000\u0492"+
		"\u0490\u0001\u0000\u0000\u0000\u0493\u0496\u0001\u0000\u0000\u0000\u0494"+
		"\u0492\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495"+
		"\u00a5\u0001\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0497"+
		"\u0499\u0003\u00a8T\u0000\u0498\u0497\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049a\u049b"+
		"\u0001\u0000\u0000\u0000\u049b\u049f\u0001\u0000\u0000\u0000\u049c\u049e"+
		"\u0003\u0086C\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001"+
		"\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001"+
		"\u0000\u0000\u0000\u04a0\u00a7\u0001\u0000\u0000\u0000\u04a1\u049f\u0001"+
		"\u0000\u0000\u0000\u04a2\u04ad\u0005\u0006\u0000\u0000\u04a3\u04a8\u0003"+
		"\u00aaU\u0000\u04a4\u04a5\u0005C\u0000\u0000\u04a5\u04a7\u0003\u00aaU"+
		"\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a7\u04aa\u0001\u0000\u0000"+
		"\u0000\u04a8\u04a6\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000"+
		"\u0000\u04a9\u04ae\u0001\u0000\u0000\u0000\u04aa\u04a8\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ae\u00059\u0000\u0000\u04ac\u04ae\u0005\f\u0000\u0000"+
		"\u04ad\u04a3\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000"+
		"\u04af\u04b3\u0005H\u0000\u0000\u04b0\u04b1\u0005\f\u0000\u0000\u04b1"+
		"\u04b3\u0005H\u0000\u0000\u04b2\u04a2\u0001\u0000\u0000\u0000\u04b2\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b3\u00a9\u0001\u0000\u0000\u0000\u04b4\u04b5"+
		"\u0003\u00aeW\u0000\u04b5\u00ab\u0001\u0000\u0000\u0000\u04b6\u04b7\u0003"+
		"\u00aeW\u0000\u04b7\u00ad\u0001\u0000\u0000\u0000\u04b8\u04bb\u0003\u00b0"+
		"X\u0000\u04b9\u04bb\u0003\u00b6[\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000"+
		"\u04ba\u04b9\u0001\u0000\u0000\u0000\u04bb\u00af\u0001\u0000\u0000\u0000"+
		"\u04bc\u04bd\u0003\u00b2Y\u0000\u04bd\u04c0\u0005J\u0000\u0000\u04be\u04c1"+
		"\u0003\u00aeW\u0000\u04bf\u04c1\u0003\u0084B\u0000\u04c0\u04be\u0001\u0000"+
		"\u0000\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c1\u00b1\u0001\u0000"+
		"\u0000\u0000\u04c2\u04ce\u0003r9\u0000\u04c3\u04c5\u0005<\u0000\u0000"+
		"\u04c4\u04c6\u0003D\"\u0000\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7"+
		"\u04ce\u0005=\u0000\u0000\u04c8\u04ca\u0005<\u0000\u0000\u04c9\u04cb\u0003"+
		"\u00b4Z\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000"+
		"\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u04ce\u0005=\u0000"+
		"\u0000\u04cd\u04c2\u0001\u0000\u0000\u0000\u04cd\u04c3\u0001\u0000\u0000"+
		"\u0000\u04cd\u04c8\u0001\u0000\u0000\u0000\u04ce\u00b3\u0001\u0000\u0000"+
		"\u0000\u04cf\u04d4\u0003r9\u0000\u04d0\u04d1\u0005C\u0000\u0000\u04d1"+
		"\u04d3\u0003r9\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d6\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001"+
		"\u0000\u0000\u0000\u04d5\u00b5\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d7\u04db\u0003\u00ba]\u0000\u04d8\u04d9\u0003\u00b8"+
		"\\\u0000\u04d9\u04da\u0003\u00aeW\u0000\u04da\u04dc\u0001\u0000\u0000"+
		"\u0000\u04db\u04d8\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000"+
		"\u0000\u04dc\u00b7\u0001\u0000\u0000\u0000\u04dd\u04ed\u0005]\u0000\u0000"+
		"\u04de\u04ed\u0005L\u0000\u0000\u04df\u04ed\u0005M\u0000\u0000\u04e0\u04ed"+
		"\u0005N\u0000\u0000\u04e1\u04ed\u0005O\u0000\u0000\u04e2\u04ed\u0005S"+
		"\u0000\u0000\u04e3\u04ed\u0005P\u0000\u0000\u04e4\u04ed\u0005Q\u0000\u0000"+
		"\u04e5\u04ed\u0005R\u0000\u0000\u04e6\u04ed\u0005K\u0000\u0000\u04e7\u04e8"+
		"\u0005^\u0000\u0000\u04e8\u04ed\u0005Z\u0000\u0000\u04e9\u04ea\u0005^"+
		"\u0000\u0000\u04ea\u04eb\u0005^\u0000\u0000\u04eb\u04ed\u0005Z\u0000\u0000"+
		"\u04ec\u04dd\u0001\u0000\u0000\u0000\u04ec\u04de\u0001\u0000\u0000\u0000"+
		"\u04ec\u04df\u0001\u0000\u0000\u0000\u04ec\u04e0\u0001\u0000\u0000\u0000"+
		"\u04ec\u04e1\u0001\u0000\u0000\u0000\u04ec\u04e2\u0001\u0000\u0000\u0000"+
		"\u04ec\u04e3\u0001\u0000\u0000\u0000\u04ec\u04e4\u0001\u0000\u0000\u0000"+
		"\u04ec\u04e5\u0001\u0000\u0000\u0000\u04ec\u04e6\u0001\u0000\u0000\u0000"+
		"\u04ec\u04e7\u0001\u0000\u0000\u0000\u04ec\u04e9\u0001\u0000\u0000\u0000"+
		"\u04ed\u00b9\u0001\u0000\u0000\u0000\u04ee\u04f4\u0003\u00bc^\u0000\u04ef"+
		"\u04f0\u0005I\u0000\u0000\u04f0\u04f1\u0003\u00aeW\u0000\u04f1\u04f2\u0005"+
		"H\u0000\u0000\u04f2\u04f3\u0003\u00ba]\u0000\u04f3\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f4\u04ef\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f5\u00bb\u0001\u0000\u0000\u0000\u04f6\u04fb\u0003\u00be_\u0000"+
		"\u04f7\u04f8\u0005\\\u0000\u0000\u04f8\u04fa\u0003\u00be_\u0000\u04f9"+
		"\u04f7\u0001\u0000\u0000\u0000\u04fa\u04fd\u0001\u0000\u0000\u0000\u04fb"+
		"\u04f9\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc"+
		"\u00bd\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe"+
		"\u0503\u0003\u00c0`\u0000\u04ff\u0500\u0005[\u0000\u0000\u0500\u0502\u0003"+
		"\u00c0`\u0000\u0501\u04ff\u0001\u0000\u0000\u0000\u0502\u0505\u0001\u0000"+
		"\u0000\u0000\u0503\u0501\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000"+
		"\u0000\u0000\u0504\u00bf\u0001\u0000\u0000\u0000\u0505\u0503\u0001\u0000"+
		"\u0000\u0000\u0506\u050b\u0003\u00c2a\u0000\u0507\u0508\u0005g\u0000\u0000"+
		"\u0508\u050a\u0003\u00c2a\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u050a"+
		"\u050d\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b"+
		"\u050c\u0001\u0000\u0000\u0000\u050c\u00c1\u0001\u0000\u0000\u0000\u050d"+
		"\u050b\u0001\u0000\u0000\u0000\u050e\u0513\u0003\u00c4b\u0000\u050f\u0510"+
		"\u0005h\u0000\u0000\u0510\u0512\u0003\u00c4b\u0000\u0511\u050f\u0001\u0000"+
		"\u0000\u0000\u0512\u0515\u0001\u0000\u0000\u0000\u0513\u0511\u0001\u0000"+
		"\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u00c3\u0001\u0000"+
		"\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000\u0516\u051b\u0003\u00c6"+
		"c\u0000\u0517\u0518\u0005f\u0000\u0000\u0518\u051a\u0003\u00c6c\u0000"+
		"\u0519\u0517\u0001\u0000\u0000\u0000\u051a\u051d\u0001\u0000\u0000\u0000"+
		"\u051b\u0519\u0001\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000"+
		"\u051c\u00c5\u0001\u0000\u0000\u0000\u051d\u051b\u0001\u0000\u0000\u0000"+
		"\u051e\u0523\u0003\u00c8d\u0000\u051f\u0520\u0007\u0004\u0000\u0000\u0520"+
		"\u0522\u0003\u00c8d\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0522\u0525"+
		"\u0001\u0000\u0000\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0523\u0524"+
		"\u0001\u0000\u0000\u0000\u0524\u00c7\u0001\u0000\u0000\u0000\u0525\u0523"+
		"\u0001\u0000\u0000\u0000\u0526\u052d\u0003\u00ccf\u0000\u0527\u0528\u0007"+
		"\u0005\u0000\u0000\u0528\u052c\u0003\u00ccf\u0000\u0529\u052a\u0005\u001a"+
		"\u0000\u0000\u052a\u052c\u0003\u00cae\u0000\u052b\u0527\u0001\u0000\u0000"+
		"\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052c\u052f\u0001\u0000\u0000"+
		"\u0000\u052d\u052b\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000"+
		"\u0000\u052e\u00c9\u0001\u0000\u0000\u0000\u052f\u052d\u0001\u0000\u0000"+
		"\u0000\u0530\u0532\u0003Z-\u0000\u0531\u0533\u0003r9\u0000\u0532\u0531"+
		"\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u00cb"+
		"\u0001\u0000\u0000\u0000\u0534\u053a\u0003\u00d0h\u0000\u0535\u0536\u0003"+
		"\u00ceg\u0000\u0536\u0537\u0003\u00d0h\u0000\u0537\u0539\u0001\u0000\u0000"+
		"\u0000\u0538\u0535\u0001\u0000\u0000\u0000\u0539\u053c\u0001\u0000\u0000"+
		"\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000\u0000"+
		"\u0000\u053b\u00cd\u0001\u0000\u0000\u0000\u053c\u053a\u0001\u0000\u0000"+
		"\u0000\u053d\u0544\u0005T\u0000\u0000\u053e\u053f\u0005^\u0000\u0000\u053f"+
		"\u0540\u0005^\u0000\u0000\u0540\u0544\u0005^\u0000\u0000\u0541\u0542\u0005"+
		"^\u0000\u0000\u0542\u0544\u0005^\u0000\u0000\u0543\u053d\u0001\u0000\u0000"+
		"\u0000\u0543\u053e\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000"+
		"\u0000\u0544\u00cf\u0001\u0000\u0000\u0000\u0545\u054a\u0003\u00d2i\u0000"+
		"\u0546\u0547\u0007\u0006\u0000\u0000\u0547\u0549\u0003\u00d2i\u0000\u0548"+
		"\u0546\u0001\u0000\u0000\u0000\u0549\u054c\u0001\u0000\u0000\u0000\u054a"+
		"\u0548\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b"+
		"\u00d1\u0001\u0000\u0000\u0000\u054c\u054a\u0001\u0000\u0000\u0000\u054d"+
		"\u0552\u0003\u00d4j\u0000\u054e\u054f\u0007\u0007\u0000\u0000\u054f\u0551"+
		"\u0003\u00d4j\u0000\u0550\u054e\u0001\u0000\u0000\u0000\u0551\u0554\u0001"+
		"\u0000\u0000\u0000\u0552\u0550\u0001\u0000\u0000\u0000\u0552\u0553\u0001"+
		"\u0000\u0000\u0000\u0553\u00d3\u0001\u0000\u0000\u0000\u0554\u0552\u0001"+
		"\u0000\u0000\u0000\u0555\u0556\u0007\b\u0000\u0000\u0556\u055e\u0003\u00d4"+
		"j\u0000\u0557\u0558\u0005<\u0000\u0000\u0558\u0559\u0003Z-\u0000\u0559"+
		"\u055a\u0005=\u0000\u0000\u055a\u055b\u0003\u00d4j\u0000\u055b\u055e\u0001"+
		"\u0000\u0000\u0000\u055c\u055e\u0003\u00d6k\u0000\u055d\u0555\u0001\u0000"+
		"\u0000\u0000\u055d\u0557\u0001\u0000\u0000\u0000\u055d\u055c\u0001\u0000"+
		"\u0000\u0000\u055e\u00d5\u0001\u0000\u0000\u0000\u055f\u0565\u0003\u00da"+
		"m\u0000\u0560\u0564\u0003\u00d8l\u0000\u0561\u0564\u0005U\u0000\u0000"+
		"\u0562\u0564\u0005V\u0000\u0000\u0563\u0560\u0001\u0000\u0000\u0000\u0563"+
		"\u0561\u0001\u0000\u0000\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0564"+
		"\u0567\u0001\u0000\u0000\u0000\u0565\u0563\u0001\u0000\u0000\u0000\u0565"+
		"\u0566\u0001\u0000\u0000\u0000\u0566\u00d7\u0001\u0000\u0000\u0000\u0567"+
		"\u0565\u0001\u0000\u0000\u0000\u0568\u0569\u0005D\u0000\u0000\u0569\u056b"+
		"\u0003r9\u0000\u056a\u056c\u0003\u00e4r\u0000\u056b\u056a\u0001\u0000"+
		"\u0000\u0000\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u0585\u0001\u0000"+
		"\u0000\u0000\u056d\u056e\u0005D\u0000\u0000\u056e\u0585\u0005+\u0000\u0000"+
		"\u056f\u0570\u0005D\u0000\u0000\u0570\u0585\u0005(\u0000\u0000\u0571\u0572"+
		"\u0005D\u0000\u0000\u0572\u0574\u0005\u001f\u0000\u0000\u0573\u0575\u0003"+
		"`0\u0000\u0574\u0573\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000"+
		"\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u0585\u0003\u00e0p\u0000"+
		"\u0577\u0578\u0005@\u0000\u0000\u0578\u0579\u0003\u00aeW\u0000\u0579\u057a"+
		"\u0005A\u0000\u0000\u057a\u0585\u0001\u0000\u0000\u0000\u057b\u057d\u0005"+
		"G\u0000\u0000\u057c\u057e\u0003`0\u0000\u057d\u057c\u0001\u0000\u0000"+
		"\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u0581\u0001\u0000\u0000"+
		"\u0000\u057f\u0582\u0003r9\u0000\u0580\u0582\u0005\u001f\u0000\u0000\u0581"+
		"\u057f\u0001\u0000\u0000\u0000\u0581\u0580\u0001\u0000\u0000\u0000\u0582"+
		"\u0585\u0001\u0000\u0000\u0000\u0583\u0585\u0003\u00e4r\u0000\u0584\u0568"+
		"\u0001\u0000\u0000\u0000\u0584\u056d\u0001\u0000\u0000\u0000\u0584\u056f"+
		"\u0001\u0000\u0000\u0000\u0584\u0571\u0001\u0000\u0000\u0000\u0584\u0577"+
		"\u0001\u0000\u0000\u0000\u0584\u057b\u0001\u0000\u0000\u0000\u0584\u0583"+
		"\u0001\u0000\u0000\u0000\u0585\u00d9\u0001\u0000\u0000\u0000\u0586\u0599"+
		"\u0003\u00f8|\u0000\u0587\u0599\u0005+\u0000\u0000\u0588\u0599\u0005("+
		"\u0000\u0000\u0589\u0599\u0003r9\u0000\u058a\u058b\u0005<\u0000\u0000"+
		"\u058b\u058c\u0003\u00aeW\u0000\u058c\u058d\u0005=\u0000\u0000\u058d\u0599"+
		"\u0001\u0000\u0000\u0000\u058e\u058f\u0005\u001f\u0000\u0000\u058f\u0599"+
		"\u0003\u00dcn\u0000\u0590\u0591\u0003Z-\u0000\u0591\u0592\u0005D\u0000"+
		"\u0000\u0592\u0593\u0005\t\u0000\u0000\u0593\u0599\u0001\u0000\u0000\u0000"+
		"\u0594\u0595\u00050\u0000\u0000\u0595\u0596\u0005D\u0000\u0000\u0596\u0599"+
		"\u0005\t\u0000\u0000\u0597\u0599\u0003p8\u0000\u0598\u0586\u0001\u0000"+
		"\u0000\u0000\u0598\u0587\u0001\u0000\u0000\u0000\u0598\u0588\u0001\u0000"+
		"\u0000\u0000\u0598\u0589\u0001\u0000\u0000\u0000\u0598\u058a\u0001\u0000"+
		"\u0000\u0000\u0598\u058e\u0001\u0000\u0000\u0000\u0598\u0590\u0001\u0000"+
		"\u0000\u0000\u0598\u0594\u0001\u0000\u0000\u0000\u0598\u0597\u0001\u0000"+
		"\u0000\u0000\u0599\u00db\u0001\u0000\u0000\u0000\u059a\u059c\u0003`0\u0000"+
		"\u059b\u059a\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000"+
		"\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u05a0\u0003\u00deo\u0000\u059e"+
		"\u05a0\u0003^/\u0000\u059f\u059b\u0001\u0000\u0000\u0000\u059f\u059e\u0001"+
		"\u0000\u0000\u0000\u05a0\u05a6\u0001\u0000\u0000\u0000\u05a1\u05a3\u0003"+
		"\u00e4r\u0000\u05a2\u05a4\u0003 \u0010\u0000\u05a3\u05a2\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a7\u0003\u00e2q\u0000\u05a6\u05a1\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a5\u0001\u0000\u0000\u0000\u05a7\u00dd\u0001\u0000\u0000\u0000"+
		"\u05a8\u05aa\u0003r9\u0000\u05a9\u05ab\u0003b1\u0000\u05aa\u05a9\u0001"+
		"\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05b3\u0001"+
		"\u0000\u0000\u0000\u05ac\u05ad\u0005D\u0000\u0000\u05ad\u05af\u0003r9"+
		"\u0000\u05ae\u05b0\u0003b1\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05af"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b0\u05b2\u0001\u0000\u0000\u0000\u05b1"+
		"\u05ac\u0001\u0000\u0000\u0000\u05b2\u05b5\u0001\u0000\u0000\u0000\u05b3"+
		"\u05b1\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000\u0000\u05b4"+
		"\u00df\u0001\u0000\u0000\u0000\u05b5\u05b3\u0001\u0000\u0000\u0000\u05b6"+
		"\u05b8\u0003r9\u0000\u05b7\u05b9\u0003b1\u0000\u05b8\u05b7\u0001\u0000"+
		"\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05be\u0001\u0000"+
		"\u0000\u0000\u05ba\u05bc\u0003\u00e4r\u0000\u05bb\u05bd\u0003 \u0010\u0000"+
		"\u05bc\u05bb\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000"+
		"\u05bd\u05bf\u0001\u0000\u0000\u0000\u05be\u05ba\u0001\u0000\u0000\u0000"+
		"\u05be\u05bf\u0001\u0000\u0000\u0000\u05bf\u00e1\u0001\u0000\u0000\u0000"+
		"\u05c0\u05c1\u0005@\u0000\u0000\u05c1\u05c2\u0003\u00aeW\u0000\u05c2\u05c3"+
		"\u0005A\u0000\u0000\u05c3\u05c5\u0001\u0000\u0000\u0000\u05c4\u05c0\u0001"+
		"\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000\u05c6\u05c4\u0001"+
		"\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0001"+
		"\u0000\u0000\u0000\u05c8\u05ca\u0003t:\u0000\u05c9\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cf\u0001\u0000\u0000"+
		"\u0000\u05cb\u05cc\u0003t:\u0000\u05cc\u05cd\u0003V+\u0000\u05cd\u05cf"+
		"\u0001\u0000\u0000\u0000\u05ce\u05c4\u0001\u0000\u0000\u0000\u05ce\u05cb"+
		"\u0001\u0000\u0000\u0000\u05cf\u00e3\u0001\u0000\u0000\u0000\u05d0\u05d2"+
		"\u0005<\u0000\u0000\u05d1\u05d3\u0003\u0098L\u0000\u05d2\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d2\u05d3\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d5\u0005=\u0000\u0000\u05d5\u00e5\u0001\u0000\u0000"+
		"\u0000\u05d6\u05d8\u0003\u0002\u0001\u0000\u05d7\u05d6\u0001\u0000\u0000"+
		"\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05dc\u0001\u0000\u0000"+
		"\u0000\u05d9\u05db\u0003\u0004\u0002\u0000\u05da\u05d9\u0001\u0000\u0000"+
		"\u0000\u05db\u05de\u0001\u0000\u0000\u0000\u05dc\u05da\u0001\u0000\u0000"+
		"\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05e4\u0001\u0000\u0000"+
		"\u0000\u05de\u05dc\u0001\u0000\u0000\u0000\u05df\u05e3\u0003\u00e8t\u0000"+
		"\u05e0\u05e3\u0003\u0006\u0003\u0000\u05e1\u05e3\u0005B\u0000\u0000\u05e2"+
		"\u05df\u0001\u0000\u0000\u0000\u05e2\u05e0\u0001\u0000\u0000\u0000\u05e2"+
		"\u05e1\u0001\u0000\u0000\u0000\u05e3\u05e6\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5"+
		"\u05e7\u0001\u0000\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000\u0000\u05e7"+
		"\u05e8\u0005\u0000\u0000\u0001\u05e8\u00e7\u0001\u0000\u0000\u0000\u05e9"+
		"\u05eb\u0003x<\u0000\u05ea\u05e9\u0001\u0000\u0000\u0000\u05eb\u05ec\u0001"+
		"\u0000\u0000\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000\u05ec\u05ed\u0001"+
		"\u0000\u0000\u0000\u05ed\u05f2\u0001\u0000\u0000\u0000\u05ee\u05f3\u0003"+
		"\b\u0004\u0000\u05ef\u05f3\u0003\n\u0005\u0000\u05f0\u05f3\u0003\f\u0006"+
		"\u0000\u05f1\u05f3\u0003\u0018\f\u0000\u05f2\u05ee\u0001\u0000\u0000\u0000"+
		"\u05f2\u05ef\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f1\u0001\u0000\u0000\u0000\u05f3\u00e9\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f6\u0003x<\u0000\u05f5\u05f4\u0001\u0000\u0000\u0000\u05f6\u05f9"+
		"\u0001\u0000\u0000\u0000\u05f7\u05f5\u0001\u0000\u0000\u0000\u05f7\u05f8"+
		"\u0001\u0000\u0000\u0000\u05f8\u05fa\u0001\u0000\u0000\u0000\u05f9\u05f7"+
		"\u0001\u0000\u0000\u0000\u05fa\u05fb\u0003\b\u0004\u0000\u05fb\u00eb\u0001"+
		"\u0000\u0000\u0000\u05fc\u05fe\u0003x<\u0000\u05fd\u05fc\u0001\u0000\u0000"+
		"\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u05fd\u0001\u0000\u0000"+
		"\u0000\u05ff\u0600\u0001\u0000\u0000\u0000\u0600\u0601\u0001\u0000\u0000"+
		"\u0000\u0601\u0602\u00032\u0019\u0000\u0602\u00ed\u0001\u0000\u0000\u0000"+
		"\u0603\u0605\u0003x<\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0605\u0606"+
		"\u0001\u0000\u0000\u0000\u0606\u0604\u0001\u0000\u0000\u0000\u0606\u0607"+
		"\u0001\u0000\u0000\u0000\u0607\u0608\u0001\u0000\u0000\u0000\u0608\u0609"+
		"\u00032\u0019\u0000\u0609\u00ef\u0001\u0000\u0000\u0000\u060a\u060c\u0003"+
		"x<\u0000\u060b\u060a\u0001\u0000\u0000\u0000\u060c\u060d\u0001\u0000\u0000"+
		"\u0000\u060d\u060b\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000"+
		"\u0000\u060e\u060f\u0001\u0000\u0000\u0000\u060f\u0610\u0003*\u0015\u0000"+
		"\u0610\u00f1\u0001\u0000\u0000\u0000\u0611\u0612\u0003x<\u0000\u0612\u00f3"+
		"\u0001\u0000\u0000\u0000\u0613\u0614\u0003x<\u0000\u0614\u00f5\u0001\u0000"+
		"\u0000\u0000\u0615\u0617\u0003x<\u0000\u0616\u0615\u0001\u0000\u0000\u0000"+
		"\u0617\u061a\u0001\u0000\u0000\u0000\u0618\u0616\u0001\u0000\u0000\u0000"+
		"\u0618\u0619\u0001\u0000\u0000\u0000\u0619\u061b\u0001\u0000\u0000\u0000"+
		"\u061a\u0618\u0001\u0000\u0000\u0000\u061b\u061c\u0003\b\u0004\u0000\u061c"+
		"\u00f7\u0001\u0000\u0000\u0000\u061d\u061e\u0007\t\u0000\u0000\u061e\u00f9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00fb\u0100\u0105\u0107\u010f\u0118\u011d"+
		"\u0126\u012b\u0131\u0135\u0139\u013d\u0144\u014a\u014e\u0152\u0159\u0160"+
		"\u0164\u0167\u016c\u0176\u017c\u0181\u0184\u0189\u0195\u019d\u01a6\u01ae"+
		"\u01b3\u01b9\u01be\u01c4\u01cd\u01d3\u01d8\u01e0\u01e9\u01f0\u01f6\u01fa"+
		"\u0200\u020a\u020c\u0218\u0227\u0231\u0235\u0239\u023d\u0242\u0246\u024a"+
		"\u024e\u0255\u025a\u0265\u026a\u0270\u0277\u027c\u0282\u0289\u0290\u0295"+
		"\u0298\u029d\u02a4\u02ab\u02b4\u02bd\u02c4\u02ca\u02ce\u02d2\u02da\u02de"+
		"\u02e0\u02e6\u02eb\u02f0\u02f3\u02f7\u02fd\u0302\u0306\u0312\u0319\u0320"+
		"\u0322\u032a\u0332\u033c\u033f\u0346\u034e\u0356\u0360\u0365\u036c\u037d"+
		"\u0382\u0387\u038a\u0393\u039d\u03a5\u03a9\u03ab\u03b3\u03bd\u03c3\u03c8"+
		"\u03d0\u03d7\u03e2\u03fa\u0400\u0405\u040f\u041c\u0425\u042a\u0439\u0440"+
		"\u0444\u0448\u044a\u044f\u0459\u0460\u0466\u046f\u0475\u047e\u0489\u0494"+
		"\u049a\u049f\u04a8\u04ad\u04b2\u04ba\u04c0\u04c5\u04ca\u04cd\u04d4\u04db"+
		"\u04ec\u04f4\u04fb\u0503\u050b\u0513\u051b\u0523\u052b\u052d\u0532\u053a"+
		"\u0543\u054a\u0552\u055d\u0563\u0565\u056b\u0574\u057d\u0581\u0584\u0598"+
		"\u059b\u059f\u05a3\u05a6\u05aa\u05af\u05b3\u05b8\u05bc\u05be\u05c6\u05c9"+
		"\u05ce\u05d2\u05d7\u05dc\u05e2\u05e4\u05ec\u05f2\u05f7\u05ff\u0606\u060d"+
		"\u0618";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}