import java.util.Arrays;

public class CycleSort {
    public static void swap(int nums[],int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static void cycleSort(int nums[])
    {
        int i=0;
        while(i< nums.length)
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
    }
    public static void main(String args[])
    {
        int nums[]={2,3,1,9,8,7,4,6,5};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
