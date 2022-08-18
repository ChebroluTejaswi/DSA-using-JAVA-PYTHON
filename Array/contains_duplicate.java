package Array;
import java.util.*;

//https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class contains_duplicate {
    public static boolean check_duplicates(int[] list)
    {
        boolean result=false;
        for(int i=0;i<list.length;i++)
        {
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i]==list[j])
                    result=true;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements: ");
        int n=sc.nextInt();
        int list[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            list[i]=sc.nextInt();
        }
        boolean ans=check_duplicates(list);
        System.out.println(ans);
    }
}
