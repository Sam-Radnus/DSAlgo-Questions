class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        if target=="0000":
            return 0
        if "0000" in deadends or target in deadends:
            return -1
        deadends=set(deadends)
        queue=collections.deque()
        visited={}
        queue.append(["0000",0])
        while len(queue)>0:
            curr,level=queue.popleft()
            new_nums=[]
     
            for i in range(4):
                new_nums.append(curr[:i]+str((int(curr[i])+1)%10)+curr[i+1:])
                new_nums.append(curr[:i]+str((int(curr[i])-1)%10)+curr[i+1:])
            for nums in new_nums:
                if nums in deadends or nums in visited:
                    continue
                visited[nums]=True
                if nums==target:
                    return level+1
                queue.append([nums,level+1])
        return -1
                
