import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Rat_in_a_Maze {
    // Vector to store all the possible paths
    public static ArrayList<String> ans = new ArrayList<>();
    public static int[][] visited;
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        visited=new int[n][n];
        ans.clear();
        solve(0,0,m,visited,n,"");
        if(ans.size()==0)
        {
            ans.add("-1");
            return ans;
        }
        else {
            Collections.sort(ans);
            return ans;
        }
    }
    public static void solve(int i, int j, int[][] m, int[][] v, int n, String p) {
       //1 means visited
       //0 means not visited
        v[i][j]=1;
        if(m[i][j]==0)
        {
            return;
        }
        if(i==n-1 && j==n-1)
        {
            ans.add(p);
        }
        //downward
        if(i!=n-1 && m[i+1][j]==1 && v[i+1][j]==0)
        {
            solve(i+1,j,m,v,n,p+"D");
            v[i+1][j]=0;
        }
        //upward
        if(i!=0 &&m[i-1][j]==1 && v[i-1][j]==0)
        {
            solve(i-1,j,m,v,n,p+"U");
            v[i-1][j]=0;
        }
        //right
        if(j!=n-1 && m[i][j+1]==1 && v[i][j+1]==0)
        {
            solve(i,j+1,m,v,n,p+"R");
            v[i][j+1]=0;
        }
        if(j!=0 && m[i][j-1]==1 && v[i][j-1]==0)
        {
            solve(i,j-1,m,v,n,p+"L");
            v[i][j-1]=0;
        }

     }
    public static int main(String args[])
    {

    }
}
