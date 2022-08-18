package Linked_List.Doubly_LinkedList;

public class deletion {
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
        void delete(int loc){
            if(head==null)
            {
                System.out.println("Linked list does not exists!");
                return;
            }
            else{
                if(loc<0||loc>size)
                {
                    System.out.println("Invalid location!");
                    return;
                }
                else if(loc==0){//deleting first node
                    if(size==1){//linked list has only 1 node
                        head=null;
                        tail=null;
                    }
                    else{//linked list has more than 1 node
                        head=head.next;
                        head.prev=null;
                    }
                }
                else if(loc==size){//deleting last node
                    if(size==1)//linked list has only 1 node
                    {
                        head=null;
                        tail=null;
                    }
                    else{//linked list has more than 1 node 
                        tail=tail.prev;
                        tail.next=null;
                    }
                }
                else{//deleting node at a given location
                    Node temp=head;
                    for(int i=0;i<loc-2;i++)
                    {
                        temp=temp.next;
                    }
                    temp.next=temp.next.next;
                    temp.next.prev=temp;
                }
                size--;
            }
        }
        void entire_delete(){
            if(head==null)
            {
                System.out.println("Linked list does not exists!");
                return;
            }
            else{
                Node temp=head;
                for(int i=0;i<size;i++)
                {
                    temp.prev=null;
                    temp=temp.next;
                }
                head=null;
                tail=null;
                System.out.println("Doubly linked list is deleted!");
            }
        }
    }
    public static void main(String args[]){
        doublylinkedlist dll=new doublylinkedlist();
        dll.createdoublylinkedlist(3);
        dll.insertion(2, 0);
        dll.insertion(5, 0);
        dll.insertion(8, 1);
        dll.insertion(9, 1);
        dll.insertion(7, 3);
        dll.insertion(10, 6);
        dll.traversal();
        dll.delete(0);
        dll.traversal();
        dll.delete(2);
        dll.traversal();
        dll.entire_delete();
        dll.traversal();
    }
}
