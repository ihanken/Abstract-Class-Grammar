// Define a grammar called Zip
grammar AbstractClass;
full
    : CLASSSCOPE? ' abstract class ' NAME '{' ((VARIABLE | FUNCTION)+)? '}'
    ;

CLASSSCOPE
    : 'public'
    | 'internal'
    ;

SCOPE
    : CLASSSCOPE
    | 'private'
    ;

NAME
    : [A-Za-z]+
    ;

FUNCTION
    : SCOPE? ' abstract ' FUNCTYPE ' ' NAME '();'
    ;
VARIABLE
    : SCOPE? ' ' VARTYPE ' ' NAME ';'
    ;

FUNCTYPE
    : VARTYPE
    | 'void'
    ;

VARTYPE
    : 'int'
    ;

WS
    : [ \t\r\n]+ -> skip // skip spaces, tabs, newlines
    ;
