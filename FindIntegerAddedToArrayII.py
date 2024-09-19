'''
3132. Find the Integer Added to Array II
Medium
Topics
Companies
Hint

You are given two integer arrays nums1 and nums2.

From nums1 two elements have been removed, and all other elements have been increased (or decreased in the case of negative) by an integer, represented by the variable x.

As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.

Return the minimum possible integer x that achieves this equivalence.

 

Example 1:

Input: nums1 = [4,20,16,12,8], nums2 = [14,18,10]

Output: -2

Explanation:

After removing elements at indices [0,4] and adding -2, nums1 becomes [18,14,10].

Example 2:

Input: nums1 = [3,5,5,3], nums2 = [7,7]

Output: 2

Explanation:

After removing elements at indices [0,3] and adding 2, nums1 becomes [7,7].

'''
class Solution:
    def minimumAddedInteger(self, nums1: List[int], nums2: List[int]) -> int:
        m = len(nums1)
        ans = float('-inf')

        nums1.sort()
        nums2.sort()

        def helper(diff):
            idx = 0
            for num in nums2:
                num1 = num + diff
                while idx < m and nums1[idx] != num1:
                    idx+=1
                if idx >= m:
                    return False
                idx+=1
            return True
        
        
        for diff in [nums1[0]-nums2[0],nums1[1]-nums2[0],nums1[2]-nums2[0]]:
            temp = helper(diff)
            if temp:
                ans = max(ans,diff)

        return -ans
