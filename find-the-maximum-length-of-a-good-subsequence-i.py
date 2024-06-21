class Solution:
    def maximumLength(self, nums: List[int], k: int) -> int:
        dp=[ defaultdict(int) for _ in range(k+1) ]
        res=[ 0 for _ in range(k+1) ]
        for a in nums:
            for i in range(k,-1,-1):
                 dp[i][a] = max( dp[i][a] + 1 , res[i-1] + 1 if i else 0 )
                 res[i] = max( res[i] , dp[i][a] )
        return res[k]
