class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int res[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=1;j<mat[0].length;j++)
            {
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int i=1;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]+=mat[i-1][j];
            }
        }
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                res[i][j]=getSum(mat,i,j,k);
            }
        }
        return res;

    }
    public static int getSum(int mat[][],int i,int j,int k)
    {
       int rows=mat.length;
       int cols=mat[0].length;
       int endRow=Math.min(rows-1,i+k);
       int endCol=Math.min(cols-1,j+k);
       int sum=mat[endRow][endCol];
       int n1=j-k-1>=0?mat[endRow][j-k-1]:0;
       int n2=i-k-1>=0?mat[i-k-1][endCol]:0;
       int n3=(i-k-1>=0)&&(j-k-1>=0)?mat[i-k-1][j-k-1]:0;
       return sum-n1-n2+n3;
    }
}
