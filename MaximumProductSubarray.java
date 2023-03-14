class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int curMax=nums[0];
        int curMin=nums[0];
        int ans=curMax;
        for(int i=1;i<nums.length;i++){
            int temp=curMax;
            curMax=Math.max(temp*nums[i],Math.max(nums[i]*curMin,nums[i]));
            curMin=Math.min(temp*nums[i],Math.min(nums[i]*curMin,nums[i]));
            ans=Math.max(curMax,ans);
        }
        return ans;
    }
}
