//https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/
package algorithms.easy.t;

public class TheEmployeeThatWorkedOnTheLongestTask {
    public static void main(String[] args) {
        TheEmployeeThatWorkedOnTheLongestTask longest = new TheEmployeeThatWorkedOnTheLongestTask();
        System.out.println("Output:\t" + longest.hardestWorker(10, new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 15}}));
        System.out.println("Output:\t" + longest.hardestWorker(26, new int[][]{{1, 1}, {3, 7}, {2, 12}, {7, 17}}));
        System.out.println("Output:\t" + longest.hardestWorker(2, new int[][]{{0, 10}, {1, 20}}));
    }

    public int hardestWorker(int n, int[][] logs) {
        int answer = logs[0][0], curr = logs[0][1];
        for (int i = 1; i < logs.length; i++) {
            int time = logs[i][1] - logs[i - 1][1];
            if (time > curr || (time == curr && logs[i][0] < answer)) {
                answer = logs[i][0];
                curr = time;
            }
        }
        return answer;
    }
}
