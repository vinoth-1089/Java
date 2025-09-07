package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkList {
    Node head;


    // Insert the Element

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

    public void Insertkposition(int k,int val)
    {    Node newnode = new Node(val);
        if(head==null)
        {   
            return;
        }
        if(k==1)
        {
           newnode.next=head;
           head=newnode;
           return;
        }
        int cnt=1;
        Node prev=null;
        Node current=head;

        while(current!=null)
        {

            if(cnt==k)
            {
                prev.next=newnode;
                newnode.next=current;
            }
            prev=current;
            current=current.next;
            cnt+=1;
        }
    
    }
    public void checkEl(int val)
    {
        if (head == null) { 
            System.out.println("List is empty");
        }
        if (head.data == val) {
            System.out.println("Element in first position");
        }
        Node current = head;
        int cnt=1;
        while(current!=null)
        {
            if(current.data==val)
            {
                System.out.println("Element present in the position of "+cnt);
            }
            else
            {
                System.out.println("Element not present in the list");
                break;
            }
            current=current.next;
            cnt+=1;
        }
    }
    


    public void delete(int val) {
        if (head == null) {  
            return;
        }

        // Delete at first element


        if (head.data == val) {
            head = head.next;
            return;
        }
        // Delete at middle And Tail

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
    // Display the Element
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
        SinglyLinkList list = new SinglyLinkList();
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.display();

        // list.delete(20); 
        // System.out.println("After deleting 20:");
        // list.display();

       
        // System.out.println("Insert at Kth poisition:");
        // list.Insertkposition(2,40);
        // list.display();

        list.checkEl(90);

    }
}
