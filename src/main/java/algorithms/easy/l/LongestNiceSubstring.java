//https://leetcode.com/problems/longest-nice-substring/
package algorithms.easy.l;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        LongestNiceSubstring longest = new LongestNiceSubstring();
        System.out.println("Output:\t" + longest.longestNiceSubstring("YazaAay"));
        System.out.println("Output:\t" + longest.longestNiceSubstring("Bb"));
        System.out.println("Output:\t" + longest.longestNiceSubstring("c"));
        System.out.println("Output:\t" + longest.longestNiceSubstringBitMask("YazaAay"));
        System.out.println("Output:\t" + longest.longestNiceSubstringBitMask("Bb"));
        System.out.println("Output:\t" + longest.longestNiceSubstringBitMask("c"));
    }

    public String longestNiceSubstringBitMask(String s) {
        int n = s.length();
        int start = -1;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int lower = 0;
            int upper = 0;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (Character.isLowerCase(ch)) lower |= 1 << (ch - 'a');
                else upper |= 1 << (ch - 'A');

                if (lower == upper && maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    start = i;
                }
            }
        }

        return (start == -1) ? "" : s.substring(start, start + maxLen);
    }

    public String longestNiceSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (charSet.contains(Character.toUpperCase(s.charAt(i))) && charSet.contains(
                    Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        return s;
    }
}
