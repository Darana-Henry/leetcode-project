//https://leetcode.com/problems/count-unguarded-cells-in-the-grid/
package algorithms.medium.c;

public class CountUnguardedCellsInTheGrid {
    public static void main(String[] args) {
        CountUnguardedCellsInTheGrid obj = new CountUnguardedCellsInTheGrid();
        System.out.println("Output:\t" + obj.countUnguarded(4, 6, new int[][]{{0, 0}, {1, 1}, {2, 3}},
                new int[][]{{0, 1}, {2, 2}, {1, 4}}));
        System.out.println("Output:\t" + obj.countUnguarded(3, 3, new int[][]{{1, 1}},
                new int[][]{{0, 1}, {1, 0}, {2, 1}, {1, 2}}));
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int answer = 0;
        int[][] cells = new int[m][n];
        int[] dir = {-1, 0, 1, 0, -1};

        for (int[] guard : guards)
            cells[guard[0]][guard[1]] = 2;

        for (int[] wall : walls)
            cells[wall[0]][wall[1]] = 2;

        for (int[] guard : guards) {
            for (int d = 0; d < 4; d++) {
                int x = guard[0], y = guard[1];
                int dx = dir[d], dy = dir[d + 1];
                while (x + dx >= 0 && y + dy >= 0 && x + dx < m && y + dy < n && cells[x + dx][y + dy] < 2) {
                    x += dx;
                    y += dy;
                    cells[x][y] = 1;
                }
            }
        }

        for (int[] cell : cells)
            for (int c : cell)
                if (c == 0) answer++;

        return answer;
    }
}
