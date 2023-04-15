import java.util.Scanner;

public class NaiveApproach {
    public static int root(int x)
    {
        if(x==0 || x==1){
            return x;
        }

        int i=1,result=0;
        while(result<=x)
        {
            i++;
            result=i*i;
        }
        return i-1;
    }
    public static void main(String[] pav)
    {
        Scanner in = new Scanner(System.in);
        int sqrRoot;
        System.out.print("Enter any number:");
        sqrRoot=in.nextInt();
        System.out.print("The result is :"+root(sqrRoot));
        in.close();
    }
}
