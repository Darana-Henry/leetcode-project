//https://leetcode.com/problems/maximum-average-pass-ratio/
package algorithms.medium.m;

import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
    public static void main(String[] args) {
        MaximumAveragePassRatio obj = new MaximumAveragePassRatio();
        System.out.println("Output:\t" + obj.maxAverageRatio(new int[][]{{1, 2}, {3, 5}, {2, 2}}, 2));
        System.out.println("Output:\t" + obj.maxAverageRatio(new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4));
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> {
            double impA = (a[0] + 1) / (a[1] + 1) - a[0] / a[1];
            double impB = (b[0] + 1) / (b[1] + 1) - b[0] / b[1];
            return Double.compare(impB, impA);
        });

        for (int[] cls : classes)
            pq.offer(new double[]{cls[0], cls[1]});

        while (extraStudents-- > 0) {
            double[] curr = pq.poll();
            pq.offer(new double[]{curr[0] + 1, curr[1] + 1});
        }

        double avg = 0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            avg += curr[0] / curr[1];
        }

        return avg / classes.length;
    }
}
