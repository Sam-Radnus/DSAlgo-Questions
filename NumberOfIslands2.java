public class NumberOfIslands2 {
    public static void helper(char grid[][],int rows,int cols,int x,int y)
    {
        if(x<0||x>=rows||y<0||y>=cols||grid[x][y]!='1')
        {
            return ;
        }
        grid[x][y]='2';
        helper(grid,rows,cols,x+1,y);
        helper(grid,rows,cols,x,y+1);
        helper(grid,rows,cols,x-1,y);
        helper(grid,rows,cols,x,y-1);
    }
    public static int islandCounter(char[][]grid)
    {
        int nums_of_islands=0;
        if(grid.length==0)
        {
            return grid.length;
        }
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1')
                {
                    nums_of_islands+=1;
                    helper(grid,rows,cols,i,j);
                }
            }
        }
        return nums_of_islands;
    }
    public static void main(String args[])
    {
        char [][]islands={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        System.out.println(islandCounter(islands));
    }
}
