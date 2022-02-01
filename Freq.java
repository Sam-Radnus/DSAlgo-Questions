import java.util.*;
public class Freq {
    public static void main(String args[])
    {


        char s[]={'h','e','l','l','o'};
        String rev_s[]=new String[s.length];
        int k=0;
        for(int i=s.length-1;i>=0;i--)
        {
            rev_s[k++]=String.valueOf(s[i]);
        }
        for(int i=0;i< rev_s.length;i++)
        {
            System.out.println(rev_s[i]);
        }
        System.out.println(Arrays.toString(rev_s));
    }
}
