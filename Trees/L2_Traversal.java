import java.util.Scanner;

public class L2_Traversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.printf("%d\t", root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.printf("%d\t", root.data);
        }
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.printf("%d\t", root.data);
            inorder(root.right);
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
