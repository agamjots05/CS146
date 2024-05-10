package Labs.Lab8;

import java.util.Arrays;

class solution {
    public int coinChange(int[] coins, int amount) {
        int[] min = new int[amount + 1];
        Arrays.fill(min, amount + 1);
        min[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    min[i] = Math.min(min[i], 1 + min[i - coins[j]]);
                }
            }
        }

        return min[amount] != amount + 1 ? min[amount] : -1;        
    }

    public static void main(String[] args) {

        //Announced test Cases
        //Test 1
        solution test1 = new solution();
        System.out.println("Test 1: Total number of coins: " + test1.coinChange(new int[]{1,2,5}, 11));
        //Test 2
        System.out.println("Test 2: Total number of coins: " + test1.coinChange(new int[]{2}, 3));
        //Test 3
        System.out.println("Test 3: Total number of coins: " + test1.coinChange(new int[]{1}, 0));

        //Hidden test case, where you have many higher denominations and have multiple solutions
        System.out.println("Hidden Test 1: Total number of coins: " + test1.coinChange(new int[]{1, 2, 5, 10, 20}, 99));

    }
}
