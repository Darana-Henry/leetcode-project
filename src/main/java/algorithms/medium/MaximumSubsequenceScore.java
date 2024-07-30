//https://leetcode.com/problems/maximum-subsequence-score/description/
package algorithms.medium;


import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public static void main(String[] args) {
        MaximumSubsequenceScore maxSub = new MaximumSubsequenceScore();
        System.out.println("Output:\t" + maxSub.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3));
        System.out.println("Output:\t" + maxSub.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++)
            pairs[i] = new int[]{nums1[i], nums2[i]};

        Arrays.sort(pairs, (a, b) -> (b[1] - a[1]));

        long maxScore = 0;
        long sum = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            sum += pairs[i][0];
            minHeap.offer(pairs[i][0]);

            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * pairs[i][1]);
                sum -= minHeap.poll();
            }
        }

        return maxScore;
    }
}
