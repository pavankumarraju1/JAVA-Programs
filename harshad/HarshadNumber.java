import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] pav)
    {
        int num,res,result=0,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number:");
        num=in.nextInt();
        temp=num;
        while(num>0)
        {
            res=num%10;
            result+=res;
            num/=10;
        }
        if((temp%result)==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
        in.close();
    }
}