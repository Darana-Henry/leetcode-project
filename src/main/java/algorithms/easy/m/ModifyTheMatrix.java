//https://leetcode.com/problems/modify-the-matrix/
package algorithms.easy.m;

public class ModifyTheMatrix {
    public static void main(String[] args) {
        ModifyTheMatrix modify = new ModifyTheMatrix();
        System.out.println("Output:\t" + modify.modifiedMatrix(new int[][]{{1, 2, -1}, {4, -1, 6}, {7, 8, 9}}));
        System.out.println("Output:\t" + modify.modifiedMatrix(new int[][]{{3, -1}, {5, 2}}));
    }

    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            int max = -2;

            for (int row = 0; row < rows; row++)
                max = Math.max(max, matrix[row][col]);

            for (int row = 0; row < rows; row++)
                if (matrix[row][col] == -1) matrix[row][col] = max;
        }
        return matrix;
    }
}
