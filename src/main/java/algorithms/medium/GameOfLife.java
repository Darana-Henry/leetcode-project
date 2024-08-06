//https://leetcode.com/problems/game-of-life/
package algorithms.medium;

public class GameOfLife {
    public static void main(String[] args) {
        GameOfLife life = new GameOfLife();
        life.gameOfLife(new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}});
        life.gameOfLife(new int[][]{{1, 1}, {1, 0}});
    }

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int count = 0;
                for (int[] direction : directions) {
                    int adjRow = row + direction[0];
                    int adjCol = col + direction[1];
                    if (adjRow >= 0 && adjRow < rows && adjCol >= 0 && adjCol < cols && (board[adjRow][adjCol] == 1 || board[adjRow][adjCol] == 2))
                        count++;
                }
                if (board[row][col] == 1) {
                    if (count < 2 || count > 3) board[row][col] = 2;
                } else {
                    if (count == 3) board[row][col] = 3;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] %= 2;
            }
        }
    }
}
