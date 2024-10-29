//https://leetcode.com/problems/non-overlapping-intervals/description/
package algorithms.medium.n;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        NonOverlappingIntervals non = new NonOverlappingIntervals();
        System.out.println("Output:\t" + non.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        System.out.println("Output:\t" + non.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
        System.out.println("Output:\t" + non.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int answer = 0;
        int endTime = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < endTime)
                answer++;
            else
                endTime = intervals[i][1];
        }
        return answer;
    }
}
