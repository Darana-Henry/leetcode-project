//https://leetcode.com/problems/average-waiting-time/
package algorithms.medium.a;

public class AverageWaitingTime {
    public static void main(String[] args) {
        AverageWaitingTime obj = new AverageWaitingTime();
        System.out.println("Output:\t" + obj.averageWaitingTime(new int[][]{{1, 2}, {2, 5}, {4, 3}}));
        System.out.println("Output:\t" + obj.averageWaitingTime(new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
    }

    public double averageWaitingTime(int[][] customers) {
        int nextIdle = 0;
        long waitTime = 0;

        for (int i = 0; i < customers.length; i++) {
            nextIdle = Math.max(nextIdle, customers[i][0]) + customers[i][1];
            waitTime += nextIdle - customers[i][0];
        }

        return (double) waitTime / customers.length;
    }
}
