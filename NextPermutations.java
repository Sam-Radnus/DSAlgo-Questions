class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return ;
        int n=nums.length;
        int lastInc=-1;
        int i=0;
        int temp=0;
        for(i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1]){
               lastInc=i;
            }
        }
       
        if(lastInc==-1)
        {
          Arrays.sort(nums);
          return;
        }
        int index=lastInc;
        for(i=lastInc;i<n;i++)
        {
            if(nums[lastInc-1]<nums[i] && nums[i]<nums[index])
            {
               index=i;
            }
        }
        temp=nums[index];
        nums[index]=nums[lastInc-1];
        nums[lastInc-1]=temp;
        Arrays.sort(nums,lastInc,nums.length);
        
    }
}
