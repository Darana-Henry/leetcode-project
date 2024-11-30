//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
package algorithms.easy.l;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public static void main(String[] args) {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray longest = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();
        System.out.println("Output:\t" + longest.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2}));
        System.out.println("Output:\t" + longest.longestMonotonicSubarray(new int[]{3, 3, 3, 3}));
        System.out.println("Output:\t" + longest.longestMonotonicSubarray(new int[]{3, 2, 1}));
    }

    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, inc = 1, dec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }
        return max;
    }
}
