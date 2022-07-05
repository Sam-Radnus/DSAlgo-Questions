public class CycleDetection {
    public static int findDuplicate(int nums[])
    {
        int slow=nums[0];
        int fast=nums[nums[0]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        int start=0;
        while(start!=slow)
        {
            start=nums[start];
            slow=nums[slow];
        }
        return start;
    }
    public static void main(String args[])
    {
          System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
}
