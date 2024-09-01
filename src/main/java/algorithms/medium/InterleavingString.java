//https://leetcode.com/problems/interleaving-string/
package algorithms.medium;

public class InterleavingString {
    public static void main(String[] args) {
        InterleavingString inter = new InterleavingString();
        System.out.println("Output:\t" + inter.isInterleave("aab", "axy", "aaxaby"));
        System.out.println("Output:\t" + inter.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println("Output:\t" + inter.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        System.out.println("Output:\t" + inter.isInterleave("", "", ""));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int l = s3.length();
        if (m + n != l) return false;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int k = i + j - 1;
                if (i > 0) dp[j] &= s1.charAt(i - 1) == s3.charAt(k);
                if (j > 0) dp[j] |= (dp[j - 1] & (s2.charAt(j - 1) == s3.charAt(k)));
            }
        }
        return dp[n];
    }
}
