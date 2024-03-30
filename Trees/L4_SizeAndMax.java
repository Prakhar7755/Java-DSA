import java.util.Scanner;

public class L4_SizeAndMax {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Node root = createTree();

        System.out.printf("\n\nSize of the Tree is %d\n\n", size(root)); /* Size of the Tree is 5 */

        System.out.printf("\n\nThe Largest element is %d\n\n", maxElement1(root)); /* The Largest element is 9 */

        System.out.printf("\n\nThe Largest element is %d\n\n", maxElement2(root)); /* The Largest element is 9 */

        System.out.printf("\n\nThe Smallest element is %d\n\n", minElement(root)); /* The Smallest element is 1 */
    }

    static int size(Node root) { // SIZE OF THE TREE
        if (root == null)
            return 0;

        return size(root.left) + size(root.right) + 1;
    }

    static int minElement(Node root) { // MAX ELEMENT IN THE TREE
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(minElement(root.left), minElement(root.right)));

    }

    static int maxElement2(Node root) { // MAX ELEMENT IN THE TREE
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maxElement2(root.left), maxElement2(root.right)));

    }

    static int maxElement1(Node root) { // MAX ELEMENT IN THE TREE
        if (root == null)
            return Integer.MIN_VALUE;

        int temp = Math.max(maxElement1(root.left), maxElement1(root.right));
        if (root.data > temp) {
            return root.data;
        } else {
            return temp;
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
