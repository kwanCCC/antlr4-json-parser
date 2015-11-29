lexer grammar JSONLexer;

@lexer::members {
	public void notifyListeners(LexerNoViableAltException e) {
		String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));		
		ANTLRErrorListener listener = getErrorListenerDispatch();
		listener.syntaxError(this, null, _tokenStartLine, _tokenStartCharPositionInLine, text, e);
	}
}

GROUPBY
:
	QUOTES G R O U P B Y QUOTES
;

IDANDV
:
	QUOTES I D A N D V QUOTES
;

TOP
:
	QUOTES T O P QUOTES
;

ORDER
:
	QUOTES O R D E R QUOTES
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
		EscapeSequence
		| ~( '\\' | '"' | '\n' | '\r' )
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
OctalEscape
:
	'\\'
	(
		'0' .. '3'
	)
	(
		'0' .. '7'
	)
	(
		'0' .. '7'
	)
	| '\\'
	(
		'0' .. '7'
	)
	(
		'0' .. '7'
	)
	| '\\'
	(
		'0' .. '7'
	)
;

fragment
HexDigit
:
	(
		'0' .. '9'
		| 'a' .. 'f'
		| 'A' .. 'F'
	)
;
//四字节长度字符

fragment
UnicodeEscape
:
	'\\' 'u' HexDigit HexDigit HexDigit HexDigit
;

fragment
EscapeSequence
:
	'\\'
	(
		'b'
		| 't'
		| 'n'
		| 'f'
		| 'r'
		| '\"'
		| '\''
		| '\\'
	)
	| UnicodeEscape
	| OctalEscape
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