import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>res=new ArrayList<>();
        if(n<1)
        {
            return res;
        }
        char board[][]=new char[n][n];
        for(char row[]:board)
        {
            for(int i=0;i<n;i++)
            {
                row[i]='.';
            }
        }
        solve(board,n,0,res);
        return res;
    }
    public boolean solve(char board[][],int n,int col,List<List<String>>res)
    {
        if(col==n)
        {
            List<String>list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(String.valueOf(board[i]));
            }
            res.add(list);
            return false;//backtack
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(board,n,i,col))
            {
                board[i][col]='Q';
                if(solve(board,n,col+1,res)) return false;
                else{
                    board[i][col]='.';
                }
            }
        }
        return false;
    }
    public boolean isSafe(char board[][],int n,int row,int col)
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
