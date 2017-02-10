import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashi on 2/8/17.
 */
public class Listener  extends PropertyFileBaseListener {

    Map<String,String> propMap = new HashMap<>();
    @Override
    public void exitProp(PropertyFileParser.PropContext ctx) {


        propMap.put(ctx.ID().getText(),ctx.STRING().getText());
    }
}
