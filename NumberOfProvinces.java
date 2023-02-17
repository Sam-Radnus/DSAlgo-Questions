class Solution {
    boolean visited[];
    public int findCircleNum(int[][] isConnected) {
        visited=new boolean[isConnected.length]; 
        int count=0;
        for(int i=0;i<isConnected.length;i++)
        {
           if(!visited[i])
           {
              isProvince(i,isConnected);
              count++;
           }
        }
        return count;  
    } 
    public void isProvince(int i,int isConnected[][])
    {
        visited[i]=true;
        for(int j=0;j<isConnected[i].length;j++)
        { 
            if(!visited[j] && isConnected[i][j]==1)
            {
                isProvince(j,isConnected);
            }
        }
    }
}
