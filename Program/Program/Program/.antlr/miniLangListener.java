// Generated from c:/Users/comin/anul ii/lfc/proiect2_lfc/proiect2lfc2/Program/Program/miniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniLangParser}.
 */
public interface miniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(miniLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(miniLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(miniLangParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(miniLangParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(miniLangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(miniLangParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(miniLangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(miniLangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(miniLangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(miniLangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(miniLangParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(miniLangParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(miniLangParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(miniLangParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(miniLangParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(miniLangParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(miniLangParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(miniLangParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(miniLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(miniLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miniLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miniLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(miniLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(miniLangParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(miniLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(miniLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(miniLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(miniLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(miniLangParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(miniLangParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(miniLangParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(miniLangParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(miniLangParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(miniLangParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(miniLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(miniLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(miniLangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(miniLangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(miniLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(miniLangParser.VariableDeclarationContext ctx);
}