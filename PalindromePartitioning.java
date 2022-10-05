class Solution {
    public List<List<String>> partition(String s) {
        int len=s.length();
        boolean dp[][]=new boolean[len][len];
        List<List<String>>res=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        helper(0,s,temp,res,dp);

        return res;
    }
    public void helper(int start,String s,List<String>temp,List<List<String>>res,boolean dp[][])
    {
        if(start>=s.length())
        {
            res.add(new ArrayList<>(temp));
        }
        for(int end=start;end<s.length();end++)
        {
            if(s.charAt(end) == s.charAt(start) && (end-start<=2 || dp[start+1][end-1]))
            {
                dp[start][end]=true;
                temp.add(s.substring(start,end+1));
                helper(end+1,s,temp,res,dp);
                temp.remove(temp.size()-1);
            }
        }
    }
}