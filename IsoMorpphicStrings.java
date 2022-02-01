import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsoMorpphicStrings {
    public static boolean isIsomorphic(String s,String t)
    {
        boolean isomorph=false;
        if(s.length()!=t.length())
        {
            return isomorph;
        }
        Map<Character,Character> m1=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
      //  Map<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (!m1.containsValue(t.charAt(i))) {
                m1.put(s.charAt(i), t.charAt(i));
            }
        }
        System.out.println(m1);
        for(int j=0;j<s.length();j++)
        {
            s1[j]=m1.get(s1[j]);
        }
        int x=0;
        for(int i=0;i<s1.length;i++) {
            System.out.println(s1[i]+":"+t1[i]);
            if(s1[i]==t1[i])
            {
                isomorph=true;
            }
            else
            {
                isomorph=false;
                break;
            }
        }
        System.out.println(x);
        return isomorph;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str1=Sc.nextLine();
        String str2=Sc.nextLine();
        System.out.println("is "+str1+" and "+str2+" Isomorphic:"+isIsomorphic(str1,str2));
    }
}
