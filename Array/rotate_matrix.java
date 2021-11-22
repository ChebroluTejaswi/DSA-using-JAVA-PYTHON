package Array;
import java.util.Arrays;

//rotate the given matrix by 90 degrees.
public class rotate_matrix {
    public static void main(String args[])
    {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=arr.length;
        //rotating elements layer wise
        //layer1 [(1,2,3),(1,4,7),(7,8,9),(3,6,9)
        //layer2 [(5)]
        for (int layer=0;layer<(n/2);layer++) {
            int first=layer;
            int last=n-1-layer;
            for(int i=first;i<last;i++)
            {
                int offset=i-first;
                
                int top=arr[first][i];
                arr[first][i]=arr[last-offset][first];
                arr[last-offset][first]=arr[last][last-offset];
                arr[last][last-offset]=arr[i][last];
                arr[i][last]=top;
            }
        }
        //printing matrix after rotating 90 degrees
        System.out.println("After rotating 90 degrees: "+Arrays.deepToString(arr));
    }
}
