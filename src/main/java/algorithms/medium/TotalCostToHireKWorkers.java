//https://leetcode.com/problems/total-cost-to-hire-k-workers/
package algorithms.medium;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public static void main(String[] args) {
        TotalCostToHireKWorkers totalCost = new TotalCostToHireKWorkers();
        System.out.println("Output:\t" + totalCost.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
        System.out.println("Output:\t" + totalCost.totalCost(new int[]{1, 2, 4, 1}, 3, 3));
    }

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        long cost = 0;
        int n = costs.length;
        int left = candidates - 1;
        int right = n - candidates;

        for (int i = 0; i < candidates; ++i)
            q.offer(new int[]{costs[i], i});

        for (int i = n - candidates; i < n; ++i) {
            if (i > left)
                q.offer(new int[]{costs[i], i});
        }

        while (k-- > 0) {
            int[] current = q.poll();
            int currentCost = current[0];
            int index = current[1];
            cost += currentCost;

            if (index <= left) {
                if (++left < right) {
                    q.offer(new int[]{costs[left], left});
                }
            }
            if (index >= right) {
                if (--right > left) {
                    q.offer(new int[]{costs[right], right});
                }
            }
        }

        return cost;
    }
}
