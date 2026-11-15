lexer grammar JavaLexer;

// Java keywords and reserved words
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
MODULE: 'module';
OPEN: 'open';
REQUIRES: 'requires';
EXPORTS: 'exports';
OPENS: 'opens';
TO: 'to';
USES: 'uses';
PROVIDES: 'provides';
WITH: 'with';
TRANSITIVE: 'transitive';
VAR: 'var';
YIELD: 'yield';
RECORD: 'record';
SEALED: 'sealed';
PERMITS: 'permits';
NON_SEALED: 'non-sealed';

NULL: 'null';
TRUE: 'true';
FALSE: 'false';

// Separators
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

// Operators (longest tokens first)
URSHIFT_ASSIGN: '>>>=';
RSHIFT_ASSIGN: '>>=';
LSHIFT_ASSIGN: '<<=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
AND_ASSIGN: '&=';
OR_ASSIGN: '|=';
XOR_ASSIGN: '^=';
MOD_ASSIGN: '%=';
URSHIFT: '>>>';
RSHIFT: '>>';
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

// Literals
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
BooleanLiteral: TRUE | FALSE;
NullLiteral: NULL;

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

// Comments and whitespace
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n\f]+ -> skip;
