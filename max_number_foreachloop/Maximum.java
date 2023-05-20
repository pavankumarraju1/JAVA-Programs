public class Maximum{
    static int highNumber(int a[])
    {
        int max=a[0];
        for(int elements:a)
        {
            if(elements>max)
            {
                max=elements;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] a={10,20,2,3,100};
        System.out.println("The maximum number is :"+highNumber(a));
    }
}