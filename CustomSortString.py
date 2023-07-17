class Solution:
    def customSortString(self, order: str, s: str) -> str:
        res=""
        for i in range(len(order)):
            while order[i] in s:
                idx=s.find(order[i])
                left=s[:idx]
                right=s[idx+1:]
                res=res+s[idx]
                s=left+right
                
        return res+s
