public class AllPossibleSubsets {
    public static int findTiles(String str)
    {
        return helper(str,"",0,0);
    }
    public static int helper(String str,String substr,int index,int sum)
    {

        if(substr.length()==str.length())
        {
            return sum;
        }
        System.out.println(substr);
        helper(str,substr,index+1,sum+1);
        helper(str,substr+str.charAt(index),index+1,sum+2);
        return sum;
    }
    public static void main(String args[])
    {
       System.out.println(findTiles("AAB"));
    }
}
