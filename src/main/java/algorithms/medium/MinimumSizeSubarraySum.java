//https://leetcode.com/problems/minimum-size-subarray-sum/
package algorithms.medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        MinimumSizeSubarraySum minSum = new MinimumSizeSubarraySum();
        System.out.println("Output:\t" + minSum.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + minSum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println("Output:\t" + minSum.minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println("Output:\t" + minSum.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                min = Math.min(min, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
