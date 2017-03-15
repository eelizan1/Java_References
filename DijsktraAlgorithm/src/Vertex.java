import java.util.List;

/**
 * Created by eeliz_000 on 3/15/2017.
 */
public class Vertex {

    private String name;
    private List<Edge> adjecenciesList;
    private boolean visited;
    private Vertex predecessor;
    private double minDistance = Double.MAX_VALUE;
}
