import java.util.*;
import java.text.*;
public class ValidParentheses {
    public static boolean isValid(String s) {
        String replace1 = "";
        String replace2="";
        for (int i = 0; i < 10; i++) {
            replace1 = (s.replace("{}", ""));
            replace2 = (replace1.replace("[]", ""));
            s = (replace2.replace("()", ""));
        }
        if (s.length() == 0) {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String Str=Sc.nextLine();
        System.out.println(Str+" is a valid parenthesis "+isValid(Str));
    }
}
