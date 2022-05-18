import java.util.Arrays;

public class Sorting_Selection {
    public static void selectionSort(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[j]<ar[min_index])
                    min_index=j;
            }
            int temp=ar[i];
            ar[i]=ar[min_index];
            ar[min_index]=temp;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String args[])
    {
        selectionSort(new int[]{2,3,1,9,8,5,4});
    }
}
