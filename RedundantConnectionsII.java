class Solution {
   
    public int[] findRedundantDirectedConnection(int[][] edges) {
         int ans1=-1;
         int ans2=-1;
         int inDegree[]=new int[edges.length+1];
         Arrays.fill(inDegree,-1);
         for(int i=0;i<edges.length;i++)
         {
             if(inDegree[edges[i][1]]==-1) inDegree[edges[i][1]]=i;
             else{
                 ans1=inDegree[edges[i][1]];
                 ans2=i;  //DOUBLE PARENT
             }
         }
         UnionFind uf=new UnionFind();
         uf.CreateParent(edges.length+1);
         for(int edge[]:edges)
         {
            if(ans2!=-1 && edge==edges[ans2]) continue;  //FIND THE LAST CASE
            int u=uf.find(edge[0]);
            int v=uf.find(edge[1]);
            if(u==v) return ans1==-1?edge:edges[ans1];
            uf.union(edge[0],edge[1]);    
         }
         return edges[ans2];
    }
    
}
class UnionFind{
    int parent[];
    public void UnionFind(){
      
    }
    public void CreateParent(int n)
    {
       parent=new int[n];
       for(int i=0;i<parent.length;i++)
          parent[i]=i;
    }
    public int find(int x)
    {
        if(parent[x]==x) return x;
        else return find(parent[x]);
    }
    public void union(int x,int y)
    {
        int parX=find(x);
        int parY=find(y);
        parent[parX]=parY;
    }

}
