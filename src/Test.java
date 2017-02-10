
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by ashi on 2/8/17.
 */
public class Test {
    public static void main(String[] args) {

            String prop = "id=\"parrt\"\n";
            ANTLRInputStream input = null;
            input = new ANTLRInputStream(prop);
            PropertyFileLexer lexer = new PropertyFileLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PropertyFileParser parser = new PropertyFileParser(tokens);
            ParseTree tree = parser.file();
            System.out.println(tree.toStringTree(parser));
            Trees.inspect(tree, parser);
            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener,tree);
            System.out.println(listener.propMap);

    }
}
