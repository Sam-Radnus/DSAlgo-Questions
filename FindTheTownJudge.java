import java.util.*;
public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if(trust.length<1)
        {
            return n==1?1:-1;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i[]:trust)
        {
            map.put(i[1],map.getOrDefault(i[1],0)+1);
            map.put(i[0],map.getOrDefault(i[0],0)+(-1));//to check if the town judge trusts anyone else
        }
        for(int i:map.keySet())
        {
            if(map.get(i)==n-1)
                return i;
        }
        return -1;
    }
}
