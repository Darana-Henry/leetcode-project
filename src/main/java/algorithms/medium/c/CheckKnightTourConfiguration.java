//https://leetcode.com/problems/check-knight-tour-configuration/
package algorithms.medium.c;

public class CheckKnightTourConfiguration {
    public static void main(String[] args) {
        CheckKnightTourConfiguration obj = new CheckKnightTourConfiguration();
        System.out.println("Output:\t" + obj.checkValidGrid(
                new int[][]{{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6}, {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}}));
        System.out.println("Output:\t" + obj.checkValidGrid(new int[][]{{0, 3, 6}, {5, 8, 1}, {2, 7, 4}}));
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;

        int n = grid.length;
        int[][] pos = new int[n * n][2];
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
                pos[grid[row][col]] = new int[]{row, col};

        for (int i = 1; i < n * n; i++) {
            int[] prev = pos[i - 1];
            int[] curr = pos[i];

            int dx = Math.abs(prev[0] - curr[0]);
            int dy = Math.abs(prev[1] - curr[1]);

            if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) continue;
            else return false;
        }

        return true;
    }
}
