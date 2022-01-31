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
    public static void main(String args[])
    {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(ar));
    }
}
