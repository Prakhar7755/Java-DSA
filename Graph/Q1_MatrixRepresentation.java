import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class Graph {
  private int[][] adjacencyMatrix;
  private int V;

  public Graph(int numOfVertices) {
    this.V = numOfVertices;
    adjacencyMatrix = new int[numOfVertices][numOfVertices];
  }

  public void addEdge(int src, int dest) {
    // FOR AN UNDIRECTED GRAPH
    adjacencyMatrix[src][dest] = 1;
    adjacencyMatrix[dest][src] = 1;
  }

  /* Adding Vertices */
  public void addVertex() {
    V++;
    int[][] newMatrix = new int[V][V];
    for (int i = 0; i < V - 1; i++) {
      System.arraycopy(adjacencyMatrix[i], 0, newMatrix[i], 0, V - 1);
    }
    adjacencyMatrix = newMatrix;
  }
  /* Removing Vertices */

  public void removeVertex(int vertex) {
    if (vertex > V) {
      System.out.println("Vertex doesn't exist");
      return;
    }
    for (int i = vertex; i < V - 1; i++) {
      for (int j = 0; j < V; j++) {
        adjacencyMatrix[j][i] = adjacencyMatrix[j][i + 1];
      }
    }
    for (int i = vertex; i < V - 1; i++) {
      for (int j = 0; j < V; j++) {
        adjacencyMatrix[i][j] = adjacencyMatrix[i + 1][j];
      }
    }
    V--;
  }

  /* Checking if there's an edge between two vertices: */
  public boolean hasEdge(int src, int dest) {
    return adjacencyMatrix[src][dest] == 1;
  }

  public void printAdjacencyMatrix() {
    for (int i = 0; i < V; i++) {
      for (int j = 0; j < V; j++) {
        System.out.println(adjacencyMatrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  /* Getting neighbors of a vertex */
  public List<Integer> getNeighbors(int vertex) {
    List<Integer> neighbors = new ArrayList<>();
    for (int i = 0; i < V; i++) {
      if (adjacencyMatrix[vertex][i] == 1) {
        neighbors.add(i);
      }
    }
    return neighbors;
  }

  /* Finding the degree of a vertex */
  public int getDegree(int vertex) {
    int degree = 0;
    for (int i = 0; i < V; i++) {
      if (adjacencyMatrix[vertex][i] == 1) {
        degree++;
      }
    }
    return degree;
  }
}

public class Q1_MatrixRepresentation {
  public static void main(String[] args) {
    int numVertices = 5; // Change this to the desired number of vertices
    Graph graph = new Graph(numVertices);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);

    graph.printAdjacencyMatrix();
  }
}
