parser grammar JSONParser;

options {
	tokenVocab = JSONLexer;
}

prog
:
	LBRACE
	(
		GROUPBY COLON dimensions
	)?
	(
		COMMA IDANDV COLON metricIdAndValues
	)?
	(
		COMMA TOP COLON limit
	)?
	(
		COMMA ORDER COLON orderBy
	)? RBRACE EOF
;

dimensions
:
	LBRACKET dimension
	(
		COMMA dimension
	)* RBRACKET
;

dimension
:
	(
		dimensionName = STRING
	)?
;

metricIdAndValues
:
	LBRACE metricIdAndValue
	(
		COMMA metricIdAndValue
	)* RBRACE
;

metricIdAndValue
:
	(
		metricName = STRING COLON metricValue =
		(
			STRING
			| INT
		)
	)?
;

limit
:
	(
		limitNum = INT
	)?
;

orderBy
:
	(
		orderByStr = STRING
	)?
;