public class shortestToChar {
    public static int shortestLength(String s,char c)
    {
        int N=s.length();
        int [] ans=new int[N];
        int prev=Integer.MIN_VALUE/2;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c){
                prev=i;
            }
            ans[i]=i-prev;
        }
        prev=Integer.MAX_VALUE/2;
        for(int i=N-1;i>=0;i--)
        {
            if(s.charAt(i)==c){
                prev=i;
            }
            ans[i]=Math.min(ans[i],prev);
        }
        return 'c';
    }
    public static void main(String args[])
    {
      // System.out.println(shortestLength("loveleetcode",'e'));

    }
}
