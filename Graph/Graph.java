import java.util.*;

public class Graph {
  void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  void printGraph(ArrayList<ArrayList<Integer>> adj) {
    for (int i = 0; i < adj.size(); i++) {
      System.out.print("\nAdjacency List of vertex " + i);
      for (int j = 0; j < adj.get(i).size(); j++) {
        System.out.print(" -> " + adj.get(i).get(j));
      }
      System.out.println();
    }
  }

  void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
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

  void BFSdis(ArrayList<ArrayList<Integer>> adj, int V) {
    boolean[] visited = new boolean[V + 1];
    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        BFS2(adj, i, visited);
      }
    }
  }

  void BFS2(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
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

  void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
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

  boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V) {
    boolean vis[] = new boolean[V];
    for (int i = 0; i < V; i++) {
      
    }
  }

  void shortestPath(ArrayList<ArrayList<Integer>> adj, int V, int s) {
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

}
