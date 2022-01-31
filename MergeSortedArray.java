import java.util.*;
public class MergeSortedArray {
    public static void mergeArray(int ar1[],int ar2[],int start)
    {
         int result[]=new int[ar1.length+ ar2.length];
         System.arraycopy(ar1,0,result,0, ar1.length);
         System.arraycopy(ar2,start,result,ar1.length, ar2.length-1);
    }
    public static void merge(int []nums1,int m,int []nums2,int n)
    {
        int i=0,j=0,k=0;
        int ar[]=new int[m+n];
        while(i<m && j<n) {
            if (nums1[i] < nums2[j]) {
                ar[k++] = nums1[i++];
            } else {
                ar[k++] = nums2[j++];
            }
        }
        while(i<m) {
            ar[k++]=nums1[i++];
        }
        while(j<n) {
            ar[k++]=nums2[j++];
        }
    }
    public static void main(String args[])
    {
          int a[]={1,2,3};
          int b[]={2,5,6};
          merge(a,a.length,b,b.length);


    }
}
