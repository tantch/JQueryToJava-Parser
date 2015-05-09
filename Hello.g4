// Define a grammar called Hello
grammar Hello;
//LEXAR
NUM : [0-9]+ ;
OP: '|=' | '*=' | '~=' | '$=' | '!=' | '^=';
OPENP : '(' ;
CLOSEP : ')' ;
OPENB : '[' ;
CLOSEB : ']' ;
ALL : '*';
IN : 'in' ;
OUT : 'out' ;
STRING : [a-zA-z][a-zA-Z0-9]+ ;
ENDL : ';' ;
DELIMITER : '\'';
EQS : '=';
SEP : '>' | '~' ;
PSS : ':even' | ':first' | ':odd' | ':last';
PPS : ':not' | ':contains' | 'eq' | ':lt' | ':gt';
OPENXP : '$("';
CLOSEXP : '")';
WS: [ \t\n\r]+ -> skip ;


//PARSER
ops: OP | EQS;

start: input output exp EOF {}
;

input returns[String v]:
	IN STRING ENDL		{$v=$STRING.text;}
;

output returns[String s]:
	OUT STRING ENDL {$s=$STRING.text;}
;

exp:
ter=STRING EQS OPENXP exp1 CLOSEXP ENDL 
 |
ter=STRING EQS OPENXP exp1 CLOSEXP ENDL prev=exp 
;

exp1 returns[String v]:
(ALL | ter=STRING) (psel | braexp)? SEP? exp1? {$v=$ter.text;}
;
braexp:
OPENB STRING ops DELIMITER STRING DELIMITER CLOSEB (psel | braexp)?
;
psel:
	PSS (psel | braexp)?
	|
	PPS OPENP STRING CLOSEP (psel | braexp)?
;
