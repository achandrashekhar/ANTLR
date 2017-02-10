// Generated from /Users/ashi/git/inclassLabs/grammars/CDecl.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CDeclParser}.
 */
public interface CDeclListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CDeclParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CDeclParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CDeclParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDeclParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(CDeclParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(CDeclParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterArray(CDeclParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitArray(CDeclParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CDeclParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CDeclParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterVar(CDeclParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitVar(CDeclParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pointer}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CDeclParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pointer}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CDeclParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(CDeclParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link CDeclParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(CDeclParser.GroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDeclParser#declaration2}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration2(CDeclParser.Declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#declaration2}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration2(CDeclParser.Declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CDeclParser#declarator2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator2(CDeclParser.Declarator2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CDeclParser#declarator2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator2(CDeclParser.Declarator2Context ctx);
}