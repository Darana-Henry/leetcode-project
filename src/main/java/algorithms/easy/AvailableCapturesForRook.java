//https://leetcode.com/problems/available-captures-for-rook/
package algorithms.easy;

public class AvailableCapturesForRook {
    public static void main(String[] args) {
        AvailableCapturesForRook captures = new AvailableCapturesForRook();
        captures.numRookCaptures(
                new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}});
        captures.numRookCaptures(
                new char[][]{{'.', '.', '.', '.', '.', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'}, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'}, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}});
        captures.numRookCaptures(
                new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'p', 'p', '.', 'R', '.', 'p', 'B', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'B', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}});
    }

    public int numRookCaptures(char[][] board) {
        int rookR = -1;
        int rookC = -1;
        int captures = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'R') {
                    rookR = row;
                    rookC = col;
                }
            }
        }

        for (int col = rookC - 1; col >= 0; col--) {
            if (board[rookR][col] == 'B') break;
            if (board[rookR][col] == 'p') {
                captures++;
                break;
            }
        }

        for (int col = rookC + 1; col < cols; col++) {
            if (board[rookR][col] == 'B') break;
            if (board[rookR][col] == 'p') {
                captures++;
                break;
            }
        }

        for (int row = rookR - 1; row >= 0; row--) {
            if (board[row][rookC] == 'B') break;
            if (board[row][rookC] == 'p') {
                captures++;
                break;
            }
        }

        for (int row = rookR + 1; row < rows; row++) {
            if (board[row][rookC] == 'B') break;
            if (board[row][rookC] == 'p') {
                captures++;
                break;
            }
        }

        return captures;
    }
}
