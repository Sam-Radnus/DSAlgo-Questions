class Solution {
    List<Integer>temp=new ArrayList<>();
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(1,n,k,0);
        return res;
    }
    public void helper(int start,int n,int k,int CSum)
    {
        if(temp.size()>k) return;
        if(CSum>n) return;
        if(temp.size()==k)
        {
            if(CSum==n && !res.contains(temp)) res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=start;i<10;i++)
        {
           int x=i%10;
           if(temp.contains(x)) continue;
           temp.add(x);
          // CSum+=x;
           helper(i,n,k,CSum+x);
           temp.remove(temp.size()-1);
           //CSum-=x;
        }
    }
}
