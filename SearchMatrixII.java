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

    }
}
