'''
3133. Minimum Array End
Solved
Medium
Topics
Companies
Hint

You are given two integers n and x. You have to construct an array of positive integers nums of size n where for every 0 <= i < n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise AND operation between all elements of nums is x.

Return the minimum possible value of nums[n - 1].

 

Example 1:

Input: n = 3, x = 4

Output: 6

Explanation:

nums can be [4,5,6] and its last element is 6.

Example 2:

Input: n = 2, x = 7

Output: 15

Explanation:

nums can be [7,15] and its last element is 15.

 
'''

class Solution:
    def minEnd(self, n: int, x: int) -> int:

        x_bin = bin(x)[2:]
        s = len(bin(10**20)[2:])
        nums = list(x_bin.zfill(s))
        
        zeroes = []
        for i in range(len(nums)):
            if nums[i] == '0':
                zeroes.append(i)

        bi = bin(n - 1)[2:][::-1]
        c = 0
        for index in zeroes[::-1]:
            if c >= len(bi):
                break
            nums[index] = bi[c]
            c += 1

        res = "".join(nums)
        return int(res, 2)
