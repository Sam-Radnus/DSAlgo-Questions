import java.util.*;
import java.util.LinkedList;
import java.util.Map;
public class BreadthFirstSearch2 {
    Map<Integer,ArrayList<Integer>>graph=new HashMap<>();
    boolean visited[]=new boolean[5];
    public  void addEdge(int g,int s)
    {
        //System.out.println(graph.get(1));
        graph.get(g).add(s);
        graph.get(s).add(g);
    }
    public  void printEdges()
    {
        for(int key:graph.keySet())
        {
            System.out.print("Neighbours of "+key+" are:");
            for(int neighbours:graph.get(key))
            {
                System.out.print(neighbours+" ");
            }
            System.out.println();
        }
    }
    public  void BFS(int s)
    {
        boolean visited[]=new boolean[5];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty())
        {
            int neighbour=q.remove();
            for(int adj:graph.get(neighbour)) {
                if (!visited[adj]) {
                    System.out.print(adj+" ");
                    visited[adj] = true;
                    q.add(adj);
                }
            }
            //System.out.println();
        }
    }
    public void DFS(int s)
    {

        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        System.out.print(s+" ");
        for(int neighbour:graph.get(s)) {
            if(!visited[neighbour]){
                     DFS(neighbour);
            }
        }

    }
    public static void main(String args[])
    {
       BreadthFirstSearch2 bfs=new BreadthFirstSearch2();
       for(int i=0;i<5;i++)
       {
           bfs.graph.put(i,new ArrayList<>());
       }
       bfs.addEdge(0,1);
       bfs.addEdge(0,2);
       bfs.addEdge(0,3);
       bfs.addEdge(2,4);
       //bfs.addEdge(1,2);
       bfs.printEdges();
       System.out.print("BFS Traversal:");
       bfs.BFS(0);
       System.out.println();
       System.out.print("DFS Traversal:");
       bfs.DFS(0);
    }
}
