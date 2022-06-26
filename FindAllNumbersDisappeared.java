public class FindAllNumbersDisappeared {
    public void swap(int nums[],int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer>list=new ArrayList<>();
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i])
            {
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                list.add(i+1); //a number we are expecting to be present there
            }
        }
        return list;
    }
}
