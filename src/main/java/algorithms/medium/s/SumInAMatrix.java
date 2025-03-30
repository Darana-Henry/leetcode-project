//https://leetcode.com/problems/sum-in-a-matrix/
package algorithms.medium.s;

import java.util.Arrays;

public class SumInAMatrix {
    public static void main(String[] args) {
        SumInAMatrix obj = new SumInAMatrix();
        System.out.println("Output:\t" + obj.matrixSum(new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}}));
        System.out.println("Output:\t" + obj.matrixSum(new int[][]{{1}}));
    }

    public int matrixSum(int[][] nums) {
        int answer = 0;

        for (int[] num : nums)
            Arrays.sort(num);

        for (int col = 0; col < nums[0].length; col++) {
            int max = 0;

            for (int[] row : nums)
                max = Math.max(max, row[col]);

            answer += max;
        }

        return answer;
    }
}
