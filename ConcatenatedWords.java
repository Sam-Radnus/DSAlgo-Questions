class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String>res=new ArrayList<>();
        Set<String>preDict=new HashSet<>();
        Arrays.sort(words,new Comparator<String>(){
            public int compare(String s1,String s2)
            {
                return s1.length()-s2.length();
            }
        });
        for(String str:words)
        {
            if(canForm(str,preDict))
            {
                res.add(str);
            }
            preDict.add(str);
        }
        return res;
    }
    public boolean canForm(String word,Set<String>preDict)
    {
        if(preDict.contains(word))
            return false;
        boolean dp[]=new boolean[word.length()+1];
        dp[0]=true;
        for(int i=1;i<=word.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(!dp[j]) continue;
                if(preDict.contains(word.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[word.length()];

    }
}
