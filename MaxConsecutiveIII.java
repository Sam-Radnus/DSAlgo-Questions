class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end=0;
        int n=nums.length;
        int len=-1;
        while(end<n)
        {
           if(nums[end]==1){
               end++;
           }
           else if(nums[end]==0 && k>0)
           {
              end++;
              k--;
           }
           else{
               len=Math.max(end-start,len);
               if(nums[start]==0) k++;
               start++;
           }
        }
        return Math.max(len,end-start);
    }
}
