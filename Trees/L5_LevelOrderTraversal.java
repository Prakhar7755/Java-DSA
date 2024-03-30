import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class L5_LevelOrderTraversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = createTree();

        levelOrderTraversal(root);
        System.out.println("");

        printLevelOrder2(root);
        System.out.println("");

    }

    static void printLevelOrder2(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.printf("%d\t", curr.data);

            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

    }

    static void levelOrderTraversal(Node root) {
        for (int i = 1; i <= height(root); i++) {
            printCurrentLevel(root, i);
        }
    }

    static void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;

        if (level == 1)
            System.out.printf(root.data + "\t");

        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }

    }

    static int height(Node root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
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
