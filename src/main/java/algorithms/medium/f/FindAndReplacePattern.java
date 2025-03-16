//https://leetcode.com/problems/find-and-replace-pattern/
package algorithms.medium.f;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        FindAndReplacePattern obj = new FindAndReplacePattern();
        System.out.println(
                "Output:\t" + obj.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
        System.out.println("Output:\t" + obj.findAndReplacePattern(new String[]{"a", "b", "c"}, "a"));
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();

        for (String word : words)
            if (match(word, pattern)) answer.add(word);

        return answer;
    }

    public boolean match(String word, String pattern) {
        int[] wCount = new int[128];
        int[] pCount = new int[128];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            char ph = pattern.charAt(i);
            if (wCount[ch] != pCount[ph]) return false;
            wCount[ch] = i + 1;
            pCount[ph] = i + 1;
        }
        return true;
    }
}
