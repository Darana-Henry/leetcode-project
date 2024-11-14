//https://leetcode.com/problems/find-champion-i/
package algorithms.easy.f;

public class FindChampionI {
    public static void main(String[] args) {
        FindChampionI champion = new FindChampionI();
        System.out.println("Output:\t" + champion.findChampion(new int[][]{{0, 1}, {0, 0}}));
        System.out.println("Output:\t" + champion.findChampion(new int[][]{{0, 0, 1}, {1, 0, 1}, {0, 0, 0}}));
    }


    public int findChampion(int[][] grid) {
        int teams = grid.length;

        for (int row = 0; row < teams; row++) {
            int wins = 0;

            for (int col = 0; col < teams; col++) {
                if (row == col) continue;
                if (grid[row][col] == 0) break;
                if (grid[row][col] == 1) wins++;
            }

            if (wins == teams - 1) return row;
        }
        return -1;
    }
}
