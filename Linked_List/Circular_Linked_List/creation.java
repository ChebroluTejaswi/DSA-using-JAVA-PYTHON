package Circular_Linked_List;

public class creation {
    Node head;
    Node tail;
    int size=0;

    Node create_cll(int value)
    {
        if(size==0)
        {
            Node node = new Node();
            node.value=value;
            node.next=node;
            size=1;
            head=node;
            tail=node;
            System.out.println("Linked list created!");
        }
        else
        {
            System.out.println("Linked list exists!");
        }
        return head;
    }
    public static void main(String[] args)
    {
        creation l1 = new creation();
        l1.create_cll(6);
        l1.create_cll(8);
        System.out.println(l1.head.value);
    }
}
