import java.util.Scanner;

public class L1_Implementation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        preorder(root);

    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.printf("%d\t", root.data);
            preorder(root.left);
            preorder(root.right);
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
