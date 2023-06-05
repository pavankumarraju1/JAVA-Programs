public class StringUsingForLoop {
    public static boolean name(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Madam";
        str=str.toLowerCase();
        if (name(str)) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not");
        }
    }
}
