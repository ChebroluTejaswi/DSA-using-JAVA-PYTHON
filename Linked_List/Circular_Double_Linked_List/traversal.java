package Circular_Double_Linked_List;

public class traversal {
    Node head;
    Node tail;
    int size=0;

    Node create_cdl(int value)
    {
        if(head==null)
        {
            Node node= new Node();
            node.value=value;
            node.next=node;
            node.prev=node;
            head=node;
            tail=node;
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
            if(loc==0 || loc==size-1)
            {
                node.next=head;
                node.prev=tail;
                head.prev=node;
                head=node;
                tail.next=head;
                size++;
            }
            else if(loc<0||loc>size)
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
        else{
            System.out.println("Linked list doesn't exist!");
        }
        return head;
    }

    void traverse() {
        if(head!=null)
        {
            int t = 0;
            Node temp = head;
            while (t < size - 1) {
                System.out.print(temp.value + "->");
                temp = temp.next;
                t++;
            }
            System.out.println(temp.value);
        }
        else{
            System.out.println("Linked list doesn't exist!");
        }
    }

    void reversetraverse()
    {
        if(head!=null)
        {
            int t=0;
            Node temp=tail;
            while(t<size-1)
            {
                System.out.print(temp.value+"->");
                temp=temp.prev;
                t++;
            }
            System.out.println(temp.value);
        }
        else{
            System.out.println("Linked list doesn't exist!");
        }
    }
    public static void main(String[] args)
    {
        traversal l1=new traversal();
        l1.create_cdl(8);
        l1.insert(0,2);
        l1.insert(0,9);
        l1.insert(1,7);
        l1.traverse();
        l1.reversetraverse();
    }
}
