/**
 * Created by eeliz_000 on 3/15/2017.
 *
 * Demonstrates
 */
public class App {
    public static void main (String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        // edges
        vertexA.addNeighbour(new Edge(6, vertexA, vertexB));
        vertexA.addNeighbour(new Edge(1, vertexA, vertexD));
        vertexB.addNeighbour(new Edge(2, vertexB, vertexD));
        vertexB.addNeighbour(new Edge(2, vertexB, vertexE));
        vertexB.addNeighbour(new Edge(5, vertexB, vertexC));
        vertexC.addNeighbour(new Edge(5, vertexC, vertexE));
        vertexE.addNeighbour(new Edge(1, vertexE, vertexD));

        DijsktraAlgorithm algorithm = new DijsktraAlgorithm();
        algorithm.computePaths(vertexA);

        System.out.println(algorithm.getShortestPathto(vertexC));
    }
}
