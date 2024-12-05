//https://leetcode.com/problems/spiral-matrix-iii/
package algorithms.medium.s;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        SpiralMatrixIII spiralMatrix = new SpiralMatrixIII();
        System.out.println("Output:\t" + spiralMatrix.spiralMatrixIII(1, 4, 0, 0));
        System.out.println("Output:\t" + spiralMatrix.spiralMatrixIII(5, 6, 1, 5));
    }

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] answer = new int[rows * cols][2];
        int steps = 0, d = 0, count = 1;
        answer[0] = new int[]{rStart, cStart};

        while (count < rows * cols) {
            if (d == 0 || d == 2) steps++;
            for (int i = 0; i < steps; i++) {
                rStart += dir[d][0];
                cStart += dir[d][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    answer[count++] = new int[]{rStart, cStart};
                if (count == rows * cols) return answer;
            }

            d = (d + 1) % 4;
        }

        return answer;
    }
}
