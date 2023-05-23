package magim.utility.jsonconverter.model.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Violation {
    private String type;
    private String from;
    private String to;
    private Rule rule;
}
