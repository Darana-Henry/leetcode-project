//https://leetcode.com/problems/word-break/
package algorithms.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        WordBreak word = new WordBreak();
        System.out.println("Output:\t" + word.wordBreakWithHashSet("leetcode", new ArrayList<>() {
            {
                add("leet");
                add("code");
            }
        }));
        System.out.println("Output:\t" + word.wordBreakWithHashSet("applepenapple", new ArrayList<>() {
            {
                add("apple");
                add("pen");
            }
        }));
        System.out.println("Output:\t" + word.wordBreakWithHashSet("catsandog", new ArrayList<>() {
            {
                add("cats");
                add("dog");
                add("sand");
                add("and");
                add("cat");
            }
        }));

        System.out.println("Output:\t" + word.wordBreak("leetcode", new ArrayList<>() {
            {
                add("leet");
                add("code");
            }
        }));
        System.out.println("Output:\t" + word.wordBreak("applepenapple", new ArrayList<>() {
            {
                add("apple");
                add("pen");
            }
        }));
        System.out.println("Output:\t" + word.wordBreak("catsandog", new ArrayList<>() {
            {
                add("cats");
                add("dog");
                add("sand");
                add("and");
                add("cat");
            }
        }));

    }

    public boolean wordBreakWithHashSet(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || dp[j - 1]) {
                    if (wordDict.contains(s.substring(j, i + 1))) {
                        dp[i] = true;
                        break;
                    }

                }
            }
        }
        return dp[n - 1];
    }
}
