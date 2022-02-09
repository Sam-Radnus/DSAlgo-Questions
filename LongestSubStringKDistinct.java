import java.util.HashMap;

public class LongestSubStringKDistinct {
    public static int findLength(String str, int k)
    {
        char ar[]=str.toCharArray();
        int i=0;
        int startIndex=0;
        int maxLen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(i=0;i<ar.length;i++)
        {
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
            while(map.size()>k)             //IF THERE ARE MORE THAN K DISTINCT CHARACTERS
            {
                char leftChar=ar[startIndex];
                map.put(leftChar,map.get(leftChar)-1);//DECREMENTING THE FREQUENCY
                if(map.get(leftChar)==0)
                {
                    map.remove(leftChar);
                }
                startIndex++;              //INCREMENTING THE SLIDING WINDOW
            }
            maxLen=Math.max(maxLen,i-startIndex+1);
        }
        return maxLen;
    }
    public static void main(String args[])
    {
         System.out.println(findLength("AHAHAIBCKKKKKK",2));
    }
}
