//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
package algorithms.easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        MinimumDifferenceBetweenHighestAndLowestOfKScores min = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
        System.out.println("Output:\t" + min.minimumDifference(new int[]{90}, 1));
        System.out.println("Output:\t" + min.minimumDifference(new int[]{9, 4, 1, 7}, 2));
    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = Integer.MAX_VALUE;

        for (int i = k - 1; i < nums.length; i++)
            answer = Math.min(answer, nums[i] - nums[i - k + 1]);

        return answer;
    }
}
