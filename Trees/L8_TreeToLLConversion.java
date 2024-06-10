import java.util.Scanner;

public class L8_TreeToLLConversion {
    private DoublyListNode head;
    private DoublyListNode prev;
    static Scanner sc = new Scanner(System.in);

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
        DoublyListNode curr = new DoublyListNode(node.data);
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
        Node root = createTree();

        L8_TreeToLLConversion converter = new L8_TreeToLLConversion();
        DoublyListNode result = converter.convertToDoublyLinkedList(root);

        while (result != null) {
            System.out.print(result.data + " ");
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
    int data;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int data) {
        this.data = data;
    }
}
