class Solution {
    int parent[];
    public int[] findRedundantConnection(int[][] edges) {
        parent=new int[edges.length+1];
        for(int i=0;i<edges.length;i++)
           parent[i]=i;
        for(int e[]:edges){
            if(find(e[0])==find(e[1]))
               return e;
            else
               union(e[0],e[1]);
        }
        return edges[0];
    }
    public int find(int x)
    {
        if(x==parent[x]) return x;
        return find(parent[x]);
    }
    public void union(int y,int x)
    {
        parent[find(y)]=x;
    }
}
