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
    public static void main(String args[])
    {

    }
}
