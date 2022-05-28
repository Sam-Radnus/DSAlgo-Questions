public class twoZeroes {
    public static void printArray(int nums[])
    {
        System.out.print("Array:");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void moveZeroes2(int []nums)
    {
        if(nums.length<=1){
            return;
        }
        int totalZeroes=0;
        int newArr[]=new int[nums.length];
        int x=0,j=nums.length-1,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                totalZeroes++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                newArr[x]=nums[i];
                x++;
            }
            else{
                newArr[j]=nums[i];
                j--;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            nums[i]=newArr[i];
        }

    }
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int ptr1=0,ptr2=1,temp;
        while(ptr2<nums.length)
        {
            if(nums[ptr1]!=0 && nums[ptr2]!=0)
            {
                ptr1++;
                ptr2++;
            }
            else if(nums[ptr1]==0 && nums[ptr2]==0)
            {
                ptr2++;
            }
            else if(nums[ptr1]==0 && nums[ptr2]!=0)
                {
                    temp=nums[ptr1];
                    nums[ptr1]=nums[ptr2];
                    nums[ptr2]=temp;

                    ptr1++;
                    ptr2++;
                }
            else if(nums[ptr1]!=0)
            {
              ptr1++;
            }
        }

    }
    public static void main(String args[])
    {
         int ar[]={0,1,0,3,12};
         printArray(ar);
         moveZeroes2(ar);
         printArray(ar);
    }
}
