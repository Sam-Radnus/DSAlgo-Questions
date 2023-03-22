class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0;
        int count=0,ans=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                count++;
                ans=Math.max(ans,count);
            }
            else{
                j++;
                count--;
            }
        }
        return ans;
    }
    
}

