package Strings;
        import java.io.File;
        import java.io.IOException;
        import java.util.*;

public class Test {
    static final int INFINITY = Integer.MAX_VALUE;
    static int nodes, edges;
    static int[] shortDist;
    static List<Edge>[] adjList;

    public static void main(String[] args) {
        Date d = new Date();
        long s1 = d.getTime();
        try {
            Scanner sc = new Scanner(new File("1000.txt"));
            String line = sc.nextLine();
            String[] ne = line.split(" ");

            nodes = Integer.parseInt(ne[0].split("=")[1]);
            edges = Integer.parseInt(ne[1].split("=")[1]);

            constructGraph(sc);

            int start = 0;

            calShortestPaths(start);

            int sum = 0;
            for (int i = 0; i < nodes; i++) {
                if (i == start)
                    continue;

                if (shortDist[i] != INFINITY) {
                    sum += shortDist[i];
                }
            }

            System.out.println();
            System.out.println("Sum is:"+sum);

        } catch (IOException e) {
//
        }
        Date d1 = new Date();
        long s2 = d1.getTime();
        System.out.println((s2 - s1) / 100);
    }

    static void constructGraph(Scanner sc) {
        adjList = new ArrayList[nodes];

        for (int i = 0; i < nodes; i++)
            adjList[i] = new ArrayList<>();

        for (int i = 0; i < nodes && sc.hasNext(); i++) {
            String edge;
            String n = sc.nextLine();
            while (sc.hasNext() && !(edge = sc.nextLine()).isEmpty()) {
                String[] e = edge.trim().split(" ");
                int from, to, weight;

                to = Integer.parseInt(e[0]);
                weight = Integer.parseInt(e[1].trim());
                adjList[Integer.parseInt(n)].add(new Edge(to, weight));
                adjList[to].add(new Edge(Integer.parseInt(n), weight));
            }
        }
    }

    static void calShortestPaths(int start) {
        shortDist = new int[nodes];

        for (int i = 0; i < nodes; i++)
            shortDist[i] = INFINITY;

        TreeSet<Node> set = new TreeSet<>();

        shortDist[start] = 0;
        set.add(new Node(start, 0, -1));

        while (set.size() > 0) {
            Node curr = set.pollFirst();

            for (Edge edge : adjList[curr.node]) {
                if (shortDist[curr.node] + edge.weight < shortDist[edge.to]) {
                    set.remove(new Node(edge.to, shortDist[edge.to], -1));
                    shortDist[edge.to] = shortDist[curr.node] + edge.weight;
                    set.add(new Node(edge.to, shortDist[edge.to], curr.node));
                }
            }
        }
    }

    private static class Edge {
        int to, weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

    }

    static class Node implements Comparable<Node> {
        int node, dist, parent;

        public Node(int node, int dist, int parent) {
            this.node = node;
            this.dist = dist;
            this.parent = parent;
        }

        @Override
        public int compareTo(Node o) {
            if (dist == o.dist)
                return Integer.compare(node, o.node);

            return Integer.compare(dist, o.dist);
        }

    }
}
