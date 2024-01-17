#https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/
class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        c=0
        m=max(nums)
        n=len(nums)
        x=0
        i=0
        j=0
        for i in range(len(nums)):
            if nums[i]==m:
                x+=1
            while x>=k:
                c+=n-i
                if nums[j]==m:
                    x-=1
                j+=1

        return c
                
