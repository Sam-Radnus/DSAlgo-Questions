class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int dp[][];
    static int eggDropHelper(int n, int k) 
	{
	    // Your code here
	    if(k==0||k==1) return k;
	    if(n==1) return k;
	    if(dp[n][k]!=-1) return dp[n][k];
	    int mn=Integer.MAX_VALUE;
	    for(int i=1;i<k;i++){
	        int low,high;
	        if(dp[n-1][i-1]!=-1)low=dp[n-1][i-1];
	        else{
	            dp[n-1][i-1]=eggDropHelper(n-1,i-1);
	            low=dp[n-1][i-1];
	        }
	        if(dp[n][k-i]!=-1)high=dp[n][k-i];
	        else{
	            dp[n][k-i]=eggDropHelper(n,k-i);
	            high=dp[n][k-i];
	        }
	        int temp=1+Math.max(low,high);
	        mn=Math.min(temp,mn);
	    }
	    dp[n][k]=mn;
	    return dp[n][k];
	}
	static int eggDrop(int n, int k) 
	{
	    dp=new int[n+1][k+1];
	    for(int row[]:dp) Arrays.fill(row,-1);
	    return eggDropHelper(n,k);
	}
}
