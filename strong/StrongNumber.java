import java.util.Scanner;
public class StrongNumber{
    static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
    public static void main(String[] pav)
    {
        int num,temp,res=0,result=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        num=in.nextInt();
        temp=num;
        while(num>0)
        {
            res=num%10;
            result += fact(res);
            num/=10;
        }
        if(result==temp)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        in.close();
    }
}