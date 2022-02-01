import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x)
    {
        int r=0;
        int x1=x;
        int y=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            r=x%10;
            y=y*10+r;
            x=x/10;
        }
        //System.out.println(x1);
        //System.out.println(y);
        if(x1==y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int x=Sc.nextInt();
        System.out.println("Is "+x+" a Palindrome:"+isPalindrome(x));
    }
}
