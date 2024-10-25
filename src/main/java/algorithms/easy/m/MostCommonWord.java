//https://leetcode.com/problems/most-common-word/
package algorithms.easy.m;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        MostCommonWord common = new MostCommonWord();
        System.out.println(
                "Output:\t" + common.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                        new String[]{"hit"}));
        System.out.println("Output:\t" + common.mostCommonWord("a.", new String[]{""}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
        String[] words = paragraph.split(" ");
        Collections.addAll(set, banned);

        for (String s : words)
            if (!set.contains(s) && !s.equals("")) map.put(s, map.getOrDefault(s, 0) + 1);

        int maxFreq = 0;
        String answer = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }
}
