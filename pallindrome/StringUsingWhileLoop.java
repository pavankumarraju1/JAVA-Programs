public class StringUsingWhileLoop {
    public static boolean name(String name)
    {
        int i=0;
        int j=name.length()-1;
        while(i<j)
        {
            if(name.charAt(i)!=name.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Madam";
        str=str.toLowerCase();
        if(name(str))
        {
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
