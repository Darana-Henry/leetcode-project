//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
package algorithms.medium.m;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray obj = new MinimizeMaximumPairSumInArray();
        System.out.println("Output:\t" + obj.minPairSum(new int[]{3, 5, 2, 3}));
        System.out.println("Output:\t" + obj.minPairSum(new int[]{3, 5, 4, 2, 4, 6}));
    }

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int answer = 0, n = nums.length;

        for (int i = 0; i < n / 2; i++)
            answer = Math.max(answer, nums[i] + nums[n - 1 - i]);

        return answer;
    }
}
