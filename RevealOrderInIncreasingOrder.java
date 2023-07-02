class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        deck.sort()
        if len(deck)==2:
            return deck
        res=[]
        for i in range(len(deck)-1,-1,-1):
            if len(res)==0:
                res.append(deck[i])
                continue
            temp=res.pop()
            res.insert(0,temp)
            res.insert(0,deck[i])
            
        return res
