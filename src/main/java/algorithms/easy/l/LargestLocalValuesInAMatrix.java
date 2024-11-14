//https://leetcode.com/problems/largest-local-values-in-a-matrix/
package algorithms.easy.l;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        LargestLocalValuesInAMatrix largest = new LargestLocalValuesInAMatrix();
        System.out.println("Output:\t" + largest.largestLocal(
                new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}));
        System.out.println("Output:\t" + largest.largestLocal(
                new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}));
    }

    public int[][] largestLocal(int[][] grid) {
        int rows = grid.length;
        int[][] answer = new int[rows - 2][rows - 2];

        for (int row = 0; row <= rows - 3; row++) {
            for (int col = 0; col <= rows - 3; col++) {
                int max = Integer.MIN_VALUE;
                for (int r = row; r <= row + 2; r++) {
                    for (int c = col; c <= col + 2; c++)
                        max = Math.max(max, grid[r][c]);
                }
                answer[row][col] = max;
            }
        }
        return answer;
    }
}
