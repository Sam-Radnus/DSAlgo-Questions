class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean canBreak[]=new boolean[n+1];
        canBreak[n]=true;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(canBreak[j] && wordDict.contains(s.substring(i,j)))
                {
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[0];
    }
}
