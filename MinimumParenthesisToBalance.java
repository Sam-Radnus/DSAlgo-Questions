class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        if s.find("()")==-1:
            return len(s)
        while "()" in s:
            idx=s.find("()")
            left=s[:idx]
            right=s[idx+2:]
            s=left+right

        return len(s)
        
