package Linked_List.Circular_Doubly_LinkedList;

public class traverse {
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
        void reversetravesal(){
            System.out.println("Reverse Traversing: ");
            if(head==null)
            {
                System.out.println("Linked list is empty");
                return;
            }
            Node temp=tail;
            for(int i=0;i<size;i++)
            {
                System.out.print(temp.value);
                if(i!=size-1)
                    System.out.print("<-");
                temp=temp.prev;
            }
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
        cdll.reversetravesal();
    }
}
