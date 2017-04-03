// Define a grammar called Zip
grammar AbstractClass;

// Full class rule.
full
    : (CLASSSCOPE ' ')? 'abstract class ' NAME INHERIT? (' '+)? '{' (MEMBER+)? '}'
    | 'abstract ' (CLASSSCOPE ' ')?  'class' NAME INHERIT? (' '+)? '{' (MEMBER+)? '}'
    ;

// Scope of an abstract class. Can only be public or internal.
CLASSSCOPE
    : 'public'
    | 'internal'
    ;

// Scope of anything other than a class.
SCOPE
    : CLASSSCOPE
    | 'private'
    | 'protected'
    ;

INHERIT
    : (' '+)? ':' (' '+)? NAME
    ;

// The name of a variable, class, etc.
NAME
    : '_'? [A-Za-z]+
    ;

MEMBER
    : FUNCTION
    | VARIABLE
    ;

// A function declaration.
FUNCTION
    : (SCOPE ' ')? 'abstract ' FUNCTYPE ' ' NAME '(' PARAMETERS? ');' // Scope 1st
    | 'abstract ' (SCOPE ' ')? FUNCTYPE ' ' NAME '(' PARAMETERS? ');' // Scope 2nd
    ;

// A variable declaration
VARIABLE
    : (SCOPE ' ')? 'abstract '? VARTYPE ';' // Scope first.
    | 'abstract '? (SCOPE ' ')? VARTYPE ';' // 'abstract' first.
    ;

// A set of function parameters.
PARAMETERS
    : PARAMETER ', ' PARAMETERS
    | PARAMETER
    ;

// Function parameter.
PARAMETER
    : VARTYPE ' ' NAME
    ;

// Function types. Must include void.
FUNCTYPE
    : VARTYPE
    | 'void'
    ;

// Var types that includes initialization to a value.
VARTYPE
    : 'bool ' NAME ('=' ('true' | 'false'))?            // Booleans
    | 'byte ' NAME ('=' INT)?                           // Bytes
    | 'sbyte ' NAME ('=' INT)?                          // Signed Bytes
    | 'char ' NAME ('=' '\'' (~["\r\n] | '""') '\'')?   // Characters
    | 'decimal ' NAME ('=' FLOAT)?                      // Decimals
    | 'double ' ('=' FLOAT)?                            // Doubles
    | 'float ' NAME ('=' FLOAT)?                        // Floats
    | 'int ' NAME ('=' INT)?                            // Integers
    | 'uint ' NAME ('=' INT)?                           // Unsigned Integers
    | 'long ' NAME ('=' INT)?                           // Longs
    | 'ulong ' NAME ('=' INT)?                          // Unsigned Longs
    | 'object ' NAME                                    // Objects
    | 'short ' NAME ('=' INT)?                          // Shorts
    | 'ushort ' NAME ('=' INT)?                         // Unsigned Shorts
    | 'string ' NAME ('=' STRING)?                      // Strings
    ;

// All valid integers.
INT
    : [0-9]+
    ;

// All valid floats
FLOAT
    : [0-9]+ '.' [0-9]*
    | '.' [0-9]+
    ;

// All valid strings
STRING
    : '"' (~["\r\n] | '""')* '"'
    ;

WS
    : [ \t\r\n]+ -> skip // skip spaces, tabs, newlines
    ;
