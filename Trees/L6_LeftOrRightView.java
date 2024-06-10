import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L6_LeftOrRightView {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = createTree();

        printLeftSideView(root);
        System.out.println();

        printRightSideView(root);
        System.out.println();

    }

    static void printRightSideView(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                if (i == levelSize - 1) {
                    System.out.print(node.data + " "); // Print the rightmost node at each level
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    static void printLeftSideView(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                if (i == 0) {
                    System.out.print(node.data + " "); // Print the leftmost node at each level
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left for: " + data);
        root.left = createTree();

        System.out.println("Enter right for: " + data);
        root.right = createTree();

        return root;
    }
}
