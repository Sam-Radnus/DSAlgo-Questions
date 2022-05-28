import java.util.ArrayList;
import java.util.List;

public class PermutationsI {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>tempList=new ArrayList<>();
        helper(ans,tempList,nums);
        return ans;
    }
    public void helper(List<List<Integer>>ans, List<Integer> tempList, int nums[])
    {
        if(tempList.size()==nums.length)
        {
            ans.add(new ArrayList<>(tempList));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(tempList.contains(nums[i]))
            {
                continue;
            }
            tempList.add(nums[i]);
            helper(ans,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
    public static void main(String args[])
    {

    }
}
