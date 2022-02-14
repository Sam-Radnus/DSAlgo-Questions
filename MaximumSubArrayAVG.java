public class MaximumSubArrayAVG {
    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length==1&&k==1)
        {
            return nums[0];
        }
        int sum=0;
        int x=0,windowStart=0,windowEnd=0;
        double avg=0,res=Integer.MIN_VALUE;
        for(windowStart=0;windowStart<=nums.length-k;windowStart++)
        {
            windowEnd=windowStart+k-1;
            x=windowStart;
            System.out.println(nums[windowStart]);
            System.out.println(nums[windowEnd]);
            sum=0;
            while(x<=windowEnd)
            {
                sum=sum+nums[x];
                x++;
            }
            avg=(double)sum/k;
            System.out.println("sum:"+sum);
            res=Math.max(res,avg);
        }
        return res;
    }
    public static void main(String args[])
    {
        System.out.println(findMaxAverage(new int[]{0,1,1,3,3},4));
    }
}
