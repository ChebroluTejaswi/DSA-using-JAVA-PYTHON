package Double_Linked_List;

public class insertion {
    Node head;
    Node tail;
    int size=0;

    Node create_dll(int value)
    {
        Node node = new Node();
        node.value=value;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        System.out.println("Linked list created successfully!");
        return head;
    }

    Node insert(int loc,int value)
    {   
        if(head!=null)
        {
            Node node = new Node();
            node.value=value;
            if(loc==0)
            {
                node.prev=null;
                node.next=head;
                head.prev=node;
                head=node;
                size++;
            }
            else if(loc<0 || loc>size)
            {
                System.out.println("Invalid location!");
            }
            else if(loc==size-1)
            {
                node.next=null;
                node.prev=tail;
                tail.next=node;
                tail=node;
                size++;
            }
            else{
                int t=0;
                Node temp=head;
                while(t<loc-2)
                {
                    t++;
                    temp=temp.next;
                }
                node.prev=temp;
                node.next=temp.next;
                temp.next=node;
                node.next.prev=node;
                size++;
            }
        }
        else
        {
            create_dll(value);
        }
        return head;
    }
    public static void main(String[] args)
    {
        insertion l1 = new insertion();
        l1.create_dll(3);

        l1.insert(0,8);
        l1.insert(0,9);
        l1.insert(1,4);
        l1.insert(4,7);
        l1.insert(9,5);
    }
}
