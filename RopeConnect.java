class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long>pq=new PriorityQueue<Long>();
        for(int i=0;i<arr.length;i++) pq.add(arr[i]);
        long tcost=0;
        while(pq.size()>=2)
        {
            long a=pq.poll();
            long b=pq.poll();
            long res=a+b;
            tcost+=res;
            pq.add(res);
            
        }
        return tcost;
    }
}
