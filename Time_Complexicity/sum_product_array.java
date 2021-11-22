package Time_Complexicity;

//calculate the sum and product of all digits in an array.
public class sum_product_array {
    public static void sum_pro(int[] arr)
    {
        int sum=0;
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            product=product*arr[i];
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Product is: "+product);
    }
    public static void main(String args[])
    {
        int[] arr={1,3,2,4};
        sum_pro(arr);
    }
}
