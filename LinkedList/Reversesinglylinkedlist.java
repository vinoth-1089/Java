package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data= data;
        this.next= null;
    }
}

class SinglyLinkList{

    Node head;
    public void append(int data)
    {
        Node newNode=new Node(data);

        if( head == null)
        {
            head=newNode;
            return;
        }
        Node current = head;

        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }

    public void display()
    {   
        Node current=head;
        if( current == null)
        {
            return;
        }

        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null"); 
    }

    public void reverse()
    {
        Node current=head;
        Node prev =null;

        while(current!=null)
        {
            Node next_node=current.next;
            current.next=prev;
            prev=current;
            current=next_node;
        }
        this.head=prev;
   
    }
    
}
public class Reversesinglylinkedlist {

    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.display();

        System.out.println("reverse List:");
        list.reverse();
        list.display();

    }
}