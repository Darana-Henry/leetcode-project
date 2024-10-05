//https://leetcode.com/problems/longest-palindrome/
package algorithms.easy.l;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args) {

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println("Output:\t" + longestPalindrome.longestPalindrome("abccccdd"));
        System.out.println("Output:\t" + longestPalindrome.longestPalindrome("a"));
    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> wordCount = new HashMap<>();
        int longest = 0;

        for (char ch : s.toCharArray()) {
            if (wordCount.containsKey(ch)) {
                int currentCount = wordCount.get(ch);
                wordCount.put(ch, ++currentCount);
            } else
                wordCount.put(ch, 1);
        }

        for (HashMap.Entry<Character, Integer> e : wordCount.entrySet()) {
            longest += e.getValue() / 2 * 2;
            if (longest % 2 == 0 & e.getValue() % 2 == 1)
                longest += 1;
        }

        return longest;
    }
}
