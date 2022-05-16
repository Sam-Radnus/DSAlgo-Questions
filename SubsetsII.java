public class SubsetsII {
    List<List<Integer>>res=new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,res,temp,0);
        return res;
    }
    public void helper(int nums[],List<List<Integer>>res,List<Integer>temp,int index){

        res.add(new ArrayList(temp));
        if(index==nums.length)
        {

            return;
        }
        int prev=-11;
        //helper(nums,res,temp,index+1);
        for(int i=index;i<nums.length;i++)
        {
            if(prev!=nums[i]){
                temp.add(nums[i]);
                helper(nums,res,temp,i+1);
                temp.remove(temp.size()-1);
                prev=nums[i];
            }
        }

    }
    public static void main(String args[])
    {

    }
}
