from collections import deque
class Solution:
    
    def minimumOperationsToMakeEqual(self, x: int, y: int) -> int:
        vis=set()
        q=deque([[x,0]])
        vis.add(x)
        
        while q:
            num,turn=q.popleft()
            if num==y:
                return turn
            
            if num%11==0 and (num//11) not in vis:
                q.append([num//11,turn+1])
                vis.add(num//11)
            
            if num%5==0 and (num//5) not in vis:
                q.append([num//5,turn+1])
                vis.add(num//5)
            
            if num+1 not in vis:
                q.append([num+1,turn+1])
                vis.add(num+1)
            
            if num-1>=y and num-1 not in vis:
                q.append([num-1,turn+1])
                vis.add(num-1)
        return -1

                
