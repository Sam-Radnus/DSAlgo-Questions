import java.util.Arrays;
import java.util.HashMap;

public class ArrayNesting {
    public static int arrayNesting(int [] nums)
    {
        if(nums.length<=1)
        {
            return nums.length;
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int x=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            x=nums[x];
           System.out.println(x);
            if(map.containsKey(x))
            {
               return c;
            }
            map.put(x,c++);
        }
        System.out.println(map);
        return 1;
    }
    public static void main(String args[])
    {
        int nums[] = {5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }
}
