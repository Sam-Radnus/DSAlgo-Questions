import java.util.ArrayList;
import java.util.Collections;

public class Rat_in_a_Maze_II {
    static ArrayList<String>ans=new ArrayList<>();
    static boolean visited[][]=new boolean[][];
    public static ArrayList<String> findPath(int m[][],int n)
    {
        visited=new boolean[n][n];
        ans.clear();
        helper(0,0,m,visited,"",n);
        if(ans.size()==0)
        {
            ans.add("-1");
        }
        else{
            Collections.sort(ans);
        }
        return ans;
    }
    public static void helper(int i,int j,int m[][],boolean visited[][],String path,int n)
    {
        visited[i][j]=true;
        if(i==m.length-1 && j==m[0].length-1)
        {
            ans.add(path);
            return;
        }
        if(m[i][j]==0)
        {
            return;
        }
        //downward
        if(i!=n-1 && m[i+1][j]!=0 && !visited[i+1][j])
        {
            helper(i+1,j,m,visited,path+"D",n);
            visited[i+1][j]=false;
        }
        //right
        if(j!=n-1 && m[i][j+1]!=0 && !visited[i][j+1])
        {
            helper(i,j+1,m,visited,path+"R",n);
            visited[i][j+1]=false;
        }
        //upward
        if(i==0 && m[i-1][j]!=0 && !visited[i-1][j])
        {
            helper(i-1,j,m,visited,path+"U",n);
            visited[i-1][j]=false;
        }
        //left
        if(j!=n-1 && m[i][j-1]!=0 && !visited[i][j-1])
        {
            helper(i,j-1,m,visited,path+"R",n);
            visited[i][j-1]=false;
        }
    }
    public static void main(String args[])
    {

    }
}
