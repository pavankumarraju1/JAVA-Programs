import java.util.Scanner;
class FarthestSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array size:" );
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Array elements: ");
        for(int ar=0;ar<size;ar++){
            arr[ar] = in.nextInt();
        }
        System.out.println("Enter the x element: ");
        int x = in.nextInt();
        System.out.println("Enter the n size: ");
        int n = in.nextInt();
        System.out.println("result: "+ sum(arr,n,x));
        in.close();
    }

    static int sum(int[] arr,int n,int x){

        int max = 0;
        int res = 0;
        int diff=0;
        int index = 0;
        // int value = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max =0;
            index =0;
            diff = 0;
            for(int j=0;j<arr.length;j++){
                // if(arr[j]==value){
                //     continue;
                // }
                diff = (int)Math.abs(x-arr[j]);
                if(diff>max){
                    max = diff;
                    index = j;
                    
                }    
            }
            res+=arr[index];
            arr[index] = x;
            // value = arr[index];
        }

        return res;
    }
}
