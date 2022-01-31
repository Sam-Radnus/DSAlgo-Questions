public class MinimumCostClimbing {
    public static int minCostClimbingStairs(int[] cost) {
         int dp[]=new int[cost.length];
         int n=cost.length;
         if(n==1)
         {
             return cost[0];
         }
         dp[0]=cost[0];//16
         dp[1]=cost[1];//19
         for(int i=2;i<n;i++)
         {
             dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
             System.out.println(Math.min(dp[i-1],dp[i-2])+"+"+cost[i]+"="+dp[i]);
         }
         return Math.min(dp[n-2],dp[n-1]);
    }
    public static void main(String args[])
    {
      int a[]={16,19,10,12,18,2, 5, 3, 1, 7, 3, 4};
      int n=a.length;
      System.out.println(minCostClimbingStairs(a));
    }
}
