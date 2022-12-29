class Solution {
    public boolean exist(char[][] board, String word) {
        int c=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++)
            {
              if(DFS(board,word,0,i,j))
                 return true;
            }
        }
        return false;
    }
    public boolean DFS(char[][]board,String word,int c,int row,int col)
    {
        if(c==word.length()) return true;
        
        if(board[row][col] == word.charAt(c))
        {    
            if(c==word.length()-1) return true;
            char temp=board[row][col];
            board[row][col]='*';
            c++;
            if(row < board.length -1 && DFS(board,word,c,row+1,col))return true;
            if(col < board[0].length -1 && DFS(board,word,c,row,col+1))return true;
            if(row > 0 && DFS(board,word,c,row-1,col))return true;
            if(col > 0  && DFS(board,word,c,row,col-1))return true;
            board[row][col]=temp;
        }
       return false;
       
    }
}
