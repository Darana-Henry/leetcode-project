//https://leetcode.com/problems/n-queens-ii/
package algorithms.hard.n;

public class NQueensII {
    public static void main(String[] args) {
        NQueensII queens = new NQueensII();
        System.out.println("Output:\t" + queens.totalNQueens(4));
        System.out.println("Output:\t" + queens.totalNQueens(1));
    }

    int size;
    int answer;
    boolean[] cols;
    boolean[] diags;
    boolean[] rDiags;

    public int totalNQueens(int n) {
        this.size = n;
        this.answer = 0;
        cols = new boolean[n];
        diags = new boolean[2 * n];
        rDiags = new boolean[2 * n];
        backtrack(0);
        return answer;
    }

    public void backtrack(int row) {
        if (row == size) {
            answer++;
            return;
        }

        for (int col = 0; col < size; col++) {
            int positive = row + col;
            int negative = size + row - col;
            if (cols[col] || diags[positive] || rDiags[negative]) continue;

            cols[col] = true;
            diags[positive] = true;
            rDiags[negative] = true;
            backtrack(row + 1);
            cols[col] = false;
            diags[positive] = false;
            rDiags[negative] = false;
        }
    }
}
