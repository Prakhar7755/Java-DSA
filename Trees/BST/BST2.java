public class BST2 {

    public Node root;

    public BST2() {
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

    public static void main(String[] args) {
        BST2 bst = new BST2();
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