//https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
package algorithms.easy.f;

public class FindWinnerOnATicTacToeGame {
    public static void main(String[] args) {
        FindWinnerOnATicTacToeGame winner = new FindWinnerOnATicTacToeGame();
        System.out.println("Output:\t" + winner.tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
        System.out.println("Output:\t" + winner.tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
        System.out.println("Output:\t" + winner.tictactoe(
                new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}));
        System.out.println(
                "Output:\t" + winner.tictactoeOptimized(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
        System.out.println(
                "Output:\t" + winner.tictactoeOptimized(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
        System.out.println("Output:\t" + winner.tictactoeOptimized(
                new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}));

    }

    public String tictactoe(int[][] moves) {
        boolean isPlayerA = true;
        char[][] board = new char[3][3];

        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];
            if (isPlayerA) board[row][col] = 'X';
            else board[row][col] = 'O';
            isPlayerA = !isPlayerA;
        }

        return checkBoard(board);
    }

    public String checkBoard(char[][] board) {
        for (int row = 0; row < 3; row++) {
            int countA = 0, countB = 0;
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == 'X') countA++;
                else if (board[row][col] == 'O') countB++;
            }
            if (countA == 3) return "A";
            if (countB == 3) return "B";
        }

        for (int col = 0; col < 3; col++) {
            int countA = 0, countB = 0;
            for (int row = 0; row < 3; row++) {
                if (board[row][col] == 'X') countA++;
                else if (board[row][col] == 'O') countB++;
            }
            if (countA == 3) return "A";
            if (countB == 3) return "B";
        }

        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return "A";
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return "B";
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') return "A";
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') return "B";

        int count = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == 'X' || board[row][col] == 'O') count++;
            }
        }

        return count == 9 ? "Draw" : "Pending";
    }

    public String tictactoeOptimized(int[][] moves) {
        int totalMoves = moves.length;
        int[] counts = new int[8];

        for (int move = totalMoves - 1; move >= 0; move -= 2) {
            int row = moves[move][0];
            int col = moves[move][1];
            counts[row]++;
            counts[col + 3]++;
            if (row == col) counts[6]++;
            if (row + col == 2) counts[7]++;
            if (counts[row] == 3 || counts[col + 3] == 3 || counts[6] == 3 || counts[7] == 3)
                return move % 2 == 0 ? "A" : "B";
        }
        return totalMoves == 9 ? "Draw" : "Pending";
    }
}
