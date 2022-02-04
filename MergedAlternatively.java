import java.util.*;
public class MergedAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length(),i=0;
        int min=Math.min(word1.length(),word2.length());
        StringBuilder merged=new StringBuilder("");
        while(i<min)
        {
            merged.append(word1.charAt(i)).append(word2.charAt(i++));
        }
        return merged.append(word1,i,m).append(word2,i,n).toString();
    }
    public static void main(String args[])
    {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
