import java.util.*;
public class ZeroMatrix2 {
    public static void zeroFreeArray(int ar[][])
    {
        int rows=ar.length;
        int columns=ar[0].length;
        int dummy1[]=new int[rows];
        int dummy2[]=new int[columns];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++) {
                if (ar[i][j] == 0) {
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++) {
                if (dummy1[i]==0||dummy2[j]==0) {
                    ar[i][j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            System.out.println();
            for(int j=0;j<columns;j++) {
                System.out.print(ar[i][j]+" ");
            }
        }


    }
    public static void main(String args[])
    {
         int ar[][]={{1,2,3},{4,0,5},{6,7,8}};
         zeroFreeArray(ar);
    }
}
