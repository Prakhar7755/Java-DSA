class Stack {
    int maxSize;
    int top;
    int stackArray[];

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stackArray[top] = data;
        System.out.println("Pushed element: " + data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedElement = stackArray[top];
        top--;
        System.out.println("the popped element is " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stackArray[top];
    }

}

class L1_Implementation {

    public static void main(String[] args) {
        Stack st = new Stack(5); // creation
        st.peek();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Top element " + st.peek());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("Top element " + st.peek());
        st.pop();
        st.pop();

    }
}
/*
 * Stack is empty
 * Pushed element: 1
 * Pushed element: 2
 * Pushed element: 3
 * Pushed element: 4
 * Pushed element: 5
 * Top element 5
 * the popped element is 5
 * the popped element is 4
 * the popped element is 3
 * the popped element is 2
 * Top element 1
 * the popped element is 1
 * Stack is empty
 */
