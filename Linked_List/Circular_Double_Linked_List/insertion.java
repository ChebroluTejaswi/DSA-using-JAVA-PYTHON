package Circular_Double_Linked_List;

public class insertion {
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

    Node insert(int loc,int value)
    {
        if(head!=null)
        {
            Node node = new Node();
            node.value=value;
            if(loc==0 || loc==(size-1))
            {
                node.next=head;
                node.prev=tail;
                head.prev=node;
                head=node;
                tail.next=head;
                size++;
            }
            else if(loc>size)
            {
                System.out.println("Invalid location!");
            }
            else{
                int t=0;
                Node temp=head;
                while(t<loc)
                {
                    temp=temp.next;
                    t++;
                }
                node.next=temp.next;
                node.prev=temp;
                temp.next=node;
                node.next.prev=node;
                size++;
            }
        }
        else
        {
            create_cdl(value);
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        insertion l1=new insertion();
        l1.create_cdl(8);

        l1.insert(0,9);
        l1.insert(0,5);
        l1.insert(1,3);
        l1.insert(4,9);
        l1.insert(8,1);
        
        System.out.println(l1.head.value);
    }
}
