import java.util.*;

public class LetterCombinationphNO {
    public static void LetterCombinationPh(List<String> result,String digits,String current,int index,String Mapping[])
    {
       if(index==digits.length())
       {
           result.add(current);
           return;
       }
       String letters=Mapping[digits.charAt(index)-'0'];
       for(int i=0;i<digits.length();i++)
       {
           LetterCombinationPh(result,digits,current+letters.charAt(i),index+1,Mapping);
       }
    }
    public List<String> letterCombinations(String digits)
    {
        List<String> result=new ArrayList<String>();
        if(digits.length()==0)
        {
            return result;
        }
        String Mapping[]={
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz",
        };
        LetterCombinationPh(result,digits,"",0,Mapping);
        return result;
    }

    public static void main(String args[])
    {
        int i;
        Scanner Sc=new Scanner(System.in);


    }
}
