'''

Weekly Contest 414
3281. Maximize Score of Numbers in Ranges
Solved
Medium
Companies
Hint

You are given an array of integers start and an integer d, representing n intervals [start[i], start[i] + d].

You are asked to choose n integers where the ith integer must belong to the ith interval. The score of the chosen integers is defined as the minimum absolute difference between any two integers that have been chosen.

Return the maximum possible score of the chosen integers.

 '''

class Solution:
    def maxPossibleScore(self, start: List[int], d: int) -> int:
        start.sort()
        def helper(score:int)->int:
            p = start[0]
            
            for i in range(1,len(start)):
                s = start[i]

                if s + d - p < score:
                    return False
               
                p = max(s,score+p)
                
            return True
        
        l , h = 0 , start[-1] + start[0] + d + 1
        while l < h:
            m = (l+h)//2
            if helper(m):
                l = m + 1
            else:
                h = m
        return l - 1
