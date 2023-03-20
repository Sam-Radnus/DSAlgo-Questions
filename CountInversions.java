class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    static long merge(long arr[],int  l,int  m,int  r){
        int i,j;
        i=l;
        j=m+1;
        int k=0;
        long temp[]=new long[r-l+1];
        long inversionCount=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                inversionCount+=(m-i+1);
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=m){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=r){
            temp[k]=arr[j];
            k++;
            j++;
        }
        k=0;
        for(i=l;i<=r;i++) arr[i]=temp[k++];
        return inversionCount;
        
    }
    static long mergeSort(long arr[],int  start,int  end){
        long  inversionCount=0;
        if(start<end){
            int mid=start+(end-start)/2;
            inversionCount+=mergeSort(arr,start,mid);
            inversionCount+=mergeSort(arr,mid+1,end);
            inversionCount+=merge(arr,start,mid,end);
        }
        return inversionCount;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        //System.out.println(Arrays.toString(arr))
        return mergeSort(arr,0,arr.length-1);
    }
}
