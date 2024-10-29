//https://leetcode.com/problems/unique-paths-ii/
package algorithms.medium.u;

public class UniquePathsII {
    int paths = 0;

    public static void main(String[] args) {
        UniquePathsII unique = new UniquePathsII();
        System.out.println(
                "Output:\t" + unique.uniquePathsWithObstaclesWithBFS(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println("Output:\t" + unique.uniquePathsWithObstaclesWithBFS(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(
                "Output:\t" + unique.uniquePathsWithObstaclesWithDFSAndMemoization(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println("Output:\t" + unique.uniquePathsWithObstaclesWithDFSAndMemoization(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(
                "Output:\t" + unique.uniquePathsWithObstaclesWithDFS(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println("Output:\t" + unique.uniquePathsWithObstaclesWithDFS(new int[][]{{0, 1}, {0, 0}}));
    }

    public int uniquePathsWithObstaclesWithBFS(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 || col == 0) {
                    if (obstacleGrid[row][col] == 1 || (row != 0 && obstacleGrid[row - 1][col] == 0) || (col != 0 && obstacleGrid[row][col - 1] == 0))
                        obstacleGrid[row][col] = 0;
                    else obstacleGrid[row][col] = 1;
                } else {
                    if (obstacleGrid[row][col] == 1) obstacleGrid[row][col] = 0;
                    else obstacleGrid[row][col] = obstacleGrid[row - 1][col] + obstacleGrid[row][col - 1];
                }

            }
        }
        return obstacleGrid[rows - 1][cols - 1];
    }

    public int uniquePathsWithObstaclesWithDFSAndMemoization(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 || col == 0) {
                    if (obstacleGrid[row][col] == 1 || (row != 0 && obstacleGrid[row - 1][col] == 0) || (col != 0 && obstacleGrid[row][col - 1] == 0))
                        obstacleGrid[row][col] = 0;
                    else obstacleGrid[row][col] = 1;
                } else {
                    if (obstacleGrid[row][col] == 1) obstacleGrid[row][col] = 0;
                    else obstacleGrid[row][col] = obstacleGrid[row - 1][col] + obstacleGrid[row][col - 1];
                }

            }
        }
        return obstacleGrid[rows - 1][cols - 1];
    }

    public int uniquePathsWithObstaclesWithDFS(int[][] obstacleGrid) {
        dfs(obstacleGrid, 0, 0);
        return paths;
    }

    public void dfs(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row == grid.length || col == grid[0].length || grid[row][col] == 1) return;
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            paths++;
            return;
        }
        dfs(grid, row + 1, col);
        dfs(grid, row, col + 1);
    }

}
