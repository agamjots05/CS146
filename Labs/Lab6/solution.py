from collections import defaultdict

class Solution:
    def canFinish(self, numCourses, prerequisites):
        if prerequisites is None or len(prerequisites) == 0:
            return True
        
        # Using dictionary to mimick map
        course_map = defaultdict(list)
        for course, prereq in prerequisites:
            course_map[course].append(prereq)
        

        def dfs(course, visited):
            if course in visited:
                return False
            
            visited.add(course)
            
            if course not in course_map or len(course_map[course]) == 0:
                return True
            
            for prereq in course_map[course]:
                if not dfs(prereq, visited):
                    return False
            
            visited.remove(course)
            course_map[course] = []
            
            return True
        

        for course in range(numCourses):
            visited = set()
            if not dfs(course, visited):
                return False
        
        return True
    
# Provided test Cases
test1 = Solution()
print(test1.canFinish(2, [[1, 0]]))
print(test1.canFinish(2, [[1, 0], [0,1]]))

# Hidden Test Cases
# Empty 2d array
print(test1.canFinish(0, []))
# Disconnected Components
print(test1.canFinish(2, [[0, 1], [1, 0], [2, 3], [3, 2]]))
