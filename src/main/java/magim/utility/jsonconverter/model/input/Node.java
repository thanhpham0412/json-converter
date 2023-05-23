package magim.utility.jsonconverter.model.input;

import lombok.*;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private String module;
    private String moduleSystem;
    private boolean dynamic;
    private boolean exoticallyRequired;
    private String resolved;
    private boolean coreModule;
    private boolean followable;
    private boolean couldNotResolve;
    private String[] dependencyTypes;
    private boolean matchesDoNotFollow;
    private boolean circular;
    private boolean valid;

}
