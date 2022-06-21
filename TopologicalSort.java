import java.util.*;
public class TopologicalSort {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
           Map<Integer,List<Integer>>adjList=new HashMap<Integer,List<Integer>>();
           int inDegree[]=new int[numCourses];
           int topologicalSort[]=new int [numCourses];
           for(int i=0;i<prerequisites.length;i++)
           {
               int dst=prerequisites[i][0];
               int src=prerequisites[i][1];
               List<Integer>lst=adjList.getOrDefault(src,new ArrayList<Integer>());
               lst.add(dst);
               adjList.put(src,lst);
               inDegree[dst]+=1;
           }
           Queue<Integer>q=new LinkedList<>();
           for(int i=0;i<numCourses;i++)
           {
               if(inDegree[i]==0)
               {
                   q.add(i);
               }
           }
           int i=0;
           while(!q.isEmpty())
           {
               int node=q.remove();
               topologicalSort[i++]=node;
               if(adjList.containsKey(node))
               {
                   for(Integer neighbour: adjList.get(node))
                   {
                       inDegree[neighbour]-=1;
                       if(inDegree[neighbour]==0)
                       {
                           q.add(neighbour);
                       }
                   }
               }
           }
           if(i==numCourses)
           {
               return topologicalSort;
           }
           return new int[0];

    }
}
