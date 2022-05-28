public class RotatedSortedArray {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        if(nums.length==1 || nums[left]<nums[right])
            return nums[0];

        while(left<=right)
        {
            mid=(left+(right-left)/2);  //type cast is necessary

            if(nums[mid]>nums[mid+1])
                return nums[mid+1];

            if(nums[mid-1]>nums[mid])
                return nums[mid];

            if(nums[mid] >  nums[0])
                left=mid+1;
            else
                right=mid-1;
        }
        return mid;
    }
}
