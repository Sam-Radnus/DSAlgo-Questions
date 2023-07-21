class tuple{
    int distance;
    int x,y;
    public tuple(int distance,int x,int y){
        this.distance=distance;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int dist[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        PriorityQueue<tuple>pq=new PriorityQueue<>((a,b)->(a.distance-b.distance));
        pq.add(new tuple(0,0,0));
        while(pq.size()!=0){
            tuple t=pq.poll();
            if(t.x==m-1 && t.y==n-1) return t.distance;
            int r=t.x;
            int c=t.y;
            int dirs[][]={{-1,0},{0,1},{1,0},{0,-1}};
            for(int i=0;i<dirs.length;i++){
                int r1=dirs[i][0]+r;
                int c1=dirs[i][1]+c;
                if(r1>=0 && c1>=0 && r1<m && c1<n){
                    int d=Math.max(t.distance,Math.abs(heights[r1][c1]-heights[r][c]));
                    if(d<dist[r1][c1]){
                        dist[r1][c1]=d;
                        pq.add(new tuple(d,r1,c1));
                    }
                }
            }
        }
        return -1;
    }
}
