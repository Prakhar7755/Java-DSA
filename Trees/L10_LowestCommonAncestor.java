import java.util.Scanner;

/*LOWEST COMMON ANCESTOR IS LIKE A MEET  IN DISCRETE MATHEMATICS or YOU CAN SAY ITS LUB (lowest uppaer bound)*/
public class L10_LowestCommonAncestor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("The Lowest Common Anscestor is " + lowestCommonAncestor(root, 2, 4));

    }

    static Node lowestCommonAncestor(Node root, int i, int j) {
        if (root == null)
            return null;

        if (root.data == i || root.data == j)
            return root;

        Node left = lowestCommonAncestor(root.left, i, j);
        Node right = lowestCommonAncestor(root.right, i, j);

        if (left == null)
            return right;
        if (right == null)
            return left;

        return root;

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
