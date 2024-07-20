//https://leetcode.com/problems/jump-game-ii/description/
package algorithms.medium;

import java.util.Arrays;

public class JumpGameII {
    public static void main(String[] args) {
        JumpGameII jump = new JumpGameII();
        System.out.println("Output:\t" + jump.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println("Output:\t" + jump.jumpviaBFS(new int[]{2, 3, 0, 1, 4}));
    }

    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;

            for (int j = i + 1; j <= Math.min(n - 1, i + nums[i]); j++)
                min = Math.min(min, dp[j]);

            if (min != Integer.MAX_VALUE) dp[i] = min + 1;
        }
        return dp[0];
    }

    public int jumpviaBFS(int[] nums) {
        int ans = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++ans;
                break;
            }
            if (i == end) {
                ++ans;
                end = farthest;
            }
        }

        return ans;
    }
}
