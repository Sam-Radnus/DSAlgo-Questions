import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static Map<Integer,Integer> countNums(int[]nums)
    {
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                c=1;
                map.put(nums[i],c);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        return map;
    }
    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> counts=countNums(nums);
        Map.Entry<Integer,Integer>majorityEntry=null;
        for(Map.Entry<Integer,Integer>entry: counts.entrySet())
        {
            if(majorityEntry==null||entry.getValue()>majorityEntry.getValue())
            {
                majorityEntry=entry;
            }
        }
        return majorityEntry.getKey();
    }
    public static void main(String args[])
    {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
