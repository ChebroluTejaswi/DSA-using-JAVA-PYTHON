package Single_Linked_List;

public class insertion {
    Node head;
    Node tail;
    int size=0;
    Node create_sll(int value)
    {
        if(size==0)
        {
            head=new Node();
            Node temp= new Node();
            temp.value=value;
            temp.next=null;
            head=temp;
            tail=temp;
            size=1;
            System.out.println("Linked List created!");
            return head;
        }
        else
        {
            System.out.println("Linked List already exists!");
            return head;
        }
    }
    void insert(int value,int location)
    {
        if (head==null){ // if linked list doesnot exists
            create_sll(value);
            return;
        }

        Node temp=new Node();
        temp.value=value;
        if(location==0){
            temp.next=head;
            head=temp;
            System.out.println("Inserted node at the beginning!");
        }
        else if(location>=size)
        {
            temp.next=null;
            tail.next=temp;
            tail=temp;
            System.out.println("Inserted node at the last!");
        }
        else
        {
            int index=0;
            Node currentNode = head;
            while(index<=location-1)
            {
                currentNode=currentNode.next;
                index++;
            }
            Node nextNode=currentNode.next;
            currentNode.next=temp;
            temp.next=nextNode;
            System.out.println("Inserted node in between!");
        }
        size++;
    }
    public static void main(String args[])
    {
        insertion l1=new insertion();
        l1.create_sll(2);
        l1.create_sll(3);
        l1.insert(8,9);
        System.out.println(l1.head.value);
        l1.insert(19,0);
        l1.insert(5,1);
        l1.insert(7,1);
        System.out.println(l1.head.value);
    }
}
