public class Mountainin {
    public static int peak(int ar[])
    {
        int maxEl=0,max=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(max<ar[i])
            {
                max=ar[i];
                System.out.println(i);
                maxEl=i;
            }
        }
        return maxEl;

    }
    public static void main(String args[])
    {
        int ar[]={0,2,1,0};
        System.out.println(peak(ar));
    }
}
