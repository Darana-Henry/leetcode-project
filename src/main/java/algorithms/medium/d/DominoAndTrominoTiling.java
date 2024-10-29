//https://leetcode.com/problems/domino-and-tromino-tiling/description
package algorithms.medium.d;

public class DominoAndTrominoTiling {
    public static void main(String[] args) {
        DominoAndTrominoTiling dom = new DominoAndTrominoTiling();
        System.out.println("Output:\t" + dom.numTilings(3));
        System.out.println("Output:\t" + dom.numTilings(1));
    }

    public int numTilings(int n) {
        long[] dp = { 1, 0, 0, 0 };
        int mod = (int) 1e9 + 7;

        for (int i = 1; i <= n; i++) {
            long[] newDP = new long[4];
            newDP[0] = (dp[0] + dp[1] + dp[2] + dp[3]) % mod;
            newDP[1] = (dp[2] + dp[3]) % mod;
            newDP[2] = (dp[1] + dp[3]) % mod;
            newDP[3] = dp[0];
            dp = newDP;
        }

        return (int) dp[0];
    }
}
