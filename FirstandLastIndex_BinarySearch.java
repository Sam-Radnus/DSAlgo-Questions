public class FirstandLastIndex_BinarySearch {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int res[]={-1,-1};
        res[0]=search(nums,target,true);
        if(res[0]!=-1)
            res[1]=search(nums,target,false);
        return res;
    }
    public int search(int[] nums, int target,boolean isFirstSearch) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int ans=-1;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(isFirstSearch)
                    right=mid-1;
                else{
                    left=mid+1;
                }
            }
            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            if(nums[mid]>target)
            {
                right=mid-1;
            }
        }
        return ans;
    }
}
