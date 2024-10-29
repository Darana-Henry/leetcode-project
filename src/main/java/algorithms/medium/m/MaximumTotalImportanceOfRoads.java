//https://leetcode.com/problems/maximum-total-importance-of-roads/description/
package algorithms.medium.m;

import java.util.Arrays;

public class MaximumTotalImportanceOfRoads {
    public static void main(String[] args) {
        MaximumTotalImportanceOfRoads roads = new MaximumTotalImportanceOfRoads();
        System.out.println(
                "Output:\t" + roads.maximumImportance(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}}));
        System.out.println("Output:\t" + roads.maximumImportance(5, new int[][]{{0, 3}, {2, 4}, {1, 3}}));
    }

    public long maximumImportance(int n, int[][] roads) {
        long result = 0;
        int[] edges = new int[n];

        for (int[] road : roads) {
            edges[road[0]]++;
            edges[road[1]]++;
        }

        Arrays.sort(edges);

        for (int i = n - 1; i >= 0; i--) {
            result = result + (long) edges[i] * (long) (i + 1);
        }
        return result;
    }
}
