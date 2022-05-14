import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);//remove duplicate
        List<Integer>temp=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        helper(ans,temp,nums,used);
        //System.out.println(ans);
        return ans;
    }
    public void helper(List<List<Integer>>ans, List<Integer> temp, int nums[], boolean used[])
    {
        if(temp.size()==nums.length)
        {
            //System.out.println()
            ans.add(new  ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                if(used[i]|| i>0 && nums[i]==nums[i-1] && !used[i-1])
                {
                    continue;
                }
                used[i]=true;
                temp.add(nums[i]);
                helper(ans,temp,nums,used);
                used[i]=false;
                temp.remove(temp.size()-1);

            }
        }
        public static void main(String args[])
        {

        }
}
