package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergeTwoSortedList {

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new_Node;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(1);
        l1.append(3);
        l1.append(5);

        LinkedList l2 = new LinkedList();
        l2.append(2);
        l2.append(4);
        l2.append(6);

        MergeTwoSortedList merger = new MergeTwoSortedList();
        Node mergedHead = merger.mergeTwoLists(l1.head, l2.head);

        LinkedList mergedList = new LinkedList();
        mergedList.head = mergedHead;
        mergedList.display(); 
    }
}
