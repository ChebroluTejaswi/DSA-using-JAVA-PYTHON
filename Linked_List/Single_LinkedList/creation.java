package Single_LinkedList;

public class creation {
    static class Node{
        int value;
        Node next;
    }
        static class singlylinkedlist{
            Node head;
            Node tail;
            int size;
            Node createsinglylinkedlist(int val){
               if(size==0){
                    Node node=new Node();
                    node.value=val;
                    node.next=null;
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
        public static void main(String args[])
        {
            singlylinkedlist L1= new singlylinkedlist();
            L1.createsinglylinkedlist(3);
            L1.createsinglylinkedlist(8);
            System.out.println(L1.head.value);
        }
}
