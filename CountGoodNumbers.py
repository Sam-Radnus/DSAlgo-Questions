class Solution:
    def countGoodNumbers(self, n: int) -> int:
        val=1
        mod=1000000007
        odd=n//2
        even=n//2+(n%2)
        return self.binaryExp(5,even)%mod * (self.binaryExp(4,odd))%mod

    def binaryExp(self,n,x):
        mod=1000000007
        if x==0:
            return 1     
        if x<0:
            return 1/self.binaryExp(n,-x)

        if x%2==0:
            return self.binaryExp((n*n)%mod,(x//2))
        else:
            return n*self.binaryExp((n*n)%mod,((x-1)//2))
