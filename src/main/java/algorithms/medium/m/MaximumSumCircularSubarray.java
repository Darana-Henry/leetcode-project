//https://leetcode.com/problems/maximum-sum-circular-subarray/description/
package algorithms.medium.m;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        MaximumSumCircularSubarray max = new MaximumSumCircularSubarray();
        System.out.println("Output:\t" + max.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        System.out.println("Output:\t" + max.maxSubarraySumCircular(new int[]{5, -3, 5}));
        System.out.println("Output:\t" + max.maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }

    public int maxSubarraySumCircular(int[] nums) {
        int accum = 0;
        int orgMax = kadane(nums);

        for (int i = 0; i < nums.length; i++) {
            accum += nums[i];
            nums[i] = -nums[i];
        }

        int min = kadane(nums);
        int minMax = accum + min;

        if (minMax == 0)
            return orgMax;

        return Math.max(orgMax, minMax);
    }

    public int kadane(int[] nums) {
        int max = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            max = Math.max(maxSum, max);
        }
        return max;
    }
}
