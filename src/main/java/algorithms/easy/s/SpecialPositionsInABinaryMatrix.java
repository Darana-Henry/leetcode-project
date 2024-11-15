//https://leetcode.com/problems/special-positions-in-a-binary-matrix/
package algorithms.easy.s;

public class SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        SpecialPositionsInABinaryMatrix special = new SpecialPositionsInABinaryMatrix();
        System.out.println("Output:\t" + special.numSpecial(new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}));
        System.out.println("Output:\t" + special.numSpecial(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rCount = new int[rows];
        int[] cCount = new int[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                rCount[row] += mat[row][col];
                cCount[col] += mat[row][col];
            }
        }

        int answer = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++)
                if (mat[row][col] == 1 && rCount[row] == 1 && cCount[col] == 1) answer++;
        }

        return answer;
    }
}
