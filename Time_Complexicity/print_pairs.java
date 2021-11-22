package Time_Complexicity;

// print pairs of each element with all the other elements in an array.
public class print_pairs {
    public static void pp(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i]+" "+arr[j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[])
    {
        int[] arr={1,3,4,5};
        pp(arr);
    }
}
