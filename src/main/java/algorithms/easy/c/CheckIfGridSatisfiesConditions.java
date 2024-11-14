//https://leetcode.com/problems/check-if-grid-satisfies-conditions/
package algorithms.easy.c;

public class CheckIfGridSatisfiesConditions {
    public static void main(String[] args) {
        CheckIfGridSatisfiesConditions grid = new CheckIfGridSatisfiesConditions();
        System.out.println("Output:\t" + grid.satisfiesConditions(new int[][]{{1, 0, 2}, {1, 0, 2}}));
        System.out.println("Output:\t" + grid.satisfiesConditions(new int[][]{{1, 1, 1}, {0, 0, 0}}));
        System.out.println("Output:\t" + grid.satisfiesConditions(new int[][]{{1}, {2}, {3}}));
    }

    public boolean satisfiesConditions(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row < rows - 1 && grid[row][col] != grid[row + 1][col]) return false;
                if (col < cols - 1 && grid[row][col] == grid[row][col + 1]) return false;
            }
        }

        return true;
    }
}
