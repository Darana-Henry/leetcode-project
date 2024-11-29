//https://leetcode.com/problems/maximum-ascending-subarray-sum/
package algorithms.easy.m;

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        MaximumAscendingSubarraySum ascend = new MaximumAscendingSubarraySum();
        System.out.println("Output:\t" + ascend.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
        System.out.println("Output:\t" + ascend.maxAscendingSum(new int[]{10, 20, 30, 40, 50}));
        System.out.println("Output:\t" + ascend.maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12}));
    }

    public int maxAscendingSum(int[] nums) {
        int max = 0, curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] < nums[i]) {
                curr += nums[i];
                max = Math.max(max, curr);
            } else curr = nums[i];
        }

        return max;
    }
}
