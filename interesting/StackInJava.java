package interesting;

public class StackInJava {
    private int top = -1;
    private int[] arr;
    private int capacity;

    public StackInJava(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public int getTop() {
        if (isEmpty()) {
            throw new Error("stack is empty");
        }
        return arr[top];
    }

    public void push(int val) {
        if (isFull()) {
            throw new Error("stack is full");
        }
        arr[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Error("stack is empty");
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        StackInJava s = new StackInJava(5);
        // System.out.println(s.getTop()); // gives custom error
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int popped = s.pop();
        System.out.println(popped);
        popped = s.pop();
        System.out.println(popped);
        System.out.println(s.getTop());

        System.out.println("capacity of stack: " + s.getCapacity());
    }
}
