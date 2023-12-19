import java.util.Scanner;

class RepeatCharacterIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = in.nextLine();
        repeat(str);
        in.close();
    }

    static void repeat(String str) {
        char[] arr = str.toCharArray();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = 1;
            if (arr[i] == '0') {
                continue;
            }
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = '0';
                    index++;
            }
        }
            if (index == 1) {
                System.out.println(i+1);
            }
            else if(index == str.length()){
                System.out.print("All are repetitive characters");
            }
        
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}
