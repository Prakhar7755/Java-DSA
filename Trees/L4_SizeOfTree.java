import java.util.Scanner;

public class L4_SizeOfTree {

    static Scanner sc = new Scanner(System.in);

    static int size(Node root) { // SIZE OF THE TREE
        if (root == null)
            return 0;

        return size(root.left) + size(root.right) + 1;
    }

    public static void main(String[] args) {

        Node root = createTree();
        // System.out.printf("\n\nHeight of the Tree is %d\n\n", height(root)); 
        System.out.printf("\n\nSize of the Tree is %d\n\n", size(root)); /* Size of the Tree is 5 */

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
