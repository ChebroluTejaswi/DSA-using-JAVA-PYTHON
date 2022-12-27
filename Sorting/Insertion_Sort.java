package Sorting;

public class Insertion_Sort {
    public static void perform_insertion_sort(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp) // We are traversing to place it in sorted array
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,9,3,1,2};
        perform_insertion_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
