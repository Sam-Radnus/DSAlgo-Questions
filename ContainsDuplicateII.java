import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int j=map.get(nums[i]);
                if(Math.abs(j-i)<=k) {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String args[])
    {
       int ar[]={1,2,3,1,2,3};
       System.out.println("Contains Duplicate Elements:"+containsNearbyDuplicate(ar,2));
    }
}
