import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x)
    {
        int rev=0;
        int rem=0;
        while (x != 0) {
                rem = x % 10;
                if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
                {
                    return 0;
                }
                if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
                {
                    return 0;
                }
                rev = rev * 10 + rem;
                x = x / 10;
            }
             /*
             LINE #12 when x=2147483647 then rev == Integer.MAX_VALUE/10 => 214748364 and rem is greater than 7 then
             reverse is definetly overflowing
             Similarlry for
             LINE #13 when x=-214748364
             then reverse * 10 = -2147483640
             this means that rem must be in the range -8 , -7 ,-6 , -5, -4 etc to avoid overflow
              */
        return rev;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        try {
            int x = Sc.nextInt();
            System.out.println(x);
            System.out.println(reverse(x));
        }catch (InputMismatchException e)
        {
            System.out.println("0");
        }
    }
}
