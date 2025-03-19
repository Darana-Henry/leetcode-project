//https://leetcode.com/problems/longest-nice-subarray/
package algorithms.medium.l;

public class LongestNiceSubarray {
    public static void main(String[] args) {
        LongestNiceSubarray obj = new LongestNiceSubarray();
        System.out.println("Output:\t" + obj.longestNiceSubarray(new int[]{1, 3, 8, 48, 10}));
        System.out.println("Output:\t" + obj.longestNiceSubarray(new int[]{3, 1, 5, 11, 13}));
    }

    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0, maxLen = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            while ((usedBits & nums[end]) != 0) {
                usedBits ^= nums[start];
                start++;
            }
            usedBits |= nums[end];
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
