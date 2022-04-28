public class SearchMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid_i=matrix.length-1,mid_j=0;
        boolean found=false;
        if(matrix==null){ return false; }
        while( mid_i >= 0 && mid_j < matrix[0].length)
        {
            if(matrix[mid_i][mid_j]==target)
            { return true; }
            else
            if(matrix[mid_i][mid_j] < target)
            {
                mid_j ++ ;
            }
            else
            if(matrix[mid_i][mid_j] > target)
            {
                mid_i -- ;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int ar[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        printArray5(ar[0]);

    }
}
