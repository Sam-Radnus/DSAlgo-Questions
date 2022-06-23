public class MissingNumber {
    public int missingNumber(int[] nums) {

        boolean list[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            list[nums[i]]=true;
        }
        for(int i=0;i<list.length;i++)
        {
            if(!list[i])
            {
                return i;
            }
        }
        return 0;
    }
}
