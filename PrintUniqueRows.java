class GfG
{
    static class TrieNode{
       
        TrieNode nodes[]=new TrieNode[2];
        boolean isEnd;
        
        TrieNode()
        {
            
            nodes[0]=null;
            nodes[1]=null;
        }
    }
    static TrieNode root=new TrieNode();
    public static void insert(int ar[][])
    {
        for(int j=0;j<ar.length;j++){
        TrieNode ws=root;
        for(int i=0;i<ar[j].length;i++)
        {
            if(ws.nodes[ar[j][i]]==null) ws.nodes[ar[j][i]]=new TrieNode();
            ws=ws.nodes[ar[j][i]];
        }
        ws.isEnd=true;
        }
    }
    
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        insert(a);
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            TrieNode fr=root;
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<c;j++)
            {
                fr=fr.nodes[a[i][j]];
                temp.add(a[i][j]);
            }
            if(fr.isEnd) {
                res.add(temp);
                fr.isEnd=false;
            }
        }
        return res;
    }
}
