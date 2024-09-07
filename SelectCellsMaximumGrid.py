'''
Weekly Contest 413
3276. Select Cells in Grid With Maximum Score

You are given a 2D matrix grid consisting of positive integers.

You have to select one or more cells from the matrix such that the following conditions are satisfied:

    No two selected cells are in the same row of the matrix.
    The values in the set of selected cells are unique.

Your score will be the sum of the values of the selected cells.

Return the maximum score you can achieve.
'''

class Solution:

    def solve(self,i,n,t,mask):
        if i == n:
            return 0
        
        ans = 0
        for j in self.mp[t[i]]:
            if (mask & 1 << j) == 0:
                ans = max( ans , t[i] + self.solve(i+1,n,t,mask | 1 << j ))

        ans = max(ans , self.solve(i+1,n,t, mask))

        return ans
        
    def maxScore(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        s = set()

        for i in range(m):
            for j in range(n):
                s.add(grid[i][j])

        t = sorted(s,reverse=True)
        self.mp = defaultdict(list)

        for i in range(m):
            for j in range(n):
                self.mp[grid[i][j]].append(i)
        
        #self.dp = [[ -1 for _ in range(101)] for _ in range(2001)]

        return self.solve(0,len(t),tuple(t),0)
