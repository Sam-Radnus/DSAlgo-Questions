public class ReverseBit {
   public static int reverseBit(int n)
   {
       int ans=0;
       for(int i=0;i<32;i++)
       {
           int returnBitPos=31-i;
           boolean isOne=((1<<i)&n)!=0;
           if(isOne)  ans|=1<<returnBitPos;
       }
       return ans;
   }
    public static void main(String args[])
    {

    }
}
