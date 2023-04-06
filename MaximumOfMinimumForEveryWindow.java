class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) 
    {
        // Your code here
        int prev[]=prevSmall(arr,n);
        int next[]=nextSmall(arr,n);
       
        int res[]=new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            int index=next[i]-prev[i]-1;
            res[index-1]=Math.max(res[index-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            res[i]=Math.max(res[i],res[i+1]);
        }
        return res;
    }
    static int[] prevSmall(int []arr,int n){
        int prev[]=new int[n];
        Stack<Integer>stck=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && arr[stck.peek()]>=arr[i]) stck.pop();
            if(stck.isEmpty())prev[i]=-1;
            else prev[i]=stck.peek();
            stck.push(i);
        }
        return prev;
    }
    static int[] nextSmall(int []arr,int n){
        int next[]=new int[n];
        Stack<Integer>stck=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && arr[stck.peek()]>=arr[i]) stck.pop();
            if(stck.isEmpty())next[i]=n;
            else next[i]=stck.peek();
            stck.push(i);
        }
        return next;
    }
}
