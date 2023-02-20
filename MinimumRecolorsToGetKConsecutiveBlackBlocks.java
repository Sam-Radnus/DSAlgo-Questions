class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(blocks.length()==1){
            return blocks.charAt(0)=='W'?1:0;
        }
        int ops=0;
        int n=blocks.length();
        int start=0,end=0;
        int res=Integer.MAX_VALUE;
        while(end<n)
        {
            char c=blocks.charAt(end);
            if(c=='B' && end-start+1<=k) {end++;}
            else if(c=='W' && end-start+1<=k)
            {
               ops++;
               end++;
            }
            else {
               res=Math.min(ops,res);
               if(blocks.charAt(start)=='W') ops--;
               start++;  
            }  
        }
        return Math.min(res,ops);
    }
}
