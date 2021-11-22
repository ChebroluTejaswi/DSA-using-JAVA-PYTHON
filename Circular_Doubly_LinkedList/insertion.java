package Circular_Doubly_LinkedList;

public class insertion {
    static class Node{
        int value;
        Node next;
        Node prev;
    }
    static class CircularDoublyLinkedList
    {
        int size=0;
        Node head = new Node();
        Node tail = new Node();
        Node createcirculardoublyll(int value)
        {
            Node node=new Node();
            node.value=value;
            head.next=node;
            tail.next=node;
            node.prev=node;
            node.next=node;
            size=1;
            return head;
        }
        void insert(int value,int loc)
        {
            Node node= new Node();
            node.value=value;
            if(head==null){
                System.out.println("Linked list does not exist");
            }
            else{
                if(loc<0||loc>size)
                    System.out.println("Invalid location!");
                else if(loc==0) // inserting new node at begining
                {
                    node.next=head;
                    node.prev=tail;
                    head.prev=node;
                    head=node;
                    tail.next=head;
                }
                else if(loc==(size-1)) // inserting new node at last 
                {
                    node.next=head;
                    node.prev=tail;
                    head.prev=node;
                    tail.next=node;
                    tail=node;
                }
                else // inserting a new node in between 
                {
                    Node temp=head;
                    for(int i=0;i<size-2;i++)
                    {
                        temp=temp.next;
                    }
                    node.next=temp.next;
                    node.prev=temp;
                    temp.next=node;
                    node.next.prev=node;
                }
            }
        }
    }
    public static void main(String args[]){
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createcirculardoublyll(23);
        cdll.insert(3, 0);
        cdll.insert(54, 1);
        cdll.insert(5,9);
    }
}
