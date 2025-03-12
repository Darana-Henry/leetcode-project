//https://leetcode.com/problems/count-square-submatrices-with-all-ones/
package algorithms.medium.c;

public class CountSquareSubMatricesWithAllOnes {
    public static void main(String[] args) {
        CountSquareSubMatricesWithAllOnes obj = new CountSquareSubMatricesWithAllOnes();
        System.out.println("Output:\t" + obj.countSquares(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}));
        System.out.println("Output:\t" + obj.countSquares(new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}));
    }

    public int countSquares(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length, answer = 0;
        int[][] dp = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    dp[i + 1][j + 1] = 1 + Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i][j]));
                    answer += dp[i + 1][j + 1];
                }
            }
        }

        return answer;
    }
}
