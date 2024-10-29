//https://leetcode.com/problems/coin-change/
package algorithms.medium.c;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        CoinChange coin = new CoinChange();
        System.out.println("Output:\t" + coin.coinChange(new int[]{1, 2, 5}, 11));
        System.out.println("Output:\t" + coin.coinChange(new int[]{2}, 3));
        System.out.println("Output:\t" + coin.coinChange(new int[]{2}, 0));
    }

    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
