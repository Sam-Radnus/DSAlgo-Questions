class Solution {
    public int longestSubarray(int[] nums) {
        int start=0,end=0;
        int len=Integer.MIN_VALUE;
        int ops=0,n=nums.length;
        while(end<n)
        {
            if(nums[end]==0) ops++;
            if(ops==2){
               len=Math.max(len,end-start-1);
               while(ops==2)
               {
                   if(nums[start]==0) ops--;
                   start++;
               }
            }
            end++;
        }
        return Math.max(len,end-start-1);
    }
}
