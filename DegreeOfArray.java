import java.security.Key;
import java.util.*;

public class DegreeOfArray {
    public static int findShortestSubArray(int[] nums) {
        int startWindow=0;
        int WindowEnd=0;
        int degree=0;
        int res=0;
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
        }
        for(int freq:map1.values())      //GETTING THE MAX VALUE
        {
            degree=Math.max(degree,freq);
        }
        res=Integer.MAX_VALUE;
        for(WindowEnd=0;WindowEnd<nums.length;WindowEnd++)
        {
            map2.put(nums[WindowEnd],map2.getOrDefault(nums[WindowEnd],0)+1);
            if(map2.get(nums[WindowEnd])==degree)
            {
                set.add(nums[WindowEnd]);
            }
            while(!set.isEmpty())          //TO PLACE THE StartWindow Pointer
            {
                int len=WindowEnd-startWindow+1;
                res=Math.min(len,res);

                map2.put(nums[startWindow],map2.getOrDefault(nums[startWindow],0)-1);
                if(set.contains(nums[startWindow])&&map2.get(nums[startWindow])<degree)
                {
                    set.remove(nums[startWindow]);
                }
                startWindow++;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
      System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
      System.out.println(findShortestSubArray(new int[]{2,1,1,2,1,3,3,3,1,3,1,3,2}));
    }
}
