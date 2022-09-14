package Single_Linked_List;

public class search {
    Node head;
    Node tail;
    int size=0;
    
    Node create_sll(int value)
    {
        if(size==0)
        {
            head= new Node();
            Node temp= new Node();
            temp.value=value;
            temp.next=null;
            head=temp;
            tail=temp;
            size=1;
            System.out.println("Linked list created!");
            return head;
        }
        else{
            System.out.println("Linked List already exists!");
            return head;
        }
    }

    void insert(int value, int location)
    {
        if(head==null)
        {
            create_sll(value);
            return;
        }
        Node temp=new Node();
        temp.value=value;
        if(location==0)
        {
            temp.next=head;
            head=temp;
            System.out.println("Inserted Node at beginning!");
        }
        else if(location >= size-1)
        {
            temp.next=null;
            tail.next=temp;
            tail=temp;
            System.out.println("Inserted Node at the last!");
        }
        else{
            int index=0;
            Node currentNode = head;
            while(index>location-1)
            {
                currentNode=currentNode.next;
            }
            Node nextNode=currentNode.next;
            currentNode.next=temp;
            temp.next=nextNode;
            System.out.println("Inserted Node in between!");
        }
        size++;
    }
    void traverse_sll()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty!");
            return;
        }
        Node temp=head;
        int t = size;
        while(t!=0)
        {
            if(t==1)
            {
                System.out.print(temp.value);
                System.out.println();
                t--;
            }
            else{
                System.out.print(temp.value+"->");
                temp=temp.next;
                t--;
            }
        }
    }
    void search_sll(int value)
    {
        if(head==null)
        {
            System.out.println("Linked list doesn't exist!");
            return;
        }
        Node temp=head;
        int t=size;
        int position=-1;
        while(t!=0)
        {
            if(temp.value==value)
            {
                position=size-t;
                System.out.println("Element found at position : "+position+" !");
                return;
            }
            else{
                temp=temp.next;
                t--;
            }
        }
    }
    public static void main(String args[])
    {
       search ll1= new search();
       ll1.create_sll(3);
       ll1.create_sll(4);
       ll1.insert(5, 0);
       ll1.insert(6,1);
       ll1.insert(9,4);
       ll1.traverse_sll();
       ll1.search_sll(5);
       ll1.search_sll(9);
    }
}
