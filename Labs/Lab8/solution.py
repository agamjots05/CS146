from typing import List


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        min_coins = [amount + 1] * (amount + 1)
        min_coins[0] = 0

        for i in range(1, amount + 1):
            for c in coins:
                if i - c >= 0:
                    min_coins[i] = min(min_coins[i], 1 + min_coins[i - c])
        
        return min_coins[-1] if min_coins[-1] != amount + 1 else -1
    
# Announced test Cases
# Test 1
test1 = Solution()
print("Test 1: Total number of coins:", test1.coinChange([1, 2, 5], 11))
# Test 2
print("Test 2: Total number of coins:", test1.coinChange([2], 3))
# Test 3
print("Test 3: Total number of coins:", test1.coinChange([1], 0))

# Hidden test case, where you have many higher denominations and have multiple solutions
print("Hidden Test 1: Total number of coins:", test1.coinChange([1, 2, 5, 10, 20], 99))