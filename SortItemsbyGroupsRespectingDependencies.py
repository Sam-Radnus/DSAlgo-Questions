'''
1203. Sort Items by Groups Respecting Dependencies
Solved
Hard
Topics
Companies
Hint

There are n items each belonging to zero or one of m groups where group[i] is the group that the i-th item belongs to and it's equal to -1 if the i-th item belongs to no group. The items and the groups are zero indexed. A group can have no item belonging to it.

Return a sorted list of the items such that:

    The items that belong to the same group are next to each other in the sorted list.
    There are some relations between these items where beforeItems[i] is a list containing all the items that should come before the i-th item in the sorted array (to the left of the i-th item).

Return any solution if there is more than one solution and return an empty list if there is no solution.

 

Example 1:

Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
Output: [6,3,4,1,5,2,0,7]

'''
class CyclicDependencyError(Exception):
    pass


class Solution:
    def sortItems(self, n: int, m: int, group: List[int], beforeItems: List[List[int]]) -> List[int]:
        def create_and_fill_groups():
            nonlocal m
            for i in range(n):
                if group[i] == -1:
                    group[i] = m
                    m+=1
            return m

        def get_items_in_group():
            nonlocal m
            items_in_group = [[] for _ in range(m)]

            for i in range(n):
                items_in_group[group[i]].append(i)
            
            return items_in_group

        def get_adjacency_list_from_beforeItems():
            nonlocal m , n
            group_indegree = [0 for _ in range(m)]
            group_adj = [set() for _ in range(m)]
            item_indegree = [0 for _ in range(n)]
            item_adj = [[] for _ in range(n)]

            for i in range(n):
                for beforeItem in beforeItems[i]:
                    if group[i] == group[beforeItem]:
                        item_indegree[i]+=1
                        item_adj[beforeItem].append(i)
                    else:
                        if group[i] not in group_adj[group[beforeItem]]:
                           group_adj[group[beforeItem]].add(group[i])
                           group_indegree[group[i]]+=1

            return group_indegree , group_adj , item_indegree , item_adj

        
        def get_topological_order_for_group_elements(group_items):
            gto = []
            queue = []

            for item in group_items:
                if item_indegree[item] == 0:
                    queue.append(item)

           
            
            while queue:
                new_queue = []
                for el in queue:
                    gto.append(el)
                    for adj in item_adj[el]:
                        item_indegree[adj]-=1
                        if item_indegree[adj]==0:
                            new_queue.append(adj)

                queue = new_queue
                        
            
            for adj in group_items:
                if item_indegree[adj] != 0:
                    raise CyclicDependencyError
           
            return gto




        def get_topological_order(items_in_group:List[List[int]]):
            nonlocal m
            queue = []
            for group_id in range(m):
                if group_indegree[group_id] == 0:
                    queue.append(group_id)

            res = []
            while queue:
                new_queue = []
                for group_id in queue:
                    try:
                        group_topological_ordered_elements = get_topological_order_for_group_elements(items_in_group[group_id])
                    except CyclicDependencyError:
                        return []
                    res.extend(group_topological_ordered_elements)
                    for after_group_id in group_adj[group_id]:
                        group_indegree[after_group_id]-=1
                        if group_indegree[after_group_id] == 0:
                            new_queue.append(after_group_id)
                queue = new_queue
            
            for group_id in range(m):
                if group_indegree[group_id] != 0:
                    return []
            
            return res

        create_and_fill_groups()
        group_indegree, group_adj , item_indegree , item_adj = get_adjacency_list_from_beforeItems()
        grouped_items = get_items_in_group()
        

        return get_topological_order(grouped_items)

        
        

                    



            
            
            
            
            
        
