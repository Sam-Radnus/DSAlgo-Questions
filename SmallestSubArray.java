public class SmallestSubArray {
    public static int smallSub(int target,int ar[])
    {
        int minWindows=Integer.MAX_VALUE;
        int windowStart=0;
        int windowEnd=0;
        int currentSum=0;
        for(windowEnd=0;windowEnd<ar.length;windowEnd++)
        {
            currentSum+=ar[windowEnd];
            while(currentSum >= target)
            {
                minWindows=Math.min(minWindows,windowEnd-windowStart+1);
                currentSum-=ar[windowStart];
                windowStart++;
            }
        }
        return minWindows;
    }
    public static void main(String args[])
    {
       System.out.println(smallSub(18,new int[]{4,2,2,7,8,1,2,8,10}));
    }
}
