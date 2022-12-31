class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0,max=0;
        for(int x:weights)
        {
            min=Math.max(min,x);
            max+=x;
        }
        while( min < max )
        {
           int mid=(max+min)/2;
           if(getDays(weights,mid)<=days)
           {
               max=mid;
           }
           else{
               min=mid+1;
           }
        }
        return min;
    }
    public int getDays(int weights[],int mid)
    {
        int days=0,sum=0;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i]>mid)
            {
                days++;
                sum=0;
            }
            sum+=weights[i];
        }
        if(sum>0)
        {
            days++;
        }
        return days;
    }
}
