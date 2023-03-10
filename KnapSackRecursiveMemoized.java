class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSackUtil(int memo[][],int W, int wt[], int val[], int n) 
    { 
        // your code here 
        if(n-1 == 0){
            if(wt[n-1] <= W){
                return val[n-1];
            }else return 0;
        }
        if(memo[n-1][W]!=-1) return memo[n-1][W];
        int include=0,exclude=0;
        if(wt[n-1]<=W){
            include=val[n-1]+knapSackUtil(memo,W-wt[n-1],wt,val,n-1);
        }
        exclude=knapSackUtil(memo,W,wt,val,n-1);
        memo[n-1][W]=Math.max(include,exclude);
        return memo[n-1][W]; 
    } 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
        int memo[][]=new int[n][W+1];
        for(int row[]:memo) Arrays.fill(row,-1);
        return knapSackUtil(memo,W,wt,val,n);
    } 
}

