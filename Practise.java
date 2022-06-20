public class Practise {
    public static int RotatedSortedArray(int nums[])
    {
        int left=0;
        String str="hi asd";
        int right=nums.length-1;
        int mid=0;
        if(nums.length==1||nums[left]<nums[right])
        {
            return nums[0];
        }
        while(left<=right)
        {
            mid=(left+(right-left)/2);

            if(nums[mid+1]<nums[mid])
            {
              return nums[mid+1];
            }
            if(nums[mid-1]>nums[mid])
            {
                return nums[mid];
            }

            if(nums[0]<nums[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return mid;
    }
    public static void main(String args[])
    {

    }
}
