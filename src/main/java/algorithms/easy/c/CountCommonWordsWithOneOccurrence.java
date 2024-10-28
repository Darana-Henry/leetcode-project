//https://leetcode.com/problems/count-common-words-with-one-occurrence/
package algorithms.easy.c;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        CountCommonWordsWithOneOccurrence common = new CountCommonWordsWithOneOccurrence();
        System.out.println("Output:\t" + common.countWords(new String[]{"leetcode", "is", "amazing", "as", "is"},
                new String[]{"amazing", "leetcode", "is"}));
        System.out.println(
                "Output:\t" + common.countWords(new String[]{"b", "bb", "bbb"}, new String[]{"a", "aa", "aaa"}));
        System.out.println("Output:\t" + common.countWords(new String[]{"a", "ab"}, new String[]{"a", "a", "a", "ab"}));
    }

    public int countWords(String[] words1, String[] words2) {
        int answer = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String word : words1)
            map1.put(word, map1.getOrDefault(word, 0) + 1);

        for (String word : words2)
            map2.put(word, map2.getOrDefault(word, 0) + 1);

        for (String word : words1)
            if (map1.getOrDefault(word, 0) == 1 && map2.getOrDefault(word, 0) == 1) answer++;

        return answer;
    }
}
