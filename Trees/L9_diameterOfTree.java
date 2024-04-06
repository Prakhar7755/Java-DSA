import java.util.Scanner;

//                   Diameter of a tree = Number of nodes in the largest path b/w two leaf nodes

public class L9_diameterOfTree {
    static Scanner sc = new Scanner(System.in);
    static int ans = 0; // THIS WILL STORE THE DIAMETER OF THE second approach function

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("\nthe diameter1 of the binary tree according to function1 => " + diameter1(root));

        heightAndDiameter(root);
        System.out.println("\nthe diameter2 of the binary tree according to function2 => " + ans);

    }

    static int heightAndDiameter(Node root) { /* SECOND APPROACH */
        /*
         * THIS FUNCTION WILL RETURN HEIGHT AND WILL FIND THE DIAMETER AND STORE
         * IT IN ANS VARIABLE
         */
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        ans = Math.max(ans, 1 + lh + rh);

        return 1 + Math.max(lh, rh);
    }

    static int diameter1(Node root) {/* FIRST APPROACH */
        if (root == null)
            return 0;

        int dl = height(root.left);
        int dr = height(root.right);
        int curr = height(root.left) + height(root.right) + 1;

        return Math.max(curr, Math.max(dr, dl));

    }

    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
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

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }
}
