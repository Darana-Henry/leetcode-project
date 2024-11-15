//https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/
package algorithms.easy.c;

import java.util.Arrays;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public static void main(String[] args) {
        CheckIfEveryRowAndColumnContainsAllNumbers check = new CheckIfEveryRowAndColumnContainsAllNumbers();
        System.out.println("Output:\t" + check.checkValid(new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}));
        System.out.println("Output:\t" + check.checkValid(new int[][]{{1, 1, 1}, {1, 2, 3}, {1, 2, 3}}));
    }

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[] seen = new int[n + 1];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (seen[matrix[row][col]] == matrix[row][col]) return false;
                seen[matrix[row][col]] = matrix[row][col];
            }
            Arrays.fill(seen, 0);
        }

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (seen[matrix[row][col]] == matrix[row][col]) return false;
                seen[matrix[row][col]] = matrix[row][col];
            }
            Arrays.fill(seen, 0);
        }

        return true;
    }
}
