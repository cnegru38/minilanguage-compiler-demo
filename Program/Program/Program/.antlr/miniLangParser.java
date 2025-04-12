// Generated from c:/Users/comin/anul ii/lfc/proiect2_lfc/proiect2lfc2/Program/Program/miniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miniLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, DOUBLE=3, STRING=4, VOID=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		RETURN=10, ARITHMETIC_OPERATOR=11, RELATIONAL_OPERATOR=12, LOGICAL_OPERATOR=13, 
		ASSIGNMENT_OPERATOR=14, INCREMENT_OPERATOR=15, LPAREN=16, RPAREN=17, LBRACE=18, 
		RBRACE=19, COMMA=20, SEMICOLON=21, IDENTIFIER=22, NUMBER=23, STRING_LITERAL=24, 
		WS=25, COMMENT=26, MULTILINE_COMMENT=27;
	public static final int
		RULE_program = 0, RULE_globalVariableDeclaration = 1, RULE_functionDeclaration = 2, 
		RULE_parameterList = 3, RULE_parameter = 4, RULE_statement = 5, RULE_compoundStatement = 6, 
		RULE_selectionStatement = 7, RULE_iterationStatement = 8, RULE_jumpStatement = 9, 
		RULE_expressionStatement = 10, RULE_expression = 11, RULE_assignmentExpression = 12, 
		RULE_logicalOrExpression = 13, RULE_logicalAndExpression = 14, RULE_equalityExpression = 15, 
		RULE_relationalExpression = 16, RULE_additiveExpression = 17, RULE_multiplicativeExpression = 18, 
		RULE_primaryExpression = 19, RULE_variableDeclaration = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalVariableDeclaration", "functionDeclaration", "parameterList", 
			"parameter", "statement", "compoundStatement", "selectionStatement", 
			"iterationStatement", "jumpStatement", "expressionStatement", "expression", 
			"assignmentExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"primaryExpression", "variableDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'double'", "'string'", "'void'", "'if'", "'else'", 
			"'for'", "'while'", "'return'", null, null, null, null, null, "'('", 
			"')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "DOUBLE", "STRING", "VOID", "IF", "ELSE", "FOR", 
			"WHILE", "RETURN", "ARITHMETIC_OPERATOR", "RELATIONAL_OPERATOR", "LOGICAL_OPERATOR", 
			"ASSIGNMENT_OPERATOR", "INCREMENT_OPERATOR", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "COMMA", "SEMICOLON", "IDENTIFIER", "NUMBER", "STRING_LITERAL", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "miniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31786878L) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					globalVariableDeclaration();
					}
					break;
				case 2:
					{
					setState(43);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(44);
					statement();
					}
					break;
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniLangParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(miniLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(miniLangParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(miniLangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(miniLangParser.STRING, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(miniLangParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitGlobalVariableDeclaration(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			match(IDENTIFIER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OPERATOR) {
				{
				setState(52);
				match(ASSIGNMENT_OPERATOR);
				setState(53);
				expression();
				}
			}

			setState(56);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(miniLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(miniLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(miniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(miniLangParser.RBRACE, 0); }
		public TerminalNode INT() { return getToken(miniLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(miniLangParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(miniLangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(miniLangParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(miniLangParser.VOID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(LPAREN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				setState(61);
				parameterList();
				}
			}

			setState(64);
			match(RPAREN);
			setState(65);
			match(LBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31786846L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(miniLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(miniLangParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			parameter();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				parameter();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(miniLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(miniLangParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(miniLangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(miniLangParser.STRING, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case SEMICOLON:
			case IDENTIFIER:
			case NUMBER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				expressionStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				compoundStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				selectionStatement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				iterationStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				jumpStatement();
				}
				break;
			case INT:
			case FLOAT:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(miniLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(miniLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LBRACE);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31786846L) != 0)) {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(miniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniLangParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miniLangParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(LPAREN);
			setState(104);
			expression();
			setState(105);
			match(RPAREN);
			setState(106);
			statement();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(107);
				match(ELSE);
				setState(108);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(miniLangParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(miniLangParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(miniLangParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(miniLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(miniLangParser.SEMICOLON, i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterationStatement);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(WHILE);
				setState(112);
				match(LPAREN);
				setState(113);
				expression();
				setState(114);
				match(RPAREN);
				setState(115);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FOR);
				setState(118);
				match(LPAREN);
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(119);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(120);
					expressionStatement();
					}
					break;
				}
				setState(123);
				match(SEMICOLON);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
					{
					setState(124);
					expression();
					}
				}

				setState(127);
				match(SEMICOLON);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
					{
					setState(128);
					expression();
					}
				}

				setState(131);
				match(RPAREN);
				setState(132);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(miniLangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(RETURN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
				{
				setState(136);
				expression();
				}
			}

			setState(139);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(miniLangParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
				{
				setState(141);
				expression();
				}
			}

			setState(144);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(miniLangParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(IDENTIFIER);
				setState(149);
				match(ASSIGNMENT_OPERATOR);
				setState(150);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				logicalOrExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OPERATOR() { return getTokens(miniLangParser.LOGICAL_OPERATOR); }
		public TerminalNode LOGICAL_OPERATOR(int i) {
			return getToken(miniLangParser.LOGICAL_OPERATOR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			logicalAndExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATOR) {
				{
				{
				setState(155);
				match(LOGICAL_OPERATOR);
				setState(156);
				logicalAndExpression();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OPERATOR() { return getTokens(miniLangParser.LOGICAL_OPERATOR); }
		public TerminalNode LOGICAL_OPERATOR(int i) {
			return getToken(miniLangParser.LOGICAL_OPERATOR, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			equalityExpression();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					match(LOGICAL_OPERATOR);
					setState(164);
					equalityExpression();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OPERATOR() { return getTokens(miniLangParser.RELATIONAL_OPERATOR); }
		public TerminalNode RELATIONAL_OPERATOR(int i) {
			return getToken(miniLangParser.RELATIONAL_OPERATOR, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			relationalExpression();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIONAL_OPERATOR) {
				{
				{
				setState(171);
				match(RELATIONAL_OPERATOR);
				setState(172);
				relationalExpression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIONAL_OPERATOR() { return getTokens(miniLangParser.RELATIONAL_OPERATOR); }
		public TerminalNode RELATIONAL_OPERATOR(int i) {
			return getToken(miniLangParser.RELATIONAL_OPERATOR, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			additiveExpression();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(RELATIONAL_OPERATOR);
					setState(180);
					additiveExpression();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ARITHMETIC_OPERATOR() { return getTokens(miniLangParser.ARITHMETIC_OPERATOR); }
		public TerminalNode ARITHMETIC_OPERATOR(int i) {
			return getToken(miniLangParser.ARITHMETIC_OPERATOR, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			multiplicativeExpression();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITHMETIC_OPERATOR) {
				{
				{
				setState(187);
				match(ARITHMETIC_OPERATOR);
				setState(188);
				multiplicativeExpression();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> ARITHMETIC_OPERATOR() { return getTokens(miniLangParser.ARITHMETIC_OPERATOR); }
		public TerminalNode ARITHMETIC_OPERATOR(int i) {
			return getToken(miniLangParser.ARITHMETIC_OPERATOR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			primaryExpression();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(ARITHMETIC_OPERATOR);
					setState(196);
					primaryExpression();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(miniLangParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(miniLangParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(miniLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniLangParser.RPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryExpression);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(LPAREN);
				setState(206);
				expression();
				setState(207);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(miniLangParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniLangParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(miniLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(miniLangParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(miniLangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(miniLangParser.STRING, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(miniLangParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniLangListener ) ((miniLangListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			match(IDENTIFIER);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OPERATOR) {
				{
				setState(213);
				match(ASSIGNMENT_OPERATOR);
				setState(214);
				expression();
				}
			}

			setState(217);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002"+
		"\n\u0002\f\u0002G\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\b\u0001"+
		"\b\u0003\b~\b\b\u0001\b\u0001\b\u0003\b\u0082\b\b\u0001\b\u0001\b\u0003"+
		"\b\u0086\b\b\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\t\u0001\t\u0001\n"+
		"\u0003\n\u008f\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0099\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u009e"+
		"\b\r\n\r\f\r\u00a1\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00a6\b\u000e\n\u000e\f\u000e\u00a9\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00ae\b\u000f\n\u000f\f\u000f\u00b1\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00b6\b\u0010\n\u0010\f\u0010\u00b9"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00be\b\u0011"+
		"\n\u0011\f\u0011\u00c1\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00c6\b\u0012\n\u0012\f\u0012\u00c9\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00d2\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d8\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(\u0000\u0002\u0001\u0000\u0001\u0004\u0001\u0000\u0001\u0005"+
		"\u00e6\u0000/\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004"+
		":\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bR\u0001\u0000"+
		"\u0000\u0000\n[\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e"+
		"f\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0087"+
		"\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0092"+
		"\u0001\u0000\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u009a"+
		"\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e\u00aa"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00ba\u0001"+
		"\u0000\u0000\u0000$\u00c2\u0001\u0000\u0000\u0000&\u00d1\u0001\u0000\u0000"+
		"\u0000(\u00d3\u0001\u0000\u0000\u0000*.\u0003\u0002\u0001\u0000+.\u0003"+
		"\u0004\u0002\u0000,.\u0003\n\u0005\u0000-*\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0001\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000023\u0007\u0000\u0000\u000036\u0005"+
		"\u0016\u0000\u000045\u0005\u000e\u0000\u000057\u0003\u0016\u000b\u0000"+
		"64\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0005\u0015\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0007"+
		"\u0001\u0000\u0000;<\u0005\u0016\u0000\u0000<>\u0005\u0010\u0000\u0000"+
		"=?\u0003\u0006\u0003\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u0011\u0000\u0000AE\u0005\u0012"+
		"\u0000\u0000BD\u0003\n\u0005\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0013\u0000\u0000"+
		"I\u0005\u0001\u0000\u0000\u0000JO\u0003\b\u0004\u0000KL\u0005\u0014\u0000"+
		"\u0000LN\u0003\b\u0004\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0007\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000"+
		"ST\u0005\u0016\u0000\u0000T\t\u0001\u0000\u0000\u0000U\\\u0003\u0014\n"+
		"\u0000V\\\u0003\f\u0006\u0000W\\\u0003\u000e\u0007\u0000X\\\u0003\u0010"+
		"\b\u0000Y\\\u0003\u0012\t\u0000Z\\\u0003(\u0014\u0000[U\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u000b"+
		"\u0001\u0000\u0000\u0000]a\u0005\u0012\u0000\u0000^`\u0003\n\u0005\u0000"+
		"_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000de\u0005\u0013\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0006\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0003\u0016\u000b\u0000"+
		"ij\u0005\u0011\u0000\u0000jm\u0003\n\u0005\u0000kl\u0005\u0007\u0000\u0000"+
		"ln\u0003\n\u0005\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u000f\u0001\u0000\u0000\u0000op\u0005\t\u0000\u0000pq\u0005\u0010\u0000"+
		"\u0000qr\u0003\u0016\u000b\u0000rs\u0005\u0011\u0000\u0000st\u0003\n\u0005"+
		"\u0000t\u0086\u0001\u0000\u0000\u0000uv\u0005\b\u0000\u0000vy\u0005\u0010"+
		"\u0000\u0000wz\u0003(\u0014\u0000xz\u0003\u0014\n\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{}\u0005\u0015\u0000\u0000|~\u0003\u0016\u000b\u0000"+
		"}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0005\u0015\u0000\u0000\u0080\u0082\u0003\u0016"+
		"\u000b\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0011"+
		"\u0000\u0000\u0084\u0086\u0003\n\u0005\u0000\u0085o\u0001\u0000\u0000"+
		"\u0000\u0085u\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0005\n\u0000\u0000\u0088\u008a\u0003\u0016\u000b\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0015\u0000\u0000\u008c"+
		"\u0013\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0016\u000b\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0015\u0000\u0000\u0091"+
		"\u0015\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0017"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0016\u0000\u0000\u0095\u0096"+
		"\u0005\u000e\u0000\u0000\u0096\u0099\u0003\u0016\u000b\u0000\u0097\u0099"+
		"\u0003\u001a\r\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a\u009f\u0003"+
		"\u001c\u000e\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009e\u0003\u001c"+
		"\u000e\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a7\u0003\u001e\u000f\u0000\u00a3\u00a4\u0005\r\u0000"+
		"\u0000\u00a4\u00a6\u0003\u001e\u000f\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001d\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00af\u0003 \u0010\u0000"+
		"\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ae\u0003 \u0010\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u001f\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b7\u0003\"\u0011\u0000\u00b3\u00b4\u0005\f\u0000\u0000\u00b4\u00b6"+
		"\u0003\"\u0011\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8!\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bf\u0003$\u0012\u0000\u00bb\u00bc\u0005\u000b\u0000"+
		"\u0000\u00bc\u00be\u0003$\u0012\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003&\u0013\u0000\u00c3\u00c4"+
		"\u0005\u000b\u0000\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8%\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00d2\u0005\u0017"+
		"\u0000\u0000\u00cb\u00d2\u0005\u0018\u0000\u0000\u00cc\u00d2\u0005\u0016"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0010\u0000\u0000\u00ce\u00cf\u0003\u0016"+
		"\u000b\u0000\u00cf\u00d0\u0005\u0011\u0000\u0000\u00d0\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0005\u0016\u0000\u0000\u00d5\u00d6\u0005\u000e\u0000"+
		"\u0000\u00d6\u00d8\u0003\u0016\u000b\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u0015\u0000\u0000\u00da)\u0001\u0000\u0000\u0000"+
		"\u0018-/6>EO[amy}\u0081\u0085\u0089\u008e\u0098\u009f\u00a7\u00af\u00b7"+
		"\u00bf\u00c7\u00d1\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}