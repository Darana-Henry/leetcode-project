//https://leetcode.com/problems/n-queens/
package algorithms.hard.n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    List<List<String>> answer = new ArrayList<>();
    int[] cols;
    int[] diags;
    int[] rDiags;
    int size;
    String[][] board;

    public static void main(String[] args) {
        NQueens queens = new NQueens();
        System.out.println("Output:\t" + queens.solveNQueens(4));
        System.out.println("Output:\t" + queens.solveNQueens(1));
    }

    public List<List<String>> solveNQueens(int n) {
        this.size = n;
        cols = new int[n];
        diags = new int[2 * n];
        rDiags = new int[2 * n];
        board = new String[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], ".");

        backtrack(0);
        return answer;
    }

    public void backtrack(int row) {
        if (row == size) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < size; i++)
                solution.add(String.join("", board[i]));
            answer.add(solution);
            return;
        }

        for (int col = 0; col < size; col++) {
            if (cols[col] + diags[row + col] + rDiags[size - row + col] == 0) {
                board[row][col] = "Q";
                cols[col] = diags[row + col] = rDiags[size - row + col] = 1;
                backtrack(row + 1);
                cols[col] = diags[row + col] = rDiags[size - row + col] = 0;
                board[row][col] = ".";
            }
        }
    }
}
