// Generated from /Users/ashi/git/inclassLabs/grammars/FaLaLa.g4 by ANTLR 4.6
import symtab.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FaLaLaParser}.
 */
public interface FaLaLaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FaLaLaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FaLaLaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FaLaLaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FaLaLaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(FaLaLaParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(FaLaLaParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FaLaLaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FaLaLaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(FaLaLaParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(FaLaLaParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FaLaLaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FaLaLaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FaLaLaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FaLaLaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FaLaLaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FaLaLaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaLaLaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FaLaLaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaLaLaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FaLaLaParser.ExprContext ctx);
}