package Recursion;

// convert the first letter in each word to uppercase.
public class firstcap {
    public static String cap(String str)
    {
        if(str.isEmpty())
            return "";
        if(str.length()==1)
            return Character.toString(Character.toUpperCase(str.charAt(0)));
        else
        {
            String ch="";
            if(str.charAt(str.length()-2)==' ')
            {
                ch=ch+Character.toUpperCase(str.charAt(str.length()-1));
            }
            else
            {
                ch=ch+str.charAt(str.length()-1);
            }
            return cap(str.substring(0,str.length()-1))+ch;
        }
    }
    public static void main(String args[])
    {
        System.out.println(cap("i love java"));
    }
}
