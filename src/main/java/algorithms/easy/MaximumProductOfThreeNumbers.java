//https://leetcode.com/problems/maximum-product-of-three-numbers/
package algorithms.easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        MaximumProductOfThreeNumbers product = new MaximumProductOfThreeNumbers();
        System.out.println("Output:\t" + product.maximumProductOptimized(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + product.maximumProductOptimized(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + product.maximumProduct(new int[]{-1, -2, -3}));
    }

    public int maximumProductOptimized(int[] nums) {
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (max1 <= num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 <= num) {
                max3 = max2;
                max2 = num;
            } else if (max3 <= num) {
                max3 = num;
            }

            if (min1 >= num) {
                min2 = min1;
                min1 = num;
            } else if (min2 >= num) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int last3 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int first2andlast1 = nums[n - 1] * nums[0] * nums[1];
        return Math.max(last3, first2andlast1);
    }
}
