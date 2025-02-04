//https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/
package algorithms.medium.f;

public class FindValidMatrixGivenRowAndColumnSums {
    public static void main(String[] args) {
        FindValidMatrixGivenRowAndColumnSums obj = new FindValidMatrixGivenRowAndColumnSums();
        System.out.println("Output:\t" + obj.restoreMatrix(new int[]{3, 8}, new int[]{4, 7}));
        System.out.println("Output:\t" + obj.restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8}));
    }

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;

        int[][] answer = new int[rows][cols];
        int[] rSum = new int[rows];
        int[] cSum = new int[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                answer[row][col] = Math.min(rowSum[row] - rSum[row], colSum[col] - cSum[col]);
                rSum[row] += answer[row][col];
                cSum[col] += answer[row][col];
            }
        }

        return answer;
    }
}
