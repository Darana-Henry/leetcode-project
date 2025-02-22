//https://leetcode.com/problems/maximum-length-of-repeated-subarray/
package algorithms.medium.m;

public class MaximumLengthOfRepeatedSubArray {
    public static void main(String[] args) {
        MaximumLengthOfRepeatedSubArray obj = new MaximumLengthOfRepeatedSubArray();
        System.out.println("Output:\t" + obj.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
        System.out.println("Output:\t" + obj.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}));
    }

    public int findLength(int[] nums1, int[] nums2) {
        int answer = 0;
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];

        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                answer = Math.max(answer, dp[i][j]);
            }
        }
        return answer;
    }
}
