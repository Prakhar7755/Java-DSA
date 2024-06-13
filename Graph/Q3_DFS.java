import java.util.ArrayList;

public class Q3_DFS {
  static void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
    boolean visited[] = new boolean[V];
    DFSRec(adj, s, visited);
  }

  static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
    visited[s] = true;
    System.out.print(s + "\t");

    for (int u : adj.get(s)) {
      if (!visited[u]) {
        DFSRec(adj, u, visited);
      }
    }
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

    g.printGraph(adj);

    g.BFS(adj, V, 0);

    System.out.println();

    DFS(adj, V, 0);
    System.out.println();

    g.DFS(adj, V, 0);
  }
}