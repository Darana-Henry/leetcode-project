//https://leetcode.com/problems/word-search/description/
package algorithms.medium;

public class WordSearch {
    boolean[][] visited;

    public static void main(String[] args) {
        WordSearch word = new WordSearch();
        System.out.println(
                "Output:\t" + word.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                        "ABCCED"));
        System.out.println(
                "Output:\t" + word.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                        "SEE"));
        System.out.println(
                "Output:\t" + word.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                        "ABCB"));
    }

    public boolean exist(char[][] board, String word) {
        int rowSize = board.length;
        int colSize = board[0].length;
        visited = new boolean[rowSize][colSize];

        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (board[row][col] == word.charAt(0) && backtrack(row, col, 0, board, word))
                    return true;
            }
        }
        return false;
    }

    public boolean backtrack(int row, int col, int index, char[][] board, String word) {
        if (index == word.length())
            return true;

        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length || visited[row][col]
                || board[row][col] != word.charAt(index))
            return false;

        visited[row][col] = true;
        if (backtrack(row + 1, col, index + 1, board, word) ||
                backtrack(row - 1, col, index + 1, board, word) ||
                backtrack(row, col + 1, index + 1, board, word) ||
                backtrack(row, col - 1, index + 1, board, word))
            return true;

        visited[row][col] = false;
        return false;
    }
}
