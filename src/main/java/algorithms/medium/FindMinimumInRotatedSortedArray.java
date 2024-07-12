//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
package algorithms.medium;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray findMin = new FindMinimumInRotatedSortedArray();
        System.out.println("Output:\t" + findMin.findMinBruteForce(new int[]{3, 4, 5, 1, 2}));
        System.out.println("Output:\t" + findMin.findMinOptimized(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println("Output:\t" + findMin.findMinOptimized(new int[]{11, 13, 15, 17}));
    }

    public int findMinBruteForce(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public int findMinOptimized(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }
}
