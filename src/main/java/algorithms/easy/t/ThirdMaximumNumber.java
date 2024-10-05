//https://leetcode.com/problems/third-maximum-number/description/
package algorithms.easy.t;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        ThirdMaximumNumber maxNumber = new ThirdMaximumNumber();
        System.out.println("Output:\t" + maxNumber.thirdMax(new int[]{3, 2, 1}));
        System.out.println("Output:\t" + maxNumber.thirdMax(new int[]{1, 2}));
        System.out.println("Output:\t" + maxNumber.thirdMax(new int[]{2, 2, 3, 1}));
    }

    public int thirdMax(int[] nums) {
        int answer = Integer.MAX_VALUE;
        int count = 0;
        Arrays.sort(nums);
        for (int num = nums.length - 1; num >= 0; num--) {
            if (answer != nums[num] || answer == Integer.MAX_VALUE) {
                count++;
                answer = Math.min(answer, nums[num]);
            }
            if (count == 3)
                break;
        }
        return count == 3 ? answer : nums[nums.length - 1];
    }
}
