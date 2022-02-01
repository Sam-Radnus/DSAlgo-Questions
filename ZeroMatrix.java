public class ZeroMatrix {
    public static int[][] setMatrixToZero(int ar[][]) {
        int rows = ar.length;   //NUMBER OF ROWS
        int columns = ar[0].length;//NUMBER OF COLUMNS
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(ar[i][j]==0)
                {
                    int ind=i-1;
                    while(ind>=0)                   //IF IT IS NOT THE FIRST ROW IN ORDER TO PROVIDE BACKTRACKING OR BACK TRAVERSAL
                    {
                        if(ar[ind][j]!=0)
                        {
                            ar[ind][j]=-1;
                        }
                        ind--;
                    }
                    ind=j-1;
                    while(ind>=0)                   //IF IT IS NOT THE FIRST ROW IN ORDER TO PROVIDE BACKTRACKING OR BACK TRAVERSAL
                    {
                        if(ar[i][ind]!=0)
                        {
                            ar[i][ind]=-1;
                        }
                        ind--;
                    }
                     ind=i+1;
                    while(ind<rows) {               //SETTING THE ENTIRE ROW AS -1
                        if (ar[ind][j] != 0) {
                            ar[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind=j+1;
                    while(ind<columns)             //SETTING THE ENTIRE COLUMN AS -1
                    {
                        if (ar[i][ind] != 0) {
                            ar[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        for(int t=0;t<rows;t++){
            for(int l=0;l<rows;l++)
            {
                if(ar[t][l]<=0)
                {
                    ar[t][l]=0;
                }
            }
        }
        return ar;
    }
    public static void main(String args[])
    {
       int ar[][]={{1,0,3},{4,0,5},{6,0,8}};
       int naturalArray[][];
       naturalArray=setMatrixToZero(ar);
       for(int i=0;i<naturalArray.length;i++){
           System.out.println();
           for(int j=0;j<naturalArray[0].length;j++){
               System.out.print(naturalArray[i][j]+" ");
           }
       }
    }
}
