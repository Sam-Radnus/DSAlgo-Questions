import java.util.*;
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites)
    {
        Map<Integer,List<Integer>>adjList=new HashMap<>();
        int topologicalOrder[]=new int[numCourses];
        int inDegree[]=new int[numCourses];

        for(int i=0;i<prerequisites.length;i++)
        {
            int dst=prerequisites[i][0];
            int src=prerequisites[i][1];
            List<Integer>lst=adjList.getOrDefault(src,new ArrayList<Integer>());
            lst.add(dst);
            adjList.put(src,lst);
            inDegree[dst]++;
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
            topologicalOrder[i++]=node;
            if(adjList.containsKey(node))
            {
                for(Integer neighbour:adjList.get(node))
                {
                    inDegree[neighbour]--;
                    if(inDegree[neighbour]==0)
                    {
                        q.add(neighbour);
                    }
                }
            }
        }
        if(i==numCourses)
        {
            return topologicalOrder;
        }
        return new int[0];
    }
    public static void main(String args[])
    {

    }
}
