//https://leetcode.com/problems/sort-the-matrix-diagonally/
package algorithms.medium.s;

public class SortTheMatrixDiagonally {
    public static void main(String[] args) {
        SortTheMatrixDiagonally obj = new SortTheMatrixDiagonally();
        System.out.println("Output:\t" + obj.diagonalSort(new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}}));
        System.out.println("Output:\t" + obj.diagonalSort(
                new int[][]{{11, 25, 66, 1, 69, 7}, {23, 55, 17, 45, 15, 52}, {75, 31, 36, 44, 58, 8}, {22, 27, 33, 25, 68, 4}, {84, 28, 14, 11, 5, 50}}));
    }

    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int k = 0; k < Math.min(rows, cols) - 1; k++) {
            for (int row = 0; row < rows - 1; row++) {
                for (int col = 0; col < cols - 1; col++) {
                    if (mat[row][col] > mat[row + 1][col + 1]) {
                        int temp = mat[row][col];
                        mat[row][col] = mat[row + 1][col + 1];
                        mat[row + 1][col + 1] = temp;
                    }
                }
            }
        }

        return mat;
    }
}
