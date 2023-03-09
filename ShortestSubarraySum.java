class Solution {
    static class Pair{
    int el;
    int index;
    Pair(int el,int index){
        this.el=el;
        this.index=index;
    }
   }
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.el-a.el);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<k;i++) pq.offer(new Pair(arr[i],i));
        res.add(pq.peek().el);
        for(int i=k;i<n;i++){
            pq.offer(new Pair(arr[i],i));
            while(pq.peek().index<=i-k)
                pq.poll();
            res.add(pq.peek().el);
        }
        return res;
    }
}
