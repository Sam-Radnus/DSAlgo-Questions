class Solution {
    public static int solve(int n, int k, int[] stalls) {
        if(k>n) return -1;
        Arrays.sort(stalls);
        int low=1,high=stalls[n-1]-stalls[0];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlaceCows(stalls,n,mid,k)){
                res=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return res;
    }
    public static boolean canPlaceCows(int []ar,int N,int gap,int cows_to_be_placed){
         int cow=ar[0];
         int count=1;
         for(int i=1;i<N;i++){
             if(ar[i]-cow>=gap){
                 count++;
                 cow=ar[i];
             }
             if(count==cows_to_be_placed) return true;
         }
         return false;
    }
        
    
}
