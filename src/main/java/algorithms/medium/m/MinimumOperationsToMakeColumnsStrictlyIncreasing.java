//https://leetcode.com/problems/minimum-operations-to-make-columns-strictly-increasing/
package algorithms.medium.m;

public class MinimumOperationsToMakeColumnsStrictlyIncreasing {
    public static void main(String[] args) {
        MinimumOperationsToMakeColumnsStrictlyIncreasing obj = new MinimumOperationsToMakeColumnsStrictlyIncreasing();
        System.out.println("Output:\t" + obj.minimumOperations(new int[][]{{3, 2}, {1, 3}, {3, 4}, {0, 1}}));
        System.out.println("Output:\t" + obj.minimumOperations(new int[][]{{3, 2, 1}, {2, 1, 0}, {1, 2, 3}}));
    }

    public int minimumOperations(int[][] grid) {
        int answer = 0;

        for (int c = 0; c < grid[0].length; c++) {
            for (int r = 1; r < grid.length; r++) {
                if (grid[r][c] <= grid[r - 1][c]) {
                    answer += grid[r - 1][c] - grid[r][c] + 1;
                    grid[r][c] = grid[r - 1][c] + 1;
                }
            }
        }
        return answer;
    }
}
