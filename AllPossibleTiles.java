import java.util.Arrays;

public class AllPossibleTiles {
    int count=0;
    public int tiles(String tiles)
    {
        char ar[]=tiles.toCharArray();
        Arrays.sort(ar);

        return count-1;
    }
    public  void helper(char ar[],boolean used[])
    {
        count++;
        for(int i=0;i<ar.length;i++)
        {                      //  A A
            if(used[i]||(i>0 && ar[i] == ar[i-1] && !used[i-1]))//to remove duplications
            {
                continue;
            }
            used[i]=true;
            helper(ar,used);
            used[i]=false;
        }
    }
    public static void main(String args[])
    {

    }
}
