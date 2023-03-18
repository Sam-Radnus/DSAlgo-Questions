class Solution
{
    public int longestPalinSubseq(String str)
    {
        //code here
        StringBuffer strBuff=new StringBuffer(str);
        String rts=strBuff.reverse().toString();
        int n=str.length();
        
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(str.charAt(i-1)==rts.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
