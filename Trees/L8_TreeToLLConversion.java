public class L8_TreeToLLConversion {
    private DoublyListNode head;
    private DoublyListNode prev;

    public DoublyListNode convertToDoublyLinkedList(Node root) {
        if (root == null) {
            return null;
        }
        inorderTraversal(root);
        return head;
    }

    private void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        DoublyListNode curr = new DoublyListNode(node.val);
        if (head == null) {
            head = curr;
        } else {
            prev.next = curr;
            curr.prev = prev;
        }
        prev = curr;
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        // Example usage:
        Node root = createTree();

        L8_TreeToLLConversion converter = new L8_TreeToLLConversion();
        DoublyListNode result = converter.convertToDoublyLinkedList(root);

        // Print the doubly linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
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

class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
    }
}
