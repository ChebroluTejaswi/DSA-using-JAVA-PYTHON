package Sorting;

public class Bubble_Sort {
    
    public static void perform_bubble_sort(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++) // we need to perform n-1 comparisions
        {
            for(int j=0;j<n-i-1;j++) // After each iteration greatest element moves to extreme right.
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,9,3,1,2};
        perform_bubble_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
