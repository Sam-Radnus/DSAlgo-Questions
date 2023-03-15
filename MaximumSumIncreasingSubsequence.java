class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    if(arr==null || arr.length<1) return 0; 
	    int sum=arr[0];
	    int dp[]=new int[n];
	    for(int i=0;i<n;i++) dp[i]=arr[i];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j]){
	                dp[i]=Math.max(dp[i],dp[j]+arr[i]);  
	                sum=Math.max(sum,dp[i]);
	            }
	        }
	    }
	    return sum;
	}  
}
