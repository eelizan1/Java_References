import java.util.HashMap;
import java.util.Map;

/**
 * Date 10/11/2014
 * @author Tushar Roy
 *
 * Find single source shortest path using Dijkstra's algorithm
 *
 * Space complexity - O(E + V)
 * Time complexity - O(ElogV)
 *
 * References
 * https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm
 * CLRS book*/
public class DijkstraShortestPath {

	// shortestPath function takes in the graph and source vertex: Graph<Integer> graph, Vertex<Integer> sourceVertex 
	// returns a map of vertex and the shortest distance of that vertex from the source : Map<Vertex<Integer>,Integer>
    public Map<Vertex<Integer>,Integer> shortestPath(Graph<Integer> graph, Vertex<Integer> sourceVertex){

        //heap + map data structure
		// contains 4 operations: 
		//			extractMinNode
		//			add
		//			decrease
		//			contains
        BinaryMinHeap<Vertex<Integer>> minHeap = new BinaryMinHeap<>();

        // Distance Map: stores shortest distance from root to every vertex
        Map<Vertex<Integer>,Integer> distance = new HashMap<>();

        // Path Map: stores parent of every vertex in shortest distance
        Map<Vertex<Integer>, Vertex<Integer>> parent = new HashMap<>();

        // Initialize all vertex with infinite distance from source vertex
		// All nodes will get infinity because we do not know the shortest distance yet 
        for(Vertex<Integer> vertex : graph.getAllVertex()){
            minHeap.add(Integer.MAX_VALUE, vertex);
        }

        //set distance of source vertex to 0
		// A - 0 
        minHeap.decrease(sourceVertex, 0);

        // put value it in distance map
        distance.put(sourceVertex, 0);

        //source vertex parent is null
        parent.put(sourceVertex, null);
		
		// END INITIALIZATION 
		/*********************************************************************************************************/

        //iterate till heap is not empty
        while(!minHeap.empty()){
            //get the min value from heap node which has vertex and distance of that vertex from source vertex.
			// heapNode contains the vertex and distance from that vertex from the source 
            BinaryMinHeap<Vertex<Integer>>.Node heapNode = minHeap.extractMinNode();
			
			// once get heap node, get current vertex from it 
			// key is the current vertex 
            Vertex<Integer> current = heapNode.key;

            //update shortest distance of current vertex from source vertex in distance map 
            distance.put(current, heapNode.weight);

			//*****************************************************************************************************/
			//CHECKING PART OF THE ALGORITHM 
			/*****************************************************************************************************/
			
			
            // iterate through all edges of current vertex
			// so look at each neighbour of the current vertex 
            for(Edge<Integer> edge : current.getEdges()){

                //get the adjacent vertex
                Vertex<Integer> adjacent = getVertexForEdge(current, edge);

                // if heap does not contain adjacent vertex means adjacent vertex already has shortest distance from source vertex
				// Checking the hash + map 
                if(!minHeap.containsData(adjacent)){
					// if it's not there, continue by going back up the for loop to the next adjacent vertex 
                    continue;
                }
				
				// IF HASH MAP + HEAP CONTAINS AN AJACENT VERTEX 

                //add distance of current vertex to edge weight to get distance of adjacent vertex from source vertex
                //when it goes through current vertex
				// that new distance from source to current vertex adjacent neighbour
				// this will be checked against current distance and see if it is smaller not not 
                int newDistance = distance.get(current) + edge.getWeight();

                //see if this above calculated distance is less than current distance stored for adjacent vertex from source vertex
                if(minHeap.getWeight(adjacent) > newDistance) {
                    minHeap.decrease(adjacent, newDistance);
                    parent.put(adjacent, current);
                }
            }
        }
		
		// returns the distance from every vertex from the source 
        return distance;
    }

    private Vertex<Integer> getVertexForEdge(Vertex<Integer> v, Edge<Integer> e){
        return e.getVertex1().equals(v) ? e.getVertex2() : e.getVertex1();
    }
    
    public static void main(String args[]){
        Graph<Integer> graph = new Graph<>(false);
        /*graph.addEdge(0, 1, 4);
        graph.addEdge(1, 2, 8);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 9);
        graph.addEdge(4, 5, 10);
        graph.addEdge(2, 5, 4);
        graph.addEdge(1, 7, 11);
        graph.addEdge(0, 7, 8);
        graph.addEdge(2, 8, 2);
        graph.addEdge(3, 5, 14);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 8, 6);
        graph.addEdge(6, 7, 1);
        graph.addEdge(7, 8, 7);*/

        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(1, 4, 9);
        graph.addEdge(1, 5, 3);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 4, 2);
        graph.addEdge(3, 4, 3);

        DijkstraShortestPath dsp = new DijkstraShortestPath();
        Vertex<Integer> sourceVertex = graph.getVertex(1);
        Map<Vertex<Integer>,Integer> distance = dsp.shortestPath(graph, sourceVertex);
        System.out.print(distance);
    }
}