public class Subsets {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        helper(nums,0,temp,res);
        return res;
    }
    public void helper(int nums[],int index,List<Integer>temp,List<List<Integer>> res)
    {
        //System.out.println(index);ragon

        if(index==nums.length)
        {
            res.add(new ArrayList(temp));
            return;
        }
        //System.out.println(temp);
        temp.add(nums[index]);
        helper(nums,index+1,temp,res);
        temp.remove(temp.size()-1);
        helper(nums,index+1,temp,res);
    }
    public static void main(String args[])
    {

    }
}
