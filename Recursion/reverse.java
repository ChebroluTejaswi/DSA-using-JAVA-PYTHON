package Recursion;

// return a reverse string.
public class reverse {
    public static String rev(String str){
        if(str.isEmpty())
            return "";
        else
            return rev(str.substring(1))+str.charAt(0);
    }
    public static void main(String args[])
    {
        System.out.println(rev("java"));
    }
}
