import java.util.*;

public class L1_AdjacencyListImplementation {
    public static void main(String[] args) {
        Graph2 graph = new Graph2(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}

class Graph2 {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    Graph2(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination) {
        // Assuming the graph is undirected
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    void removeEdge(int source, int destination) {
        // Assuming the graph is undirected
        adjacencyList.get(source).remove(Integer.valueOf(destination));
        adjacencyList.get(destination).remove(Integer.valueOf(source));
    }

    void printGraph() {
        System.out.println("Graph:");

        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            List<Integer> adjacentVertices = adjacencyList.get(i);

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
