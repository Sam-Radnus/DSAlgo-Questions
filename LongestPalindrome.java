import java.util.*;
public class LongestPalindrome{
    public static String longestPalindrome(String s)
    {
        if (s == null || s.length() < 1) return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
           // int len1,len2,len;
           int  len1=expandAroundCentres(s,i,i);
           int  len2=expandAroundCentres(s,i,i+1);
           int  len=Math.max(len1,len2);
            if(len>end-start)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int expandAroundCentres(String s,int left,int right)
    {
        int L=left,R=right;
        while(L >= 0 && R< s.length() && s.charAt(L)==s.charAt(R))
        {
            L--;
            R++;
        }
        return R-L-1;
    }
    public static void main(String args[]) {
           Scanner Sc=new Scanner(System.in);
           String S=Sc.nextLine();
           System.out.println("The Longest Palindrome is:"+longestPalindrome(S));
    }
}
