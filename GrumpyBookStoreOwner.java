class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start=0,end=0;
        int n=customers.length;
        int extraSum=0,sum=0,numSat=Integer.MIN_VALUE;
        while(end<n)
        {
           if(grumpy[end]==1) sum+=customers[end];
           else extraSum+=customers[end];
           if(end-start+1==minutes)
           {
               numSat=Math.max(numSat,sum);
               if(grumpy[start]!=0) sum-=customers[start];
               start++;
           }
           end++;

        }
        return extraSum+numSat;
    }
}
