class Solution {
    public boolean isValid(int[] nums,int mid,int p){
        int count=0;
        for(int i=0;i<nums.length-1;){
           if(Math.abs(nums[i]-nums[i+1])<=mid){
              count++; 
              i+=2;
           } 
           else{
              i+=1;
           }
           if(count==p) return true;
        }
       return false;
    }
    public int minimizeMax(int[] nums, int p) {
      
        Arrays.sort(nums);
        int l=0;
        int r=(int)Math.pow(10,9);
        int res=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(isValid(nums,mid,p)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}
