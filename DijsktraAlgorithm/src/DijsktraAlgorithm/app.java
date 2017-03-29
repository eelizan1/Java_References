package DijsktraAlgorithm;

import java.util.ArrayList;

/**
 * Created by eeliz_000 on 3/22/2017.
 */
public class app {

    public static void main (String[] args) {
        // arrayList to store the minimal values
        ArrayList<Double> minDistance = new ArrayList<Double>();
        // set vertices
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");
        Vertex vertexH = new Vertex("H");

        /*
            Graph Test
         */

        // Source: A
        // Neighbors: B, H, E
        vertexA.addNeighbour(new Edge(5, vertexA, vertexB));
        vertexA.addNeighbour(new Edge(8, vertexA, vertexH));
        vertexA.addNeighbour(new Edge(9, vertexA, vertexE));
        // Vertex: B
        // Neighbors: H, C, D
        vertexB.addNeighbour(new Edge(15, vertexB, vertexD));
        vertexB.addNeighbour(new Edge(12, vertexB, vertexC));
        vertexB.addNeighbour(new Edge(4, vertexB, vertexH));
        // Vertex: C
        // Neighbors: D, G
        vertexC.addNeighbour(new Edge(3, vertexC, vertexD));
        vertexC.addNeighbour(new Edge(11, vertexC, vertexG));
        // Vertex: D
        // Neighbors: G
        vertexD.addNeighbour(new Edge(9, vertexD, vertexG));
        // Vertex: E
        // Neighbors: H, F, G
        vertexE.addNeighbour(new Edge(5, vertexE, vertexH));
        vertexE.addNeighbour(new Edge(4, vertexE, vertexF));
        vertexE.addNeighbour(new Edge(20, vertexE, vertexG));
        // Vertex: F
        // Neighbors: C, G
        vertexF.addNeighbour(new Edge(1, vertexF, vertexC));
        vertexF.addNeighbour(new Edge(13, vertexF, vertexG));
        // Vertex: H
        // Neighbors: C, F
        vertexH.addNeighbour(new Edge(7, vertexH, vertexC));
        vertexH.addNeighbour(new Edge(6, vertexH, vertexF));
        // instantiate Dijsktras Algorithm
        DijsktraAlgorithm algorithm = new DijsktraAlgorithm();
        // source us Vertex0
        algorithm.computePaths(vertexA);

        // what is the shortest path from A to C?
        System.out.println("Shortest path from A to B: " + algorithm.getShortestPathTo(vertexB));
        System.out.println("Shortest path from A to C: " + algorithm.getShortestPathTo(vertexC));
        System.out.println("Shortest path from A to D: " + algorithm.getShortestPathTo(vertexD));
        System.out.println("Shortest path from A to E: " + algorithm.getShortestPathTo(vertexE));
        System.out.println("Shortest path from A to F: " + algorithm.getShortestPathTo(vertexF));
        System.out.println("Shortest path from A to G: " + algorithm.getShortestPathTo(vertexG));
        System.out.println("Shortest path from A to H: " + algorithm.getShortestPathTo(vertexH));

        System.out.println();
        // add distances to array
        minDistance.add(vertexA.getDistance());
        minDistance.add(vertexB.getDistance());
        minDistance.add(vertexC.getDistance());
        minDistance.add(vertexD.getDistance());
        minDistance.add(vertexE.getDistance());
        minDistance.add(vertexF.getDistance());
        minDistance.add(vertexG.getDistance());
        minDistance.add(vertexH.getDistance());

        // shortest path: 91
        System.out.println("Distance of A: " + vertexA.getDistance());
        System.out.println("Distance of B: " + vertexB.getDistance());
        System.out.println("Distance of C: " + vertexC.getDistance());
        System.out.println("Distance of D: " + vertexD.getDistance());
        System.out.println("Distance of E: " + vertexE.getDistance());
        System.out.println("Distance of F: " + vertexF.getDistance());
        System.out.println("Distance of G: " + vertexG.getDistance());
        System.out.println("Distance of H: " + vertexH.getDistance());

        double sum = 0;
        for(int i = 0; i < minDistance.size(); i++) {
            sum += minDistance.get(i);
        }

        System.out.println("Shortest Path Distance is: " + sum);



    }

}
