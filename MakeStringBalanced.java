class Solution {
    public int minSwaps(String s) {
        if(s.length()==0){
            return 0;
        }
        char ar[]=s.toCharArray();
        int last=ar.length-1;
        int count_open=0;
        int count_close=0;
        int swaps=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='['){
                count_open+=1;
            }
            else{
                count_close+=1;
            }
            if(count_open<count_close){
                while(last>0 && ar[last]!='['){
                    last-=1;
                }
                ar[i]='[';
                ar[last]=']';
                last-=2;
                swaps+=1;
                count_open+=1;
                count_close-=1;
            }
        }
        return swaps;
    }
}
