import java.util.ArrayList;
import java.util.List;

public class L2_AdjacencyMatrixImplementation {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}

class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    void addEdge(int source, int destination) {
        // assumming the graph is undirected
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    void removeEdge(int source, int destination) {
        // Assuming the graph is undirected
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0;
    }

    public void printGraph() {
        System.out.println("Graph:");

        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");

            List<Integer> adjacentVertices = new ArrayList<>();
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    adjacentVertices.add(j);
                }
            }

            if (adjacentVertices.isEmpty()) {
                System.out.print("No adjacent vertices");
            } else {
                for (int j = 0; j < adjacentVertices.size(); j++) {
                    System.out.print(adjacentVertices.get(j));
                    if (j != adjacentVertices.size() - 1) {
                        System.out.print(" -> ");
                    }
                }
            }

            System.out.println();
        }
    }
}
