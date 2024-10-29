//https://leetcode.com/problems/maximum-subarray/description/
package algorithms.medium.m;

public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray maxSub = new MaximumSubarray();
        System.out.println("Output:\t" + maxSub.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println("Output:\t" + maxSub.maxSubArray(new int[]{1}));
        System.out.println("Output:\t" + maxSub.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
