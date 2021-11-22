package Circular_Single_LinkedList;

public class search {
    static class Node{
        int value;
        Node next;
    }
    static class circularsinglylinkedlist{
        Node head=new Node();
        Node tail;
        int size=0;
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
               else if(loc>size){
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
                   while(t<loc-1){
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
        void traversal()
        {
            System.out.println("Traversing the linked list...................");
            Node node=head;
            int t=0;
            while(t<size){
                System.out.println(node.value+"\t");
                node=node.next;
                t++;
            }
        }
        void searchinlist(int searchval)
        {
            System.out.println("Searching in the linked list...................");
            Node node=head;
            int t=0;
            while(t<size){
                if(node.value==searchval)
                {
                    System.out.println("Element found! position: "+t);
                    return;
                }
                node=node.next;
                t++;
            }
            System.out.println("Element not found!");
            return;
        }
    }
    public static void main(String args[]){
        circularsinglylinkedlist l1=new circularsinglylinkedlist();
        l1.create(2);
        l1.insert(3,0);
        l1.insert(8,0);
        l1.insert(7,0);
        l1.insert(6,2);
        l1.insert(9,4);
        l1.traversal();
        l1.searchinlist(8);
        l1.searchinlist(18);
    }
}
