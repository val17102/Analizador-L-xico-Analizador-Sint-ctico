grammar decaf3;

// Keyword 

CLASS               : 'class';
PROGRAM             : 'Program';
IF                  : 'if';
ELSE                : 'else';
RETURN              : 'return';

// Variable types

BOOLEAN             : 'boolean';
CHAR                : 'char';
INT                 : 'int';
STRING              : 'string';
TRUE                : 'True';
FALSE               : 'False';
VOID                : 'void';

// Symbols

PUNTOCOMA           : ';';
LBIG              : '{';
RBIG              : '}';
LCOR             : '[';
RCOR             : ']';
LPAR              : '(';
RPAR              : ')';
COMMA               : ',';
COMILLAD              : '"';
COMILLA          : '\'';
ADD                 : '+';
SUB                 : '-';
MULTIPLY            : '*';
DIVIDE              : '/';
MODULO            : '%';
AND                 : '&&';
OR                  : '||';
NOT                 : '!';
GREAT_OP          : '>';
LESS_OP             : '<';
GREAT_eq_op       : '>=';
LESS_eq_op          : '<=';
EQUAL_OP            : '=';
ADD_eq_op           : '+=';
SUB_eq_op           : '-=';
EQUALITY_OP         : '==';
UNEQUALITY_OP       : '!=';


// Variables

ID                  : ALPHA ALPHA_NUM*; 
ALPHA      : [a-zA-Z_];
CHAR_LITERAL        : COMILLA ( '\\' [btnfr"'\\] | ~[\r\n\\"] ) COMILLA;
DECIMAL_LITERAL     : [0-9]+;
DIGIT      : [0-9];
BOOL_LITERAL        : TRUE | FALSE;
STRING_LITERAL      : '"' ( '\\' [btnfr"'\\] | ~[\r\n\\"] )* '"';
ALPHA_NUM           : ALPHA | DIGIT;
NEWLINE				: ('\r'? '\n' | '\r')+ -> skip;


//Productions

program		    : CLASS PROGRAM LBIG paramDeclaration* methodDeclaration* RBIG;

varDeclaration            : (var_type paramVar) (COMMA var_type paramVar)* PUNTOCOMA;

paramDeclaration         : var_type paramVar (COMMA paramVar)* PUNTOCOMA;

arrayId            : ID LCOR int_literal RCOR;

paramVar           : varId | arrayId;

varId              : ID;

methodDeclaration        : returnType methodName LPAR ((var_type varId) (COMMA var_type varId)*)? RPAR block;

returnType         : (var_type | VOID);

block               : LBIG varDeclaration* statement* RBIG;

statement           : location assign_op expr
                    | location assign_op expr PUNTOCOMA
                    | methodCall
                    | IF LPAR expr RPAR block (ELSE block)?
                    | varId EQUAL_OP expr PUNTOCOMA
                    | RETURN expr PUNTOCOMA;

methodCallInter   : methodName LPAR (expr (COMMA expr)*)? RPAR;

methodCall         : methodCallInter
                    | methodCallInter PUNTOCOMA;

expr                : location
                    | literal
                    | expr bin_op expr
                    | SUB expr
                    | methodCall
                    | NOT expr
                    | LPAR expr RPAR;

location            : varId | arrayId;

int_literal         : DECIMAL_LITERAL;

rel_op              : GREAT_OP | LESS_OP | LESS_eq_op | GREAT_eq_op;

eq_op               : EQUALITY_OP | UNEQUALITY_OP;

cond_op             : AND | OR;

literal             : int_literal | CHAR_LITERAL | BOOL_LITERAL;

bin_op              : arith_op | rel_op | eq_op | cond_op;

arith_op            : ADD | SUB | MULTIPLY | DIVIDE | MODULO;

var_type            : INT | BOOLEAN;

assign_op           : EQUAL_OP
                    | ADD_eq_op
                    | SUB_eq_op;

methodName         : ID;

WHITESPACE			: [ \t\r\n] -> skip ;