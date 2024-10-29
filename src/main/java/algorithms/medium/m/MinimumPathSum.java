//https://leetcode.com/problems/minimum-path-sum/
package algorithms.medium.m;

public class MinimumPathSum {
    public static void main(String[] args) {
        MinimumPathSum minPath = new MinimumPathSum();
        System.out.println("Output:\t" + minPath.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println("Output:\t" + minPath.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        System.out.println("Output:\t" + minPath.minPathSumOptimized(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println("Output:\t" + minPath.minPathSumOptimized(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];

        for (int row = 1; row < rows; row++)
            dp[row][0] = dp[row - 1][0] + grid[row][0];

        for (int col = 1; col < cols; col++)
            dp[0][col] = dp[0][col - 1] + grid[0][col];

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                dp[row][col] = grid[row][col] + Math.min(dp[row - 1][col], dp[row][col - 1]);
            }
        }
        return dp[rows - 1][cols - 1];
    }

    public int minPathSumOptimized(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int row = 1; row < rows; row++)
            grid[row][0] = grid[row - 1][0] + grid[row][0];

        for (int col = 1; col < cols; col++)
            grid[0][col] = grid[0][col - 1] + grid[0][col];

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
            }
        }
        return grid[rows - 1][cols - 1];
    }
}
