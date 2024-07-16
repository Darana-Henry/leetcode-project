package algorithms.medium;


import java.util.HashSet;

public class RottingOranges {

    public static void main(String[] args) {
        RottingOranges rottingOranges = new RottingOranges();
        System.out.println("Output:\t" + rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(
                "Output:\t" + rottingOranges.orangesRottingOptimized(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        System.out.println("Output:\t" + rottingOranges.orangesRottingOptimized(new int[][]{{0, 2}}));
    }

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        int minutes = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        HashSet<String> fresh = new HashSet<>();
        HashSet<String> rotten = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1) fresh.add("" + i + j);
                else if (grid[i][j] == 2) rotten.add("" + i + j);
            }
        }

        while (fresh.size() > 0) {
            HashSet<String> infected = new HashSet<>();
            for (String s : rotten) {
                for (int[] direction : directions) {
                    int nextI = direction[0] + s.charAt(0) - '0';
                    int nextJ = direction[1] + s.charAt(1) - '0';

                    if (fresh.contains("" + nextI + nextJ)) {
                        fresh.remove("" + nextI + nextJ);
                        infected.add("" + nextI + nextJ);
                    }

                }
            }
            if (infected.size() == 0) return -1;

            rotten = infected;
            minutes++;
        }
        return minutes;
    }

    public int orangesRottingOptimized(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) rotAdjacent(grid, i, j, 2);
            }
        }

        int minutes = 2;
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        }

        return minutes - 2;
    }

    private void rotAdjacent(int[][] grid, int i, int j, int minutes) {
        if (i < 0 || i >= grid.length /* out of bounds */ || j < 0 || j >= grid[0].length /* out of bounds */ || grid[i][j] == 0 /* empty cell */ || (1 < grid[i][j] && grid[i][j] < minutes) /* this orange is already rotten by another rotten orange */)
            return;
        else {
            grid[i][j] = minutes;
            rotAdjacent(grid, i - 1, j, minutes + 1);
            rotAdjacent(grid, i + 1, j, minutes + 1);
            rotAdjacent(grid, i, j - 1, minutes + 1);
            rotAdjacent(grid, i, j + 1, minutes + 1);
        }
    }
}
