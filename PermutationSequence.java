class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer>numbers=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            numbers.add(i);
        }
        String ans="";
        numbers.add(n);
        k=k-1;
        while(true){
            int index=k/fact;
            ans=ans+numbers.get(index);
            numbers.remove(index);
            if(numbers.size()==0) break;
            k=k-(fact*index);
            fact=fact/numbers.size();
        }
        return ans;
    }
}
