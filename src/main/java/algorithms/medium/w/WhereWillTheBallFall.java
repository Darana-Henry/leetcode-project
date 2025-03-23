//https://leetcode.com/problems/where-will-the-ball-fall/
package algorithms.medium.w;

public class WhereWillTheBallFall {
    int rows, cols;
    int[][] grid;

    public static void main(String[] args) {
        WhereWillTheBallFall obj = new WhereWillTheBallFall();
        System.out.println("Output:\t" + obj.findBall(
                new int[][]{{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}}));
        System.out.println("Output:\t" + obj.findBall(new int[][]{{-1}}));
        System.out.println("Output:\t" + obj.findBall(
                new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}}));
    }


    public int[] findBall(int[][] grid) {
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.grid = grid;
        int[] answer = new int[cols];

        for (int col = 0; col < cols; col++)
            answer[col] = drop(0, col);

        return answer;
    }

    public int drop(int row, int col) {
        if (row == rows) return col;
        if (col == 0 && grid[row][col] == -1 || col == cols - 1 && grid[row][col] == 1 || grid[row][col] == 1 && grid[row][col + 1] == -1 || grid[row][col] == -1 && grid[row][col - 1] == 1)
            return -1;
        return grid[row][col] == 1 ? drop(row + 1, col + 1) : drop(row + 1, col - 1);
    }
}
