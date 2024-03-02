package Time_Complexicity;

public class unordered_pairs {
    public static void up(int arr[])
    {
     for(int i=0;i<arr.length;i++)
     {
         for(int j=i+1;j<arr.length;j++)
         {
             System.out.print(arr[i]+" "+arr[j]+"\t");
         }
         System.out.println("\n");
     }
    }
    public static void main(String args[])
    {
        int arr[]={1,3,4,5};
        up(arr);
    }
}
