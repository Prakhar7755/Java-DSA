class BST2 {

    Node root;
    int x = Integer.MIN_VALUE;

    public BST2() {
        this.root = null;
    }

    /*
     * CHECKING IF A TREE IS BST OR NOT CAN BE DONE IN 3 WAYS
     * 1) recursive thinking on Lt , Rt and root
     * 2) Inoder traverse and add it to the arraylist (as inorder gives sorted array
     * in BST)
     * 3) let x = -INF, and if inorder is not greater than this then return false.
     */

    boolean isBinarySearchTree(Node root) {
        if (root != null) {
            isBinarySearchTree(root.left);
            if (x>root.data) {
                return false;
            }
            else{
                x = root.data;
            }
            isBinarySearchTree(root.right);
        }
        return true;
    }

    void insert(int value) {
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

    void inOrderTraversal(Node node) {
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

    }
}