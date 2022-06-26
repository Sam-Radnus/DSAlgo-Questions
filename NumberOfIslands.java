public class NumberOfIslands {
    public static void markAsIsland(char[][]grid,int x,int y,int rows,int cols)
    {
        if(x<0||y<0||x>=rows||y>=cols||grid[x][y]!='1')//grid[x][y]!=1 denotes to check whether it is a zero or a visited index
        {
            return;
        }
        if(grid[x][y]=='1')
        {
            grid[x][y]='2';
        }
        markAsIsland(grid,x+1,y,rows,cols);
        markAsIsland(grid,x,y+1,rows,cols);
        markAsIsland(grid,x-1,y,rows,cols);
        markAsIsland(grid,x,y-1,rows,cols);
    }
    public static int numIslands(char[][] grid) {
        int nums_of_islands=0;
        if(grid.length==0)
        {
            return 0;
        }
        int rows=grid.length;
        int cols=grid[0].length;
        //System.out.println(rows);
        //System.out.println(cols);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1')
                {
                    markAsIsland(grid,i,j,rows,cols);
                    //System.out.println("island");
                    nums_of_islands++;
                }
            }
        }
        return nums_of_islands;
    }
}
