class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)
            dp[i]=Integer.MAX_VALUE;
        dp[0]=0;
        int index=0;
        while(index<n)
        {
            for(int i=1;i<=nums[index];i++)
                if(index+i<=n)
                   dp[index+i]=Math.min(dp[index+i],dp[index]+1);
            index++;    
        }
        return dp[n-1];
    }
}
