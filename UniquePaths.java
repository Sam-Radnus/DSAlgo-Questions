class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0||n==0)
        {
            return 0;
        }
        int dp[][]=new int[m][n];
        return numPaths(m-1,n-1,dp);
    }
    public int numPaths(int m,int n,int dp[][])
    {
        if(m==0 || n==0)
        {
           return 1;
        }
        if(dp[m-1][n]==0) dp[m-1][n]=numPaths(m-1,n,dp);
        if(dp[m][n-1]==0) dp[m][n-1]=numPaths(m,n-1,dp);
        return dp[m][n-1]+dp[m-1][n];
    }
}
