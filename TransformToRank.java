import java.util.*;
public class TransformToRank {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res[]=new int[arr.length];
        int nums[]=new int[arr.length];
        int i;
        System.arraycopy(arr, 0, nums, 0, arr.length);
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++)
        {
            map.putIfAbsent(arr[i],map.size()+1);
        }
        for(i=0;i<arr.length;i++)
        {
            res[i]=map.get(nums[i]);

        }
        return res;
    }
    public static void main(String args[])
    {

    }
}
