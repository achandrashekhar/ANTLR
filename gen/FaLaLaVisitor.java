// Generated from /Users/ashi/git/inclassLabs/grammars/FaLaLa.g4 by ANTLR 4.6
import symtab.*;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FaLaLaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FaLaLaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FaLaLaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FaLaLaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(FaLaLaParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FaLaLaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(FaLaLaParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FaLaLaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FaLaLaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FaLaLaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FaLaLaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FaLaLaParser.ExprContext ctx);
}