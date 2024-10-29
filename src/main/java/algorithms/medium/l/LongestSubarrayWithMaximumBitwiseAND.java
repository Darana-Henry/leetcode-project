//https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/
package algorithms.medium.l;


public class LongestSubarrayWithMaximumBitwiseAND {
    public static void main(String[] args) {
        LongestSubarrayWithMaximumBitwiseAND maxBitwise = new LongestSubarrayWithMaximumBitwiseAND();
        System.out.println("Output:\t" + maxBitwise.longestSubarray(new int[]{1, 2, 3, 3, 2, 2}));
        System.out.println("Output:\t" + maxBitwise.longestSubarray(new int[]{1, 2, 3, 4}));
    }

    public int longestSubarray(int[] nums) {
        int max = 0;
        int maxLen = 0;
        int currLen = 0;

        for (int num : nums)
            max = Math.max(max, num);

        for (int num : nums) {
            if (num == max) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else currLen = 0;
        }

        return maxLen;
    }
}
