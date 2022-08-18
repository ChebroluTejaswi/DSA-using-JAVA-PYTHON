package Linked_List.Circular_Single_LinkedList;

public class deletion {
    static class Node{
        int value;
        Node next;
    }
    static class circularsinglylinkedlist{
        Node head=new Node();
        Node tail;
        int size;
        Node create(int val){
            if(size==0){
                Node node=new Node();
                node.value=val;
                node.next=node;
                head=node;
                tail=node;
                size=1;
                return head;
            }
            else
            {
               System.out.println("Linked list exists");
               return head;
            }
        }
        void  insert(int val, int loc){
           if(head!=null){
               Node node=new Node();
               node.value=val;
               //inserting node at beginning
               if(loc==0){
                   node.next=head;
                   head=node;
                   tail.next=head;
                   size++;
               }
               else if(loc>=size){
                   System.out.println("Entered location is invalid");
               }
               //inserting node at last
               else if(loc==size){
                   tail.next=node;
                   tail=node;
                   tail.next=head;
                   size++;
               }
               //inserting at given location
               else{
                   int t=0;
                   Node temp=head;
                   while(t!=loc){
                       temp=temp.next;
                       t++;
                   }
                   node.next=temp.next;
                   temp.next=node;
                   size++;
               }
           }
           else
           {
               create(val);
               return;
           }
        }
        void delete(int loc){
            if(head==null)
            {
                System.out.println("Linked lidt does not exist.");
                return;
            }
            if(loc>size||loc<0)
            {
                System.out.println("Invalid location!");
                return;
            }
            //deleting first node.
            else if(loc==0)
            {
                if(size==1){ // there is only one node in linked list
                    head=null;
                    tail=null;
                    head.next=null;
                }
                else{ // there are multiple nodes in linked list
                    head=head.next;
                    tail.next=head;
                }
                size--;
            }
            //deleting last node.
            else if(loc==size){
                if(size==1){ // there is only one node in linked list
                    head=null;
                    tail=null;
                    head.next=null;
                }
                else{ // there are multiple nodes in linked list
                    Node temp=head;
                    for(int i=0;i<size-1;i++)
                    {
                        temp=temp.next;
                    }
                    temp.next=head;
                    tail=temp;
                }
                size--;
            }
            else{
                Node temp=head;
                for(int i=0;i<loc-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
        void traversal()
        {
            System.out.println("Traversing the linked list...................");
            if(head==null)
            {
                System.out.println("Your linked list is empty");
                return;
            }
            Node node=head;
            int t=0;
            while(t<size){
                System.out.println(node.value+"\t");
                node=node.next;
                t++;
            }
        }
        void delete_entire_list(){
            if(head==null){
                System.out.println("Linked list doe not exists!");
            }
            else{
                head=null;
                tail.next=null;
                tail=null;
                System.out.println("Successfully deleted!");
            }
        }
    }
    public static void main(String args[]){
        circularsinglylinkedlist l1=new circularsinglylinkedlist();
        l1.create(2);
        System.out.println(l1.head.value);
        System.out.println(l1.head.next.value);
        l1.insert(5, 0);
        l1.insert(9, 0);
        l1.insert(3, 0);
        l1.insert(4, 1);
        l1.insert(8, 1);
        l1.traversal();
        l1.delete(0);
        l1.traversal();
        l1.delete(3);
        l1.traversal();
        l1.delete(9);
        l1.traversal();
        l1.delete_entire_list();
        l1.traversal();
    }
}
