import java.math.BigInteger;
import java.util.*;
public class RemoveDigit {
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static String removeDigit(String number, char digit) {
        List<String>digits=new ArrayList<>();
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit) {
                digits.add(charRemoveAt(number, i));
            }
        }
        Collections.sort(digits);
        return digits.get(digits.size()-1);
    }
    public static void main(String args[])
    {
        System.out.println(removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471"
                ,'3'));
    }
}
