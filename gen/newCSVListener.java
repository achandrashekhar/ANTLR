// Generated from /Users/ashi/git/inclassLabs/grammars/newCSV.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link newCSVParser}.
 */
public interface newCSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link newCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(newCSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link newCSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(newCSVParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link newCSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(newCSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link newCSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(newCSVParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link newCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(newCSVParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link newCSVParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(newCSVParser.FieldContext ctx);
}