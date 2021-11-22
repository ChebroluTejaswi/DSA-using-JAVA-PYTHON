package Recursion;

//function should return true if entered string is palindrome, otherwise it should return false.
public class palindrome {
    public static boolean ispali(String s)
    {
        if(s.length()==0||s.length()==1)
            return true;
        else
        {
            if(s.charAt(0)==s.charAt(s.length()-1))
                return ispali(s.substring(1,s.length()-1));
            else
                return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println(ispali("tocot"));
    }
}
