public class DutchFlag {
    //USED ONLY TO SWAP Os 1s AND 2s
    //DUTCH NATIONAL FLAG ALGO
    public static void DutchNationalFlag(int nums[])
    {
        int temp;
        int l=0,m=0,h=nums.length-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                temp=nums[l];
                nums[l]=nums[m];
                nums[m]=temp;
                l++;
                m++;
            }
            else
            if(nums[m]==1)
            {
                m++;
            }
            else
            if(nums[m]==2)
            {
                temp=nums[m];
                nums[m]=nums[h];
                nums[h]=temp;
                h--;
            }
        }
    }
    public static void printArray(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int nums[]={0,1,2,0,1,2};
        System.out.println("Before Sorting:");
        printArray(nums);
        DutchNationalFlag(nums);
        System.out.println("After Sorting:");
        printArray(nums);
    }
}
