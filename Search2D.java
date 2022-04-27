public class Search2D{
    public boolean binary_search(int[]matrix,int target,int start,int end)
    {
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(matrix[mid]==target)
            {
                return true;
            }
            else{
                if(matrix[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found=false;
        int i,j,end;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                end=matrix[0].length-1;
                if(matrix[i][end] < target)
                {
                    break;
                }
                else
                {
                    found=binary_search(matrix[i],target,0,end+1);

                }

            }
            if(found)
            { break;}
        }
        return found;
    }
    public static void main(String args[])
    {

    }
}
