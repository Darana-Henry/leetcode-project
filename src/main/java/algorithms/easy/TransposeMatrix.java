//https://leetcode.com/problems/transpose-matrix/
package algorithms.easy;

public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix transpose = new TransposeMatrix();
        System.out.println("Output:\t" + transpose.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println("Output:\t" + transpose.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int row = 0; row < cols; row++)
            for (int col = 0; col < rows; col++)
                transposed[row][col] = matrix[col][row];

        return transposed;
    }
}
