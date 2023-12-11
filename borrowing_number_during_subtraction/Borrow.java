import java.util.Scanner;
class Borrow{

    static int noOfBorrows(int a,int b){
        int count = 0;
        int rem1=0;
        int rem2=0;
        if(a<b){
            return count=0;
        }
        while(a!=0 && b!=0){
            rem1 = a%10;
            rem2 = b%10;
            if(rem1<rem2){
                count++;
                a = (a/10)-1;
            }
            b = (b/10);
            if(rem1==rem2 || rem1>rem2){
                a = (a/10);
                b = (b/10);
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int count = noOfBorrows(num1, num2);
        if(count>0){
            System.out.print("Result:"+count);
        }
        else{
            System.out.println("Not possible");
        }
        in.close();
    } 
}