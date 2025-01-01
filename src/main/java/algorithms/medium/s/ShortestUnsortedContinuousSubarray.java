//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
package algorithms.medium.s;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray obj = new ShortestUnsortedContinuousSubarray();
        System.out.println("Output:\t" + obj.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println("Output:\t" + obj.findUnsortedSubarray(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + obj.findUnsortedSubarray(new int[]{1}));
        System.out.println("Output:\t" + obj.findUnsortedSubarrayOptimized(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println("Output:\t" + obj.findUnsortedSubarrayOptimized(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + obj.findUnsortedSubarrayOptimized(new int[]{1}));
    }

    public int findUnsortedSubarray(int[] nums) {
        int start = nums.length, end = 0;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < nums.length; i++) {
            if (sorted[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }

        return end - start > 0 ? end - start + 1 : 0;
    }

    public int findUnsortedSubarrayOptimized(int[] nums) {
        boolean notAsc = false;
        int l = 0, r = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) notAsc = true;
            if (notAsc) min = Math.min(min, nums[i]);
        }

        notAsc = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) notAsc = true;
            if (notAsc) max = Math.max(max, nums[i]);
        }

        for (l = 0; l < nums.length; l++)
            if (min < nums[l]) break;

        for (r = nums.length - 1; r >= 0; r--)
            if (max > nums[r]) break;

        return r - l < 0 ? 0 : r - l + 1;
    }
}
