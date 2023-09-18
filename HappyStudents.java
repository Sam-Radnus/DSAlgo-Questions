class Solution {
    public int countWays(List<Integer> nums) {
        int count=nums.contains(0)?0:1;
        Collections.sort(nums);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            int x=nums.get(i);
            res.add(x);
            int temp=0;
            boolean pos=true;
            if(i<nums.size()-1 && nums.get(i+1)<=res.size()){
                pos=false;
            }
            if((x<res.size() || x==0) && pos){
                count+=1;
            }
        }
        return count;
    }
}
