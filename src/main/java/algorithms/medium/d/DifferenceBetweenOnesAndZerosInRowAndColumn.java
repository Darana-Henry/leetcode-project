//https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/
package algorithms.medium.d;


public class DifferenceBetweenOnesAndZerosInRowAndColumn {
    public static void main(String[] args) {
        DifferenceBetweenOnesAndZerosInRowAndColumn obj = new DifferenceBetweenOnesAndZerosInRowAndColumn();
        System.out.println("Output:\t" + obj.onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}}));
        System.out.println("Output:\t" + obj.onesMinusZeros(new int[][]{{1, 1, 1}, {1, 1, 1}}));
    }


    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rCount = new int[rows];
        int[] cCount = new int[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    rCount[row] += 1;
                    cCount[col] += 1;
                } else {
                    rCount[row] -= 1;
                    cCount[col] -= 1;
                }
            }
        }

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                grid[row][col] = rCount[row] + cCount[col];

        return grid;
    }
}
