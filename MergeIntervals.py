class Solution:
    def merge(self,intervals):
        intervals.sort(key=lambda x:(x[0],x[1]))
        merged=[]
        for i in range(len(intervals)):
            if merged==[]:
                merged.append(intervals[i])
            previous_end=merged[-1][1]
            current_start=intervals[i][0]
            current_end=intervals[i][1]
            if previous_end>=current_start:
                merged[-1][1]=max(previous_end,current_end)
            else:
                merged.append(intervals[i])   
        return merged

