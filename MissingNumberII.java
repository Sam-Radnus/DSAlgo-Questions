import java.util.Arrays;

public class MissingNumberII {
    public static void swap(int nums[],int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static int missingNumber(int nums[])
    {
        int i=0;
        while(i< nums.length)
        {
            if(nums[i]!=nums.length) {
                int correct = nums[i];
                if (nums[correct] != nums[i]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String args[])
    {
        int nums[]={4,0,2,1};
        System.out.println(missingNumber(nums));

    }
}
