//https://leetcode.com/problems/count-days-without-meetings/description/
package algorithms.medium.c;

import java.util.Arrays;

public class CountDaysWithoutMeetings {
    public static void main(String[] args) {
        CountDaysWithoutMeetings obj = new CountDaysWithoutMeetings();
        System.out.println("Output:\t" + obj.countDays(10, new int[][]{{5, 7}, {1, 3}, {9, 10}}));
        System.out.println("Output:\t" + obj.countDays(5, new int[][]{{2, 4}, {1, 3}}));
        System.out.println("Output:\t" + obj.countDays(6, new int[][]{{1, 6}}));
    }

    public int countDays(int days, int[][] meetings) {
        int answer = 0, last = 0;
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        for (int[] m : meetings) {
            int start = m[0];
            int end = m[1];
            if (last < start) answer += start - last - 1;
            last = Math.max(last, end);
        }

        answer += days - last;
        return answer;
    }
}
