//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        FindKPairsWithSmallestSums k = new FindKPairsWithSmallestSums();
        System.out.println("Output:\t" + k.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
        System.out.println("Output:\t" + k.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2));
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        for (int i = 0; i < Math.min(n, k); i++)
            q.offer(new int[]{nums1[i] + nums2[0], i, 0});

        while (!q.isEmpty() && k > 0) {
            int[] currentPair = q.poll();
            answer.add(Arrays.asList(nums1[currentPair[1]], nums2[currentPair[2]]));
            k--;
            if (currentPair[2] + 1 < m) {
                q.offer(new int[]{nums1[currentPair[1]] + nums2[currentPair[2] + 1], currentPair[1],
                        currentPair[2] + 1});
            }
        }
        return answer;
    }
}
