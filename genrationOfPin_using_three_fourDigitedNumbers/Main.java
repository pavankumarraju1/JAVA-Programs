import java.util.Scanner;
public class Main{
    public static int pin(int one, int two, int three, int four) {
        int[] arr = { one, two, three };
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<4;j++) {
                if (j % 2 == 0) {
                    oddSum += arr[i] % 10;
                } else {
                    evenSum += arr[i] % 10;
                }
            
            arr[i] /= 10;
            }
        }
        if (four % 2 == 0) {
            return evenSum - oddSum;
        } else {
            return oddSum - evenSum;
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any number(even/odd):");
        int num=in.nextInt();
        System.out.println("The pin generated is:"+pin(3521, 2452, 1352, num));
        in.close();
    }
}
