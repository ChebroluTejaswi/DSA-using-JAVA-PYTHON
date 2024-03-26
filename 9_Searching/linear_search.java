package Searching;

public class linear_search {
    public static int search(int[] arr,int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                System.out.println("Element found");
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }
    public static void main(String args[])
    {
        int [] arr={1,7,3,5,2};
        System.out.println(search(arr,9));
        System.out.println(search(arr,7));
    }
}