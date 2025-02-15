//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/
package algorithms.medium.m;

import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValueII {
    public static void main(String[] args) {
        MinimumOperationsToExceedThresholdValueII obj = new MinimumOperationsToExceedThresholdValueII();
        System.out.println("Output:\t" + obj.minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        System.out.println("Output:\t" + obj.minOperations(new int[]{1, 1, 2, 4, 9}, 20));
    }

    public int minOperations(int[] nums, int k) {
        int answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int num : nums)
            pq.offer((long) num);

        while (pq.peek() < k && pq.size() > 1) {
            long x = pq.poll();
            long y = pq.poll();
            long num = Math.min(x, y) * 2 + Math.max(x, y);
            pq.offer(num);
            answer++;
        }

        return answer;
    }
}
