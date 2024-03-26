package Searching;

public class binary_search {
    public static int search(int [] arr,int value)
    {
        int start=0;
        int end=arr.length-1;
        int middle=(start+end)/2;
        while(arr[middle]!=value && start<=end){
            if(arr[middle]>value)
            {
                end=middle-1;
            }
            else
            {
                start=middle+1;
            }
            middle=(start+end)/2;
        }
        if(arr[middle]==value)
        {
            System.out.println("Element found");
            return middle;
        }
        else
        {
            System.out.println("Element not found!");
            return -1;
        }
    }
    public static void main(String args[])
    {
        int [] arr={1,9,2,8};
        System.out.println(search(arr,9));
        System.out.println(search(arr,7));
    }
}
