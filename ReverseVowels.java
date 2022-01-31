import java.util.Arrays;

public class ReverseVowels {
    public static boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public static String ReverseVowels(String s)
    {
        if(s.length()<=1)
        {
            return s;
        }
        int ptr1=0,ptr2=s.length()-1;
        System.out.println(ptr1);
        System.out.println(ptr2);
        char temp;
        char ar[]=s.toCharArray();
        while(ptr1<ptr2 && ptr2>ptr1)
        {
            if(isVowel(ar[ptr1])&&isVowel(ar[ptr2]))
            {
               temp=ar[ptr1];
               ar[ptr1]=ar[ptr2];
               ar[ptr2]=temp;
                System.out.println("ptr1:"+ptr1);
                System.out.println("ptr2:"+ptr2);
               ptr1++;
               ptr2--;
            }
            else
            if(isVowel(ar[ptr2]))
            {
               ptr1++;
            }
            else
            {
                ptr2--;
            }


        }
        return Arrays.toString(ar);
    }
    public static void main(String args[])
    {
        System.out.println(ReverseVowels("Euston saw I was not Sue."));
    }
}
