package magim.utility.jsonconverter.model.input;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private String event;
    private Payload payload;
}
