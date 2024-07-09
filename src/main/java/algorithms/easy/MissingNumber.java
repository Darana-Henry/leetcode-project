//https://leetcode.com/problems/missing-number/description/
package algorithms.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println("Output:\t" + missingNumber.missingNumberBruteForce(new int[]{3, 0, 1}));
        System.out.println("Output:\t" + missingNumber.missingNumberOptimized(new int[]{0, 1}));
        System.out.println("Output:\t" + missingNumber.missingNumberOptimized(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumberBruteForce(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

    public int missingNumberOptimized(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i] - i;
        return nums.length - sum;
    }
}
