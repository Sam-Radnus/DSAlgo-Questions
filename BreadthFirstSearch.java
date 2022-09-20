import java.util.*;
import java.util.LinkedList;
public class BreadthFirstSearch {
    private int V;
    private LinkedList<Integer>adj[];
    BreadthFirstSearch(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }

    }
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    public void BFS(int s)
    {
        boolean []visited=new boolean[V];
        LinkedList<Integer>queue=new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);

        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.println(s+" ");

            Iterator<Integer>itr=adj[s].listIterator();
            while(itr.hasNext())
            {
                int x=itr.next();
                if(!visited[x]){ visited[x]=true; queue.add(x);}
            }
        }
    }
    public void DFS(int s){

    }
    public static void main(String []args)
    {
        BreadthFirstSearch g = new BreadthFirstSearch(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }
}
