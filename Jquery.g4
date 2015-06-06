// Define a grammar called Hello
grammar Jquery;
//LEXAR

NUM
:
	[0-9]+
;

OP
:'|='
	| '*='
	| '~='
	| '$='
	| '!='
	| '^='
;

OPENP
:
	'('
;

CLOSEP
:
	')'
;

OPENB
:
	'['
;

CLOSEB
:
	']'
;

IN
:
	'in'
;

OUT
:
	'out'
;

STRING
:
	[a-zA-z] [a-zA-Z0-9]+
;

ENDL
:
	';'
;

DELIMITER
:
	'\''
;

EQS
:
	'='
;

SEP
:
	'>'
	| '~'
;

PSS
:
	':even'
	| ':first'
	| ':odd'
	| ':last'
;

PPS
:
	':not'
	| ':contains'
	| ':eq'
	| ':lt'
	| ':gt'
;

OPENXP
:
	'$("'
;

CLOSEXP
:
	'")'
;

WS
:
	[ \t\n\r]+ -> skip
;

//PARSER

ops
:
	OP
	| EQS
;

start
:
	line EOF
;

input
:
	IN STRING ENDL
;

output
:
	OUT STRING ENDL
;

line
:
	input line?
	| output line?
	| exp line?
;

exp
:
	ter = STRING EQS OPENXP exp1 CLOSEXP ENDL
;

exp1 returns [String v]
:
	ter = STRING
	(
		psel
		| braexp
	)? SEP? exp1?
	{$v=$ter.text;}

;

braexp
:
	OPENB STRING ops DELIMITER STRING DELIMITER CLOSEB
	(
		psel
		| braexp
	)?
;

psel
:
	PSS
	(
		psel
		| braexp
	)?
	| PPS OPENP STRING CLOSEP
	(
		psel
		| braexp
	)?
;
