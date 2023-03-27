class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M) return -1;
        int low=1,high=0;
        for(int i=0;i<N;i++){
            low=Math.min(low,A[i]);
            high=high+A[i];
        }
        boolean possible=false;
        while(low<=high){
           int mid=(low+high)/2;
           if(getStudents(A,mid)<=M) high=mid-1;
           else low=mid+1;
        }
        return low;
    }
    public static int getStudents(int ar[],int mid){
        int p=0,students=0;
        for(int x:ar){
            if((p+x)>mid){
                students++;
                p=x;
                if(p>mid) return mid;
            }
            else p+=x;
        }
        if(p>0) students++;
        return students;
    }
};
