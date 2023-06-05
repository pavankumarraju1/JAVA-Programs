class PallindromeNumber{
    public static boolean number(int num)
    {
        int rev=0;
        int temp=num;
        while(num!=0)
        {
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        if(temp!=rev)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if(number(1232))
        {
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not");
        }
    }
}