import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if(nums.length==0)
        {
            return nums[0];
        }
       // Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
          if(map.containsKey(nums[i])){
              map.put(nums[i],2);
          }
           else{
               map.put(nums[i],1);
               c=nums[i];
           }
        }
        System.out.println(map);
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int ar[]={2,2,1};
        System.out.println(singleNumber(ar));

    }
}
/*
class Solution {
    public int singleNumber(int[] nums) {
         if(nums.length==0)
        {
            return nums[0];
        }
       // Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
        {
            int search=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(search==nums[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                return search;
            }
        }
        return nums[0];
    }

}
 */