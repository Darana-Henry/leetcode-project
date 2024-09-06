//https://leetcode.com/problems/surrounded-regions/
package algorithms.medium;

public class SurroundedRegions {
    char[][] clone;

    public static void main(String[] args) {
        SurroundedRegions regions = new SurroundedRegions();
        regions.solve(
                new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}});
        regions.solve(new char[][]{{'X'}});
    }

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        if (rows == 0 || cols == 0) return;
        this.clone = board;

        for (int row = 0; row < rows; row++) {
            if (board[row][0] == 'O') dfs(row, 0);
            if (board[row][cols - 1] == 'O') dfs(row, cols - 1);
        }

        for (int col = 0; col < cols; col++) {
            if (board[0][col] == 'O') dfs(0, col);
            if (board[rows - 1][col] == 'O') dfs(rows - 1, col);

        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') board[row][col] = 'X';
                if (board[row][col] == 'E') board[row][col] = 'O';
            }
        }
    }

    public void dfs(int row, int col) {
        if (row < 0 || col < 0 || row >= clone.length || col >= clone[row].length || clone[row][col] == 'E' || clone[row][col] == 'X')
            return;

        clone[row][col] = 'E';
        dfs(row - 1, col);
        dfs(row + 1, col);
        dfs(row, col - 1);
        dfs(row, col + 1);
    }
}
