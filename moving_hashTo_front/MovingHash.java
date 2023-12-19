import java.util.Scanner;
class MovingHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = in.nextLine();
        System.out.println("result"+move(str));
        in.close();
    }

    static String move(String str){
        String str1 = new String();
        String str2 = new String();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                str1 += str.charAt(i);
            }
            else{
                str2 += str.charAt(i);
            }
        }

        return str1+str2;
    }
}

//Another way of solving problem 1)count the # 2)then replace all # 3)then print

// public class Main
// {
// 	public static void main(String[] args) {
// 		String str = "pAva###n";
// 		int count = 0;
// 		for(int i=0;i<str.length();i++){
// 		    if(str.charAt(i) == '#'){
// 		        count++;
// 		    }
// 		}
// 		String org = str.replaceAll("\\#","");
// 		System.out.print("#".repeat(count)+""+org);
// 	}
// }
