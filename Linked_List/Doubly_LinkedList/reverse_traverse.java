package Linked_List.Doubly_LinkedList;

public class reverse_traverse {
    static class Node{
        int value;
        Node prev;
        Node next;
    }
    static class doublylinkedlist{
        Node head=new Node();
        Node tail=new Node();
        int size;
        Node createdoublylinkedlist(int value){
            Node node=new Node();
            node.value=value;
            node.prev=null;
            node.next=null;
            head=node;
            tail=node;
            size=1;
            return head;
        }
        void insertion(int value,int loc){
            Node node=new Node();
            node.value=value;
            if(head==null)
            {
                createdoublylinkedlist(value);
                return;
            }
            if(loc<0||loc>size)
            {
                System.out.println("Invalid location!");
                return;
            }
            else if(loc==0) //inserting node at beginning
            {
                node.next=head;
                node.prev=null;
                head.prev=node;
                head=node;
                size++;
            }
            else if(loc==size){//inserting node at last
                node.next=null;
                tail.next=node;
                node.prev=tail;
                tail=node;
                size++;
            }
            else{//inserting node at a particular location
                Node temp=head;
                for(int i=0;i<size-2;i++)
                {
                    temp=temp.next;
                }
                node.prev=temp;
                node.next=temp.next;
                temp.next=node;
                node.next.prev=node;
                size++;
            }
        }
        void traversal()
        {
            System.out.println("Traversal-");
            if(head==null)
            {
                System.out.println("Linked list does not exists!");
                return;
            }
            else{
                Node temp=head;
                for(int i=0;i<size;i++)
                {
                    System.out.print(temp.value);
                    if(i!=size-1)
                    {
                        System.out.print("->");
                    }
                    temp=temp.next;
                }
                System.out.println("\n");
            }
        }
        void reverse_traversal()
        {
            System.out.println("Reverse traversal-");
            if(head==null)
            {
                System.out.println("Linked list does not exists!");
                return;
            }
            else{
                Node temp=tail;
                for(int i=0;i<size;i++)
                {
                    System.out.print(temp.value);
                    if(i!=size-1)
                    {
                        System.out.print("<-");
                    }
                    temp=temp.prev;
                }
                System.out.println("\n");
            }
        }
    }
    public static void main(String args[]){
        doublylinkedlist dll=new doublylinkedlist();
        dll.createdoublylinkedlist(3);
        dll.insertion(2, 0);
        dll.insertion(5, 0);
        dll.insertion(8, 1);
        dll.insertion(10, 6);
        dll.traversal();
        dll.reverse_traversal();
    }
}
