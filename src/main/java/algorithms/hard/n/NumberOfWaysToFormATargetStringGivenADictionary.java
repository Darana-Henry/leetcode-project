//https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/
package algorithms.hard.n;

public class NumberOfWaysToFormATargetStringGivenADictionary {
    public static void main(String[] args) {
        NumberOfWaysToFormATargetStringGivenADictionary obj = new NumberOfWaysToFormATargetStringGivenADictionary();
        System.out.println("Output:\t" + obj.numWays(new String[]{"acca", "bbbb", "caca"}, "aba"));
        System.out.println("Output:\t" + obj.numWays(new String[]{"abba", "baab"}, "bab"));
    }

    public int numWays(String[] words, String target) {
        int wordsLen = words[0].length();
        int tLen = target.length();
        int mod = 1000000007;
        int[] dp = new int[tLen + 1];
        int[][] count = new int[wordsLen][26];
        dp[0] = 1;

        for (String word : words)
            for (int i = 0; i < wordsLen; i++)
                count[i][word.charAt(i) - 'a']++;

        for (int i = 0; i < wordsLen; i++) {
            for (int j = tLen - 1; j >= 0; j--) {
                dp[j + 1] += (int) ((long) dp[j] * count[i][target.charAt(j) - 'a'] % mod);
                dp[j + 1] %= mod;
            }
        }

        return dp[tLen];
    }
}
