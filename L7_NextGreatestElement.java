import java.util.Stack;

public class L7_NextGreatestElement {
    static void findNextGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];
            int nextGreater = -1; // indicating that no next greater element

            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nextGreater = stack.peek();
            }
            System.out.println(element + "-->" + nextGreater);
            stack.push(element);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 11, 13, 21, 3 };
        findNextGreater(arr);
    }
}
