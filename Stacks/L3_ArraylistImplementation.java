import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stackList; // arraylist to store list elements

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public void push(int value) {
        stackList.add(value);
        System.out.println("ADDED element: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = stackList.removeLast();

        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("TOP element: " + stackList.getLast());
        return stackList.getLast();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}

public class L3_ArraylistImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("--------------------");
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        System.out.println("--------------------");
        st.pop();
        st.pop();
        st.pop();
        st.peek();

    }
}
/*
 * ADDED element: 1
 * ADDED element: 2
 * ADDED element: 3
 * ADDED element: 4
 * --------------------
 * Popped element: 4
 * TOP element: 3
 * Popped element: 3
 * TOP element: 2
 * --------------------
 * Popped element: 2
 * Popped element: 1
 * Stack is empty
 * Stack is empty
 */