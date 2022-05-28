public class RemoveElement {
    public static int removeElement(int nums[],int val)
    {
        if(nums.length==1 && nums[0]==val)
        {
            return 0;
        }
        int i,countNum=0,j=0,x=nums.length-1;
        int newArr[]=new int[nums.length];
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==val) {
                countNum++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                newArr[j]=nums[i];
                j++;
            }
            else{
                newArr[x]=nums[i];
                x--;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            nums[i]=newArr[i];
        }
        return j;
    }
    public static void main(String args[])
    {

    }
}
