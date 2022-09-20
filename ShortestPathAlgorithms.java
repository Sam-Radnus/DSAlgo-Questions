public class ShortestPathAlgorithms {
    static final int V=9;
    public int minDist(int minDist[],Boolean sptSet[])
    {
        int min_index=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<V;i++)
        {
             if(sptSet[i]==false&&minDist[i]<=min){
                 min=minDist[i];
                 min_index=i;
             }
        }
        return min_index;
    }
    void printSolution(int dist[])
    {
        System.out.println("Vertex \t\t Distance from Source");
        for(int i=0;i<V;i++)
        {
            System.out.println(i+" \t\t "+dist[i]);
        }
    }
    public void dijkstrasAlgorithm(int Graphs[][],int src){
        Boolean sptSet[]=new Boolean[V];
        int minDist[]=new int[V];
        for(int i=0;i<V;i++)
        {
            minDist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }
        minDist[src]=0;
        for(int count=0;count<V-1;count++){
            int u=minDist(minDist,sptSet);
            sptSet[u]=true;
            for(int v=0;v<V;v++)
            {
                if(Graphs[u][v]!=0 && !sptSet[v] && minDist[u]!=Integer.MAX_VALUE && minDist[v]>minDist[u]+Graphs[u][v]) {
                    minDist[v]=minDist[u]+Graphs[u][v];
                }
            }
        }
        printSolution(minDist);
    }
    public static void main(String args[])
    {
        /* Let us create the example graph discussed above
         */
        int graph[][]
                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        ShortestPathAlgorithms t = new ShortestPathAlgorithms();

        // Function call
        t.dijkstrasAlgorithm(graph, 0);
    }
}
