//https://leetcode.com/problems/maximal-square/
package algorithms.medium.m;

public class MaximalSquare {
    public static void main(String[] args) {
        MaximalSquare maximal = new MaximalSquare();
        System.out.println("Output:\t" + maximal.maximalSquare(
                new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
        System.out.println("Output:\t" + maximal.maximalSquare(new char[][]{{'0', '1'}, {'1', '0'}}));
        System.out.println("Output:\t" + maximal.maximalSquare(new char[][]{{'0'}}));
    }

    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];

        int maximal = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == '1') {
                    dp[row + 1][col + 1] = Math.min(Math.min(dp[row][col + 1], dp[row + 1][col]), dp[row][col]) + 1;
                    maximal = Math.max(maximal, dp[row + 1][col + 1]);
                }
            }
        }
        return maximal * maximal;
    }
}
