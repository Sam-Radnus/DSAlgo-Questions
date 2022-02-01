import java.util.*;
public class ContainsDuplicate {
    public static long getBucketId(long val,long width){
        return val<0?(val+1L)/width-1L:val/width;
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t)
    {
      int n=nums.length;
      if(n<=1) return false;  //ONLY ONE ELEMENT
      if(t<0) return false;   //T IS NEGATIVE

      long width=(long)t+1;
      Map<Long,Long> map=new HashMap<>();
      for(int i=0;i<n;i++)
      {
          long bucketId=getBucketId((long)nums[i],width);
          if(map.containsKey(bucketId))
          {
              return true;
          }
          if(map.containsKey(bucketId-1L) && Math.abs(map.get(bucketId-1)-nums[i])<width)
          {
              return true;
          }
          if(map.containsKey(bucketId+1L) && Math.abs(map.get(bucketId+1)-nums[i])<width)
          {
              return true;
          }
          map.put(bucketId,(long)nums[i]);
          if(i-k>=0)
          {
              long oldBucketId=getBucketId((long)nums[i-k],width);
              map.remove(oldBucketId);
          }
      }
      return false;
    }
    public static void main(String args[])
    {
        int ar[]={1,5,9,1,5,9};
        System.out.println("Does the Array contain Duplicate Elements:"+containsNearbyAlmostDuplicate(ar,2,3));
    }
}
