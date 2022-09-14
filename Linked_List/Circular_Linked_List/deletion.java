package Circular_Linked_List;

public class deletion {
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
            head=node;
            tail=node;
            size=1;
            System.out.println("Linked list created!");
        }
        else{
            System.out.println("Linked List already exists!");
        }
        return head;
    }

    Node insert(int loc, int value)
    {
        if(head!=null)
        {
            Node node = new Node();
            node.value=value;
            if(loc==0)
            {
                node.next=head;
                head=node;
                tail.next=head;
            }
            else if(loc>size)
            {
                System.out.println("Enter valid location!");
            }
            else if(loc==size-1)
            {
                tail.next=node;
                tail=node;
                tail.next=head;
            }
            else{
                int t=loc;
                Node temp = head;
                while(t>0)
                {
                    temp=temp.next;
                    t--;
                }
                node.next=temp.next;
                temp.next=node;
            }
            size++;
        }
        else{
            create_cll(value);
        }
        return head;
    }

    void traverse()
    {
        if(head==null){
            System.out.println("Linked List doesn't exist!");
        }
        else{
            Node temp = head;
            int t=size-1;
            while(t>0)
            {
                System.out.print(temp.value+"->");
                temp=temp.next;
                t--;
            }
            System.out.println(temp.value);
        }
    }

    void delete(int loc)
    {
        if(head!=null)
        {
            if(loc==0)
            {
                if(size==1)
                {
                    head=null;
                    tail.next=null;
                    tail=null;
                }
                else{
                    head=head.next;
                    tail.next=head;
                }
                size--;
            }
            else if(loc==size-1)
            {
                if(size==1)
                {
                    head=null;
                    tail=null;
                    head.next=null;
                }
                else{
                    Node temp = head;
                    int t=0;
                    while(t<size)
                    {
                        temp=temp.next;
                        t++;
                    }
                    temp.next=head;
                    tail=temp;
                }
                size--;
            }
            else if(loc >size){
                System.out.println("Invalid location!");
                return ;
            }
            else{
                Node temp = head;
                int t=0;
                while(t<loc-1)
                {
                    temp=temp.next;
                    t++;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
        else{
            System.out.println("Linked list does not exist!");
        }
    }

    void delete_entire_list()
    {
        if(head!=null)
        {
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("Successfully deleted!");
        }
        else{
            System.out.println("Linked list does not exist!");
        }
    }
    public static void main(String[] args)
    {
        deletion cll = new deletion();
        cll.create_cll(3);
        cll.insert(0,4);
        cll.insert(0,9);
        cll.insert(1,8);
        cll.insert(8,2);
        cll.insert(2,5);
        cll.traverse();

        cll.delete(1);
        cll.delete(9);
        cll.delete(0);
        cll.traverse();

        cll.delete_entire_list();
        cll.traverse();
    }
}
