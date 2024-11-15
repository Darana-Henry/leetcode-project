//https://leetcode.com/problems/toeplitz-matrix/
package algorithms.easy.t;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        ToeplitzMatrix toeplitz = new ToeplitzMatrix();
        System.out.println(
                "Output:\t" + toeplitz.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
        System.out.println("Output:\t" + toeplitz.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] != matrix[row - 1][col - 1]) return false;
            }
        }
        return true;
    }
}
