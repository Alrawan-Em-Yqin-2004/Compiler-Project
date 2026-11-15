lexer grammar SpringJavaLexer;


ABSTRACT: 'abstract';
ASSERT: 'assert';
BOOLEAN: 'boolean';
BREAK: 'break';
BYTE: 'byte';
CASE: 'case';
CATCH: 'catch';
CHAR: 'char';
CLASS: 'class';
CONST: 'const';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
DOUBLE: 'double';
ELSE: 'else';
ENUM: 'enum';
EXTENDS: 'extends';
FINAL: 'final';
FINALLY: 'finally';
FLOAT: 'float';
FOR: 'for';
GOTO: 'goto';
IF: 'if';
IMPLEMENTS: 'implements';
IMPORT: 'import';
INSTANCEOF: 'instanceof';
INT: 'int';
INTERFACE: 'interface';
LONG: 'long';
NATIVE: 'native';
NEW: 'new';
PACKAGE: 'package';
PRIVATE: 'private';
PROTECTED: 'protected';
PUBLIC: 'public';
RETURN: 'return';
SHORT: 'short';
STATIC: 'static';
STRICTFP: 'strictfp';
SUPER: 'super';
SWITCH: 'switch';
SYNCHRONIZED: 'synchronized';
THIS: 'this';
THROW: 'throw';
THROWS: 'throws';
TRANSIENT: 'transient';
TRY: 'try';
VOID: 'void';
VOLATILE: 'volatile';
WHILE: 'while';
VAR: 'var';
YIELD: 'yield';
RECORD: 'record';
SEALED: 'sealed';
PERMITS: 'permits';
NON_SEALED: 'non-sealed';

NULL: 'null';
TRUE: 'true';
FALSE: 'false';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMI: ';';
COMMA: ',';
DOT: '.';
ELLIPSIS: '...';
AT: '@';
COLONCOLON: '::';
COLON: ':';
QUESTION: '?';
ARROW: '->';

LSHIFT_ASSIGN: '<<=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';
MOD_ASSIGN: '%=';
LSHIFT: '<<';
INC: '++';
DEC: '--';
EQUAL: '==';
NOTEQUAL: '!=';
LE: '<=';
GE: '>=';
AND: '&&';
OR: '||';
ASSIGN: '=';
GT: '>';
LT: '<';
NOT: '!';
TILDE: '~';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
BITAND: '&';
BITOR: '|';
CARET: '^';
MOD: '%';

FloatingPointLiteral
    : (Digits DOT Digits? | DOT Digits) ExponentPart? [fFdD]?
    | Digits ExponentPart [fFdD]?
    | Digits [fFdD]
    ;
IntegerLiteral
    : DecimalIntegerLiteral [lL]?
    | HexIntegerLiteral [lL]?
    | OctalIntegerLiteral [lL]?
    | BinaryIntegerLiteral [lL]?
    ;
