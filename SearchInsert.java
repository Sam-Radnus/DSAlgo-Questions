import java.util.HashMap;
import java.util.Map;

public class SearchInsert {
    public static int searchInsert(int [] nums,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i, pos = 0, k = 0;

        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        if (map.containsKey(target)) {
            pos = map.get(target);
        } else if (target > nums[nums.length - 1])     //number is greater than all the values in the array
        {
            pos = map.get(nums[nums.length - 1]) + 1;
        } else if (target < nums[0])//number is smaller than all the values in the array
        {
            pos = map.get(nums[0]);
        } else {
            for (i = 0; i < nums.length; i++) {
                if (nums[i] < target) {
                    k++;
                } else if (nums[i] > target) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }
    public static void main(String args[])
    {
       int ar[]={1,3,5,6};
       int target=2;
       System.out.println(searchInsert(ar,target));
       System.out.println(ar[ar.length -1 ]);
    }
}
