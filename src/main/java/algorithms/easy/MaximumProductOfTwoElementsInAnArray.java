//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
package algorithms.easy;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray maxProd = new MaximumProductOfTwoElementsInAnArray();
        System.out.println("Output:\t" + maxProd.maxProduct(new int[]{3, 4, 5, 2}));
        System.out.println("Output:\t" + maxProd.maxProduct(new int[]{1, 5, 4, 5}));
        System.out.println("Output:\t" + maxProd.maxProduct(new int[]{3, 7}));
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = nums.length - 2;
        return (nums[i] - 1) * (nums[j] - 1);
    }
}
