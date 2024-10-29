//https://leetcode.com/problems/perfect-squares/
package algorithms.medium.p;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        PerfectSquares perfect = new PerfectSquares();
        System.out.println("Output:\t" + perfect.numSquares(12));
        System.out.println("Output:\t" + perfect.numSquares(13));
    }

    public int numSquares(int n) {
        int maxRoot = (int) Math.sqrt(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= maxRoot; i++) {
            int square = i * i;
            for (int j = square; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - square] + 1);
            }
        }
        return dp[n];
    }
}
