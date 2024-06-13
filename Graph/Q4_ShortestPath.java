import java.util.*;

public class Q4_ShortestPath {

  static void shortestPath(ArrayList<ArrayList<Integer>> adj, int V, int s) {
    int[] dist = new int[V];
    for (int i = 0; i < dist.length; i++) {
      dist[i] = Integer.MAX_VALUE;
    }

    dist[s] = 0;
    Queue<Integer> q = new LinkedList<>();

    boolean visited[] = new boolean[V];
    q.offer(s);
    visited[s] = true;

    while (!q.isEmpty()) {
      int u = q.poll();
      for (int v : adj.get(u)) {
        if (!visited[v]) {
          dist[v] = dist[u] + 1;
          visited[v] = true;
          q.offer(v);
        }
      }
    }
    System.out.println(Arrays.toString(dist));
  }

  public static void main(String[] args) {
    int V = 5;
    var adj = new ArrayList<ArrayList<Integer>>(V);

    Graph g = new Graph();
    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<Integer>());
    }

    g.addEdge(adj, 0, 1);
    g.addEdge(adj, 0, 4);
    g.addEdge(adj, 1, 2);
    g.addEdge(adj, 1, 3);
    g.addEdge(adj, 1, 4);
    g.addEdge(adj, 2, 3);
    g.addEdge(adj, 3, 4);

    shortestPath(adj, V, 0);

    /*
     * [0, 1, 2, 2, 1]
     */

  }
}