class Solution {
    public int countPairs(List<List<Integer>> ar, int k) {
         HashMap<String,Integer>set=new HashMap<>();
         for(int i=0;i<ar.size();i++){
             int x=ar.get(i).get(0);
             int y=ar.get(i).get(1);
             String s=x+" "+y;
             if(set.containsKey(s)){
                 set.put(s,set.get(s)+1);
             }
             else{
                 set.put(s,1);
             }
         }
        
         int ans=0;
         for(int i=0;i<ar.size();i++){
             int x=ar.get(i).get(0);
             int y=ar.get(i).get(1);
             if(set.get(x+" "+y)>1){
                 set.put(x+" "+y,set.get(x+" "+y)-1);
             }
             else{
                 set.remove(x+" "+y);
             }
             for(int j=0;j<=k;j++){
                 int x2=x^j;
                 int y2=(k-j)^y;
                 if(set.containsKey(x2+" "+y2)){
                    ans+=set.get(x2+" "+y2);
                 } 
             }
        }
        return ans;
    }
}
