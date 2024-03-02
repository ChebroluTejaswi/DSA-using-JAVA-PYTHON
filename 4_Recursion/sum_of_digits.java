package Recursion;

// for a given umber, calculate the sum of all digits in the number.
public class sum_of_digits {
    public static int cal_sum(int n)
    {
        if(n==0)
            return 0;
        else
        {
            return cal_sum(n/10)+(n%10);
        }
    }
    public static void main(String args[])
    {
        int n=112;
        System.out.println(cal_sum(n));
    }
}
