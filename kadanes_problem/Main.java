import java.util.*;
public class Main {
        static long maxSubarraySum(long arr[], int n){
        long maxSum=arr[0];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>maxSum)
            {
                maxSum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;       
    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=in.nextInt();
        long[] arr=new long[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The maxSum of the array is:"+maxSubarraySum(arr, size));
        in.close();
    }
}