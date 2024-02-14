import java.util.LinkedList;

// class Node{
//     int data;
//     Node *next;
// }
class Queue {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int data) {
        queue.offerLast(data);
    }

    public int dequeue() {
        return queue.pollFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void display() {
        System.out.println("----------------------------");
        System.out.print("Queue:\tFront -> ");
        for (int data : queue) {
            System.out.printf("%d\t", data);
        }
        System.out.println("<-Rear\n----------------------------");
    }

    public int max() {
        int ans = Integer.MIN_VALUE;
        for (int data : queue)
            if (ans < data)
                ans = data;

        return ans;
    }

}

public class L2_LinkedListImplementation {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        // q.display();
        // q.dequeue();
        // q.display();
        // q.dequeue();
        // q.display();
        // q.dequeue();
        // q.display();
        // q.dequeue();
        // q.display();
        System.out.println("Max element is " + q.max());
    }
}
