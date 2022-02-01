public class ReverseString2 {
    public static String strRev(String str)
    {
        String rts="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rts=rts+str.charAt(i);
        }
        return rts;
    }
    public static String reverseStr(String s, int k) {
        String rev="";
        for(int i=0;i<=s.length()-2;i+=2*k) {
            rev = rev+ strRev(s.substring(i, i+k));
        }
        return rev;
    }
    public static void main(String args[])
    {
        String str="abcdefg";
        System.out.println(reverseStr(str,2));
    }
}
