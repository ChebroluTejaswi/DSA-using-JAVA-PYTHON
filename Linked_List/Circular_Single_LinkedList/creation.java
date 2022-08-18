package Linked_List.Circular_Single_LinkedList;

public class creation {
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
    }
    public static void main(String args[]){
        circularsinglylinkedlist l1=new circularsinglylinkedlist();
        l1.create(2);
        System.out.println(l1.head.value);
        System.out.println(l1.head.next.value);
    }
}
