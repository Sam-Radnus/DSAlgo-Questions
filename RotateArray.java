public class RotateArray {
    public static void Rotate(int ar[][])
    {
        int temp,n=ar.length;
        for(int i=0;i<(n+1)/2;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                temp=ar[n-j-1][i];
                ar[n-j-1][i]=ar[n-i-1][n-j-1];
                ar[n-i-1][n-j-1]=ar[j][n-i-1];
                ar[j][n-i-1]=ar[i][j];
                ar[i][j]=temp;
            }
        }
    }
    public static void main(String args[])
    {

    }
}
