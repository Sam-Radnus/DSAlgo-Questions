public class Sum_of_All_XOR_sets {
    public static int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public static int helper(int nums[],int start,int currentXOR)
    {
        //THIS MEANS WE HAVE PROCESSED THE ENTIRE SUBSET
        if(start==nums.length){ return currentXOR; }

        int withElement=helper(nums,start+1,currentXOR^nums[start]);

        int withoutElement=helper(nums,start+1,currentXOR);

        return withElement + withoutElement;
    }
    public static void main(String args[])
    {

    }
}
