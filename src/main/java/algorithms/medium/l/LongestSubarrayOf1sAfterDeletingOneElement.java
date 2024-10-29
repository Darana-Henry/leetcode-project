//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
package algorithms.medium.l;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        LongestSubarrayOf1sAfterDeletingOneElement longestSubarray = new LongestSubarrayOf1sAfterDeletingOneElement();
        System.out.println("Output:\t" + longestSubarray.longestSubarray(new int[]{1, 1, 0, 1}));
        System.out.println("Output:\t" + longestSubarray.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        System.out.println("Output:\t" + longestSubarray.longestSubarray(new int[]{1, 1, 1}));
    }

    public int longestSubarray(int[] nums) {

        int start = 0;
        int zeroCount = 0;
        int longestWindow = 0;

        for (int i = 0; i < nums.length; i++) {
            zeroCount += nums[i] == 0 ? 1 : 0;

            while (zeroCount > 1) {
                zeroCount -= nums[start] == 0 ? 1 : 0;
                start++;
            }

            longestWindow = Math.max(longestWindow, i - start);
        }

        return longestWindow;
    }

}
