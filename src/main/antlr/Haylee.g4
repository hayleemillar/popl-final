grammar Haylee;

/*
 * Parser Rules
 */
r   : expr EOF;

expr    : VAR | BOOL_VAL | INT_VAL |
            orexpr | andexpr | notexpr | condexpr |
            letexpr | lambdaexpr | callexpr |
            addexpr | subexpr | multexpr;

orexpr  : '(or' expr expr ')';
andexpr : '(and' expr expr ')';
notexpr : '(not' expr ')';
condexpr : '(if' expr expr expr ')';
letexpr : '(let' VAR expr expr ')';
addexpr : '(add' expr expr ')';
subexpr : '(sub' expr expr ')';
multexpr : '(mult' expr expr ')';
lambdaexpr  : '(lambda' VAR expr ')';
callexpr    : '(call' VAR expr ')';


/*
 * Lexer Rules
 */
VAR : STR (STR | INT_VAL)*;

STR : LETTER+;
LETTER  : [a-z];

BOOL_VAL : 'True' | 'False';
INT_VAL : [0-9]+;

WS  : [ \t\r\n]+ -> skip;