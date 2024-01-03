class Solution:
    def numSmallerByFrequency(self, queries: List[str], words: List[str]) -> List[int]:
        def search(words,freq):
            left,right=0,len(words)-1
            while left<=right:
                mid=(left+right)//2
                if words[mid]>freq:
                    right=mid-1
                else:
                    left=mid+1
            return len(words)-left
        c=0
        for q in queries:
            q=list(q)
            q.sort()
            temp="".join(q)
            queries[c]=temp.count(temp[0])
            c+=1
        c=0
        for w in words:
            w=list(w)
            w.sort()
            temp="".join(w)
            words[c]=temp.count(temp[0])
            c+=1
        res=[]

        words.sort()
    
        for i in range(len(queries)):
            res.append(search(words,queries[i]))
        return res
