parser grammar JSONParser;

options {
	tokenVocab = JSONLexer;
}

prog
:
	(
		GROUPBY COLON dimension
	)?
	(
		COMMA IDANDV COLON metricIdAndValue
	)?
	(
		COMMA TOP COLON limit
	)?
	(
		COMMA ORDER COLON orderBy
	)? EOF
;

dimension
:
	(
		LBRACKET dimensionName = STRING RBRACKET
		(
			COMMA
		)?
	)*
;

metricIdAndValue
:
	(
		LBRACE metricName = STRING COLON metricValue = STRING
		| INT RBRACE
		(
			COMMA
		)?
	)*
;

limit
:
	(
		limit = INT
	)?
;

orderBy
:
	(
		orderBy = STRING
	)?
;