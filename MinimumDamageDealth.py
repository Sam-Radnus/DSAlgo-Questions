'''
3273. Minimum Amount of Damage Dealt to Bob
Solved
Hard
Companies
Hint

You are given an integer power and two integer arrays damage and health, both having length n.

Bob has n enemies, where enemy i will deal Bob damage[i] points of damage per second while they are alive (i.e. health[i] > 0).

Every second, after the enemies deal damage to Bob, he chooses one of the enemies that is still alive and deals power points of damage to them.

Determine the minimum total amount of damage points that will be dealt to Bob before all n enemies are dead.

 

'''

class Solution:
    def minDamage(self, power: int, damage: List[int], health: List[int]) -> int:
        n = len(damage)
        pq = []
        heapify(pq)
        for i in range(n):
            heappush(pq,( - damage[i] / ceil(health[i] / power),i))
        
        dmg = 0
        ts = sum(damage)
        while pq:
            curr = heappop(pq)
            dmg += ts * math.ceil(health[curr[1]] / power)
            ts -= damage[curr[1]]
        
        return dmg
