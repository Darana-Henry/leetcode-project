//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
package algorithms.easy.f;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArray gcd = new FindGreatestCommonDivisorOfArray();
        System.out.println("Output:\t" + gcd.findGCD(new int[]{2, 5, 6, 9, 10}));
        System.out.println("Output:\t" + gcd.findGCD(new int[]{7, 5, 6, 8, 3}));
        System.out.println("Output:\t" + gcd.findGCD(new int[]{3, 3}));
        System.out.println("Output:\t" + gcd.findGCDOptimized(new int[]{2, 5, 6, 9, 10}));
        System.out.println("Output:\t" + gcd.findGCDOptimized(new int[]{7, 5, 6, 8, 3}));
        System.out.println("Output:\t" + gcd.findGCDOptimized(new int[]{3, 3}));
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int findGCDOptimized(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

}
