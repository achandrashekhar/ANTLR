// Generated from /Users/ashi/git/inclassLabs/grammars/newCSV.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link newCSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface newCSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link newCSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(newCSVParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link newCSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(newCSVParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link newCSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(newCSVParser.FieldContext ctx);
}