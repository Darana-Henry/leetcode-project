//https://leetcode.com/problems/count-the-number-of-consistent-strings/
package algorithms.easy.c;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        CountTheNumberOfConsistentStrings count = new CountTheNumberOfConsistentStrings();
        System.out.println("Output:\t" + count.countConsistentStringsWithArrays("ab",
                new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.println("Output:\t" + count.countConsistentStringsWithArrays("abc",
                new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
        System.out.println("Output:\t" + count.countConsistentStringsWithArrays("cad",
                new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
        System.out.println("Output:\t" + count.countConsistentStringsWithSet("ab",
                new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.println("Output:\t" + count.countConsistentStringsWithSet("abc",
                new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
        System.out.println("Output:\t" + count.countConsistentStringsWithSet("cad",
                new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}));
    }

    public int countConsistentStringsWithArrays(String allowed, String[] words) {
        int consistent = words.length;
        int[] store = new int[26];

        for (char c : allowed.toCharArray())
            store[c - 'a']++;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (store[c - 'a'] <= 0) {
                    consistent--;
                    break;
                }
            }
        }
        return consistent;
    }

    public int countConsistentStringsWithSet(String allowed, String[] words) {
        int consistent = 0;
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray())
            set.add(ch);

        for (String word : words) {
            int count = 0;
            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) break;
                else count++;
            }
            if (count == word.length()) consistent++;
        }

        return consistent;
    }
}
