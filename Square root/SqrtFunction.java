import java.util.*;
public class SqrtFunction{
    public static int root(int x)
    {
        int res = (int)Math.sqrt(x);
        // int result=(int)res;
        return res;
    }
    public static void main(String[] pav)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        int x = in.nextInt();
        int sqrRoot=root(x);
        System.out.println("Thr result is :"+sqrRoot);
        in.close();
    }
}