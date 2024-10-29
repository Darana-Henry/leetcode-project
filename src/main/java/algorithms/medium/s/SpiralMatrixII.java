//https://leetcode.com/problems/spiral-matrix-ii/
package algorithms.medium.s;

public class SpiralMatrixII {
    public static void main(String[] args) {
        SpiralMatrixII spiral = new SpiralMatrixII();
        System.out.println("Output:\t" + spiral.generateMatrix(3));
        System.out.println("Output:\t" + spiral.generateMatrix(1));
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int row = 0;
        int col = 0;
        int direction = 0;
        for (int i = 1; i <= n * n; ++i) {
            matrix[row][col] = i;
            int nextRow = row + dir[direction][0];
            int nextCol = col + dir[direction][1];
            if (nextRow < 0 || nextCol < 0 || nextRow >= n || nextCol >= n || matrix[nextRow][nextCol] > 0) {
                direction = (direction + 1) % 4;
                nextRow = row + dir[direction][0];
                nextCol = col + dir[direction][1];
            }
            row = nextRow;
            col = nextCol;
        }
        return matrix;
    }
}

