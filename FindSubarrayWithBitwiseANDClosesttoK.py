'''
3171. Find Subarray With Bitwise AND Closest to K
Hard

You are given an array nums and an integer k. You need to find a
subarray
of nums such that the absolute difference between k and the bitwise AND of the subarray elements is as small as possible. In other words, select a subarray nums[l..r] such that |k - (nums[l] AND nums[l + 1] ... AND nums[r])| is minimum.

Return the minimum possible value of the absolute difference.

A subarray is a contiguous non-empty sequence of elements within an array.

Leetcode Weekly Contest 400
 
'''

class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        @cache
        def helper(i,c):
            if i>=len(nums):
                return inf
            return min(abs((nums[i] & c)-k),abs(nums[i]-k),helper(i+1,nums[i]),helper(i+1,nums[i] & c))
        return helper(0,nums[0])
