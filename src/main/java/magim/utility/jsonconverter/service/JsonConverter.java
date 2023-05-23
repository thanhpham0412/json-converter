package magim.utility.jsonconverter.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import magim.utility.jsonconverter.model.input.Data;
import magim.utility.jsonconverter.model.input.Module;
import magim.utility.jsonconverter.model.output.Edge;
import magim.utility.jsonconverter.model.output.Node;
import magim.utility.jsonconverter.model.output.Payload;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonConverter {
    public void convertJsonFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("kenflix-dependencymap.txt"));
            Data data = new Gson().fromJson(br, Data.class);
//            System.out.println(data);
            handleData(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Payload handleData(Data data) {
        List<Node> nodes = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        int i = 0;
        for (Module module : data.getPayload().getModules()) {
            Node node = Node.builder().source(module.getSource())
                    .orphan(module.isOrphan())
                    .valid(module.isValid()).build();
            nodes.add(node);
            for (magim.utility.jsonconverter.model.input.Node node1 : module.getDependencies()) {
                Edge edge = Edge.builder()
                        .from(module.getSource())
                        .to(node1.getResolved())
                        .moduleSystem(node1.getModuleSystem())
                        .dynamic(node1.isDynamic())
                        .exoticallyRequired(node1.isExoticallyRequired())
                        .coreModule(node1.isCoreModule())
                        .followable(node1.isFollowable())
                        .couldNotResolve(node1.isCouldNotResolve())
                        .dependencyTypes(node1.getDependencyTypes())
                        .matchesDoNotFollow(node1.isMatchesDoNotFollow())
                        .circular(node1.isCircular())
                        .valid(node1.isValid())
                        .build();
                edges.add(edge);
            }



            System.out.println(i + " " + module.getSource());
            i++;
        }

        int j = 0;
        for (Edge edge : edges) {
            //System.out.println(j + " " + edge.getFrom() + " -> " + edge.getTo());
            j++;
        }

        Payload payload = Payload.builder()
                .nodes(nodes)
                .edges(edges).build();

        Gson gson = new GsonBuilder().create();
        String payloadStr = gson.toJson(payload);


        /*try (PrintWriter out = new PrintWriter("output.json")) {
            out.println(payloadStr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

        return payload;
    }
}
