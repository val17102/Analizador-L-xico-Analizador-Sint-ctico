// Generated from decaf3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decaf3Parser}.
 */
public interface decaf3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decaf3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decaf3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decaf3Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decaf3Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclaration(decaf3Parser.ParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclaration(decaf3Parser.ParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decaf3Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decaf3Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#arrayId}.
	 * @param ctx the parse tree
	 */
	void enterArrayId(decaf3Parser.ArrayIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#arrayId}.
	 * @param ctx the parse tree
	 */
	void exitArrayId(decaf3Parser.ArrayIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#paramVar}.
	 * @param ctx the parse tree
	 */
	void enterParamVar(decaf3Parser.ParamVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#paramVar}.
	 * @param ctx the parse tree
	 */
	void exitParamVar(decaf3Parser.ParamVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(decaf3Parser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(decaf3Parser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decaf3Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decaf3Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(decaf3Parser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(decaf3Parser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decaf3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decaf3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decaf3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decaf3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#methodCallInter}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallInter(decaf3Parser.MethodCallInterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#methodCallInter}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallInter(decaf3Parser.MethodCallInterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decaf3Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decaf3Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(decaf3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(decaf3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decaf3Parser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decaf3Parser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decaf3Parser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decaf3Parser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decaf3Parser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decaf3Parser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decaf3Parser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decaf3Parser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decaf3Parser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decaf3Parser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decaf3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decaf3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(decaf3Parser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(decaf3Parser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decaf3Parser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decaf3Parser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(decaf3Parser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(decaf3Parser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(decaf3Parser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(decaf3Parser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decaf3Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(decaf3Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link decaf3Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(decaf3Parser.MethodNameContext ctx);
}