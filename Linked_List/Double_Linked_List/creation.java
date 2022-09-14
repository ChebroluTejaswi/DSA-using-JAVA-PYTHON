package Double_Linked_List;

public class creation {
    Node head;
    Node tail;
    int size=0;

    Node create_dll(int value)
    {
        Node node = new Node();
        node.value=value;
        node.prev=null;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        System.out.println("Linked list created successfully!");
        return head;
    }

    public static void main(String[] args)
    {
        creation l1= new creation();
        l1.create_dll(6);
    }
}
