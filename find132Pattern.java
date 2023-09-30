class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<=2){
            return false;
        }
        int second=Integer.MIN_VALUE;
        Stack<Integer>stck=new Stack<>();
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]<second){
                return true;
            }
            while(!stck.isEmpty() && nums[j]>stck.peek()){
                second=stck.pop();
            }
            stck.push(nums[j]);
        }
        return false;
    }
}
