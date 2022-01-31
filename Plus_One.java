import java.util.Arrays;
public class Plus_One {
    public static void main(String args[])
    {
        int ar[]={8,9,9,9};
        int newAr[]=new int[ar.length+1];
        //output=1000
        int len=ar.length-1;
        ar[len]=ar[len]+1;
        if(ar[len]>9)
        {
            for(int i=len;i>0;i--)
            {
                ar[i]=0;
                ar[i-1]=ar[i-1]+1;
                if(ar[i-1]<=9)
                {
                    break;
                }
            }
            if(ar[0]>=10)
            {
                newAr[0]=1;
                for(int i=1;i< newAr.length;i++)
                {
                    newAr[i]=ar[i-1];
                    if(newAr[i]>9)
                    {
                        newAr[i]=0;
                    }
                }
                System.out.println(Arrays.toString(newAr));
            }

        }
        System.out.println(Arrays.toString(ar));


    }
}
