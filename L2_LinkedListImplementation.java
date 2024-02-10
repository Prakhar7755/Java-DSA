
class Stack {
    private class Node {
        int data; // Data of the node
        Node next; // Reference to the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Reference to the top element of the stack

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty())
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(value + " is added to the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next;
        System.err.println("delete element is " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println(top.data + " is at the top of the stack");
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

}

public class L2_LinkedListImplementation {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();

    }

}

/*
 * In your case, if you’re trying to declare Stack as a public class in the same
 * file as public class L2_LinkedListImplementation, you’ll get an error because
 * you can’t have more than one public class in the same file.
 */