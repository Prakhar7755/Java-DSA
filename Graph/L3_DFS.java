public class L3_DFS {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // Perform DFS starting from vertex 0
        graph.dfs(0);
         
        /*0 2 3 1*/
    }
}
