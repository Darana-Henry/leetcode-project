//https://leetcode.com/problems/check-if-matrix-is-x-matrix/
package algorithms.easy.c;

public class CheckIfMatrixIsXMatrix {
    public static void main(String[] args) {
        CheckIfMatrixIsXMatrix xMatrix = new CheckIfMatrixIsXMatrix();
        System.out.println("Output:\t" + xMatrix.checkXMatrix(
                new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}}));
        System.out.println("Output:\t" + xMatrix.checkXMatrix(new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}}));
    }

    public boolean checkXMatrix(int[][] grid) {
        int rows = grid.length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                if (row == col || row + col == rows - 1) {
                    if (grid[row][col] == 0) return false;
                } else {
                    if (grid[row][col] != 0) return false;
                }
            }
        }
        return true;
    }
}
