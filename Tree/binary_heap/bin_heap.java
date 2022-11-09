package Tree.binary_heap;

public class bin_heap {
    int arr[];
    int size;

    public bin_heap(int size)
    {
        this.arr = new int[size+1];
        this.size=0;
        System.out.println("Binary Heap created!");
    }

    public boolean isEmpty()
    {
        if(this.size==0)
            return true;
        else
            return false;
    }

    public Integer peek()
    {
        if(!isEmpty())
            return arr[1];
        else
            return null;
    }

    public int sizeBH()
    {
        return this.size;
    }

    public void levelOrder()
    {
        for(int i=1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void heapifyBottomToTop(int index,String heapType)
    {
        int parent= index/2;
        if(index<=1)
            return;
        if(heapType=="Min")
        {
            if(arr[index]<arr[parent])
            {
                int t=arr[index];
                arr[index]=arr[parent];
                arr[parent]=t;
            }
        }
        else if(heapType=="Max")
        {
            if(arr[index]>arr[parent])
            {
                int t=arr[index];
                arr[index]=arr[parent];
                arr[parent]=t;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    public void insert(int value,String heapType)
    {
        this.arr[this.size+1]=value;
        this.size++;
        heapifyBottomToTop(size,heapType);
    }

    public void heapifyTopToBottom(int index,String heapType)
    {
        int left=index*2;
        int right=(index*2)+1;
        int swapChild=0;
        if(size<left)
            return;
        if(heapType=="Min")
        {
            if(size ==left)
            {
                if(arr[index]>arr[left])
                {
                    int t=arr[index];
                    arr[index]=arr[left];
                    arr[left]=t;
                }
                return;
            }
            else
            {
                if(arr[left]>arr[right])
                {
                    swapChild=left;
                }
                else
                    swapChild=right;
                if(arr[index]>arr[swapChild])
                {
                    int t=arr[index];
                    arr[index]=arr[swapChild];
                    arr[swapChild]=t;
                }
                return;
            }
        }
        else if(heapType == "Max")
        {
            if(size ==left)
            {
                if(arr[index]<arr[left])
                {
                    int t=arr[index];
                    arr[index]=arr[left];
                    arr[left]=t;
                }
                return;
            }
            else
            {
                if(arr[index]>arr[right])
                {
                    swapChild=left;
                }
                else
                    swapChild=right;
                if(arr[index]<arr[swapChild])
                {
                    int t=arr[index];
                    arr[index]=arr[swapChild];
                    arr[swapChild]=t;
                }
                return;
            }
        }
        heapifyBottomToTop(swapChild, heapType);
    }

    public int extractheadOfBH(String heapType)
    {
        if(isEmpty())
            return -1;
        else
        {
            int extractedValue = arr[1];
            arr[1] = arr[size];
            size--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void deleteBH()
    {
        this.arr=null;
        System.out.println("Binary heap deleted!");
    }
    public static void main(String args[])
    {
        bin_heap b = new bin_heap(4);
        b.peek();
        b.insert(9,"min");
        b.insert(1,"min");
        b.insert(19,"min");
        b.insert(13,"min");
        b.levelOrder();
        b.extractheadOfBH("Min");
        b.levelOrder();
    }
}
