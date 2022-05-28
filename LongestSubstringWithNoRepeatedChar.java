import java.util.*;
public class LongestSubstringWithNoRepeatedChar {
    //TECNIQUE USED:-Sliding Window and Two Pointers
    public static  int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
        {
            return 1;
        }
        int start=0,end=0,res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(end=0;end<s.length();end++)
        {
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end))+1,start);
            }
            map.put(s.charAt(end),end);
            res=Math.max(end-start+1,res);
        }
        return res;
    }
    public static void main(String args[])
    {

    }
}
