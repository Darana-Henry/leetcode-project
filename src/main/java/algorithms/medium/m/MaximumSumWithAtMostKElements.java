//https://leetcode.com/problems/maximum-sum-with-at-most-k-elements/
package algorithms.medium.m;

import java.util.PriorityQueue;

public class MaximumSumWithAtMostKElements {
    public static void main(String[] args) {
        MaximumSumWithAtMostKElements obj = new MaximumSumWithAtMostKElements();
        System.out.println("Output:\t" + obj.maxSum(new int[][]{{1, 2}, {3, 4}}, new int[]{1, 2}, 2));
        System.out.println("Output:\t" + obj.maxSum(new int[][]{{5, 3, 7}, {8, 2, 6}}, new int[]{2, 2}, 3));
    }

    public long maxSum(int[][] grid, int[] limits, int k) {
        long sum = 0;
        int rows = grid.length, cols = grid[0].length;
        int[] visited = new int[rows];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                pq.add(new int[]{grid[i][j], i});

        while (k > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            if (visited[curr[1]] < limits[curr[1]]) {
                sum += curr[0];
                visited[curr[1]]++;
                k--;
            }
        }

        return sum;
    }
}
