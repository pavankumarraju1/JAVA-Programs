import java.util.Scanner;
class MakeAPallindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = in.nextLine();
        makePallindrome(str);
        in.close();
    }

    static boolean isPallindrome(String str){
        // char[] arr = str.toCharArray();
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static void makePallindrome(String str){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(isPallindrome(str.substring(i,str.length()))){
                res = str.substring(0,i);
                break;
            }
        }
        System.out.println(new StringBuilder(res).reverse());
    }
}