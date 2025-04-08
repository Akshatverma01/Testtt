package LinkedListJava;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLLImplementation {

    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        Node curr = head;

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }else  {
                tail = null;
            }
            size--;
            return;
        }

        while (curr != null && curr.data != data) {
            curr = curr.next;
        }

        if (curr == null) {
            return ;
        }

        if (curr == tail) {
            tail = curr.prev;
            tail.next = null;
        } else {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }

        size--;
    }

    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLLImplementation list = new DoublyLLImplementation();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        System.out.print("Forward: ");
        list.printForward(); // 5 10 20 30

        System.out.print("Backward: ");
        list.printBackward(); // 30 20 10 5

        list.delete(20);

        System.out.print("After deletion (forward): ");
        list.printForward(); // 5 10 30

        System.out.println("Size: " + list.size); // 3

    }
}
