//https://leetcode.com/problems/decode-ways/
package algorithms.medium.d;

public class DecodeWays {
    public static void main(String[] args) {
        DecodeWays dw = new DecodeWays();
        System.out.println("Output:\t" + dw.numDecodings("12"));
        System.out.println("Output:\t" + dw.numDecodings("226"));
        System.out.println("Output:\t" + dw.numDecodings("06"));
    }

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int current = Integer.valueOf(s.substring(i - 1, i));
            int last2 = Integer.valueOf(s.substring(i - 2, i));
            if (current >= 1) dp[i] += dp[i - 1];
            if (last2 >= 10 && last2 <= 26) dp[i] += dp[i - 2];
        }
        return dp[s.length()];
    }
}
