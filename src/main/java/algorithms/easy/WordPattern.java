//https://leetcode.com/problems/word-pattern/description/
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println("Output:\t" + wordPattern.wordPatternBruteForce("abba", "dog cat cat dog"));
        System.out.println("Output:\t" + wordPattern.wordPatternOptimized("abba", "dog cat cat fish"));
        System.out.println("Output:\t" + wordPattern.wordPatternOptimized("aaaa", "dog cat cat dog"));
    }

    public boolean wordPatternOptimized(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;

    }

    public boolean wordPatternBruteForce(String pattern, String s) {

        if (pattern.length() != s.split(" ").length)
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String st = s.split(" ")[i].trim();

            if (map.containsKey(ch)) {
                if (!st.equalsIgnoreCase(map.get(ch)))
                    return false;
            } else {
                if (map.containsValue(st))
                    return false;
                else
                    map.put(ch, st);
            }

        }
        return true;
    }
}
