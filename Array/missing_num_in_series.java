package Array;
import java.util.Scanner;

// Find the missing number in the sequence
public class missing_num_in_series {
    public static int cal_missing_num(int series[],int start,int end)
    {
        int miss=-1;
        int sum1=(end*(end+1))/2;
        int sum2=(start*(start-1))/2;
        int diff=sum1-sum2;
        int sum=0;
        for(int i=0;i<series.length;i++)
        {
            sum=sum+series[i];
        }
        miss=diff-sum;
        return miss;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total number of elements: ");
        int n=sc.nextInt();
        int series[]=new int[n];
        System.out.println("Enter elements: ");
        for (int i=0;i<n;i++)
        {
            series[i]=sc.nextInt();
        }

        System.out.println("Enter start element: ");
        int start=sc.nextInt();
        System.out.println("Enter end element: ");
        int end=sc.nextInt();
        int miss=cal_missing_num(series,start,end);
        System.out.print("Missing number in sequence is:"+miss);
    }
}
