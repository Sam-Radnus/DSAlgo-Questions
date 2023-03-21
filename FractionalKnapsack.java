class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double ans=0;
        double ratio[][]=new double[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=arr[i].value/(double)arr[i].weight;
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        for(int i=n-1;i>=0;i--){
            int index=(int)ratio[i][0];
            if(W>=arr[index].weight){
                ans+=arr[index].value;
                W-=arr[index].weight;
            }
            else{
                ans+=(ratio[i][1]*W);
                W=0;
                break;
            }
        }
        return ans;
    }
}
