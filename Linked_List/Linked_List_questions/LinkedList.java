package Linked_List_questions;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // create node in singly linked list
    public void createLL(int nodevalue)
    {
        Node node=new Node();
        node.value=nodevalue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
    }

    //inserting a node at end in singly linked list
    public void insertnode(int nodevalue){
        Node node= new Node();
        node.value=nodevalue;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }

    public void traverse(){
        Node temp=head;
        for(int i=0;i<size;i++)
        {
            System.out.print(temp.value);
            temp=temp.next;
            if(i!=(size-1))
                System.out.print("->");
        }
        System.out.println("\n");
    }

    public void delete(int location)
    {
        Node temp=new Node();
        for(int i=0;i<location-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}
