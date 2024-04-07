public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertRec(root, value);
        }
    }

    private void insertRec(Node current, int value) {
        if (value < current.data) {
            if (current.left == null) {
                current.left = new Node(value);
            } else {
                insertRec(current.left, value);
            }
        } else {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                insertRec(current.right, value);
            }
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    static boolean search(Node root, int val) {
        if (root == null)
            return false;
        if (root.data == val)
            return true;

        if (root.data > val)
            return search(root.left, val);

        else
            return search(root.right, val);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.print("In-order traversal: ");
        bst.inOrderTraversal(bst.root);

        System.out.printf("\nSearching for 10 in BST: " + search(bst.root, 10));

        System.out.printf("\nSearching for 30 in BST: " + search(bst.root, 30));
    }
}