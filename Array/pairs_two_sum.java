package Array;
import java.util.*;

//https://leetcode.com/problems/two-sum/
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class pairs_two_sum {
    public static int[] two_sum(int[]list, int target)
    {
        int indices[]=new int[2];
        for(int i=0;i<list.length;i++)
        {
            if (i>=target)
            {
                continue;
            }
            else{
                for(int j=i+1;j<list.length;j++)
                {
                    if(list[i]+list[j]==target)
                    {
                        indices[0]=i;
                        indices[1]=j;
                    }
                }
            }
        }
        return indices;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements: ");
        int n=sc.nextInt();
        int list[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            list[i]=sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target=sc.nextInt();
        int[] ans=two_sum(list,target);
        System.out.println(Arrays.toString(ans));
    }
}
