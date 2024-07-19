//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
package algorithms.easy;

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
        System.out.println("Output:\t" + luckyNumbers.luckyNumbersViaContradiction(new int[][]{{7, 8}, {1, 2}}));
    }

    public List<Integer> luckyNumbersViaContradiction(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int minMax = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;

            for (int num : row)
                min = Math.min(num, min);

            minMax = Math.max(minMax, min);
        }
        output.add(minMax);
        return output;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        return output;
    }
}