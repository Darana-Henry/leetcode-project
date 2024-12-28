//https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/
package algorithms.hard.m;

public class MaximumSumOf3NonOverlappingSubarrays {
    public static void main(String[] args) {
        MaximumSumOf3NonOverlappingSubarrays obj = new MaximumSumOf3NonOverlappingSubarrays();
        System.out.println("Output:\t" + obj.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2));
        System.out.println("Output:\t" + obj.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}, 2));
    }

    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int sum = 0, maxSum = 0;
        int[] max3 = new int[3];

        int sub = nums.length - k + 1;
        int[] subSum = new int[sub];
        int[] maxLeft = new int[sub];
        int[] maxRight = new int[sub];

        if (nums == null || nums.length < k * 3) return new int[]{};

        for (int i = 0; i < k; i++)
            sum += nums[i];

        subSum[0] = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            subSum[i - k + 1] = sum;
        }

        for (int i = 1; i < sub; i++)
            maxLeft[i] = (subSum[i] > subSum[maxLeft[i - 1]]) ? i : maxLeft[i - 1];

        maxRight[sub - 1] = sub - 1;

        for (int i = sub - 2; i >= 0; i--)
            maxRight[i] = (subSum[i] >= subSum[maxRight[i + 1]]) ? i : maxRight[i + 1];

        for (int i = k; i < sub - k; i++) {
            int cur = subSum[maxLeft[i - k]] + subSum[i] + subSum[maxRight[i + k]];
            if (cur > maxSum) {
                maxSum = cur;
                max3 = new int[]{maxLeft[i - k], i, maxRight[i + k]};
            }
        }

        return max3;
    }
}
