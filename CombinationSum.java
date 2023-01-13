class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> currCombination = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombination(candidates,target,0);
        return ans;
    }
    
    public void findCombination(int[] candidates, int target,int start){
        if(target==0)
        {
            ans.add(new ArrayList<>(currCombination));
            return;
        }
        if(target<0)
            return;
        for(int i=start;i<candidates.length;++i)
        {
            currCombination.add(candidates[i]);
            findCombination(candidates,target-candidates[i],i);
            currCombination.remove(currCombination.size()-1);
        }
    }
}
