package magim.utility.jsonconverter.model.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Edge {
    private String from;
    private String to;
    private String moduleSystem;
    private boolean dynamic;
    private boolean exoticallyRequired;
    private boolean coreModule;
    private boolean followable;
    private boolean couldNotResolve;
    private String[] dependencyTypes;
    private boolean matchesDoNotFollow;
    private boolean circular;
    private boolean valid;
}
