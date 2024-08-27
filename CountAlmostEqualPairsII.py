# Leetcode WC 412
class Solution:
    def countPairs(self, nums: List[int]) -> int:
        
        cnt = Counter(nums)
        freq = defaultdict(list)

        for x , v in cnt.items():
            freq[x].append((x,v))
            temp = list(str(x).zfill(7))
            for j in range(7):
                for k in range(j+1,7):
                    if temp[j] != temp[k]:
                        temp[j] , temp[k] = temp[k] , temp[j]
                        cand = int("".join(temp))
                        freq[cand].append((x,v))
                        temp[j] , temp[k] = temp[k] , temp[j]
    
        ans = defaultdict(int)
        for x , v in freq.items():
            for x1,v1 in v:
                ans[(x1,x1)] = v1 * (v1 - 1) // 2

            for (x1,v1),(x2,v2) in combinations(v,2):
                ans[(x1,x2)] = v1 * v2
            
        return sum(ans.values())

