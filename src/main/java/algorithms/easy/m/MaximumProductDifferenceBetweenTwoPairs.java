//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
package algorithms.easy.m;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        MaximumProductDifferenceBetweenTwoPairs maxProd = new MaximumProductDifferenceBetweenTwoPairs();
        System.out.println("Output:\t" + maxProd.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
        System.out.println("Output:\t" + maxProd.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}
