import java.util.Arrays;
import java.util.Scanner;

class ArrayFloor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 10, 3, 4, 11, 2, 30, 40 };
        Arrays.sort(arr);
        // for(int i : arr){
        // System.out.println(i);
        // }
        // System.out.println(Arrays.toString(arr));
        // finding the floor of element in an array arr={1,8,5,3} x=5 result=3;
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        int index = 0;
        if (x <= 1) {
            System.out.println("no floor value");
        } else {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= x) {
                    index = i - 1;
                    break;
                }
            }
            System.out.print("The floor of x " + x + " is:" + arr[index]);
        }
        in.close();
    }
}