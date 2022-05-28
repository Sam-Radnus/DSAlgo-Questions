public class ArrangingCoins {
    public int arrangeCoins(int n) {
        //here we have to find out the number of rows which we can fill
        long left=0,right=n;
        long k,curr;
        while(left<=right)
        {
            k=left+(right-left)/2;
            curr=k*(k+1)/2;

            if(curr==n){return (int)k;}

            if(curr>n){right=k-1;}
            else{left=k+1;}
        }
        return (int)right;
    }
}
