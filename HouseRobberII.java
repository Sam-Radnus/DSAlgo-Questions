class Solution {
    public int helper(int[] nums,int low,int high) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int withRob=0;
        int withoutRob=0;
        for(int i=low;i<high;i++)
        {
            int currRob=withoutRob+nums[i];
            withoutRob=Math.max(withoutRob,withRob);
            withRob=currRob;
        }
        return Math.max(withRob,withoutRob);
    }
    public int rob(int nums[])
    {
           return Math.max(helper(nums,1,nums.length),helper(nums,0,nums.length-1));
    }
}
