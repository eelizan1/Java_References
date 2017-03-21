import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;
/**
 * Created by eeliz_000 on 3/15/2017.
 * The Algorithm itself
 */
public class DijsktraAlgorithm {

    public void computePaths(Vertex sourceVertex) {
        sourceVertex.setDistance(0);
        // to order the vertices
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while(!priorityQueue.isEmpty()) {
            Vertex actualVertex = priorityQueue.poll();
            for(Edge edge : actualVertex.getAdjecenciesList()) {
                Vertex v = edge.getTargetVertex();
                double newDistance = actualVertex.getDistance() + edge.getWeight();

                if(newDistance < v.getDistance()) {
                    priorityQueue.remove(v);
                    v.setDistance(newDistance);
                    v.setPredecessor(actualVertex);
                    priorityQueue.add(v);
                }
            }
        }
    }
    public List<Vertex> getShortestPathto(Vertex targetVertex) {
        List<Vertex> shortestPathToTarget = new ArrayList<>();
        for(Vertex vertex = targetVertex; vertex !=null; vertex = vertex.getPredecessor()) {
            shortestPathToTarget.add(vertex);
        }
        Collections.reverse(shortestPathToTarget);
        return shortestPathToTarget;
    }
}
