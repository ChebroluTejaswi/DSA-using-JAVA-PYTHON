package Circular_Doubly_LinkedList;


public class creation {
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
    }
    public static void main(String args[]){
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createcirculardoublyll(23);
        System.out.println(cdll.head.next.value);
    }
}
