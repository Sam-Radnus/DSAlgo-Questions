class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        
        int []res=new int[2];
        PriorityQueue<Job>pq=new PriorityQueue<>((a,b)->b.profit-a.profit);
        int dp[]=new int[arr.length+1];
        int count=0;
        for(Job j:arr) pq.add(j);
        int total=0;
        
        while(!pq.isEmpty()){
            Job j=pq.poll();
            if(dp[j.deadline]==0){
                dp[j.deadline]=j.id;
                total+=j.profit;
                count++;
               
            }
            else{
                int curr=j.deadline;
                while(curr>0 && dp[curr]!=0) curr--;
                if(curr>0 && dp[curr]==0){
                    dp[curr]=j.id;
                    total+=j.profit;
                    count++;
                }
                
            }
        }
        res[0]=count;
        res[1]=total;
        return res;
    }
}
