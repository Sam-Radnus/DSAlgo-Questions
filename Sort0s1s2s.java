class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        for(int i=0;i<3;i++)
        {
            int start=0;
            int end=a.length-1;
            while(start<end)
            {
                while(start<a.length && a[start]<=i) start++;//find the first non zero element
                while(end >= 0 && a[end]!=i) end--;
                if(start>end) break;
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
       // System.out.println(Arrays.toString(a));
    }
}
