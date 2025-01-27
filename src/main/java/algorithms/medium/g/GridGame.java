//https://leetcode.com/problems/grid-game/
package algorithms.medium.g;

public class GridGame {
    public static void main(String[] args) {
        GridGame obj = new GridGame();
        System.out.println("Output:\t" + obj.gridGame(new int[][]{{2, 5, 4}, {1, 5, 1}}));
        System.out.println("Output:\t" + obj.gridGame(new int[][]{{3, 3, 1}, {8, 5, 2}}));
        System.out.println("Output:\t" + obj.gridGame(new int[][]{{1, 3, 1, 15}, {1, 3, 3, 1}}));
    }

    public long gridGame(int[][] grid) {
        long answer = Long.MAX_VALUE, upper = 0, lower = 0;

        for (int i = 0; i < grid[0].length; i++)
            upper += grid[0][i];

        for (int i = 0; i < grid[0].length; i++) {
            upper -= grid[0][i];
            answer = Math.min(answer, Math.max(upper, lower));
            lower += grid[1][i];
        }

        return answer;
    }
}
