package Sorting;

public class Quick_Sort {
    // Function to swap two numbers in array
    static void swap(int [] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // takes last element as pivot
    // places all smaller elements than pivot to left of pivot
    // places all greater elements than pivot to right of pivot
    static int partition(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=(low-1);
        // System.out.println(pivot);
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                // System.out.println("swapping "+arr[i]+" "+arr[j]);
                swap(arr,i,j);
            }
        }
        // printArray(arr, arr.length);
        return i;
    }

    static void perform_quick_sort(int[] arr, int low, int high)
    {
        if (low < high) {
            int p = partition(arr, low, high);
            perform_quick_sort(arr, low, p - 1);
            perform_quick_sort(arr, p + 1, high);
        }
    }
  
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        perform_quick_sort(arr, 0, n - 1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
  
}
