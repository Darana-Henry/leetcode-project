//https://leetcode.com/problems/insert-interval/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval insertInterval = new InsertInterval();
        System.out.println("Output:\t" + insertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
        System.out.println("Output:\t" + insertInterval.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                new int[]{4, 8}));
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> answer = new ArrayList<>();
        int index = 0;
        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            answer.add(intervals[index]);
            index++;
        }

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }
        answer.add(newInterval);

        while (index < intervals.length) {
            answer.add(intervals[index]);
            index++;
        }

        return answer.toArray(new int[answer.size()][]);
    }
}
