package interesting;

public class QueueInJava {
    
    private int capacity;
    private int size = 0;
    private int front = 0;
    private int rear = -1;
    private int[] arr;

    public QueueInJava(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new Error("queue is empty");
        }
        return arr[front];
    }

    public void push(int val) {
        if (isFull()) {
            throw new Error("queue is full");
        }
        rear = (rear+1)%capacity;
        arr[rear] = val;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Error("queue is empty");
        }
        int retval = arr[front];
        front = (front+1)%capacity;
        size--;
        return retval;
    }

    public static void main(String[] args) {
        QueueInJava q = new QueueInJava(5);
        // System.out.println(q.getFront()); // gives custom error

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        int popped = q.pop();
        System.out.println(popped);
        popped = q.pop();
        System.out.println(popped);
        System.out.println(q.getFront());

        System.out.println("capacity of stack: " + q.getCapacity());
    }
}
