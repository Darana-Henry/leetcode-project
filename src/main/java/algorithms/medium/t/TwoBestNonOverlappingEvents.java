//https://leetcode.com/problems/two-best-non-overlapping-events/
package algorithms.medium.t;

import java.util.Arrays;

public class TwoBestNonOverlappingEvents {
    public static void main(String[] args) {
        TwoBestNonOverlappingEvents nonOverlappingEvents = new TwoBestNonOverlappingEvents();
        System.out.println(
                "Output:\t" + nonOverlappingEvents.maxTwoEvents(new int[][]{{1, 3, 2}, {4, 5, 2}, {2, 4, 3}}));
        System.out.println(
                "Output:\t" + nonOverlappingEvents.maxTwoEvents(new int[][]{{1, 3, 2}, {4, 5, 2}, {1, 5, 5}}));
        System.out.println(
                "Output:\t" + nonOverlappingEvents.maxTwoEvents(new int[][]{{1, 5, 3}, {1, 5, 1}, {6, 6, 5}}));
    }

    public int maxTwoEvents(int[][] events) {
        int answer = 0;
        int n = events.length;
        int[] max = new int[n + 1];
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        for (int i = n - 1; i >= 0; i--)
            max[i] = Math.max(max[i + 1], events[i][2]);

        for (int[] event : events) {
            int left = 0, right = n, val = event[2];

            while (left < right) {
                int mid = (left + right) >> 1;
                if (events[mid][0] > event[1]) right = mid;
                else left = mid + 1;
            }

            if (left < n) val += max[left];

            answer = Math.max(answer, val);
        }

        return answer;
    }
}
