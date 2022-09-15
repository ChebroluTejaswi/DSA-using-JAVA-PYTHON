package Queue;

class queue{
    int[] arr;
    int beginning=-1;
    int ending=-1;

    queue(int size)
    {
        this.arr= new int[size];
        System.out.println("Queue created successfully!");
    }
    boolean isFull()
    {
        if(this.arr==null)
        {
            System.out.println("Queue doesn't exist!");
            return false;
        }
        else
        {
            if(this.ending==this.arr.length-1)
                return true;
            else
                return false;
        }
    }
    boolean isEmpty()
    {
        if(this.arr==null)
        {
            System.out.println("Queue doesn't exist!");
            return true;
        }
        else
        {
            if(this.beginning==-1 || this.beginning==arr.length-1)
                return true;
            else
                return false;
        }
    }
    void enqueue(int value)
    {
        if(this.arr==null)
        {
            System.out.println("Queue doesn't exist!");
        }
        else
        {
            if(isFull()){
                System.out.println("Queue is completely filled!");
                return;
            }
            else
            {
                if(isEmpty())
                {
                    this.beginning=0;
                    this.ending++;
                    this.arr[ending]=value;
                }
                else
                {
                    this.ending++;
                    this.arr[ending]=value;
                }
                System.out.println("Element inserted successfully!");
            }
        }
    }
    void dequeue()
    {
        if(this.arr==null)
        {
            System.out.println("Queue doesn't exist!");
        }
        else
        {
            if(isEmpty()){
                System.out.println("Queue is completely empty!");
                return;
            }
            else
            {
                this.beginning++;
                if(this.beginning>this.ending)
                    this.beginning=this.ending=-1;
                System.out.println("Element removed successfully!");
            }
        }
    }
    void deleteQueue()
    {
        this.arr=null;
        System.out.println("Queue deleted successfully!");
    }
}

public class linear_queue_array {
    public static void main(String[] args)
    {
        queue q = new queue(4);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(8);
        q.enqueue(1);
        System.out.println(q.isEmpty());
        q.dequeue();
        q.deleteQueue();
        System.out.println(q.isFull());
    }
}
