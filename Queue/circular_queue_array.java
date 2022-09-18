package Queue;

class queue{
    int[] arr;
    int beginning=-1;
    int ending=-1;

    public queue(int size){
        this.arr = new int[size];
        System.out.println("Circular queue created successfully!");
    }
    
    boolean isEmpty()
    {
        if(this.arr==null)
        {
            System.out.println("CQ doesn't exist!");
            return true;
        }
        else
        {
            if(this.ending==-1)
                return true;
            else
                return false;
        }
    }
    
    boolean isFull()
    {
        if(this.arr==null)
        {
            System.out.println("CQ doesn't exist!");
            return false;
        }
        else
        {
            if(this.ending==arr.length-1 && this.beginning==0)
                return true;
            else if(this.ending==this.beginning-1)
                return true;
            else
                return false;
        }
    }

    void enqueue(int value)
    {
        if(this.arr==null)
        {
            System.out.println("CQ doesn't exist!");
        }
        else
        {
            if(isFull())
                System.out.println("CQ is full!");
            else
            {
                if(isEmpty())
                {
                    this.beginning=0;
                    this.ending++;
                    this.arr[this.ending]=value;
                }
                else
                {
                    this.ending=(this.ending+1)%(arr.length);
                    this.arr[this.ending]=value;
                }
                System.out.println("Inserted "+value+" successfully!");
            }
        }
    }

    int dequeue()
    {
        if(this.arr==null)
        {
            System.out.println("CQ doesn't exist!");
            return -1;
        }
        else
        {
            if(isEmpty())
            {
                System.out.println("CQ is Empty!");
                return -1;
            }
            else
            {
                int value=arr[this.beginning];
                arr[this.beginning]=0;
                if(this.beginning == this.ending)
                {
                    this.beginning=this.ending=-1;
                }
                else
                {
                    this.beginning=(this.beginning+1)%(arr.length);
                }
                System.out.println("Deleted "+value+" successfully!");
                return value;
            }
        }
    }
    int peek()
    {
        if(this.arr==null)
        {
            System.out.println("CQ doesn't exist!");
            return -1;
        }
        else
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty!");
                return -1;
            }
            else
            {
                return this.arr[this.beginning];
            }
        }
    }
    void delete()
    {
        this.arr=null;
        System.out.println("Queue deleted successfully!");
    }
}
public class circular_queue_array {
    public static void main(String[] args)
    {
        queue q = new queue(3);
        System.out.println("Empty: "+q.isEmpty());
        q.dequeue();
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        System.out.println("Empty: "+q.isEmpty());
        q.enqueue(9);
        q.dequeue();
        q.enqueue(7);
        q.dequeue();
        q.enqueue(12);
        q.enqueue(34);
        q.enqueue(98);
        System.out.println("Full: "+q.isFull());
    }
}
