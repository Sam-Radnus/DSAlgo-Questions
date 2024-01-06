class Solution:
    def jobScheduling(self, startTime: List[int], endTime: List[int], profit: List[int]) -> int:
        def find_index(ar,target):
            left,right=0,len(ar)-1
            while left<=right:
                mid=(left+right)//2
                if ar[mid][0]<target:
                    left=mid+1
                else:
                    right=mid-1
            return left

        n=len(profit)
        ar=[]
        for i in range(n):
            ar.append([startTime[i],endTime[i],profit[i]])
        ar.sort(key=lambda x:x[0])
        
        dp=[0 for i in range(n+1)]
        for i in range(n-1,-1,-1):
            j=find_index(ar,ar[i][1])
            dp[i]=max(dp[i+1],dp[j]+ar[i][2])
        return max(dp)
