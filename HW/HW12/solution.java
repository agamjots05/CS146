package HW.HW12;

import java.util.Arrays;

public class solution {
    private int[] parent;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int[][] connections = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++) {
            connections[pipes.length + i] = new int[] {0, i + 1, wells[i]};
        }
        Arrays.sort(connections, (a, b) -> a[2] - b[2]);
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        int totalCost = 0;
        for (var connection : connections) {
            int house1 = connection[0], house2 = connection[1], cost = connection[2];
            int parentHouse1 = find(house1), parentHouse2 = find(house2);
            if (parentHouse1 != parentHouse2) {
                parent[parentHouse1] = parentHouse2;
                totalCost += cost;
                if (--n == 0) {
                    return totalCost;
                }
            }
        }
        return totalCost;
    }

    private int find(int house) {
        if (parent[house] != house) {
            parent[house] = find(parent[house]);
        }
        return parent[house];
    }

    public static void main(String[] args) {
        solution test1 = new solution();
        //Provided Test Case
        int n1 = 2;
        int[] wells1 = {1, 1};
        int[][] pipes1 = {{1, 2, 1}, {1, 2, 2}};
        System.out.println("Test Case 1: " + test1.minCostToSupplyWater(n1, wells1, pipes1));

        //Edge Case 1: No pipes available
        int[] wells2 = {1,4,5};
        int[][] pipes2 = {};
        System.out.println("Test Case 2: " + test1.minCostToSupplyWater(3,wells2, pipes2));


    }

    
}
