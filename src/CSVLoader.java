import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashi on 2/13/17.
 */
public class CSVLoader extends newCSVBaseListener  {
    List<List<String>> data = new ArrayList<>();

@Override
public void exitRow(newCSVParser.RowContext ctx) {
    List<String> row = new ArrayList<>();
    for (newCSVParser.FieldContext f : ctx.field()) {
        row.add(f.getText().trim());
    }
    data.add(row);
}
}
