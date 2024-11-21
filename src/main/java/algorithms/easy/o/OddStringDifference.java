//https://leetcode.com/problems/odd-string-difference/
package algorithms.easy.o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddStringDifference {
    public static void main(String[] args) {
        OddStringDifference odd = new OddStringDifference();
        System.out.println("Output:\t" + odd.oddString(new String[]{"adc", "wzy", "abc"}));
        System.out.println("Output:\t" + odd.oddString(new String[]{"aaa", "bob", "ccc", "ddd"}));
    }

    public String oddString(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            int n = word.length();
            char[] diff = new char[n - 1];

            for (int i = 0; i < n - 1; i++)
                diff[i] = (char) (word.charAt(i + 1) - word.charAt(i));

            String key = String.valueOf(diff);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        for (List<String> word : map.values())
            if (word.size() == 1) return word.get(0);

        return "";
    }
}
