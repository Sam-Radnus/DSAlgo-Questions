class Solution {
    int res=Integer.MAX_VALUE;
    int dp[][];
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        return helper(grid,grid.length-1,grid[0].length-1);
    }
    public int helper(int [][]grid,int i,int j)
    {

        if(i==0 && j==0) return grid[i][j];
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return 1000;
        if(dp[i][j]!=0) return dp[i][j];
        dp[i][j]=grid[i][j]+Math.min(helper(grid,i-1,j),helper(grid,i,j-1));
        return dp[i][j];
    }

}
