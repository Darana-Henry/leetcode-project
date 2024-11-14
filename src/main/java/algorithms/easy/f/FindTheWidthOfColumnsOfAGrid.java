//https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/
package algorithms.easy.f;

public class FindTheWidthOfColumnsOfAGrid {
    public static void main(String[] args) {
        FindTheWidthOfColumnsOfAGrid width = new FindTheWidthOfColumnsOfAGrid();
        System.out.println("Output:\t" + width.findColumnWidth(new int[][]{{1}, {22}, {333}}));
        System.out.println("Output:\t" + width.findColumnWidth(new int[][]{{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}}));
    }

    public int[] findColumnWidth(int[][] grid) {
        int[] answer = new int[grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++)
                answer[col] = Math.max(answer[col], (grid[row][col] + "").length());
        }

        return answer;
    }
}
