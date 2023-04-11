class Pair{
    int src;
    int val;
    Pair(int src,int val){
        this.src=src;
        this.val=val;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->(x.val-y.val));
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S]=0;
        pq.offer(new Pair(S,0));
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int node=p.src;
            int weight=p.val;
            for(int i=0;i<adj.get(node).size();i++){
                int adjNode=adj.get(node).get(i).get(0);
                int distt=adj.get(node).get(i).get(1);
                if(distt+weight<dist[adjNode]){
                    dist[adjNode]=distt+weight;
                    pq.offer(new Pair(adjNode,distt+weight));
                }
            }
        }
        return dist;
    }
}
