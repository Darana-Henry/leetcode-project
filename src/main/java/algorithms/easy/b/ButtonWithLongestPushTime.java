//https://leetcode.com/problems/button-with-longest-push-time/
package algorithms.easy.b;

public class ButtonWithLongestPushTime {
    public static void main(String[] args) {
        ButtonWithLongestPushTime obj = new ButtonWithLongestPushTime();
        System.out.println("Output:\t" + obj.buttonWithLongestTime(new int[][]{{1, 2}, {2, 5}, {3, 9}, {1, 15}}));
        System.out.println("Output:\t" + obj.buttonWithLongestTime(new int[][]{{10, 5}, {1, 7}}));
    }

    public int buttonWithLongestTime(int[][] events) {
        int answer = events[0][0], max = events[0][1];

        for (int i = 1; i < events.length; i++) {
            int duration = events[i][1] - events[i - 1][1];
            if (duration > max || (duration == max && events[i][0] < answer)) {
                max = duration;
                answer = events[i][0];
            }
        }

        return answer;
    }
}
