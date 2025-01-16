//https://leetcode.com/problems/count-paths-with-the-given-xor-value/
package algorithms.medium.c;

import java.util.Arrays;

public class CountPathsWithTheGivenXORValue {
    int mod = 1000000007, rows = 0, cols = 0, target = 0;
    int[][] g;
    int[][][] dp;

    public static void main(String[] args) {
        CountPathsWithTheGivenXORValue obj = new CountPathsWithTheGivenXORValue();
        System.out.println(
                "Output:\t" + obj.countPathsWithXorValue(new int[][]{{2, 1, 5}, {7, 10, 0}, {12, 6, 4}}, 11));
        System.out.println(
                "Output:\t" + obj.countPathsWithXorValue(new int[][]{{1, 3, 3, 3}, {0, 3, 3, 2}, {3, 0, 1, 1}}, 2));
        System.out.println(
                "Output:\t" + obj.countPathsWithXorValue(new int[][]{{1, 1, 1, 2}, {3, 0, 3, 2}, {3, 0, 2, 2}}, 10));
    }


    public int countPathsWithXorValue(int[][] grid, int k) {
        g = grid;
        target = k;
        rows = g.length;
        cols = g[0].length;
        dp = new int[rows][cols][16];

        for (int[][] row : dp)
            for (int[] col : row)
                Arrays.fill(col, -1);

        return (int) solve(0, 0, g[0][0]);
    }

    public long solve(int row, int col, int xor) {
        if (row == rows - 1 && col == cols - 1) return xor == target ? 1 : 0;

        if (dp[row][col][xor] != -1) return dp[row][col][xor];

        long ways = 0;

        if (row + 1 < rows) ways += solve(row + 1, col, xor ^ g[row + 1][col]);

        if (col + 1 < cols) ways += solve(row, col + 1, xor ^ g[row][col + 1]);

        ways %= mod;
        dp[row][col][xor] = (int) ways;

        return ways;
    }
}
