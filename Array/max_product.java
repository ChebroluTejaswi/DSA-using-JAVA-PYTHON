package Array;

// calculate the largest possible product of any two elements in an array.
public class max_product {
    public static void main(String args[])
    {
        //method 1
        int arr[]={10,20,5,30};
        int maxproduct=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int product=arr[i]*arr[j];
                if(maxproduct<product)
                    maxproduct=product;
            }
        }
        System.out.println("Max product of elements in an array: "+maxproduct);
        System.out.println("-------------------------------------------------------------");
        //method 2
        int fm=0;
        int sm=0;
        for(int i=0;i<arr.length;i++) //arr[]={10,20,5,30};
        {
            if(fm<arr[i])
                fm=arr[i];
            else if(sm<arr[i] && sm<fm)
                sm=fm;
        }
        System.out.println("First largest element: "+fm);
        System.out.println("Second largest element: "+sm);
        System.out.println("Max product of elements in an array: "+fm*sm);
    }
}
