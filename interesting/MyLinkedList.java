package interesting;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this(data, null);
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class MyLinkedList {
    private Node head;
    private int size = 0;

    public MyLinkedList() {
        head = null;
    }

    public MyLinkedList(int data) {
        head = new Node(data);
        size = 1;
    }

    public int size() {
        return size;
    }

    public void append(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
        size++;
    }

    public void appendAtBeginning(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = n;
        } else {
            n.next = head;
            head = n;
            size++;
        }
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            // throw new Error("Index out of range"); // I don't know how to use Errors in Java yet
            // return -1;
            throw new IndexOutOfBoundsException("Index out of range");
        }
        int i = 0;
        Node current = head;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    public void set(int index, int data) {
        if (index >= size || index < 0) {
            // throw new Error("Index out of range"); // I don't know how to use Errors in Java yet
            // return;
            throw new IndexOutOfBoundsException("Index out of range");
        }
        int i = 0;
        Node current = head;
        while (i < index) {
            current = current.next;
            i++;
        }
        current.data = data;
    }

    public String toString() {
        // String s = "";
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (current != null) {
            // s += current.data + " ";
            builder.append(current.data).append(" ");
            current = current.next;
        }
        // return String.join(",", s.split(" "));
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        MyLinkedList ll = new MyLinkedList();
        ll.append(5);
        ll.append(6);
        ll.append(7);
        System.out.println(ll.get(1));
        ll.append(8);
        ll.appendAtBeginning(0);
        System.out.println(ll.toString());
        ll.set(2, 80);
        System.out.println(ll.toString());
        // System.out.println(ll.get(100)); // Exception IndexOutOfBoundsException: Index out of range
    }
}
