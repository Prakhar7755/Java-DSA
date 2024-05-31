import java.util.ArrayList;

class Graph {
  static class Edge {
    int src, dest;
    int weight;

    Edge(int source, int destination/* ,int weight */) {
      this.src = source;
      this.dest = destination;
      // this.weight = weight;
    }
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    // TO AVOID nullPointerException we will
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>(); // initializing each index with an edge
    }

    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 3));
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 2));
  }

  public static void printGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      System.out.print("Vertex " + i + ":\t");
      for (Edge edge : graph[i]) {
        System.out.printf(edge.dest + "\t\t");
      }
      System.out.println();
    }
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    int V = 4; // no. of vertices

    ArrayList<Edge> graph[] = new ArrayList[V]; // each index has a NULL value instead of an empty ArrayList
    Graph.createGraph(graph);

    // Print the graph
    Graph.printGraph(graph);

    System.out.println("\n\nPrinting 2's neighbors");
    for (int i = 0; i < graph[2].size(); i++) {
      Edge e = graph[2].get(i);
      System.out.print(e.dest + "\t");
    }

  }
}
