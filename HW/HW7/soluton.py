from typing import List

class Solution:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        starts = sorted(interval[0] for interval in intervals)
        ends = sorted(interval[1] for interval in intervals)

        s = 0
        e = 0
        max_servers = 0
        cur_servers = 0

        while s < len(intervals):
            if starts[s] < ends[e]:
                cur_servers += 1
                s += 1
            else:
                cur_servers -= 1
                e += 1

            if cur_servers > max_servers:
                max_servers = cur_servers

        return max_servers

# Test cases
test1 = Solution()
#Provided test acases
print(test1.minMeetingRooms([[0,30], [5,10], [15,20]]))
print(test1.minMeetingRooms([[0,1], [1,2], [2,3]]))     

#Hidden Test Cases
print(test1.minMeetingRooms([[0, 100], [50, 150], [100, 200], [150, 250]])) 
