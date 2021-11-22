package Recursion;

// convert a decimal number to binary. 
public class deci_to_bin{
    public static long to_bin(int n)
    {
        if(n==0)
            return 0;
        else
            return (to_bin(n/2))*10+(n%2);
    }
    public static void main(String args[])
    {
        System.out.println(to_bin(875));
    }
}