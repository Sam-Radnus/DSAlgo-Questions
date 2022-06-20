import java.util.*;
public class DepthFirstSearch {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Graph creation
    DepthFirstSearch(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }
    public void DFS(int s)
    {
        visited[s]=true;
        System.out.println(s+" ");
        Iterator<Integer>itr=adjLists[s].listIterator();

        while(itr.hasNext())
        {
            int element=itr.next();
            if(!visited[element])
               DFS(element);
        }
    }
    public static void main(String args[]) {
        DepthFirstSearch g = new DepthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS(2);
    }

}
