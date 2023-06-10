import java.util.*;

public class Main {
    public static void maxSum(int[] num, int size, int expectedSum) {
            int Sum;
            for (int i = 0; i < num.length; i++) {
                Sum = 0;
                for (int j = i; j < num.length; j++) {
                    Sum += num[j];
                    if (Sum == expectedSum) {
                        System.out.println("The result is " + (i + 1) + " and " + (j + 1));
                    }
                }
            }
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        // System.out.println("The result is");
        maxSum(arr, size, 12);
        in.close();
    }
}