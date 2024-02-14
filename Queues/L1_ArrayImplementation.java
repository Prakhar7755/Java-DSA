
public class L1_ArrayImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        // q.remove();
        // q.remove();
        // q.remove();

        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue in not empty");
        }

        q.display();
    }
}

class Queue {
    int maxSize;
    int front;
    int rear;
    int[] queueArray;
    int nItems;

    public Queue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
        nItems = 0;
    }

    public void insert(int element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = element;
        nItems++;
        System.out.printf("%d inserted\n", element);
    }

    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;

        System.out.printf("%d deleted\n", temp);
        return temp;
    }

    public void display() {
        System.out.println("----------------------------------");
        for (int i = front; i <= rear; i++) {
            System.out.printf("%d\t", queueArray[i]);
        }
        System.out.println("\n----------------------------------");
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}