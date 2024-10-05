//https://leetcode.com/problems/delete-greatest-value-in-each-row/
package algorithms.easy.d;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        DeleteGreatestValueInEachRow delete = new DeleteGreatestValueInEachRow();
        System.out.println("Output:\t" + delete.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
        System.out.println("Output:\t" + delete.deleteGreatestValue(new int[][]{{10}}));
    }

    public int deleteGreatestValue(int[][] grid) {
        int answer = 0;
        for (int[] row : grid)
            Arrays.sort(row);

        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++)
                max = Math.max(max, grid[row][col]);
            answer += max;
        }
        return answer;
    }
}
