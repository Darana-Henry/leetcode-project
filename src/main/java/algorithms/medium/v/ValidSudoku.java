//https://leetcode.com/problems/valid-sudoku/
package algorithms.medium.v;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        System.out.println(
                "Output:\t" + validSudoku.isValidSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
        System.out.println(
                "Output:\t" + validSudoku.isValidSudoku(new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch != '.') {
                    if (!set.add(ch + "found in row " + row)
                            || !set.add(ch + "found in col " + col)
                            || !set.add(ch + "found in box " + row / 3 + "-" + col / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
