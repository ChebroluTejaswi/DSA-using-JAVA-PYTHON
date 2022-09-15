package Stack;

class stack{
    int arr[];
    int top;
    int[] createStack(int size)
    {
        if(this.arr!=null)
        {
            System.out.println("Stack already exist!");
            return this.arr;
        }
        else{
            System.out.println("stack created successfully!");
            this.arr=new int[size];
            top=-1;
            return this.arr;
        }
    }
    boolean isEmpty()
    {
        if(this.arr==null)
        {
            System.out.println("Stack does not exist!");
            return true;
        }
        else if(top==-1)
        {
            return true;
        }
        return false;
    }
    boolean isFull()
    {
        if(this.arr==null)
        {
            System.out.println("Stack does not exist!");
            return true;
        }
        else if(top==(this.arr.length-1))
        {
            return true;
        }
        return false;
    }
    void push(int value)
    {
        if(this.arr==null)
        {
            System.out.println("Stack does not exist!");
        }
        else if(isFull())
        {
            System.out.println("Stack is full!");
        }
        else
        {
            top++;
            this.arr[top]=value;
        }
    }
    int pop()
    {
        if(this.arr==null)
        {
            System.out.println("Stack does not exist!");
            return -1;
        }
        else if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return -1;
        }
        else
        {
            return this.arr[top--];
        }
    }
    int peek()
    {
        if(this.arr==null)
        {
            System.out.println("Stack does not exist!");
            return -1;
        }
        else if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return -1;
        }
        else
        {
            return this.arr[top];
        }
    }
    void delete()
    {
        this.arr=null;
        System.out.println("Stack deleted successfully!");
    }
}
public class stack_array {
    
    public static void main(String[] args)
    {
        stack s = new stack();
        System.out.println("Empty- "+s.isEmpty());
        s.createStack(4);
        System.out.println("Full- "+s.isFull());
        s.push(9);
        s.push(6);
        System.out.println("Popped out- "+s.pop());
        System.out.println("Peek- "+s.peek());
        s.delete();
        System.out.println("Peek- "+s.peek());
    }
}
