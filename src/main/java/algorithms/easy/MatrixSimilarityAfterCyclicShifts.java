//https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/
package algorithms.easy;

import java.util.Arrays;

public class MatrixSimilarityAfterCyclicShifts {
    public static void main(String[] args) {
        MatrixSimilarityAfterCyclicShifts cyclic = new MatrixSimilarityAfterCyclicShifts();
        System.out.println("Output:\t" + cyclic.areSimilar(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 4));
        System.out.println("Output:\t" + cyclic.areSimilar(new int[][]{{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}}, 2));
        System.out.println("Output:\t" + cyclic.areSimilar(new int[][]{{2, 2}, {2, 2}}, 3));
        System.out.println("Output:\t" + cyclic.areSimilarOptimized(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 4));
        System.out.println("Output:\t" + cyclic.areSimilarOptimized(new int[][]{{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}}, 2));
        System.out.println("Output:\t" + cyclic.areSimilarOptimized(new int[][]{{2, 2}, {2, 2}}, 3));
    }

    public boolean areSimilar(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        k = k % cols;
        int[][] shifted = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 == 0) shifted[i][(j + k) % cols] = mat[i][j];
                else shifted[i][(j - k + cols) % cols] = mat[i][j];
            }
        }

        return Arrays.deepEquals(shifted, mat);
    }

    public boolean areSimilarOptimized(int[][] mat, int k) {
        for (int[] row : mat) {
            int cols = row.length;
            for (int j = 0; j < cols; j++) {
                if (row[j] != row[(j + k) % cols]) return false;
            }
        }
        return true;
    }
}
