package Recursion;

// for a given base and exponent find out the value.
public class power_of_number {
    public static int power(int n,int x)
    {
        if(x==0)
            return 1;
        else
            return n*power(n,x-1);  
    }
    public static void main(String args[])
    {
        System.out.println(power(3,4));
    }
}
