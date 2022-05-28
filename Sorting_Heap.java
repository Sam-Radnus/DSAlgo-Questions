import java.util.Arrays;

public class Sorting_Heap {
    public static void sort(int ar[])
    {
        int n=ar.length;
        for(int i=n/2-1;i>=0;i--)
            heapify(ar,n,i);

        for(int i=n-1;i>=0;i--)
        {
            int temp=ar[0];
            ar[0]=ar[i];
            ar[i]=temp;
            heapify(ar,i,0);
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void heapify(int ar[],int n,int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && ar[largest]<ar[l])
            largest=l;

        if(r<n && ar[largest]<ar[r])
            largest=r;

        if(largest!=i)
        {
            int temp=ar[largest];
            ar[largest]=ar[i];
            ar[i]=temp;
            heapify(ar,n,largest);
        }
    }
    public static void main(String args[])
    {
          sort(new int[]{5,4,1,3,9,8,-5});
    }
}
