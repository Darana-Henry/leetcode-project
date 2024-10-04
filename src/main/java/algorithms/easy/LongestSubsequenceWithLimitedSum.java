//https://leetcode.com/problems/longest-subsequence-with-limited-sum/
package algorithms.easy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        LongestSubsequenceWithLimitedSum limitedSum = new LongestSubsequenceWithLimitedSum();
        System.out.println("Output:\t" + limitedSum.answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21}));
        System.out.println("Output:\t" + limitedSum.answerQueries(new int[]{2, 3, 4, 5}, new int[]{1}));
    }

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        for (int i = 0; i < queries.length; i++)
            answer[i] = search(nums, queries[i]);

        return answer;
    }

    private int search(int[] sums, int target) {
        int left = 0, right = sums.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;
            if (sums[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
