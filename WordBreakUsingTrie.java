class TrieNode{
    boolean isWord;
    TrieNode children[]=new TrieNode[26];
}
class Solution {
    TrieNode root=new TrieNode();
    public void insert(String str)
    {
        TrieNode ws=root;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(ws.children[c-'a']==null) ws.children[c-'a']=new TrieNode();
            ws=ws.children[c-'a']; 
        }
        ws.isWord=true;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String str:wordDict)
        {
            insert(str);
        }
        char str[]=s.toCharArray();
        boolean dp[]=new boolean[str.length+1];
        dp[0]=true;
        for(int i=0;i<str.length;i++)
        {
            if(!dp[i]) continue;
            TrieNode cur=root;
            int j=i;
            while(j<str.length && cur.children[str[j]-'a']!=null)
            {
                cur=cur.children[str[j++]-'a'];
                if(cur.isWord) dp[j]=true;
            }
        }
        return dp[str.length];
    }
}
