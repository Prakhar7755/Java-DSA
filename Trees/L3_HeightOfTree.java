import java.util.Scanner;

public class L3_HeightOfTree {
    
    static Scanner sc = new Scanner(System.in);

    static int height(Node root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {

        Node root = createTree();
        System.out.printf("\n\nHeight of the Tree is %d\n\n", height(root));

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
