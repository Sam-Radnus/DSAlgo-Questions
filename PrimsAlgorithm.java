class Solution{
    static class Pair{
        int node;
        int weight;
        public Pair (int node,int weight){
            this.node=node;
            this.weight=weight;
        }
    }
	static int spanningTree(int V, int E, int matrix[][]){
	    // Code Here. 
	    List<List<Pair>>edges=new ArrayList<>();
	    int sum=0;
	    for(int i=0;i<V;i++){
	        List<Pair>temp=new ArrayList<>(); 
	        edges.add(temp);
	    }
	    for(int i=0;i<matrix.length;i++){
	        edges.get(matrix[i][0]).add(new Pair(matrix[i][1],matrix[i][2]));
	        edges.get(matrix[i][1]).add(new Pair(matrix[i][0],matrix[i][2]));
	    }
	    boolean visited[]=new boolean[V];
	    PriorityQueue<Pair>pq=new PriorityQueue<Pair>((a,b)->{
	        if(a.weight==b.weight) return a.node-b.node;
	        return a.weight-b.weight;
	    });
	    pq.add(new Pair(0,0));
	    while(pq.size()!=0){
	        Pair curr=pq.remove();
	        int node=curr.node;
	        int weight=curr.weight;
	        if(!visited[node]){
	            sum+=weight;
	            visited[node]=true;
	             for(int i=0;i<edges.get(node).size();i++){
	                 int adjNode=edges.get(node).get(i).node;
	                 int adjWeight=edges.get(node).get(i).weight;
	                 if(!visited[adjNode]) pq.add(new Pair(adjNode,adjWeight));
	        }
	        }
	       
	    }
	    return sum;
	}
}
