//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
package algorithms.easy.l;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        LuckyNumbersInAMatrix luckyNumbers = new LuckyNumbersInAMatrix();
        System.out.println(
                "Output:\t" + luckyNumbers.luckyNumbersViaContradiction(new int[][]{{3, 6}, {7, 1}, {5, 2}, {4, 8}}));
        System.out.println("Output:\t" + luckyNumbers.luckyNumbersViaContradiction(
                new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
        System.out.println("Output:\t" + luckyNumbers.luckyNumbersViaContradiction(
                new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}));
        System.out.println("Output:\t" + luckyNumbers.luckyNumbersViaBruteForce(new int[][]{{7, 8}, {1, 2}}));
    }

    public List<Integer> luckyNumbersViaContradiction(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int rMinMax = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;

            for (int num : row)
                min = Math.min(num, min);

            rMinMax = Math.max(rMinMax, min);
        }

        int cMaxMin = Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length; row++) {
                max = Math.max(max, matrix[row][col]);
            }
            cMaxMin = Math.min(cMaxMin, max);
        }

        if (rMinMax == cMaxMin) output.add(rMinMax);

        return output;
    }

    public List<Integer> luckyNumbersViaBruteForce(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int[] rowMins = new int[matrix.length];
        int[] colMaxs = new int[matrix[0].length];

        int index = 0;
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;
            for (int num : row) {
                min = Math.min(min, num);
            }
            rowMins[index++] = min;
        }

        index = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length; row++) {
                max = Math.max(max, matrix[row][col]);
            }
            colMaxs[index++] = max;
        }

        for (int row : rowMins) {
            for (int col : colMaxs) {
                if (row == col)
                    output.add(row);
            }
        }
        return output;
    }
}