//https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/
package algorithms.medium.f;

import java.util.HashMap;
import java.util.Map;

public class FlipColumnsForMaximumNumberOfEqualRows {
    public static void main(String[] args) {
        FlipColumnsForMaximumNumberOfEqualRows obj = new FlipColumnsForMaximumNumberOfEqualRows();
        System.out.println("Output:\t" + obj.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 1}}));
        System.out.println("Output:\t" + obj.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 0}}));
        System.out.println("Output:\t" + obj.maxEqualRowsAfterFlips(new int[][]{{0, 0, 0}, {0, 0, 1}, {1, 1, 0}}));
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int[] row : matrix) {
            StringBuilder sb = new StringBuilder();

            for (int col = 0; col < row.length; col++)
                if (row[0] == row[col]) sb.append("T");
                else sb.append("F");
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }

        for (int count : map.values())
            answer = Math.max(answer, count);

        return answer;
    }
}
