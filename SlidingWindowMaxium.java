class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n<=1) return nums;
        Deque<Integer>dq=new ArrayDeque<>();
        int res[]=new int[n-k+1];
        for(int i=0;i<k;i++){
            while(dq.size()>0 && dq.getLast()<nums[i]) dq.removeLast();
            dq.addLast(nums[i]);
        }
        int idx=0;
        res[idx++]=dq.getFirst();
        for(int i=k;i<n;i++){
            if(nums[i-k]==dq.getFirst()) dq.removeFirst();
            while(dq.size()>0 && dq.getLast()<nums[i]) dq.removeLast();
            dq.addLast(nums[i]);
            res[idx++]=dq.getFirst();
        }
        return res; 
    }
}
