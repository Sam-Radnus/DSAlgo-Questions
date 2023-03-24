class Solution {
    public long kthElement( int a[], int b[], int n, int m, int k) {
        if(n>m) return kthElement(b,a,m,n,k);
        int low=Math.max(0,k-m);
        int high=Math.min(k,n);
        while(low<=high){
            int mid2=(low+(high-low)/2);
            int mid1=k-mid2;
            long l1=mid2==0?Integer.MIN_VALUE:a[mid2-1];
            long l2=mid1==0?Integer.MIN_VALUE:b[mid1-1];
            long r1=mid2==n?Integer.MAX_VALUE:a[mid2];
            long r2=mid1==m?Integer.MAX_VALUE:b[mid1];
            if(l1<=r2 && l2<=r1) return Math.max(l1,l2);
            else if(l1>r2) high=mid2-1;
            else low=mid2+1;
        }
        return -1;
    }
}
