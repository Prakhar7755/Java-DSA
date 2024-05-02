public class L4_BFS {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Perform BFS starting from vertex 0
        graph.bfs(0); /* 0 1 2 3 */
    }
}
