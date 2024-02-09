class Solution:
    def largestDivisibleSubset(self, nums: List[int]) -> List[int]:
        n = len(nums)
        nums.sort()
        groupSize = [1] * n
        prevEl = [-1] * n
        maxIndex=n-1
        for i in range(n):
            for j in range(i):
                if nums[i]%nums[j]==0:
                    if groupSize[i]<1+groupSize[j]:
                        groupSize[i]=1+groupSize[j]
                        prevEl[i]=j
            if groupSize[i]>groupSize[maxIndex]:
                maxIndex=i
        res=[]
        while maxIndex!=-1:
            res.append(nums[maxIndex])
            maxIndex=prevEl[maxIndex]
        
        return res
