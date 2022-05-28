public class SpecialPositions_in_a_2DArray {
    public static int numSpecial(int[][] mat) {

        int i,j,res=0;
        int m=mat.length,n=mat[0].length;
        int col[]=new int[n];
        int row[]=new int[m];

        for(i=0;i<m;i++){
            for(j=0;j<n;j++)        {
                if(mat[i][j]==1)
                {
                    col[j]++;
                    row[i]++;
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==1 && col[j]==1 && row[i]==1)
                    res++;
            }
        }
        return res;


    }
    public static void main(String args[])
    {

    }
}
