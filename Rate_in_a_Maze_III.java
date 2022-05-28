import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rate_in_a_Maze_III {
    boolean visited[][];
    String path="";
    List<String> ans=new ArrayList<>();
    public  List<String> Rat_in_a_Maze(int m[][],int n)
    {
        visited=new boolean[n][n];
        helper(m,path,ans,0,0,visited);
        if(m.length==0)
        {
            return ans;
        }
        else{
            Collections.sort(ans);
        }
        return ans;
    }
    public void helper(int m[][],String path,List<String> ans,int i,int j,boolean visited[][])
    {
        visited[i][j]=true;
        int n=m.length;
        if(i==m.length-1 && j == m[0].length-1 )
        {
          ans.add(path);
          return;
        }
        //RIGHT
        if(j!=n-1 && m[i][j+1]!=1 && !visited[i][j+1])
        {
            helper(m,path+"R",ans,i,j+1,visited);
            visited[i][j+1]=false;
        }
        //DOWN
        if(i!=n-1 && m[i+1][j]!=1 && !visited[i+1][j])
        {
            helper(m,path+"D",ans,i+1,j,visited);
            visited[i+1][j]=false;
        }
        //LEFT
        if(j!=0 && m[i][j-1]!=1 && !visited[i][j-1])
        {
            helper(m,path+"L",ans,i,j-1,visited);
            visited[i][j-1]=false;
        }
        //UP
        if(i!=0 && m[i-1][j]!=1 && !visited[i-1][j])
        {
            helper(m,path+"U",ans,i-1,j,visited);
            visited[i-1][j]=false;
        }

    }
    public static void main(String args[])
    {

    }
}
