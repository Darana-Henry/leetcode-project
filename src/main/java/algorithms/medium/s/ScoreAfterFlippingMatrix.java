//https://leetcode.com/problems/score-after-flipping-matrix/
package algorithms.medium.s;


public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        ScoreAfterFlippingMatrix obj = new ScoreAfterFlippingMatrix();
        System.out.println("Output:\t" + obj.matrixScore(new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}));
        System.out.println("Output:\t" + obj.matrixScore(new int[][]{{0}}));
    }


    public int matrixScore(int[][] grid) {
        int answer = 0, rows = grid.length, cols = grid[0].length;

        for (int row = 0; row < rows; row++) {
            if (grid[row][0] == 0) {
                for (int col = 0; col < cols; col++)
                    grid[row][col] ^= 1;
            }
        }

        for (int col = 1; col < cols; col++) {
            int count = 0;

            for (int row = 0; row < rows; row++)
                count += grid[row][col];

            if (count < rows - count) {
                for (int row = 0; row < rows; row++)
                    grid[row][col] ^= 1;
            }

        }

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++)
                answer += grid[row][col] * (1 << (cols - 1 - col));

        return answer;
    }
}
