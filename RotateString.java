import java.util.*;
public class RotateString {
    public static boolean rotateString(String s, String goal) {
        System.out.println(s+s);
        return s.length()==goal.length() && (s+s).contains(goal);
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String a=Sc.next();
        String b=Sc.next();
        System.out.println("are "+a+" and "+b+" rotated String:"+rotateString(a,b));

    }
}
