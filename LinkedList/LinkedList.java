package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class LinkedList {
    Node head;
    public void append(int data)
    {
        
        Node newnode = new Node(data);
        if(head==null)
        {
           head=newnode;
           return;
        }
        Node last=head;
        while(last.next!=null)
        {
           last=last.next;

        }
        last.next=newnode;
    }
}
class Main{
    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.append(20);
    }
}