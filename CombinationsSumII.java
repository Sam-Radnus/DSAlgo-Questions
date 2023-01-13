class Solution {
    List<Integer>temp=new ArrayList<>();
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        helper(nums,0,target);
        return ans;
    }
    public void helper(int[]nums,int start,int target){
        if(target==0)
        {
            //Collections.sort(temp);
            if(ans.contains(temp)) return;
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=start;i<nums.length;i++)
        {
            if(nums[i]>target) break;
            if(i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            helper(nums,i+1,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}
