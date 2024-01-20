class Solution:
    def sumSubarrayMins(self, arr: List[int]) -> int:
        n=len(arr)
        left=[-1]*n
        right=[n]*n
        stack=[]
        for i in range(n):
            while stack and arr[i]<=arr[stack[-1]]:
                stack.pop()
            if stack:
                left[i]=stack[-1]
            stack.append(i)
        stack=[]
        for i in range(n-1,-1,-1):
            while stack and arr[i]<arr[stack[-1]]:
                stack.pop()
            if stack:
                right[i]=stack[-1]
            stack.append(i)
        s=0
        mod=1000000007
        print(left)
        print(right)
        for i in range(n):
            s+=(i-left[i])*(right[i]-i)*arr[i]
        return s%mod
