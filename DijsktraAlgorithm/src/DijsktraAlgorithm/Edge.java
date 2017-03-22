package DijsktraAlgorithm;

/**
 * Created by eeliz_000 on 3/22/2017.
 */
public class Edge {
    // represent weight of the edge
    private double weight;
    // every edge will connect to two vertices
    private Vertex startVertex;
    // Every edge connects to vertices
    private Vertex targetVertex;

    // generate constructor
    public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    // getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}
