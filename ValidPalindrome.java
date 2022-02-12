import java.util.Arrays;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String a = s.replaceAll(" ","");
        String b = a.replaceAll("[^a-zA-Z\\d\\s]","").toLowerCase();
        String temp ="";
        System.out.println(b);
        for(int i=b.length()-1; i>=0; i--) {
            temp = temp + b.charAt(i);
        }
        return b.equals(temp);
    }
    public static void main(String args[])
    {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
