class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int start=0,end=0,count=0,temp=0,odd=0;
        while(end<n){
              if(nums[end]%2!=0) {
                 odd++;  
                 temp=0;
              }            
    
            while(odd==k){
                temp++;
                if(nums[start]%2!=0) odd--;
                start++;
            } 
            //end=extra;
            count+=temp;
          end++;
        }
        return count;
    }
}
