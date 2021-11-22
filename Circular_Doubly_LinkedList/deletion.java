package Circular_Doubly_LinkedList;

public class deletion {
    static class Node{
        int value;
        Node next;
        Node prev;
    }
    static class CircularDoublyLinkedList
    {
        int size=0;
        Node head;
        Node tail;
        Node createcirculardoublyll(int nodevalue)
        {
            head=new Node();
            Node node=new Node();
            node.value=nodevalue;
            head=node;
            tail=node;
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
                createcirculardoublyll(value);
                return;
            }
            else{
                if(loc<0||loc>size)
                    System.out.println("Invalid location!");
                else if(loc==0) // inserting new node at begining
                {
                    node.next=head;
                    node.prev=tail;
                    head.prev=node;
                    tail.next=node;
                    head=node;
                    size++;
                }
                else if(loc==size) // inserting new node at last 
                {
                    node.next=head;
                    node.prev=tail;
                    head.prev=node;
                    tail.next=node;
                    tail=node;
                    size++;
                }
                else // inserting a new node in between 
                {
                    Node temp=head;
                    int index = 0;
                    while (index < loc -1) {
                      temp = temp.next;
                      index++;
                    }
                    node.prev=temp;
                    node.next=temp.next;
                    temp.next=node;
                    node.next.prev=node;
                    size++;
                }
            }
        }
        void traversal()
        {
            System.out.println("Traversing: ");
            if(head==null)
            {
                System.out.println("Linked list is empty");
                return;
            }
            Node temp=head;
            for(int i=0;i<size;i++)
            {
                System.out.print(temp.value);
                temp=temp.next;
                if(i!=size-1)
                    System.out.print("->");
            }
            System.out.print("\n");
        }
        void delete(int loc){
            if(head==null)
            {
                System.out.println("Linked list is empty");
                return;
            }
            else{
                if(loc<0||loc>size)
                {
                    System.out.println("Invalid location!");
                }
                else if(loc==0) //deleting first node
                {
                    if(size==1)//there is only 1 node in linked list
                    {
                        head.prev=null;
                        head.next=null;
                        head=null;
                        tail=null;
                        size--;
                    }
                    else{ // there are more than 1 node in linked list
                        head=head.next;
                        head.prev=tail;
                        tail.next=head;
                        size--;
                    }
                }
                else if(loc==size) // deleting last node
                {
                    if(size==1){  // there is only 1 node in  linked list
                        head.prev=null;
                        head.next=null;
                        head=null;
                        tail=null;
                        size--;
                    }
                    else{ // there are more than 1 node in linked list
                        tail=tail.prev;
                        tail.next=head;
                        head.prev=tail;
                        size--;
                    }
                }
                else{ //deleting node at a given position
                    Node temp=head;
                    for(int i=0;i<loc-1;i++)
                    {
                        temp=temp.next;
                    }
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                    size--;
                }
            }
        }
        void deleteentirelist(){
            Node temp=head;
            for(int i=0;i<size;i++)
            {
                temp.prev=null;
                temp=temp.next;
            }
            head=null;
            tail=null;
            System.out.println("Circular doubly linked list is successfully deleted!");
        }
    }
    public static void main(String args[]){
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createcirculardoublyll(23);
        cdll.insert(3, 0);
        cdll.insert(54,1);
        cdll.insert(5,9);
        cdll.insert(8,3);
        cdll.traversal();
        cdll.delete(2);
        cdll.traversal();
        cdll.deleteentirelist();
        cdll.traversal();
    }
}
