// Generated from /Users/ashi/git/inclassLabs/grammars/CDecl.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CDeclParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CDeclVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CDeclParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CDeclParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDeclParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(CDeclParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(CDeclParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CDeclParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CDeclParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pointer}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CDeclParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(CDeclParser.GroupingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDeclParser#declaration2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration2(CDeclParser.Declaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CDeclParser#declarator2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator2(CDeclParser.Declarator2Context ctx);
}