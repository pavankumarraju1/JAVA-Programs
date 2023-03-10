import java.util.Scanner;
public class PowRecursion{
    static int power(int n,int p)
    {
      if(p==0)
      {
        return 1;
      }
      else{
        return n*power(n,p-1);
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