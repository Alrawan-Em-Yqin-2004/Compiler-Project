
parser grammar ThymeleafParser;

options { tokenVocab = ThymeleafLexer; }

template : content EOF ;

content  : ( element | TEXT | inlineExpression )* ;

element
    : TAG_OPEN TAG_NAME attribute* TAG_END content TAG_OPEN TAG_SLASH TAG_NAME TAG_END  
    | TAG_OPEN TAG_NAME attribute* TAG_SELF_END                                        
    | TAG_OPEN VOID_NAME attribute* ( TAG_END | TAG_SELF_END )                        
    ;

attribute
    : thAttribute
    | ATTR_NAME ( ATTR_EQ ( ATTR_VALUE | ATTR_NAME ) )?       
    ;

thAttribute
    : TH_ATTR_NAME TH_EQUALS ( TH_DQ_OPEN thValue? DQ_CLOSE | TH_RAW_VALUE )
    ;

inlineExpression
    : INLINE_OPEN ( variableExpr | selectionExpr | messageExpr | linkExpr ) INLINE_CLOSE
    ;

thValue
    : iteration                      
    | assignments                     
    | fragmentExpr                    
    | expression                      
    ;

iteration   : word ( COMMA word )? COLON expression ;
assignments : assignment ( COMMA assignment )* ;
assignment  : word ( DOT word )* ASSIGN expression ;
fragmentExpr: expression COLONCOLON ( word ( LPAREN argumentList? RPAREN )? )? ;

expression
    : primary
    | expression DOT word LPAREN argumentList? RPAREN             
    | expression DOT word                                        
    | expression DOT QUESTION LBRACK expression RBRACK            
    | expression DOT NOT LBRACK expression RBRACK                 
    | expression LBRACK expression RBRACK                         
    | ( MINUS | PLUS | NOT | NOT_KW ) expression                  
    | expression ( MUL | DIV | MOD ) expression
    | expression ( PLUS | MINUS ) expression
    | expression ( LT | GT | LE | GE | LT_KW | GT_KW | LE_KW | GE_KW ) expression
    | expression ( EQ | NEQ | EQ_KW | NE_KW ) expression
    | expression ( AND | AND_KW ) expression
    | expression ( OR | OR_KW ) expression
    | <assoc=right> expression QUESTION expression COLON expression  
    | <assoc=right> expression QUESTION expression                    
    | <assoc=right> expression ELVIS expression                       
    ;

primary
    : variableExpr
    | selectionExpr
    | messageExpr
    | linkExpr
    | fragmentRef
    | literalSubstitution
    | literal
    | HASH word                                         
    | word LPAREN argumentList? RPAREN                 
    | word                                              
    | LPAREN expression RPAREN
    ;

argumentList : expression ( COMMA expression )* ;

literal : STRING | NUMBER | TRUE | FALSE | NULL ;

word : IDENT | TRUE | FALSE | NULL | AND_KW | OR_KW | NOT_KW | EQ_KW | NE_KW
     | LT_KW | GT_KW | LE_KW | GE_KW ;

variableExpr  : DOLLAR_OPEN ( expression | LBRACE expression RBRACE ) RBRACE ;
selectionExpr : SELECT_OPEN expression RBRACE ;

messageExpr   : MESSAGE_OPEN messageKey ( LPAREN argumentList? RPAREN )? RBRACE ;
messageKey    : ( word | DOT | MINUS | NUMBER )+ | variableExpr ;

linkExpr      : LINK_OPEN linkPart+ RBRACE ;
linkPart
    : STRING
    | variableExpr | selectionExpr | messageExpr
    | pathVariable
    | linkParams
    | pathToken
    ;
pathVariable  : LBRACE word RBRACE ;                                 
linkParams    : LPAREN ( linkParam ( COMMA linkParam )* )? RPAREN ;   
linkParam     : word ( DOT word )* ASSIGN expression ;
pathToken     : word | NUMBER | DIV | DOT | MINUS | PLUS | QUESTION | ASSIGN
              | COMMA | COLON | COLONCOLON | HASH | TILDE | MOD | AMP ;

fragmentRef   : FRAG_OPEN expression? COLONCOLON ( word ( LPAREN argumentList? RPAREN )? )? RBRACE
              | FRAG_OPEN expression RBRACE ;

literalSubstitution
    : PIPE_OPEN ( LS_TEXT | variableExpr | selectionExpr | messageExpr | linkExpr )* PIPE_CLOSE ;
