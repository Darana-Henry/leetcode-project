//https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
package algorithms.easy.m;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        MaximumSumWithExactlyKElements maxSum = new MaximumSumWithExactlyKElements();
        System.out.println("Output:\t" + maxSum.maximizeSum(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println("Output:\t" + maxSum.maximizeSum(new int[]{5, 5, 5}, 2));
    }

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        return k * nums[nums.length - 1] + k * (k - 1) / 2;
    }
}
