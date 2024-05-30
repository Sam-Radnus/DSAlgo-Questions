'''
3164. Find the Number of Good Pairs II
Leetcode Contest 399
'''
class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:     
        freqs=Counter(n2 * k for n2 in nums2)
        counts=[0 for _ in range(max(nums1)+1)]
        for num,count in freqs.items():
            for m in range(num,len(counts),num):
                counts[m]+=count
            
        return sum(counts[num] for num in nums1)
