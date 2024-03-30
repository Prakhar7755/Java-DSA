import java.util.ArrayList;
import java.util.Scanner;

public class L6_LeftOrRightView {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = createTree();

        printLeftView(root);

    }

    static void printLeftView(Node root) {
        ArrayList<Node> list = new ArrayList<Node>();
        list.add(null); // Initialize with a dummy node

        printLeftViewUtil(root, list, 0);

        for (Node curr : list) {
            if (curr != null) {
                System.out.println(curr.data + "\t");
            }
        }
    }

    static void printLeftViewUtil(Node root, ArrayList<Node> list, int level) {
        if (root == null)
            return;

        if (list.size() <= level) {
            list.add(root); // Add the node if the list size is insufficient
        } else {
            list.set(level, root); // Update the existing node at the current level
        }

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
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
