package Time_Complexicity;
import java.util.Arrays;

//print the reverse of an array.
public class reverse {
    public static void rev(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        rev(arr);
    }
}
