import java.util.Arrays;

public class SortSeparately {
    public static int[] sortEvenOdd(int[] nums) {
        if(nums.length<=2)
        {
            return nums;
        }
        int i,j,k,temp;
        for(k=0;k<2;k++){
            for(i=k;i<nums.length-2;i+=2){
                for(j=k;j<nums.length-2;j+=2)
                {
                    if(k==0 && nums[j]>=nums[j+2])        //EVEN AND ASCENDING
                    {
                        temp=nums[j];
                        nums[j]=nums[j+2];
                        nums[j+2]=temp;
                    }
                    if(k==1&& nums[j]<=nums[j+2])        //ODD AND ASCENDING
                    {
                        temp=nums[j];
                        nums[j]=nums[j+2];
                        nums[j+2]=temp;
                    }
                }
            }
        }
      return nums;
    }
    public static void main(String args[])
    {
        int nums[]={4,1,2,3};
        System.out.println(Arrays.toString(nums));
        sortEvenOdd(nums);
        System.out.println(Arrays.toString(nums));
    }
}
