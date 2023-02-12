public class Solution {
    static int canGetEvenSum(int n, int []a) {
        // Write your code here.
        int i=0,x=0,y=0;
        while(i<n)
        {
            if(a[i]%2==0) x++;
            else y++;
            i++;
        }
        if(y%4==0) return 1;
        if(y%4==3) return 1;
        if(y%4==2) return 0;
        if(x%2==1) return 1;
        
        return 0; 
    }
}
