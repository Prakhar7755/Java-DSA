import java.util.*;

public class Graph2 {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph2(int numVertices) {
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

     void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

     void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    } 
    // boolean isCycle(int vertex) {
    //     var visited = new boolean[vertex];

    //     for (int i = 0; i < vertex; i++) {
    //         if (!visited[i]) {
    //             if (dfs(vertex);) {
                    
    //             }
    //         }
    //     }

    //     return false;
    // }


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
