//https://leetcode.com/problems/count-ways-to-build-good-strings/
package algorithms.medium.c;

import java.util.Arrays;

public class CountWaysToBuildGoodStrings {

    int lower, higher, zeros, ones, mod = 1000000007;
    int[] dp;

    public static void main(String[] args) {
        CountWaysToBuildGoodStrings obj = new CountWaysToBuildGoodStrings();
        System.out.println("Output:\t" + obj.countGoodStrings(3, 3, 1, 1));
        System.out.println("Output:\t" + obj.countGoodStrings(2, 3, 1, 2));
    }

    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high + 1];
        Arrays.fill(dp, -1);

        lower = low;
        higher = high;
        zeros = zero;
        ones = one;

        return dfs(0);
    }

    public int dfs(int index) {
        if (index > higher) return 0;
        if (dp[index] != -1) return dp[index];
        long answer = 0;
        if (index >= lower && index <= higher) answer++;
        answer += dfs(index + zeros) + dfs(index + ones);
        answer %= mod;
        dp[index] = (int) answer;
        return dp[index];
    }
}
