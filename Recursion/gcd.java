package Recursion;

// find out the greatest common divisors of two integers.
public class gcd {
    public static int cal_gcd(int a,int b)
    {
        if(b==0)
            return a;
        return cal_gcd(b,a%b);
    }
    public static int gcd_1(int a,int b)
    {
        if(a>b)
        {
            return gcd_1(a-b,b);
        }
        else if(a<b)
        {
            return gcd_1(a,b-a);
        }
        else
            return a;
    }
    public static void main(String args[])
    {
        System.out.println(cal_gcd(48,18));
        System.out.println(gcd_1(48,18));
    }
}
