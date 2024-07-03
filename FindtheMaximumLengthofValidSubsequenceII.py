'''
3202. Find the Maximum Length of Valid Subsequence II
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums and a positive integer k.

A
subsequence
sub of nums with length x is called valid if it satisfies:

    (sub[0] + sub[1]) % k == (sub[1] + sub[2]) % k == ... == (sub[x - 2] + sub[x - 1]) % k.

Return the length of the longest valid subsequence of nums. 

'''

class Solution:
    def maximumLength(self, nums: List[int],k:int) -> int:
        n = len(nums)
        mod = [ defaultdict(int) for _ in range(n)]
        res = 1
        for i in range(n):
            for j in range(0,i):
                mod[i][(nums[i]+nums[j])%k] = max(mod[i][(nums[i]+nums[j])%k],mod[j][(nums[i]+nums[j])%k] + 1 ) 
                res = max(res,mod[i][(nums[i]+nums[j])%k])

        return res + 1
        
