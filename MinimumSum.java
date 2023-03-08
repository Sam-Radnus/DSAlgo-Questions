class Solution {
    String solve(int[] arr, int n) {
        // code here
        if(n==1) return String.valueOf(arr[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int x:arr) pq.add(x);
        StringBuffer first=new StringBuffer();
        StringBuffer second=new StringBuffer();
        StringBuffer sb=new StringBuffer();
        while(pq.size()!=0){
            first.append(pq.poll());
            if(pq.size()!=0)
               second.append(pq.poll());
        }
        int i,j,sum=0,carry=0;
        for(i=first.length()-1,j=second.length()-1;i>=0 || j>=0 || carry==1;i--,j--){
            int a=i<0?0:first.charAt(i)-'0';
            int b=j<0?0:second.charAt(j)-'0';
            sum=a+b+carry;
            if(sum>0) sb.append(sum%10);
            carry=sum/10;
        }
        return sb.reverse().toString();
        
    }
}
