//https://leetcode.com/problems/substring-with-concatenation-of-all-words/
package algorithms.hard.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        SubstringWithConcatenationOfAllWords allWords = new SubstringWithConcatenationOfAllWords();
        System.out.println("Output:\t" + allWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        System.out.println("Output:\t" + allWords.findSubstring("wordgoodgoodgoodbestword",
                new String[]{"word", "good", "best", "word"}));
        System.out.println(
                "Output:\t" + allWords.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || s.length() == 0 || words.length == 0) return new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        List<Integer> list = new ArrayList<>();
        int sLen = s.length();
        int wordsLen = words.length;
        int eachWordLen = words[0].length();

        for (int i = 0; i < sLen - wordsLen * eachWordLen + 1; i++) {
            String sub = s.substring(i, i + wordsLen * eachWordLen);
            if (isConcat(sub, map, eachWordLen)) list.add(i);
        }
        return list;
    }

    public boolean isConcat(String sub, Map<String, Integer> map, int eachWordLen) {
        Map<String, Integer> seen = new HashMap<>();
        for (int i = 0; i < sub.length(); i += eachWordLen) {
            String sWord = sub.substring(i, i + eachWordLen);
            seen.put(sWord, seen.getOrDefault(sWord, 0) + 1);
        }
        return seen.equals(map);
    }
}
