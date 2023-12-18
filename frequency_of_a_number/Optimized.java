import java.util.*;
public class Optimized {
    public static void counting(int[] arr,int n)
    {
        Arrays.sort(arr);
        int i=0;
        while(i<n)
        {
            int count=1;
            while(i<n-1 && arr[i]==arr[i+1])
            {
                i++;
                count++;
            }
            System.out.println(arr[i]+" : "+count);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6,1,3};
        int len=arr.length;
        counting(arr,len);
    }
}
