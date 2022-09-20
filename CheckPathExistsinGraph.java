import java.util.*;
public class CheckPathExistsinGraph {
    boolean found=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length<=1)
            return true;
        Map<Integer,List<Integer>>graph=new HashMap();
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            graph.put(i,new ArrayList<>());
        }
        for(int edge[]:edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        DFS(edges,graph,source,destination,visited);
        return found;
    }
    public void DFS(int edges[][], Map<Integer,List<Integer>>graph,int start,int destination,boolean visited[])
    {
        if(found||visited[start])
        {
            return;
        }
        visited[start]=true;
        for(int neigh:graph.get(start))
        {
            if(neigh==destination)
            {
                found=true;
                break;
            }
            if(!visited[neigh])
            {
                DFS(edges,graph,neigh,destination,visited);
            }
        }
    }
}
