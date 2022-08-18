package Linked_List.Doubly_LinkedList;

public class creation {
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
    }
    public static void main(String args[]){
        doublylinkedlist dll=new doublylinkedlist();
        dll.createdoublylinkedlist(3);
        System.out.println(dll.head.value);
    }
}
