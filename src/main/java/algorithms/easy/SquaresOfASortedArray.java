//https://leetcode.com/problems/squares-of-a-sorted-array/
package algorithms.easy;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        SquaresOfASortedArray squares = new SquaresOfASortedArray();
        System.out.println("Output:\t" + squares.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
        System.out.println("Output:\t" + squares.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
        System.out.println("Output:\t" + squares.sortedSquaresOptimized(new int[]{-4, -1, 0, 3, 10}));
        System.out.println("Output:\t" + squares.sortedSquaresOptimized(new int[]{-7, -3, 2, 3, 11}));
    }

    public int[] sortedSquaresOptimized(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                ans[i] = nums[left] * nums[left];
                left++;
            } else {
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
