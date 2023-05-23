package magim.utility.jsonconverter.model.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Module {
    private String source;
    private Node[] dependencies;
    private String[] dependents;
    private boolean orphan;
    private boolean valid;
}
