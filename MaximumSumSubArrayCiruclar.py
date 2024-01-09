class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        currMax,currMin=0,0
        totalSum,maxSum,minSum=0,-math.inf,math.inf

        for num in nums:
            totalSum+=num
            currMax=max(currMax+num,num)
            currMin=min(currMin+num,num)
            maxSum=max(maxSum,currMax)
            minSum=min(minSum,currMin)

        return maxSum if maxSum<0 else max(maxSum,totalSum-minSum)
