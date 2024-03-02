package Array;
import java.util.Scanner;

//based on user input temperatures, calculate the average temperature.
//count number of days which has temperature above the average. 
public class days_above_avg {
    Scanner s= new Scanner(System.in);
    double avg=0;
    int sum=0;
    int arr[]=null;
    public days_above_avg(int size)
    {
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter day "+(i+1)+" temperature: ");
            int t=s.nextInt();
            arr[i]=t;
            sum=sum+t;
        }
        avg=sum/size;
        System.out.println("Average is: "+avg);
        System.out.println("-------------------------------------------");
    }
    public void num_days()
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>avg)
                count++;
        }
        System.out.println("Number of days above average: "+count);
    }
    public static void main(String args[])
    {
        System.out.println("Enter number of days: ");
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        days_above_avg temp=new days_above_avg(n);
        temp.num_days();
        s.close();
    }
}
