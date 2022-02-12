public class ShortestDistanceToChar {
    public static int[] shortestToChar(String s, char c) {
        char ar[]=s.toCharArray();
        int res[]=new int[ar.length];
        int j=0,k=0,away=0;
        for(int i=0;i<ar.length;i++) {
            if (ar[i] == c) {
                res[i] = 0;
            } else {
                j = i;
                k = i;
                while (ar[j] != c && ar[k] != c && j >= 0 && k < ar.length) {
                    if(j!=0)
                       j--;
                    if(k!=ar.length-1)
                       k++;
                    if(j==0||k==ar.length-1)
                    {
                        away = Math.max(Math.abs(i - j), Math.abs(i - k));
                    }
                    else {
                        away = Math.min(Math.abs(i - j), Math.abs(i - k));
                    }
                    res[i] = away;
                   // System.out.println(away);
                }

            }
        }
        return res;
    }
    public static void main(String args[])
    {
        String str="abaa";
        int ar[]=new int[str.length()];
        ar=shortestToChar(str,'b');
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
