//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
package algorithms.medium.m;

public class MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args) {
        MaxIncreaseToKeepCitySkyline obj = new MaxIncreaseToKeepCitySkyline();
        System.out.println("Output:\t" + obj.maxIncreaseKeepingSkyline(
                new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}}));
        System.out.println("Output:\t" + obj.maxIncreaseKeepingSkyline(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length, answer = 0;
        int[] maxRows = new int[n];
        int[] maxCols = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRows[i] = Math.max(maxRows[i], grid[i][j]);
                maxCols[j] = Math.max(maxCols[j], grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                answer += Math.min(maxRows[i], maxCols[j]) - grid[i][j];

        return answer;
    }
}
