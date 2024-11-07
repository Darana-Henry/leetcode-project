//https://leetcode.com/problems/make-a-square-with-the-same-color/
package algorithms.easy.m;

public class MakeASquareWithTheSameColor {
    public static void main(String[] args) {
        MakeASquareWithTheSameColor square = new MakeASquareWithTheSameColor();
        System.out.println(
                "Output:\t" + square.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}}));
        System.out.println(
                "Output:\t" + square.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'W', 'B', 'W'}, {'B', 'W', 'B'}}));
        System.out.println(
                "Output:\t" + square.canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'W'}}));
    }

    public boolean canMakeSquare(char[][] grid) {
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                int black = 0;

                for (int cRow = row; cRow < row + 2; cRow++) {
                    for (int cCol = col; cCol < col + 2; cCol++) {
                        if (grid[cRow][cCol] == 'B') black++;
                    }
                }
                if (black != 2) return true;
            }
        }
        return false;
    }
}
