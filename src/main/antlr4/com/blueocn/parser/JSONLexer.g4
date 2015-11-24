lexer grammar JSONLexer;

GROUPBY
:
	G R O U P B Y
;

IDANDV
:
	I D A N D V
;

TOP
:
	T O P
;

ORDER
:
	O R D E R
;

LPAREN
:
	'('
;

RPAREN
:
	')'
;

LBRACE
:
	'{'
;

RBRACE
:
	'}'
;

LBRACKET
:
	'['
;

RBRACKET
:
	']'
;

SEMI
:
	';'
;

COMMA
:
	','
;

DOT
:
	'.'
;

DOTDOT
:
	'..'
;

DOTDOTDOT
:
	'..,'
;

EQ
:
	'='
;

GT
:
	'>'
;

LT
:
	'<'
;

BANG
:
	'!'
;

BANGBANG
:
	'!!'
;

TILDE
:
	'~'
;

QUES
:
	'?'
;

COLON
:
	':'
;

COLONCOLON
:
	'::'
;

COLONEQ
:
	':='
;

EQEQ
:
	'=='
;

LTEQ
:
	'<='
;

LTEQGT
:
	'<=>'
;

LTGT
:
	'<>'
;

GTEQ
:
	'>='
;

BANGEQ
:
	'<>'
;

BANGGT
:
	'!>'
;

BANGLT
:
	'!<'
;

AMPAMP
:
	'&&'
;

BARBAR
:
	'||'
;

BARBARSLASH
:
	'||/'
;

BARSLASH
:
	'|/'
;

PLUS
:
	'+'
;

SUB
:
	'-'
;

STAR
:
	'*'
;

SLASH
:
	'/'
;

AMP
:
	'&'
;

BAR
:
	'|'
;

CARET
:
	'^'
;

PERCENT
:
	'%'
;

LTLT
:
	'<<'
;

GTGT
:
	'>>'
;

MONKEYS_AT
:
	'@'
;

POUND
:
	'#'
;

DIV
:
	D I V
;

MOD
:
	'%'
;

UNDERLINE
:
	'_'
;

QUOTES
:
	'\"'
	| '\''
;

INT
:
	DIGIT+
;

FLOAT
:
	DIGIT+ '.' DIGIT*
	| '.' DIGIT+
;

STRING
:
	QUOTES
	(
		ID
		| INT
		| FLOAT
	)* QUOTES
;

ID
:
	ID_LETTER
	(
		ID_LETTER
		| DIGIT
	)*
;

fragment
ID_LETTER
:
	[a-zA-Z]
	| '_'
;

fragment
DIGIT
:
	[0-9]
;

fragment
A
:
	[aA]
;

fragment
B
:
	[bB]
;

fragment
C
:
	[cC]
;

fragment
D
:
	[dD]
;

fragment
E
:
	[eE]
;

fragment
F
:
	[fF]
;

fragment
G
:
	[gG]
;

fragment
H
:
	[hH]
;

fragment
I
:
	[iI]
;

fragment
J
:
	[jJ]
;

fragment
K
:
	[kK]
;

fragment
L
:
	[lL]
;

fragment
M
:
	[mM]
;

fragment
N
:
	[nN]
;

fragment
O
:
	[oO]
;

fragment
P
:
	[pP]
;

fragment
Q
:
	[qQ]
;

fragment
R
:
	[rR]
;

fragment
S
:
	[sS]
;

fragment
T
:
	[tT]
;

fragment
U
:
	[uU]
;

fragment
V
:
	[vV]
;

fragment
W
:
	[wW]
;

fragment
X
:
	[xX]
;

fragment
Y
:
	[yY]
;

fragment
Z
:
	[zZ]
;

WS
:
	[ \r\n\t\u000C]+ -> channel ( HIDDEN )
;