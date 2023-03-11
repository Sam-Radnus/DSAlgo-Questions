class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0) return 0;
        return subsetSum(arr,sum/2,0)?1:0;
    }
    static boolean subsetSum(int arr[],int sum,int index){
        if(sum==0) return true;
        if(sum<0||index==arr.length) return false;
        return subsetSum(arr,sum-arr[index],index+1) || subsetSum(arr,sum,index+1);
    }
}
