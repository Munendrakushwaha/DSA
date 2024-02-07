package LinkedList;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Singly {

    Node head;

    public Singly() {
        this.head = null;
    }

    public void addElementFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;

    }

    public void addElementAtPos(int pos, int value) {
        Node newNode = new Node(value);
        Node ptr = head;
        if (head == null) {
            head = newNode;
        }
        while (pos > 2 && ptr.next != null) {
            pos--;
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        return;
    }

    public void addElementAtLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new Node(value);
        return;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Underflow");
            return;
        }
        head = head.next;
        return;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Underflow");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
        return;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("Underflow");
        } else if (head.next == null) {
            head = null;
            return;
        }
        Node ptr = head;
        while (pos > 2 && ptr.next.next != null) {
            pos--;
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return;

    }

    void display() {
        if (head == null) {
            System.out.println("Underflow");
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(" -> " + ptr.value);
            ptr = ptr.next;
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        Singly list = new Singly();
        list.addElementAtLast(2);
        list.addElementAtLast(3);
        list.addElementAtLast(4);
        list.addElementAtLast(5);
        list.addElementAtPos(2, 89);
        list.display();
        list.deleteAtPos(2);
        list.display();

    }
}