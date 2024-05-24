'''

Q.You are given an integer array coins representing coins of different denominations and an integer k.

You have an infinite number of coins of each denomination. However, you are not allowed to combine coins of different denominations.

Return the kth smallest amount that can be made using these coins.


The method count tells that the number of combination of denominations that are less than the mid value.
'''

class Solution:
    def findKthSmallest(self, coins: List[int], k: int) -> int:
        n = len(coins)
        dic = defaultdict(list)
        for i in range(1, n + 1):
            for comb in itertools.combinations(coins, i):
                dic[len(comb)].append(math.lcm(*comb))
        
        def count(dic, target):
            ans = 0
            for i in range(1, n + 1):
                for lcm in dic[i]:
                    ans += (target // lcm) * pow(-1, i + 1)
            return ans
        
        start, end = min(coins), min(coins) * k
        while start<end:
            mid=(start+end)//2
            if count(dic,mid)<k:
                start=mid+1
            else:
                end=mid
        
        return start
                
        

        

    
