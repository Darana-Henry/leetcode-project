//https://leetcode.com/problems/maximum-gap/
package algorithms.medium.m;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
        MaximumGap obj = new MaximumGap();
        System.out.println("Output:\t" + obj.maximumGap(new int[]{3, 6, 9, 1}));
        System.out.println("Output:\t" + obj.maximumGap(new int[]{10}));
    }

    public int maximumGap(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            answer = Math.max(answer, nums[i + 1] - nums[i]);

        return answer;
    }
}
