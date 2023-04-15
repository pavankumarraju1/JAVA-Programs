import java.lang.Math;
import java.util.Scanner;
public class PowMethod{
    static double power(int n,int p)
    {
        if(p==0)
        {return 1;}
        else{
            return Math.pow(n, p);
        }
    }
    public static void main(String[] pav)
    {
        int n,p;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base:");
        n=in.nextInt();
        System.out.println("Enter the power:");
        p=in.nextInt();
        System.out.print("The resultant power is"+power(n,p));
        in.close();
    }
}