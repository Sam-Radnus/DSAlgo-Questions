public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
            {
                if((i==j)||j==(mat[0].length-i-1))
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {

    }
}
