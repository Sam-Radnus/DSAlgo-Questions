public class SpiralMatrixIII {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int dr[]=new int []{0,1,0,-1};  //direction row
        int dc[]=new int []{1,0,-1,0};  //direction column

        int ans[][]=new int[R*C][2];  //co ordinates
        int t=0;

        ans[t++]=new int[]{r0,c0};
        if(R*C == 1) return ans;

        for(int k=1;k<2*(R+C);k+=2)  //2*(R+C) just to make sure the spiral ends outside of the bounds or the defined grid area
        {
            for(int i=0;i<4;i++) //i determines the direction
            {
                int dk=k+(i/2); //number of steps in this direction
                for(int j=0;j<dk;j++)
                {
                    r0+=dr[i];
                    c0+=dc[i];
                    if( 0<=r0 && r0 < R && 0<=c0 && c0<C)
                    {
                        ans[t++]=new int[]{r0,c0};
                        if(t==R*C) return ans;
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
