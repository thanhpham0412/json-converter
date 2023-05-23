package magim.utility.jsonconverter.model.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payload {
    private List<Node> nodes;
    private List<Edge> edges;
}
