package Queue;

class queue_ll
{
    LinkedList l;
    public queue_ll()
    {
        l = new LinkedList();
        System.out.println("Queue created successfully!");
    }
    boolean isEmpty()
    {
        if(l.head==null)
            return true;
        else
            return false;
    }
    void enqueue(int value)
    {   
        l.insert(value);
        System.out.println("Inserted "+value+" successfully!");
    }
    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        else
        {
            int value=l.head.value;
            l.delete();
            System.out.println("Deleted "+value+" successfully!");
            return value;
        }
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        else 
        {
            return l.head.value;
        }
    }
    void delete()
    {
        l.head=null;
        l.tail=null;
        System.out.println("Queue deleted successfully!");
    }
}

public class linear_queue_ll {
    public static void main(String[] args)
    {
        queue_ll q = new queue_ll();
        System.out.println("Empty: "+q.isEmpty());
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(8);
        q.enqueue(6);
        q.dequeue();
        System.out.println("Peek: "+q.peek());
    }
}
