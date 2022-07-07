import java.util.*;
public class NQueenPractice {
    public static void NQueen(int n)
    {
      List<List<String>>res=new ArrayList<>();
      char board[][]=new char[n][n];
      for(int i=0;i<board.length;i++)
      {
          for(int j=0;j<board.length;j++)
          {
              board[i][j]='.';
          }
      }
      helper(res,board,0,0,n);
    }
    public static boolean helper(List<List<String>>res,char board[][],int rows,int cols,int n)
    {
        if(cols==n)
        {
            List<String>temp=new ArrayList<>();
            for(int i=0;i<rows;i++)
            {
                temp.add(String.valueOf(board[i]));
            }
            res.add(temp);
            return false;
        }
        for(int i=0;i<rows;i++)
        {
            if(isSafe(board,i,cols,n)){
                board[i][cols]='Q';
                if(helper(res,board,rows,cols+1,n)) return false;
                else{
                    board[i][cols]='.';
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(board[row][i]!='.')
            {
                return false;
            }
            if(board[i][col]!='.')
            {
                return false;
            }
        }
        int step=1;
        while(row-step>=0 && col-step>=0)
        {
            if(board[row-step][col-(step++)]!='.')
            {
                return false;
            }

        }
        step=1;
        while(row+step<n && col-step>=0)
        {
            if(board[row+step][col-(step++)]!='.')
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String args[])
    {

    }
}
