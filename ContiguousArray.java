import java.util.stream.*;
public class ContiguousArray {
    public static int sumofnums(int ar[],int start,int end)
    {
        int sum=0;
        int i;
        for(i=start;i<=end;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
    public static void main(String args[]) {

        //int nums[] = {0, 0, 0, 0, 0, 1, 1, 1};
        int nums[]={0,1,0};
        int start=0;


        int end=nums.length-1;
        while(end-start!=1) {
              int sum=sumofnums(nums,start,end);
              System.out.println(sumofnums(nums,start,end));
              int mid=(start+end)/2;
              System.out.println("median"+(mid+1));
            if(mid==sum && (end-start)%2==0)
            {
                break;
            }
              if(Math.max(nums[start],nums[end])==nums[start]) {
                  start++;
              }
              else {
                  end--;
              }

        }
        System.out.println(end);
    }
}
