package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
    }

    public void delete(int val) {
        if (head == null) { 
            return;
        }

        if (head.data == val) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == val) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.display();

        list.delete(20); // delete head
        System.out.println("After deleting 20:");
        list.display();

        list.delete(40); // delete middle
        System.out.println("After deleting 40:");
        list.display();

        list.delete(50); // delete last
        System.out.println("After deleting 50:");
        list.display();
    }
}
