import java.util.Scanner;
class DecodeMsg{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = in.next();
        System.out.println(decoding(str));
        in.close();
    }

    static String decoding(String str){
        String res = "";
        int num = 0;
        char letter = 'a';
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                num = Character.getNumericValue(arr[i])+96; //for a=97 A=65 ascii values
                letter = (char)num;
                res += Character.toString(letter);
            }
            else if(arr[i]=='#'){
                letter = ' ';
                res += Character.toString(letter); 
            }
            else{
                break;
            }
        }
        return res;
    }
}
