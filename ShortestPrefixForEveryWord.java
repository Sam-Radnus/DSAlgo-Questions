class Solution {
    private static class TrieNode{
        char data;
        TrieNode children[]=new TrieNode[26];
        int prefixCount=0;
        boolean isWord;
        TrieNode(){ 
           
        }
        TrieNode(char val)
        {
            TrieNode node=new TrieNode();
            node.data=val;
            
        }
}
    private static TrieNode root;
    private static void insert(String word)
    {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(ws.children[c-'a']==null)
            {
                ws.children[c-'a']=new TrieNode(c);
            }
            ws=ws.children[c-'a'];
            ws.prefixCount++;
        }
        ws.isWord=true;
    }
    private static String search(String word)
    {
        TrieNode ws=root;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            sb.append(c);
            if(ws.children[c-'a'].prefixCount==1) break;
            ws=ws.children[c-'a'];
        }
        return sb.toString();
    }
    static String[] findPrefixes(String[] arr, int N) {
        // code here
        root=new TrieNode(' ');
        for(String str:arr)
        {
            insert(str);
        }
        String res[]=new String[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=search(arr[i]);
        }
        return res;
    }
};
