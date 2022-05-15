public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int startRow=0,endRow=n-1;
        int i=0;
        int startCol=0,endCol=n-1;
        int val=1;
        int dir=0;
        while( startRow <= endRow && startCol <= endCol)
        {
            switch(dir){
                case 0:
                    for(i=startCol;i<=endCol;i++)
                        matrix[startRow][i]=(val++);
                    startRow++;
                    break;
                case 1:
                    for(i=startRow;i<=endRow;i++)
                        matrix[i][endCol]=(val++);
                    endCol--;
                    break;
                case 2:
                    for(i=endCol;i>=startCol;i--)
                        matrix[endRow][i]=(val++);
                    endRow--;
                    break;
                case 3:
                    for(i=endRow;i>=startRow;i--)
                        matrix[i][startCol]=(val++);
                    startCol++;
                    break;
            }
            dir=(dir+1)%4;
        }
        return matrix;
    }
    public static int[][] generateMatrixII(int n)
    {
        int [][]result=new int[n][n];
        int d=0;
        int row=0;
        int col=0;
        int dir[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int cnt=1;
        while(cnt<=n*n)
        {
            result[row][col]=cnt++;
            int r=Math.floorMod(row+dir[d][0],n);
            int c=Math.floorMod(col+dir[d][1],n);

            if(result[r][c]!=0){ d=(d+1)%4;}

            row+=dir[d][0];
            col+=dir[d][1];
        }
        return result;
    }
    public static void main(String args[])
    {
        int [][]spiral=generateMatrixII(3);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }

    }
}
