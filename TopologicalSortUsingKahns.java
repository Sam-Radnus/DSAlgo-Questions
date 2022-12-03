import java.util.*;
class Graphs{
   int V;
   List<Integer>adj[];
   Graphs(int V)
   {
       this.V=V;
       adj=new ArrayList[V];
       for(int i=0;i<V;i++){
           adj[i]=new ArrayList<Integer>();
       }
   }
   public void addEdge(int u,int v)
   {
           adj[u].add(v);
   }
   public void TopologicalSort()
   {

       int indegree[]=new int[V];
       for(int i=0;i<V;i++){
           for(int node:adj[i])
           {
               indegree[node]++;
           }
       }
       Queue<Integer>q=new LinkedList();
       for(int i=0;i<V;i++)
       {
           if(indegree[i]==0)
               q.add(i);
       }
       int cnt=0;
       Vector<Integer>topOrder=new Vector<Integer>();
       while(!q.isEmpty())
       {
           int u=q.poll();
           topOrder.add(u);
           for(int node:adj[u])
           {
               if(--indegree[node]==0)
               {
                   q.add(node);
               }
           }
           cnt++;

       }
       if(cnt!=V)
       {
           System.out.println("Cycle Exists");
       }
       for(int i:topOrder)
       {
           System.out.print(i+" ");
       }

   }
}
public class TopologicalSortUsingKahns {
    public static void main(String args[])
    {
        Graphs g = new Graphs(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println(
                "Following is a Topological Sort");
        g.TopologicalSort();
    }
}
