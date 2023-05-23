package magim.utility.jsonconverter.model.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private String source;
    private boolean orphan;
    private boolean valid;
}
