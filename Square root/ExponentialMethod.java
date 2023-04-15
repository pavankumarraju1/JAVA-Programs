import java.util.Scanner;

public class ExponentialMethod {
    public static int root(int x)
    {
        double result=Math.exp(Math.log(x)/2);
        int floorRes=(int)Math.floor(result);
        if(floorRes*floorRes==x)
        {
            return floorRes;
        }
        else{
            return floorRes;
        }
    }
    public static void main(String[] pav)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        int sqrRoot=in.nextInt();
        System.out.print("The result is :"+root(sqrRoot));
        in.close();
    }
}
