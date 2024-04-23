from typing import List

class Solution:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        connections = pipes + [[0, i + 1, well] for i, well in enumerate(wells)]
        connections.sort(key=lambda x: x[2])
        parent = [i for i in range(n + 1)]
        total_cost = 0
        for connection in connections:
            house1, house2, cost = connection
            parent_house1 = self.find(parent, house1)
            parent_house2 = self.find(parent, house2)
            if parent_house1 != parent_house2:
                parent[parent_house1] = parent_house2
                total_cost += cost
                n -= 1
                if n == 0:
                    return total_cost
        return total_cost

    def find(self, parent: List[int], house: int) -> int:
        if parent[house] != house:
            parent[house] = self.find(parent, parent[house])
        return parent[house]

test1 = Solution()
# Provided Test Case
n1 = 2
wells1 = [1, 1]
pipes1 = [[1, 2, 1], [1, 2, 2]]
print("Test Case 1:", test1.minCostToSupplyWater(n1, wells1, pipes1))

# Edge Case 1: No pipes available
wells2 = [1, 4, 5]
pipes2 = []
print("Test Case 2:", test1.minCostToSupplyWater(3, wells2, pipes2))
