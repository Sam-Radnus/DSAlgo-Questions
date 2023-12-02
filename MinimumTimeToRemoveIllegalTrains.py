class Solution:
    def minimumTime(self, s: str) -> int:
        n=len(s)
        res=n
        cost_left=0
        for i in range(n):
            if s[i]=="1":
               cost_left=min(2+cost_left,i+1)
            res=min(res , cost_left + n-i-1)
        return res
        
        
