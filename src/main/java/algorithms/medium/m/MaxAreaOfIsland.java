//https://leetcode.com/problems/max-area-of-island/
package algorithms.medium.m;

public class MaxAreaOfIsland {
    boolean[][] seen;

    public static void main(String[] args) {
        MaxAreaOfIsland obj = new MaxAreaOfIsland();
        System.out.println("Output:\t" + obj.maxAreaOfIsland(
                new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}}));
        System.out.println("Output:\t" + obj.maxAreaOfIsland(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}}));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int answer = 0, rows = grid.length, cols = grid[0].length;
        seen = new boolean[rows][cols];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                answer = Math.max(answer, area(row, col, grid));

        return answer;
    }

    public int area(int row, int col, int[][] grid) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || seen[row][col] || (grid[row][col] == 0))
            return 0;

        seen[row][col] = true;
        return (1 + area(row - 1, col, grid) + area(row + 1, col, grid) + area(row, col - 1, grid) + area(row, col + 1,
                grid));
    }
}