CharacterLiteral
    : '\'' (EscapeSequence | ~['\\\r\n]) '\''
    ;
TextBlock
    : '"""' .*? '"""'
    ;
StringLiteral
    : '"' (EscapeSequence | ~["\\\r\n])* '"'
    ;


SPRING_SPRING_BOOT_APPLICATION: 'SpringBootApplication';
SPRING_ENABLE_AUTO_CONFIGURATION: 'EnableAutoConfiguration';
SPRING_COMPONENT_SCAN: 'ComponentScan';
SPRING_CONFIGURATION: 'Configuration';
SPRING_BEAN: 'Bean';
SPRING_COMPONENT: 'Component';
SPRING_SERVICE: 'Service';
SPRING_REPOSITORY: 'Repository';
SPRING_CONTROLLER: 'Controller';
SPRING_REST_CONTROLLER: 'RestController';
SPRING_AUTOWIRED: 'Autowired';
SPRING_QUALIFIER: 'Qualifier';
SPRING_PRIMARY: 'Primary';
SPRING_LAZY: 'Lazy';
SPRING_VALUE: 'Value';
SPRING_SCOPE: 'Scope';
SPRING_DEPENDS_ON: 'DependsOn';
SPRING_REQUEST_MAPPING: 'RequestMapping';
SPRING_GET_MAPPING: 'GetMapping';
SPRING_POST_MAPPING: 'PostMapping';
SPRING_PUT_MAPPING: 'PutMapping';
SPRING_PATCH_MAPPING: 'PatchMapping';
SPRING_DELETE_MAPPING: 'DeleteMapping';
SPRING_REQUEST_PARAM: 'RequestParam';
SPRING_PATH_VARIABLE: 'PathVariable';
SPRING_REQUEST_BODY: 'RequestBody';
SPRING_RESPONSE_BODY: 'ResponseBody';
SPRING_MODEL_ATTRIBUTE: 'ModelAttribute';
SPRING_REQUEST_HEADER: 'RequestHeader';
SPRING_COOKIE_VALUE: 'CookieValue';
SPRING_SESSION_ATTRIBUTE: 'SessionAttribute';
SPRING_REQUEST_ATTRIBUTE: 'RequestAttribute';
SPRING_MATRIX_VARIABLE: 'MatrixVariable';
SPRING_CROSS_ORIGIN: 'CrossOrigin';
SPRING_EXCEPTION_HANDLER: 'ExceptionHandler';
SPRING_CONTROLLER_ADVICE: 'ControllerAdvice';
SPRING_REST_CONTROLLER_ADVICE: 'RestControllerAdvice';
SPRING_INIT_BINDER: 'InitBinder';
SPRING_RESPONSE_STATUS: 'ResponseStatus';
SPRING_VALIDATED: 'Validated';
SPRING_VALID: 'Valid';
SPRING_TRANSACTIONAL: 'Transactional';
SPRING_ASYNC: 'Async';
SPRING_SCHEDULED: 'Scheduled';
SPRING_ENABLE_SCHEDULING: 'EnableScheduling';
SPRING_CACHEABLE: 'Cacheable';
SPRING_CACHE_PUT: 'CachePut';
SPRING_CACHE_EVICT: 'CacheEvict';
SPRING_ENABLE_CACHING: 'EnableCaching';
SPRING_PROFILE: 'Profile';
SPRING_PROPERTY_SOURCE: 'PropertySource';
SPRING_IMPORT: 'Import';
SPRING_IMPORT_RESOURCE: 'ImportResource';
SPRING_CONFIGURATION_PROPERTIES: 'ConfigurationProperties';
SPRING_ENABLE_CONFIGURATION_PROPERTIES: 'EnableConfigurationProperties';
SPRING_CONDITIONAL_ON_PROPERTY: 'ConditionalOnProperty';
SPRING_CONDITIONAL_ON_CLASS: 'ConditionalOnClass';
SPRING_CONDITIONAL_ON_MISSING_BEAN: 'ConditionalOnMissingBean';
SPRING_SPRING_BOOT_TEST: 'SpringBootTest';
SPRING_WEB_MVC_TEST: 'WebMvcTest';
SPRING_DATA_JPA_TEST: 'DataJpaTest';
SPRING_MOCK_BEAN: 'MockBean';
SPRING_TEST_CONFIGURATION: 'TestConfiguration';
SPRING_ORDER: 'Order';
SPRING_PRE_AUTHORIZE: 'PreAuthorize';
SPRING_SECURED: 'Secured';
SPRING_ENABLE_METHOD_SECURITY: 'EnableMethodSecurity';
SPRING_ENABLE_WEB_SECURITY: 'EnableWebSecurity';
SPRING_ENABLE_GLOBAL_METHOD_SECURITY: 'EnableGlobalMethodSecurity';

Identifier
    : JavaLetter JavaLetterOrDigit*
    ;

fragment Digits: [0-9] ([0-9_]* [0-9])?;
fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]* [0-9]? ;
fragment HexIntegerLiteral: '0' [xX] HexDigit (HexDigit | '_')*;
fragment OctalIntegerLiteral: '0' [0-7] ([0-7_]* [0-7])?;
fragment BinaryIntegerLiteral: '0' [bB] [01] ([01_]* [01])?;
fragment ExponentPart: [eE] [+-]? Digits;
fragment HexDigit: [0-9a-fA-F];
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' [0-7] [0-7]? [0-7]?
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment JavaLetter: [a-zA-Z_$] | [\u0080-\uFFFF];
fragment JavaLetterOrDigit: JavaLetter | [0-9];


LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n\f]+ -> skip;
