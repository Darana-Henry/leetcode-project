//https://leetcode.com/problems/longest-word-in-dictionary/
package algorithms.medium.c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public static void main(String[] args) {
        LongestWordInDictionary obj = new LongestWordInDictionary();
        System.out.println("Output:\t" + obj.longestWord(new String[]{"w", "wo", "wor", "worl", "world"}));
        System.out.println(
                "Output:\t" + obj.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }

    public String longestWord(String[] words) {
        String answer = "";
        Arrays.sort(words);
        Set<String> set = new HashSet<>();

        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                if (word.length() > answer.length()) answer = word;
                set.add(word);
            }

        }
        return answer;
    }
}
