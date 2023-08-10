class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;

        if(nums.length==1) return nums[0]==target;

        while(left<=right){
           
           
            while(left<n-1 && nums[left]==nums[left+1]){
                 left++;
            }
            while(right>0 && nums[right]==nums[right-1]){
                 right--;
            }
            int mid=(left+right)/2;
            if(nums[mid]==target) return true;
            
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && nums[mid]>target) right=mid-1;
                else left=mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[right]) left=mid+1;
                else right=mid-1;
            }
        }
        return false;
    }
}
