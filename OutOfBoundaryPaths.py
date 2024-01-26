class Solution:
    def findPaths(self, m: int, n: int, N: int, sr: int, sc: int) -> int:
        dp=[[0 for _ in range(n)] for _ in range(m)]
        dp[sr][sc]=1
        M = 1000000000 + 7
        c=0
        for k in range(1,N+1):
            temp=[[0 for _ in range(n)] for _ in range(m)]
            for i in range(m):
                for j in range(n):
                    if i==0:
                        c=(c+dp[i][j])%M
                    if j==0:
                        c=(c+dp[i][j])%M
                    if i==m-1:
                        c=(c+dp[i][j])%M
                    if j==n-1:
                        c=(c+dp[i][j])%M
                    temp[i][j]=((dp[i][j-1] if j>0 else 0)%M+(dp[i-1][j] if i>0 else 0)%M+(dp[i+1][j] if i<m-1 else 0)%M+(dp[i][j+1] if j<n-1 else 0)%M)%M
            dp=temp

        return c
