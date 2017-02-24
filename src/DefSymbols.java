import symtab.BasicScope;
import symtab.FunctionSymbol;
import symtab.Scope;
import symtab.Symbol;
import symtab.VariableSymbol;

public class DefSymbols extends FaLaLaBaseListener {
    protected BasicScope globals;
    protected Scope currentScope = null;

    // Handle scopes

    @Override
    public void enterProg(FaLaLaParser.ProgContext ctx) {
        globals = new BasicScope(null);
        currentScope = globals;
        ctx.scope = currentScope;
    }

    @Override
    public void exitProg(FaLaLaParser.ProgContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFunc(FaLaLaParser.FuncContext ctx) {
        String funcName = ctx.ID().getText();
        FunctionSymbol s = new FunctionSymbol(funcName, currentScope);
        currentScope.define(s);
        currentScope = s;
        ctx.scope = currentScope;
    }

    @Override
    public void exitFunc(FaLaLaParser.FuncContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterBlock(FaLaLaParser.BlockContext ctx) {
        currentScope = new BasicScope(currentScope);
        ctx.scope = currentScope;
    }

    @Override
    public void exitBlock(FaLaLaParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    // Handle defs

    @Override
    public void enterDef(FaLaLaParser.DefContext ctx) {
        String varName = ctx.ID().getText();
        VariableSymbol sym = new VariableSymbol(varName);
        currentScope.define(sym);
    }

    // Handle refs

    @Override
    public void enterStat(FaLaLaParser.StatContext ctx) {
        String varName = ctx.ID().getText();
        Symbol sym = currentScope.resolve(varName);
        if ( sym==null ) {
            System.err.println("No such var: "+varName);
        }
    }

    @Override
    public void enterExpr(FaLaLaParser.ExprContext ctx) {
        if ( ctx.ID()!=null ) {
            String varName = ctx.ID().getText();
            Symbol sym = currentScope.resolve(varName);
            if ( sym==null ) {
                System.err.println("No such var: "+varName);
            }
        }
    }
}