class Solution:    
    def findAllConcatenatedWordsInADict(self, words: List[str]) -> List[str]:
        @cache
        def helper(word):
                for i in range(1,len(word)):
                    left,right=word[:i],word[i:]
                    if left in words:
                        if right in words or helper(right):
                            return True
                return False
        res=[]
        words=set(words)
        for word in words:
             if helper(word):
                res.append(word)
        
        return res
