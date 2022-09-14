package Circular_Double_Linked_List;

public class creation {
    Node head;
    Node tail;
    int size=0;

    Node create_cdl(int value)
    {
        if(head==null)
        {
            Node node = new Node();
            node.value=value;
            head=node;
            tail=node;
            node.next=node;
            node.prev=node;
            size=1;
        }
        else
        {
            System.out.println("Linked list exists!");
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        creation l1=new creation();
        l1.create_cdl(8);
        System.out.println(l1.head.value);
    }
}
