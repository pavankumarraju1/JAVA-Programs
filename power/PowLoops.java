import java.util.Scanner;
public class PowLoops{
    static int power(int n,int p)
    {
        int pow=1;
        for(int i=1;i<=p;i++)
        {
            pow*=n;
        }
        return pow;
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
