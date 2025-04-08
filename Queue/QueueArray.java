package Queue;

public class QueueArray {

    private int front, rear, size, capacity;
    private int[] queue;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = this.size = 0;
        this.queue = new int[capacity];
    }

    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        --size;
        return removed;
    }

    public int peek(){
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        return queue[front];

    }

    public void printQueue(){
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        for(int i=front; i<=rear;i++){
            System.out.print(queue[(front + i) % capacity] + " ");
        }
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();
        
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        // queue.printQueue(); // 20 30

        System.out.println("Peek: " + queue.peek()); // 20
    }
}
