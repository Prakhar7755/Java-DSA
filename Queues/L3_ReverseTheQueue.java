import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L3_ReverseTheQueue {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);

    }
}
