import java.util.*;
class Main{
    public static void main(String[] pav)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=in.nextInt();
        int[] num=new int[size];
        System.out.println("Enter "+size+" numbers:");
        for(int i=0;i<size;i++)
        {
            num[i]=in.nextInt();
        }
        Main obj=new Main();
        System.out.println("The sum of highest digited value in each number is:"+obj.high(num));
        
        in.close();
    }

    public int high(int[] num)
    {
        int big = 0;
        int small = 0;
        int result=0;
        for (int i = 0; i < num.length; i++) {
            while (num[i] != 0) {
                int rem = num[i] % 10;
                big = Math.max(rem, big);
                small = Math.min(rem, small);
                num[i] /= 10;
            }
            result+=big;
        }
        return result;
    }
}