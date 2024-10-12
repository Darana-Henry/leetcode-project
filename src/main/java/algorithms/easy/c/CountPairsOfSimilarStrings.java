//https://leetcode.com/problems/count-pairs-of-similar-strings/https://leetcode.com/problems/count-pairs-of-similar-strings/
package algorithms.easy.c;

import java.util.HashMap;
import java.util.Map;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        CountPairsOfSimilarStrings pairs = new CountPairsOfSimilarStrings();
        System.out.println("Output:\t" + pairs.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        System.out.println("Output:\t" + pairs.similarPairs(new String[]{"aabb", "ab", "ba"}));
        System.out.println("Output:\t" + pairs.similarPairs(new String[]{"nba", "cba", "dba"}));
    }

    public int similarPairs(String[] words) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); i++)
                mask |= 1 << (word.charAt(i) - 'a');

            answer += map.getOrDefault(mask, 0);
            map.put(mask, map.getOrDefault(mask, 0) + 1);

        }
        return answer;
    }
}
