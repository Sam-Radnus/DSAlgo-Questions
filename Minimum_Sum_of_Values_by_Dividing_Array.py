'''
Leetcode Contest 393
'''

class Solution:
    def minimumValueSum(self, nums: List[int], andValues: List[int]) -> int:
        dp={}
        m=len(andValues)
        n=len(nums)
        @cache
        def helper(i,curr,val):
            if i == n:
                return 0 if curr == m else inf
            
            if curr == m:
                return inf

            min_sum=inf
            s=val & nums[i]
            if s == andValues[curr]:
                min_sum=nums[i]+helper(i+1,curr+1,(1<<20)-1)
            min_sum=min(min_sum,helper(i+1,curr,s))
            return min_sum 
            
        res=helper(0,0,(1<<20)-1)
        return res if res!=inf else -1

            
