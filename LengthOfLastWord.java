public class LengthOfLastWord {
    public static int lengthOfLastWord(String s)
    {
        int len=0;

        s=s.trim();
        if(s.length()<=1)
        {
            return s.length();
        }
        s=" "+s;
        int i=s.length()-1;
        while(s.charAt(i--)!=' ')
        {

            len++;
        }
        return len;

    }
    public static void main(String args[])
    {
      System.out.println(lengthOfLastWord("a"));
    }
}
