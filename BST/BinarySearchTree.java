public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    static Node deleteNode(Node root, int key) {
        if (root == null)  return root;

        if (key < root.data) 
            root.left = deleteNode(root.left, key);
        
            else if (key>root.data) 
            root.right = deleteNode(root.right, key);

        else{ /*CASE THREE*/
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left;
            
            root.data = minValue(root);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    static boolean search(Node root, int val) {/* SEARCHING IN BST */
        if (root == null)
            return false;
        if (root.data == val)
            return true;

        if (root.data > val)
            return search(root.left, val);

        else
            return search(root.right, val);
    }

    public void insert(int value) {/* inserting in bst */
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

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
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