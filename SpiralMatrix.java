import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int mat[][])
    {
        List<Integer>result=new LinkedList<Integer>();
        if(mat==null||mat.length==0)
        {
            return result;
        }
        int startRow=0,endRow=mat.length-1;
        int startCol=0,endCol=mat[0].length-1;
        int dir=0;
        int i,j;
        while(startRow<=endRow && startCol<=endCol)
        {
            switch(dir){
                case 0:
                    //Traverse Right
                    for(i=startCol;i<=endCol;i++)
                    {
                        result.add(mat[startRow][i]);
                    }
                    startRow++;
                    break;
                case 1:
                    //Traverse Down
                    for(j=startRow;j<=endRow;j++)
                    {
                        result.add(mat[j][endCol]);
                    }
                    endCol--;
                    break;
                case 2:
                    //Traverse Left
                    for(i=endCol;i>=startCol;i--)
                    {
                        result.add(mat[endRow][i]);
                    }
                    endRow--;
                    break;
                case 3:
                    //Traverse Up
                    for(j=endRow;j>=startRow;j--)
                    {
                        result.add(mat[j][startCol]);
                    }
                    startCol++;
                    break;
            }
            dir=(dir+1)/4;
        }
        return result;
    }
    public static void main(String args[])
    {

    }
}
