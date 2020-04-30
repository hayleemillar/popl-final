// boolean grammar
grammar Boolean;

/*
 * Parser Rules
 */
r   : expr EOF;

expr    : VAL | VAR | orexpr | andexpr | notexpr | condexpr | letexpr ;

orexpr  : '(or' expr expr ')';
andexpr : '(and' expr expr ')';
notexpr : '(not' expr ')';
condexpr : '(if' expr expr expr ')';
letexpr : '(let' VAR expr expr ')';


/*
 * Lexer Rules
 */
VAR : STR (STR | DIGIT)*;

STR : (LETTER)+;
LETTER  : [a-z];
DIGIT   : [0-9];

VAL : 'True' | 'False';

WS  : [ \t\r\n]+ -> skip;