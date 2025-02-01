//https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/
package algorithms.medium.m;

public class MaximumNumberOfFishInAGrid {
    int[][] grid;
    boolean[][] visited;
    int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        MaximumNumberOfFishInAGrid obj = new MaximumNumberOfFishInAGrid();
        System.out.println(
                "Output:\t" + obj.findMaxFish(new int[][]{{0, 2, 1, 0}, {4, 0, 0, 3}, {1, 0, 0, 4}, {0, 3, 2, 0}}));
        System.out.println(
                "Output:\t" + obj.findMaxFish(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}}));
    }


    public int findMaxFish(int[][] grid) {
        this.grid = grid;
        int max = 0, rows = grid.length, cols = grid[0].length;
        visited = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] != 0 && !visited[row][col]) max = Math.max(max, dfs(new int[]{row, col}));
            }
        }

        return max;
    }

    public int dfs(int[] curr) {
        int row = curr[0], col = curr[1];
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0 || visited[row][col])
            return 0;

        visited[row][col] = true;
        int fish = grid[row][col];
        for (int[] dir : dirs)
            fish += dfs(new int[]{dir[0] + row, dir[1] + col});

        return fish;
    }
}
