import java.util.ArrayList;
import java.util.List;

/**
 * Created by eeliz_000 on 3/15/2017.
 */
public class Vertex implements Comparable<Vertex>{

    private String name;
    // store a list because every edge is pointing to an edge
    private List<Edge> adjecenciesList;
    // to track if already visited
    private boolean visited;
    // track previous vertex
    private Vertex predecessor;
    // track the minimum distance from the starting vertex
    private double distance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.adjecenciesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjecenciesList() {
        return adjecenciesList;
    }

    public void setAdjecenciesList(List<Edge> adjecenciesList) {
        this.adjecenciesList = adjecenciesList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void addNeighbour (Edge edge) {
        this.adjecenciesList.add(edge);
    }

    @Override
    public String toString() {
        // returns name of the vertex
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance, otherVertex.getDistance());
    }
}
