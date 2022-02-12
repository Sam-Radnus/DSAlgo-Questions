public class DifferenceinIfs {
    public static boolean isEven(int x)
    {
        if(x%2==0)
        {
            return true;
        }
        else
        if(x%2!=0)
        {
            return false;
        }
        return false;
    }
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("is "+i+" Even:"+isEven(i));
        }
    }
}
