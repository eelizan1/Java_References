package DijsktraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by eeliz_000 on 3/22/2017.
 */
public class DijsktraAlgorithm {

    public void computePaths(Vertex sourceVertex) {
        // source is initialized to 0
        sourceVertex.setDistance(0);

        // the heap to order the vertices
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        // while loop iterates the heap until empty
        while(!priorityQueue.isEmpty()) {
            // poll() retrieves and removes the head of the heap
            // in this case, the head of the heap is the minimal distance
            Vertex currentVertex = priorityQueue.poll();

            // consider all the neighbors of the currentVertex
            // uses the getAdajenciesList to select neighbors
            for(Edge edge :currentVertex.getAdjecenciesList()) {
                Vertex v = edge.getTargetVertex();
                // adds the distance of current vertex and the selected adjacent vertex's edge weight
                // refer tp psuedocode: tempDistance = distance[u] + distanceBetween(u, v)
                double newDistance = currentVertex.getDistance() + edge.getWeight();

                // compares to see if this new distance is better than original distance
                if(newDistance < v.getDistance()) {
                    // if better:
                    // remove from queue
                    priorityQueue.remove(v);
                    // set new distance from source to vertex
                    v.setDistance(newDistance);
                    // set new predecessor of new vertex
                    // this will track the shortest path itself
                    v.setPredecessor(currentVertex);
                    // add v back to queue
                    priorityQueue.add(v);
                }
            }
        }
    }
    // Returns the shortest path
    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        // list of vertices we have to visit
        List<Vertex> shortestPathToTarget = new ArrayList<>();
        // backtracking the path using getPredecessor
        for(Vertex vertex = targetVertex; vertex !=null; vertex = vertex.getPredecessor()) {
            // backtracking will get the vertices
            // now add those vertices to the shortest path
            shortestPathToTarget.add(vertex);
        }

        Collections.reverse(shortestPathToTarget);
        return shortestPathToTarget;
    }
}
