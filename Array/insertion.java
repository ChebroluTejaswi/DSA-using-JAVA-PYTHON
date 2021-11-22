package Array;

// insert an element in an array.
public class insertion {
    int arr[];
    public insertion(int s)
    {
        arr= new int[s];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int l,int value)
    {
        try{
            if(arr[l]==Integer.MIN_VALUE)
            {
                arr[l]=value;
            }
            else
            {
                System.out.println("Mentioned cell is not empty");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index out of range");
        }
    }
    public static void main(String args[]){
        insertion a = new insertion(10);
        a.insert(0, 0);
        a.insert(1, 10);
        a.insert(2, 20);
        a.insert(1, 30);
        a.insert(10, 120);
        //accessing array element.
        System.out.println("third element: "+a.arr[2]);
    }
}
