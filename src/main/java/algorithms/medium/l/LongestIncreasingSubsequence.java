//https://leetcode.com/problems/longest-increasing-subsequence/
package algorithms.medium.l;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
        System.out.println("Output:\t" + subsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println("Output:\t" + subsequence.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println("Output:\t" + subsequence.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
                }
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > dp[maxIndex]) maxIndex = i;
        }

        return dp[maxIndex];
    }
}
