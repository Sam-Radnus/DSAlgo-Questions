import java.util.HashMap;
import java.util.Map;
public class NoRepeatedCharacters {
    public static int lengthOfLongestSubstring1(String s)
    {
        if(s.length()==1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
       System.out.println(lengthOfLongestSubstring1("abcabcbb"));
    }
}
