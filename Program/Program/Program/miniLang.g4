grammar miniLang;

// Lexer Rules

// Keywords
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
STRING: 'string';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';

// Operators
ARITHMETIC_OPERATOR: '+' | '-' | '*' | '/' | '%';
RELATIONAL_OPERATOR: '<' | '>' | '<=' | '>=' | '==' | '!=';
LOGICAL_OPERATOR: '&&' | '||' | '!';
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' | '%=';
INCREMENT_OPERATOR: '++' | '--';

// Delimiters
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';

// Identifiers and Literals
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL: '"' (~["\\])* '"';
type: INT | FLOAT | DOUBLE | STRING | VOID;

// Whitespace and Comments
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

// Parser Rules
program: (
		globalVariableDeclaration
		| functionDeclaration
		| statement
	)*;

globalVariableDeclaration: (INT | FLOAT | DOUBLE | STRING) IDENTIFIER (
		ASSIGNMENT_OPERATOR expression
	)? SEMICOLON;

block: LBRACE (statement)* RBRACE;

functionDeclaration:
	type IDENTIFIER LPAREN (parameterList)? RPAREN block;
parameterList: parameter (COMMA parameter)*;
parameter: (INT | FLOAT | DOUBLE | STRING) IDENTIFIER;

statement:
	expressionStatement
	| block
	| selectionStatement
	| iterationStatement
	| forStatement
	| jumpStatement
	| variableDeclaration;

selectionStatement:
	IF LPAREN expression RPAREN statement (ELSE statement)?;
iterationStatement: WHILE LPAREN expression RPAREN statement;
forStatement:
	FOR LPAREN (variableDeclaration | expressionStatement)? (
		expression
	)? SEMICOLON (
		expression
		| assignmentExpression
		| IDENTIFIER INCREMENT_OPERATOR
		| functionCall
	)? RPAREN statement;
jumpStatement: RETURN expression? SEMICOLON;

expressionStatement: expression? SEMICOLON;
expression: assignmentExpression;
assignmentExpression:
	IDENTIFIER ASSIGNMENT_OPERATOR expression
	| logicalOrExpression;
logicalOrExpression:
	logicalAndExpression (LOGICAL_OPERATOR logicalAndExpression)*;
logicalAndExpression:
	equalityExpression (LOGICAL_OPERATOR equalityExpression)*;
equalityExpression:
	relationalExpression (
		RELATIONAL_OPERATOR relationalExpression
	)*;
relationalExpression:
	additiveExpression (RELATIONAL_OPERATOR additiveExpression)*;
additiveExpression:
	multiplicativeExpression (
		ARITHMETIC_OPERATOR multiplicativeExpression
	)*;
multiplicativeExpression:
	primaryExpression (ARITHMETIC_OPERATOR primaryExpression)*;
primaryExpression:
	NUMBER
	| STRING_LITERAL
	| IDENTIFIER
	| LPAREN expression RPAREN
	| functionCall;

functionCall: IDENTIFIER LPAREN argumentList? RPAREN;
argumentList: expression (COMMA expression)*;

variableDeclaration:
	type IDENTIFIER (ASSIGNMENT_OPERATOR expression)? SEMICOLON;

// Add additional rules as neededded