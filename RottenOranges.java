class Solution {
    int dr[]={0,1,0,-1};
    int dc[]={1,0,-1,0};
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int countOne=0;
        int rows=grid.length;
        int cols=grid[0].length;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]==1)
                   countOne++;
                if(grid[i][j]==2){
                   q.add(new int[]{i,j});
                   visited[i][j]=true;
                }
            }
        }
        if(countOne==0)
        {
            return 0;
        }
        int count=0;
        int elapsed=-1;
        while(!q.isEmpty())
        {
            elapsed++;
            int size=q.size();//number of rotten oranges;
            for(int j=0;j<size;j++)
            {
                int cur[]=q.poll();
                for(int k=0;k<4;k++)
                {
                    int r=cur[0]+dr[k];
                    int c=cur[1]+dc[k];
                    if(r>=0 && r<rows && c>=0 && c<cols && !visited[r][c] && grid[r][c]==1)
                    {
                        visited[r][c]=true;
                        count++;
                        q.add(new int[]{r,c});
                    }
                }
            }
        }
            return count==countOne?elapsed:-1;
        }
}

