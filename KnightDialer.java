class Solution {
    public int knightDialer(int n) {
        if(n==1)
        {
            return 10;
        }
        long cur[]=new long[10];
        Arrays.fill(cur,1);
        cur[5]=0;
        long res=0,M=(int)1e9+7;
        while((n--)>1)
        {
           long next[]=Arrays.copyOf(cur,10);
           next[0]=(cur[4]+cur[6])%M;
           next[1]=(cur[6]+cur[8])%M;
           next[2]=(cur[7]+cur[9])%M;
           next[3]=(cur[4]+cur[8])%M;
           next[4]=(cur[3]+cur[9]+cur[0])%M;
           next[6]=(cur[1]+cur[7]+cur[0])%M;
           next[7]=(cur[6]+cur[2])%M;
           next[8]=(cur[1]+cur[3])%M;
           next[9]=(cur[2]+cur[4])%M;
           cur=next;
        }
        for(long N:cur)
            res=(res+N)%M;
        return (int)res;    
    }
}
