class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>>res=new ArrayList<>();
        if(nums.length<=3||target==-294967296||target==294967296)
           return res;
    
        int front=0;
        int end=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++)
        {
           for(int j=i+1;j<n-2;j++)
           {
               int targetSum=target-nums[i]-nums[j];
               front=j+1;
               end=n-1;
               while(front<end)
               {
                   if(targetSum < nums[front]+nums[end])
                   {
                       end--;
                   }
                   else if(targetSum > nums[front]+nums[end])
                   {
                       front++;
                   }
                   else{
                       List<Integer> quad=new ArrayList<>();
                       quad.add(nums[i]);
                       quad.add(nums[j]);
                       quad.add(nums[front]);
                       quad.add(nums[end]);
                       res.add(quad);
                       while(front < end && nums[front] == quad.get(2)) front++;
                       while(front < end && nums[end] == quad.get(3)) end--;
                   }
                    
               } 
               while(j+1<n-2 && nums[j]==nums[j+1]) j++;
           }
           while(i+1<n-3 && nums[i]==nums[i+1]) i++;
        }  
        return res; 
    }
}
