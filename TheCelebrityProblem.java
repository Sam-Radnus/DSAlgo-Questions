class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int columns=n;
    	int rows=n;
    	int count=0;
    	int result=0;
    	for(int i=0;i<n;i++){
    	    for(int j=0;j<n;j++){
    	        if(j!=i && M[j][i]==1) count++;
    	    }
    	    if(count == n-1){
    	        result=i;
    	        count=0;
    	        for(int k=0;k<n;k++){
    	            if(M[result][k]==1){
    	                result=-1;
    	                break;
    	            }
    	            else{
    	                result=i;
    	            }
    	        }
    	        break;
    	    }
    	    else{
    	        result=-1;
    	        count=0;
    	    }
    	}
    	return result;
    }
}
