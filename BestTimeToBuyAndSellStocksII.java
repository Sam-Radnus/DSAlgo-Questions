class Solution {
    int profit=0;
    public int maxProfit(int[] prices) {
        helper(prices,0,prices.length);
        return profit;
    }
    public void helper(int prices[],int start,int end)
    {
        if(start>=end) return ;
        for(int i=start;i<end-1;i++)
        {
            int j=i+1;
            if(prices[i]>prices[i+1]) continue;
            while(j + 1 < end  && prices[j]<prices[j+1])
                  j++; 
            profit+=prices[j]-prices[i];
            helper(prices,j+1,end);
            break;
        }
    }
}
