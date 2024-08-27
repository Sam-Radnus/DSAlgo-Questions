class Solution:
    def getFinalState(self, nums: List[int], k: int, m: int) -> List[int]:
        MOD = 10 ** 9 + 7
        if m == 1:
            return nums
        n = len(nums)
        mx = max(nums)
        heap = [(x,i) for i,x in enumerate(nums)]
        heapify(heap)
       
        while k:
            k -= 1
            temp , idx = heappop(heap)
            nums[idx] = temp * m
            heappush(heap,(nums[idx],idx))
            if temp > mx:
                break

        fc , rem = divmod(k,n)
    
        y = pow(m,fc,MOD)
        
        for i in range(rem):
            temp , idx = heappop(heap)
            nums[idx] = temp * m 

        return [ (x * y) % MOD for x in nums ]
