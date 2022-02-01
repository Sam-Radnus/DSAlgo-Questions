import java.util.Arrays;

public class RemoveInteger {
    public static int removeElement(int[] nums, int val) {
        if(nums.length<=1 && nums[0]==val)
        {
            return 0;
        }
        if(nums.length==1 && nums[0]!=val)
        {
            return 1;
        }
        int end = nums.length - 1;
        int temp;
        int c=0,len=nums.length;
        for (int i = 0; i < end; i++) {
            for (int j = 0; j < end; j++) {
                if (nums[j] == val) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        len=Arrays.asList(nums).indexOf(3);
        return len;
    }

    public static void main(String args[]) {
        int ar[] = {3, 2, 2, 3};
    }
}
