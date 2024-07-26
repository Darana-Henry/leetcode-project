//https://leetcode.com/problems/merge-intervals/description/
package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals merge = new MergeIntervals();
        System.out.println("Output:\t" + merge.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        System.out.println("Output:\t" + merge.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        List<int[]> answer = new ArrayList<>();
        int[] current = intervals[0];
        answer.add(current);

        for (int[] interval : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];
            int intervalStart = interval[0];
            int intervalEnd = interval[1];

            if (currentEnd >= intervalStart)
                current[1] = Math.max(currentEnd, intervalEnd);
            else {
                current = interval;
                answer.add(interval);
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }
}
