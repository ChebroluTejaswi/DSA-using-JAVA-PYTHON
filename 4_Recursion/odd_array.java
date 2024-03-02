package Recursion;
import java.util.Arrays;

//function returns true if a single value in array returns true 
//when passed to callback, otherwise returns false.
public class odd_array {
    public static boolean cal_odd(int n)
    {
        if(n%2==0)
            return false;
        else
            return true;
    }
    public static boolean oa(int[] arr)
    {
        if(arr.length==0)
            return false;
        else if(cal_odd(arr[0])==false)
            {
                return oa(Arrays.copyOfRange(arr, 1, arr.length));
            }
        else
            return true;
    }
    public static void main(String args[])
    {
        int[] arr={4,2,6};
        System.out.println(oa(arr));
    }
}
