class TrieNode{
    boolean isWord;
    TrieNode children[]=new TrieNode[26];
    int prefixCount=0;
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
            ws.prefixCount++;
        }
        ws.isWord=true;
    }
    public String longestCommonPrefix(String[] strs) {
        for(String str:strs) insert(str);
        StringBuffer sb=new StringBuffer();
        TrieNode res=root;
        String resf=strs[0];
        for(int i=0;i<resf.length();i++)
        {
            char c=resf.charAt(i);
            if(res.children[c-'a'].prefixCount==strs.length){
                sb.append(c);
                res=res.children[c-'a'];
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
