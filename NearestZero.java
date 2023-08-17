class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<ArrayList<Integer>>queue=new LinkedList<>();
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                   dp[i][j]=0;
                   ArrayList<Integer>ar=new ArrayList<>();
                   ar.add(i);
                   ar.add(j);
                   queue.offer(ar);
                }
                else{
                    dp[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        while(!queue.isEmpty()){
            ArrayList<Integer>temp=queue.poll();
            int x=temp.get(0);
            int y=temp.get(1);
            int dir[][]={{0,1},{0,-1},{-1,0},{1,0}};
            for(int i=0;i<dir.length;i++){
                int nx=dir[i][0]+x;
                int ny=dir[i][1]+y;
                if(nx<0||ny<0||nx>=m||ny>=n) continue;
                if(dp[nx][ny]>dp[x][y]+1){
                    dp[nx][ny]=dp[x][y]+1;
                    ArrayList<Integer>a=new ArrayList<>();
                    a.add(nx);
                    a.add(ny);
                    queue.offer(a);
                }
            }
        }
        return dp;
    }
}
