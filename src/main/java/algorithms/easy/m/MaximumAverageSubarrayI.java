//https://leetcode.com/problems/maximum-average-subarray-i/description/
package algorithms.easy.m;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        MaximumAverageSubarrayI maxAvg = new MaximumAverageSubarrayI();
        System.out.println("Output:\t" + maxAvg.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println("Output:\t" + maxAvg.findMaxAverage(new int[]{5}, 1));
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        int runningSum = 0;

        // Initialize the first window
        for (int i = 0; i < k; i++)
            runningSum += nums[i];

        maxAverage = Math.max(maxAverage, (double) runningSum / k);

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            runningSum += nums[i] - nums[i - k];
            maxAverage = Math.max(maxAverage, (double) runningSum / k);
        }

        return maxAverage;
    }

}
