package Sorting;
import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sort {
    public static void perform_bucket_sort(int [] arr)
    {
        int n=arr.length;

        // Create the Buckets
        int nb=(int)Math.ceil((double)Math.sqrt(n));
        ArrayList<Integer>[] buckets = new ArrayList[nb];
        for(int i=0;i<nb;i++)
        {
            buckets[i]=new ArrayList<Integer>();
        }

        // Distribute the elements of array in buckets
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            int value=arr[i];
            int bn=(int)Math.ceil(((double)value*nb)/(double)max);
            buckets[bn-1].add(value);
        }

        // Sort the bucktes indiviually 
        for(int i=0;i<nb;i++)
        {
            Collections.sort(buckets[i]);
        }
        // merge buckets after sorting
        int index=0;
        for(int i=0;i<nb;i++)
        {
            ArrayList<Integer> temp = buckets[i];
            for(int j=0;j<temp.size();j++)
            {
                arr[index]=temp.get(j);
                index++;
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,9,3,1,2};
        perform_bucket_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
