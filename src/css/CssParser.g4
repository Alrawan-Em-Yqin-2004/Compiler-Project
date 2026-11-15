parser grammar CssParser;

options { tokenVocab = CssLexer; }

stylesheet : WS* ( statement WS* )* EOF ;

statement  : ruleset
           | atRule
           ;

ruleset    : selectorList WS* LBRACE blockContent RBRACE ;

atRule     : AT_KEYWORD atPrelude ( LBRACE blockContent RBRACE | SEMI ) ;
atPrelude  : preludeToken* ;
preludeToken : LPAREN preludeToken* RPAREN
             | FUNCTION preludeToken* RPAREN
             | ~( LBRACE | RBRACE | SEMI | LPAREN | RPAREN | FUNCTION )
             ;

blockContent : ( WS | SEMI | declaration | ruleset | atRule )* ;


selectorList : selector ( WS* COMMA WS* selector )* ;

selector     : compoundSelector ( combinator compoundSelector )* ;

combinator   : WS* ( GT | PLUS | TILDE ) WS*    
             | WS+                               
             ;

compoundSelector
    : ( typeSelector | AMP ) simpleSelector*
    | simpleSelector+
    ;

typeSelector   : IDENT | STAR | PERCENTAGE ;    

simpleSelector : classSelector
               | idSelector
               | attributeSelector
               | pseudoElement
               | pseudoClass
               ;

classSelector     : DOT IDENT ;
idSelector        : HASH ;

attributeSelector : LBRACK WS* IDENT WS*
                    ( attrOperator WS* attrValue ( WS+ IDENT )? WS* )?
                    RBRACK ;
attrOperator      : EQ | INCLUDES | DASHMATCH | PREFIXM | SUFFIXM | SUBSTRM ;
attrValue         : IDENT | STRING | NUMBER | DIMENSION ;

pseudoClass    : COLON IDENT
               | COLON FUNCTION pseudoArgs RPAREN
               ;
pseudoElement  : DCOLON IDENT
               | DCOLON FUNCTION pseudoArgs RPAREN
               ;
pseudoArgs     : pseudoArg* ;
pseudoArg      : FUNCTION pseudoArgs RPAREN
               | LPAREN pseudoArgs RPAREN
               | ~( RPAREN | FUNCTION | LPAREN )
               ;


declaration : property WS* COLON WS* value ( WS* IMPORTANT )? ;

property    : IDENT ;

value       : valueGroup ( WS* COMMA WS* valueGroup )* ;

valueGroup  : term ( WS* operator WS* term | WS+ term )* ;

operator    : SLASH | STAR | PLUS | MINUS ;

term        : NUMBER
            | PERCENTAGE
            | DIMENSION
            | STRING
            | IDENT
            | HASH
            | URL
            | UNICODE_RANGE
            | function
            | parenTerm
            | bracketTerm
            ;

function    : FUNCTION WS* ( value WS* )? RPAREN ;       
parenTerm   : LPAREN WS* ( value WS* )? RPAREN ;         
bracketTerm : LBRACK WS* ( IDENT WS* )* RBRACK ;        