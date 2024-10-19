//https://leetcode.com/problems/check-if-it-is-a-straight-line/
package algorithms.easy.c;

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        CheckIfItIsAStraightLine straightLine = new CheckIfItIsAStraightLine();
        System.out.println("Output:\t" + straightLine.checkStraightLine(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
        System.out.println("Output:\t" + straightLine.checkStraightLine(
                new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1], x2 = coordinates[1][0], y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int currX = coordinates[i][0];
            int currY = coordinates[i][1];
            if (((currX - x1) * (y2 - y1)) != ((currY - y1) * (x2 - x1))) return false;
        }
        return true;
    }
}
