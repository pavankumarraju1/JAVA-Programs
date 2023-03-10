import java.util.Scanner;
public class PowBitmanipulation {
    public static void main(String[] pav)
    {
        int n,p;
        int ans=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base:");
        n=in.nextInt();
        System.out.println("Enter the power:");
        p=in.nextInt();
        in.close();
        while(p>0)
        {
            if((p&1)==1)
            {
                ans*=n;
            }
            n*=n;
            p=p>>1;
        }
        System.out.print("The resultant power is:"+ans);
        
    }
}
