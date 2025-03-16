//https://leetcode.com/problems/rotating-the-box/
package algorithms.medium.r;

import java.util.LinkedList;
import java.util.Queue;

public class RotatingTheBox {
    public static void main(String[] args) {
        RotatingTheBox obj = new RotatingTheBox();
        System.out.println("Output:\t" + obj.rotateTheBox(new char[][]{{'#', '.', '#'}}));
        System.out.println("Output:\t" + obj.rotateTheBox(new char[][]{{'#', '.', '*', '.'}, {'#', '#', '*', '.'}}));
        System.out.println("Output:\t" + obj.rotateTheBox(
                new char[][]{{'#', '#', '*', '.', '*', '.'}, {'#', '#', '#', '*', '.', '.'}, {'#', '#', '#', '.', '#', '.'}}));
    }

    public char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid.length, cols = boxGrid[0].length;
        char[][] answer = new char[cols][rows];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                answer[col][rows - row - 1] = boxGrid[row][col];

        for (int col = 0; col < rows; col++) {
            Queue<Integer> q = new LinkedList<>();
            for (int row = cols - 1; row >= 0; row--) {
                if (answer[row][col] == '*') q.clear();
                else if (answer[row][col] == '.') q.add(row);
                else if (!q.isEmpty()) {
                    answer[q.poll()][col] = '#';
                    answer[row][col] = '.';
                    q.add(row);
                }
            }
        }

        return answer;
    }
}
