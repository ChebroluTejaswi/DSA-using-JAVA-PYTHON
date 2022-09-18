package Queue;

public class LinkedList {
    Node head;
    Node tail;
    int size=0;
    
    void create(int value)
    {
        head=new Node();
        Node temp= new Node();
        temp.value=value;
        temp.next=null;
        head=temp;
        tail=temp;
        size=1;
    }
    void insert(int value)
    {
        if(head==null)
        {
            create(value);
        }
        else
        {
            Node node = new Node();
            node.value=value;
            node.next=null;
            tail.next=node;
            tail=node;
            size++;
        }
    }
    void delete()
    {
        if(head==null)
        {
            System.out.println("Queue doesn't exist!");
        }
        else
        {
            if (size == 1) {
                head= null;
                tail = null;
                size--;
            } else {
                Node temp = head;
                head = temp.next;
                size--;
            }
        }
    }
}
