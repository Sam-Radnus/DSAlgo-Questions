import java.util.*;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String [] strs)
    {
       String prefix=strs[0];
       if(strs.length==0) return "";
       for(int i=0;i<strs.length;i++)
       {
           while(strs[i].indexOf(prefix)!=0)
           {
               prefix=prefix.substring(0,prefix.length()-1);
           }
       }
       return prefix;
    }


    public static void main(String args[])
    {
          String strs[]={"ab","a"};
         //String strs[]={"redflower","flow","flight"};
          // Arrays.sort(strs, Comparator.comparingInt(String::length));
           System.out.println(longestCommonPrefix(strs));
    }
}
