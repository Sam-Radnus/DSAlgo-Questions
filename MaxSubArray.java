public class MaxSubArray {
    public static int calcSum(int ar[],int start,int end)
    {
        int sum=0;
       // System.out.println("start"+start);
      //  System.out.println("end"+end);
        for(int i=start;i<=end;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
    /*public int maxSubArray2(int[] nums) {              //OPTIMAL SOLUTION


        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }
    }

     */
    public static int maxSubArray(int [] nums)
    {
        if(nums.length<=0)
        {
            return nums[0];
        }
        int sum=0;
        int l=0;             //start pointer
        int r=nums.length-1; // end pointer
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            temp+=nums[i];
            sum=Math.max(sum,temp);
            if(temp<0)
                temp=0;
        }
        return sum;
    }
    public static int kadanesSum(int ar[])
    {
        if(ar.length<=1)
        {
            return ar[0];
        }
        int currentMax=ar[0];
        int sumMax=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            currentMax=Math.max(ar[i],currentMax+ar[i]);
            sumMax=Math.max(sumMax,currentMax);
        }
        return sumMax;
    }
    public static void main(String args[])
    {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sub Array:"+maxSubArray(ar));
        System.out.println("Kadane Sub Array:"+kadanesSum(ar));
    }
}
