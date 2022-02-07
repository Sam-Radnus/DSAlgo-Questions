import java.util.Arrays;

public class ReArrangedNum {
    public static long smallestNumber(long num) {
        boolean isNegative=num<0;
        num=Math.abs(num);
        int i;
        char temp;
        char [] charArray=(""+num).toCharArray();
        long ans=0;
        Arrays.sort(charArray);
        String ansStr="";
        if(isNegative)
        {

            for(i=charArray.length-1;i>=0;i--)
            {
                ansStr=ansStr+charArray[i];
            }
            ans=-Long.parseLong(ansStr);
        }
        else
        {
            i=0;
            for(i=0;i<charArray.length;i++)
            {
                if(charArray[i]!='0')
                {
                    break;
                }
            }
            if(i<=(charArray.length-1))
            {

                temp=charArray[i];
                charArray[i]=charArray[0];
                charArray[0]=temp;
            }
            for(i=0;i<charArray.length;i++)
            {
                ansStr=ansStr+charArray[i];
            }
            ans=Long.parseLong(ansStr);
        }
        return ans;

    }
    public static void main(String args[])
    {

    }
}
