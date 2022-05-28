import java.util.Arrays;

public class Sorting_Insertion {
    public static void insertionSort(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            int key=ar[i];
            int j=i-1;
            while(j >= 0 && ar[j] > key)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String args[])
    {
        insertionSort(new int[]{2,5,3,8,9,4});
    }
}
