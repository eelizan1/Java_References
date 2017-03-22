package DijsktraAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eeliz_000 on 3/22/2017.
 */
public class Vertex implements Comparable<Vertex>{
    /**
     * Uses the comparable<Vertex> interface as the heap
     * It will compare vertices according to the minimum distance
     * using the compareTo method
     */

    private String name;
    // store a list of edges because every vertex is pointing to an edge
    private List<Edge> adjecenciesList;
    // to track if already visited
    private boolean visited;
    // track previous vertex
    // and will be used to construct the shortest path as backtracking
    private Vertex predecessor;
    // track the distance from the starting vertex to the Vertex predecessor
    // Double.MAX_VALUE represents the infinity of the initialization of nodes
    private double distance = Double.MAX_VALUE;

    // Constructor: initialize the vertex
    public Vertex(String name) {
        this.name = name;
        this.adjecenciesList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge) {
        this.adjecenciesList.add(edge);
    }
    /*********************************************************************************************
     * Getters and Setters
     *********************************************************************************************/

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

    /********************************************************************************************************/
    @Override
    public String toString() {
        // returns name of the vertex
        return this.name;
    }

    // how the heap will compare the distance
    // Need to orverride in order for the heap to compare distance
    @Override
    public int compareTo(Vertex otherVertex) {
        // gets smaller distance
        // returns +1, -1, or 0
        // 0: if d1 is equal to d2
        // -1: if this.distance < othervertext.getDistance
        // 1: if this.distance > othervertext.getDistance
        return Double.compare(this.distance, otherVertex.getDistance());
    }
}

