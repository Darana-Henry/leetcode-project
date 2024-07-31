//https://leetcode.com/problems/longest-palindromic-substring/
package algorithms.medium;

import java.util.Arrays;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring palindrome = new LongestPalindromicSubstring();
        System.out.println("Output:\t" + palindrome.longestPalindrome("babad"));
        System.out.println("Output:\t" + palindrome.longestPalindromeViaDynamicProgramming("cbbd"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = lengthOfPalindrome(s, i, i);
            int len2 = lengthOfPalindrome(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > (end - start)) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    public int lengthOfPalindrome(String str, int start, int end) {
        if (str == null || start > end) return 0;

        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    public String longestPalindromeViaDynamicProgramming(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (boolean[] row : dp) {
            Arrays.fill(row, true);
        }

        int startIdx = 0;
        int maxLength = 1;

        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[i][j] = false;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];

                    if (dp[i][j] && maxLength < j - i + 1) {
                        maxLength = j - i + 1;
                        startIdx = i;
                    }
                }
            }
        }

        return s.substring(startIdx, startIdx + maxLength);
    }
}
