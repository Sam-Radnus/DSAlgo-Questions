import java.util.*;
public class LongSubString {
    public static  int lengthOfLongestSubstring(String s)
    {
        int n=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>(); //current index of character
        for(int j=0,i=0;j<n;j++)
        {
            if(map.containsKey(s.charAt(j)))
            {
                i=Math.max(map.get(s.charAt(j)),i);
            }
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
    public static void main(String args[])
        {
            Scanner Sc=new Scanner(System.in);
            String str=Sc.nextLine();
            System.out.println("Length of longest Substring:"+lengthOfLongestSubstring(str));
        }
}
