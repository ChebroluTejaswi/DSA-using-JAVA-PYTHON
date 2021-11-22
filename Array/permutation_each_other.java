package Array;

//find out whether both the arrays have same elements in them or not.
public class permutation_each_other {
    public static void main(String args[])
    {
        int arr1[]={1,7,2,4};
        int arr2[]={2,7,4,1};
        int sum1=0,sum2=0;
        int mul1=1,mul2=1;
        for(int i=0;i<arr1.length;i++)
        {
            sum1=sum1+arr1[i];
            mul1=mul1*arr1[i];
            sum2=sum2+arr2[i];
            mul2=mul2*arr2[i];
        }
        if(sum1==sum2 && mul1==mul2)
        {
            System.out.println("Both arrays are in permutation.");
        }
        else
        {
             System.out.println("Both arrays are not in permutation.");
        }
    }
}
