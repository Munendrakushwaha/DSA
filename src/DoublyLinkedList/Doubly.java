package DoublyLinkedList;

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly {
    Node head = null;

    public void addElementFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
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
        Doubly list = new Doubly();
        list.addElementFirst(5);
        list.addElementFirst(0);
        list.display();

    }

}
