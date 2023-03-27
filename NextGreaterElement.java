class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stck=new Stack<>();
        int res[]=new int[nums.length];
        int n=nums.length*2;
        for(int index=n-1;index>=0;index--){
            int i=index%(nums.length);
            if(stck.isEmpty()){
               res[i]=-1;  
            } 
            else {
                while(!stck.isEmpty() && stck.peek()<=nums[i]) stck.pop();
                if(!stck.isEmpty()){ 
                    res[i]=stck.peek(); 
                }
                else res[i]=-1;
            }
            stck.push(nums[i]);
        }
        return res;
    }
}
