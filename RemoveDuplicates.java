import java.util.*;

public class RemoveDuplicates {
    public static int  removeDuplicates(int [] nums)
    {
        if(nums.length<=1)
        {
            return nums.length;
        }
        int len=0,i,c=0;
        int ar[]=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++) {
            if (!(map.containsValue(nums[i]))) {
                map.put(i, nums[i]);
                ar[c++] = nums[i];
            }
        }
        System.out.println(map);
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]!=0) {
                System.out.print(ar[i] + " ");
                len++;
            }
        }

        return len;

    }
    public static void main(String args[]) {
        int ar[]={1,1,2};
        System.out.println(removeDuplicates(ar));

    }
}
