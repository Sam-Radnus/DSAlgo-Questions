
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    List<Integer>res=new ArrayList<>();
    for(int i=0,j=0;i<nums1.length && j < nums2.length ; i++,j++)
    {
        if(nums1[i]==nums2[j])
           res.add(nums1[i]);
        else 
        if(nums1[i]>nums2[j])
           i--;
        else
           j--;      
    }
    int result[]=new int[res.size()];
    for(int i=0;i<result.length;i++)
        result[i]=res.get(i);
    return result;    
}
}
