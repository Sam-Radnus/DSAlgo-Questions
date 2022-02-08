public class CountTriplets {
    public static int countTriplets(int arr[])
    {
        int c=0;
        int val=0;
        for(int i=0;i<arr.length-1;i++)
        {
            val=arr[i];
            for(int k=i+1;k<arr.length;k++)
            {
                val=val^arr[k];
                if(val==0)
                {
                    c=c+(k-1);
                }
            }
        }
        return c;
    }
    public static void main(String args[])
    {

    }
}
