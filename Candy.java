class Solution {
    public int candy(int[] ratings) {
        int dp[]=new int[ratings.length];
        int sum=0;
        int n=ratings.length;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                dp[i]=1+dp[i-1];
            }
            sum+=dp[i];
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&dp[i]<=dp[i+1]){
                sum-=dp[i];
                dp[i]=1+dp[i+1];
                sum+=dp[i];
            }
        }
        return sum+ratings.length;
    }
}
