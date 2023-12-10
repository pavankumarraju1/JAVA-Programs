import java.util.Scanner;
public class swapString {
    public static void main(String[] pav) {
        int[] arr = { 1,2 };
        int len = arr.length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = in.nextLine();
        System.out.println(swapStringname(arr, len, str));
        in.close();
    }

    static char[] swapStringname(int[] arr, int len, String name) {
        
        char[] letters = name.toCharArray(); 
        int lengt = letters.length;
        int half = lengt / 2;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1) {
                char temp1 = letters[0];
                letters[0] = letters[lengt-1];
                letters[lengt-1] = temp1;
            }
            if (arr[i] == 2) {
                char temp1 = letters[0];
                letters[0] = letters[half+1];
                letters[half+1] = temp1;
                char temp2 = letters[lengt-1];
                letters[lengt-1] = letters[half];
                letters[half] = temp2;
            }
        }
        
        return letters;
    }
}


