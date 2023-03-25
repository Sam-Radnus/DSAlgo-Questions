class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        if(n>m) return medianOfArrays(m,n,b,a);
        int low=0;
        int high=n;
        int medianPos=(m+n+1)/2;
        while(low<=high){
             int mid1=(low+(high-low)/2);
             int mid2=medianPos-mid1;
             int l1=mid1==0?Integer.MIN_VALUE:a[mid1-1];
             int l2=mid2==0?Integer.MIN_VALUE:b[mid2-1];
             int r1=mid1==n?Integer.MAX_VALUE:a[mid1];
             int r2=mid2==m?Integer.MAX_VALUE:b[mid2];
             
             if(l1<=r2 && l2<=r1){
                 if((m+n)%2==0) return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                 else return Math.max(l1,l2);
             }
             else if(l1>r2) high=mid1-1;
             else low=mid1+1;
        }
        return 0.0;
        
    }
}
