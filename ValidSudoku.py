class Solution:
    def isValid(self,board,row,col):
        cells=[]
        for i in range(0,9):
            if board[row][i]==".":
                continue
            if board[row][i] in cells:
                return False
            cells.append(board[row][i])
        cells=[]
        for i in range(0,9):
            if board[i][col]==".":
                continue
            if board[i][col] in cells:
                return False
            cells.append(board[i][col])
        cells=[]
        regionalRow=3*int(row/3)
        regionalCol=3*int(col/3)
        for i in range(0,9):
            if board[regionalRow+int(i/3)][regionalCol+int(i%3)]==".":
                continue
            if board[regionalRow+int(i/3)][regionalCol+int(i%3)] in cells:
                return False
            cells.append(board[regionalRow+int(i/3)][regionalCol+int(i%3)])
        return True


    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(0,9):
            for j in range(0,9):
                if not self.isValid(board,i,j):
                    return False
        return True
