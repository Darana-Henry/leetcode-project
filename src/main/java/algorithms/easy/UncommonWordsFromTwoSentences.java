//https://leetcode.com/problems/uncommon-words-from-two-sentences/
package algorithms.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        UncommonWordsFromTwoSentences uncommon = new UncommonWordsFromTwoSentences();
        System.out.println("Output:\t" + uncommon.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        System.out.println("Output:\t" + uncommon.uncommonFromSentences("apple apple", "banana"));
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String str : s1.split(" "))
            map.put(str, map.getOrDefault(str, 0) + 1);

        for (String str : s2.split(" "))
            map.put(str, map.getOrDefault(str, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() == 1) list.add(entry.getKey());

        return list.toArray(new String[list.size()]);
    }
}
