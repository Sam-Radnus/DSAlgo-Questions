class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int len=0;
        for(int i=1;i<nums.length;i++){
            int pos=binarySearch(dp,nums[i],len);
            if(dp[len]>nums[i]) dp[pos]=nums[i];
            else if(pos>len){
                len=pos;
                dp[len]=nums[i];
            }
        }
        return len+1;
    }
    public int binarySearch(int dp[],int val,int len){
        int left=0;
        int right=len;
        while(left+1<right){
            int mid=left+(right-left)/2;
            if(dp[mid]==val) return mid;
            else{
                if(dp[mid]<val) left=mid;
                else right=mid;
            }
        }
        if(dp[left]>=val) return left;
        else if(dp[right]<val) return len+1;
        else return right; 
    }
}
