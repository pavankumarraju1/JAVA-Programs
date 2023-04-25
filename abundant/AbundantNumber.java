import java.util.Scanner;
public class AbundantNumber{
    public static void main(String[] pav)
    {
        int num,temp,result=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        num=in.nextInt();
        temp=num;
        for(int i=1;i<num;i++)
        {
            if((num%i)==0)
            {
                result+=i;
            }
        }

        if(result>temp)
        {
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not a Abundant Number");
        }
        in.close();
    }
}