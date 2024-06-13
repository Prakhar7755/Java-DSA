import java.util.*;

public class Q2_ListRepresentation {
  static class Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
      for (int i = 0; i < adj.size(); i++) {
        System.out.print("\nAdjacency List of vertex " + i);
        for (int j = 0; j < adj.get(i).size(); j++) {
          System.out.print(" -> " + adj.get(i).get(j));
        }
        System.out.println();
      }
    }

    static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
      // s = 0 ASSUME ZERO IS SOURCE
      boolean visited[] = new boolean[V + 1];
      Queue<Integer> q = new LinkedList<>();
      visited[s] = true;
      q.add(s);

      while (!q.isEmpty()) {
        int u = q.poll();
        System.out.print(u + "\t");
        for (int v : adj.get(u)) {
          if (!visited[v]) {
            visited[v] = true;
            q.add(v);
          }
        }
      }
    }

    static void BFSdis(ArrayList<ArrayList<Integer>> adj, int V) {
      boolean[] visited = new boolean[V + 1];
      for (int i = 0; i < V; i++) {
        if (!visited[i]) {
          BFS2(adj, i, visited);
        }
      }
    }

    static void BFS2(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
      Queue<Integer> q = new LinkedList<>();
      visited[s] = true;
      q.add(s);

      while (!q.isEmpty()) {
        int u = q.poll();
        System.out.print(u + "\t");
        for (int v : adj.get(u)) {
          if (!visited[v]) {
            visited[v] = true;
            q.add(v);
          }
        }
      }
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
      boolean[] visited = new boolean[V];
      var st = new Stack<Integer>();
      st.push(s);
      visited[s] = true;

      while (!st.isEmpty()) {
        int u = st.pop();
        System.out.print(u + "\t");

        for (int v : adj.get(u)) {
          if (!visited[v]) {
            st.push(v);
            visited[v] = true;
          }
        }
      }
    }

  }

  public static void main(String[] args) {
    // Creating a Graph with 5 vertices
    int V = 5;
    var adj = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<Integer>());
    }

    Graph.addEdge(adj, 0, 1);
    Graph.addEdge(adj, 0, 4);
    Graph.addEdge(adj, 1, 2);
    Graph.addEdge(adj, 1, 3);
    Graph.addEdge(adj, 1, 4);
    Graph.addEdge(adj, 2, 3);
    Graph.addEdge(adj, 3, 4);

    Graph.printGraph(adj);

    Graph.BFS(adj, V, 0);

    System.out.println();

    Graph.BFSdis(adj, V);

    System.out.println();

    Graph.DFS(adj, V, 0);
  }
}
