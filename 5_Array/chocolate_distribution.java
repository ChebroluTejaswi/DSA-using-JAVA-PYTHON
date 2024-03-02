package Array;
import java.util.Arrays;

// Each value in array represents number of chocolates in packet.
// The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to students must be minimum.
public class chocolate_distribution {
    public static int min_diff(int arr[], int d)
    {   
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-d+1;i++)
        {
            int diff=arr[i+d-1]-arr[i];
            if(min>diff)
            {
                min=diff;
                // System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i,i+d)));  
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int ans= min_diff(arr,7);
        System.out.println("minimum difference: "+ans);
    }
}
