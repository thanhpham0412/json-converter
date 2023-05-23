package magim.utility.jsonconverter.controller;

import lombok.RequiredArgsConstructor;
import magim.utility.jsonconverter.model.input.Data;
import magim.utility.jsonconverter.model.output.Payload;
import magim.utility.jsonconverter.service.JsonConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JsonConverterController {
    private final JsonConverter jsonConverter;

    @PostMapping("/json-converter")
    public Payload getJson(@RequestBody Data input) {
        return jsonConverter.handleData(input);
    }
}
