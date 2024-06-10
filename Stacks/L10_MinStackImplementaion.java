import java.util.Stack;
//                                  LEETCODE 155 Min Stack
class MinStack {
    int min = Integer.MAX_VALUE;
    int prevMin = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min); // Push the old minimum value into the stack
            min = x; // Update the new minimum value
        }
        stack.push(x); // Push the new element into the stack
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

public class L10_MinStackImplementaion {
    public static void main(String[] args) {

    }
}
