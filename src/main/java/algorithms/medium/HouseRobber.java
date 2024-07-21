//https://leetcode.com/problems/house-robber/description/
package algorithms.medium;

import algorithms.easy.LuckyNumbersInAMatrix;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        System.out.println("Output:\t" + robber.rob(new int[]{1, 2, 3, 1}));
        System.out.println("Output:\t" + robber.rob(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        int size = nums.length + 1;
        int[] dp = new int[size];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++)
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);

        return dp[nums.length];
    }
}
