//https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/
package algorithms.medium.l;

import java.util.ArrayDeque;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    public static void main(String[] args) {
        LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit equalToLimit = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit();
        System.out.println("Output:\t" + equalToLimit.longestSubarray(new int[]{8, 2, 4, 7}, 4));
        System.out.println("Output:\t" + equalToLimit.longestSubarray(new int[]{10, 1, 2, 4, 7, 2}, 5));
        System.out.println("Output:\t" + equalToLimit.longestSubarray(new int[]{4, 2, 2, 2, 4, 4, 2, 2}, 0));
    }

    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> inc = new ArrayDeque<>();
        ArrayDeque<Integer> dec = new ArrayDeque<>();
        int result = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!inc.isEmpty() && inc.getLast() > nums[right])
                inc.removeLast();

            while (!dec.isEmpty() && dec.getLast() < nums[right])
                dec.removeLast();

            inc.addLast(nums[right]);
            dec.addLast(nums[right]);

            while (dec.getFirst() - inc.getFirst() > limit) {
                if (dec.getFirst() == nums[left])
                    dec.removeFirst();

                if (inc.getFirst() == nums[left])
                    inc.removeFirst();
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
