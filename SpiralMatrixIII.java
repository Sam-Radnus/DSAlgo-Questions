public class SpiralMatrixIII {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int matrix[][]=new int[rows][cols];
        int dr[]=new int[]{0,1,0,-1};
        int dc[]=new int[]{1,0,-1,0};

        int test=0;
        int ans[][]=new int[rows*cols][2];
        if(ans.length==1)
        {return ans;}
        int dk=0;
        ans[test++]=new int[]{rStart,cStart};

        for(int k=1;k<2*(rows+cols);k+=2)
        {
            for(int i=0;i<4;i++)
            {
                dk=k+(i/2);
                for(int j=0;j<dk;j++)
                {
                    rStart+=dr[i];
                    cStart+=dc[i];
                    if(0<=rStart && 0<=cStart && rStart<rows && cStart<cols)
                    {
                        ans[test++]=new int[]{rStart,cStart};
                        if(test==(rows*cols)){return ans;}
                    }
                }
            }
        }
        throw null;
    }
    public static void main(String args[])
    {

    }
}
