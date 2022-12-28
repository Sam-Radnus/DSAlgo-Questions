class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>maxHeap=new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer>mp:map.entrySet())
        {
            maxHeap.add(mp);
        }
        ArrayList<Integer>res=new ArrayList<>();   
        while(res.size()<k)
        {
           Map.Entry<Integer,Integer>val=maxHeap.poll();
           res.add(val.getKey());    
        }
      
        int[] res2 = res.stream().mapToInt(i -> i).toArray();
        return res2;
    }
}
