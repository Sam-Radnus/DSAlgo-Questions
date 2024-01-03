class Solution:
    def maxSatisfaction(self, satisfaction: List[int]) -> int:
        satisfaction.sort(reverse=True)
        ps,res,curr=0,0,0
        for i in range(len(satisfaction)):
            ps+=satisfaction[i]
            curr+=ps
            res=max(res,curr)
        return res

        
