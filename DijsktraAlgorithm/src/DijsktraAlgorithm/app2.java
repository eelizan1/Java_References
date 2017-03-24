package DijsktraAlgorithm;

import java.util.ArrayList;

/**
 * Created by eeliz_000 on 3/22/2017.
 */
public class app2 {

    public static void main (String[] args) {
        // arrayList to store the minimal values
        ArrayList<Double> minDistance = new ArrayList<Double>();
        // set vertices
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");
        Vertex vertex6 = new Vertex("6");

        /*
            Graph Test
         */

        // Source: 1
        // Neighbors: 2, 5, 4
        vertex1.addNeighbour(new Edge(5, vertex1, vertex2));
        vertex1.addNeighbour(new Edge(3, vertex1, vertex5));
        vertex1.addNeighbour(new Edge(9, vertex1, vertex4));
        // Source: 2
        // Neighbors: 3
        vertex2.addNeighbour(new Edge(2, vertex2, vertex3));
        // Source: 3
        // Neighbors: 4
        vertex3.addNeighbour(new Edge(3, vertex3, vertex4));
        // Source: 5
        // Neighbors: 6
        vertex5.addNeighbour(new Edge(2, vertex5, vertex6));
        // Source: 6
        // Neighbors: 4
        vertex4.addNeighbour(new Edge(2, vertex6, vertex4));
        // instantiate Dijsktras Algorithm
        DijsktraAlgorithm algorithm = new DijsktraAlgorithm();
        // source us Vertex0
        algorithm.computePaths(vertex1);

        System.out.println("Shortest path from 1 to 2: " + algorithm.getShortestPathTo(vertex2));
        System.out.println("Shortest path from 1 to 3: " + algorithm.getShortestPathTo(vertex3));
        System.out.println("Shortest path from 1 to 4: " + algorithm.getShortestPathTo(vertex4));
        System.out.println("Shortest path from 1 to 5: " + algorithm.getShortestPathTo(vertex5));
        System.out.println("Shortest path from 1 to 6: " + algorithm.getShortestPathTo(vertex6));

        System.out.println();
        // add distances to array
        minDistance.add(vertex1.getDistance());
        minDistance.add(vertex2.getDistance());
        minDistance.add(vertex3.getDistance());
        minDistance.add(vertex4.getDistance());
        minDistance.add(vertex5.getDistance());
        minDistance.add(vertex6.getDistance());

        System.out.println("Distance of A: " + vertex1.getDistance());
        System.out.println("Distance of B: " + vertex2.getDistance());
        System.out.println("Distance of C: " + vertex3.getDistance());
        System.out.println("Distance of D: " + vertex4.getDistance());
        System.out.println("Distance of E: " + vertex5.getDistance());
        System.out.println("Distance of F: " + vertex6.getDistance());


        double sum = 0;
        for(int i = 0; i < minDistance.size(); i++) {
            sum += minDistance.get(i);
        }

        System.out.println("Shortest Path Distance is: " + sum);



    }

}
