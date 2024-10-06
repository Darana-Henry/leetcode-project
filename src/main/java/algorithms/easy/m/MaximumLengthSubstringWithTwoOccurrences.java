//https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
package algorithms.easy.m;

import java.util.Map;
import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        MaximumLengthSubstringWithTwoOccurrences two = new MaximumLengthSubstringWithTwoOccurrences();
        System.out.println("Output:\t" + two.maximumLengthSubstring("bcbbbcba"));
        System.out.println("Output:\t" + two.maximumLengthSubstring("aaaa"));
    }

    public int maximumLengthSubstring(String s) {
        int max = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rCh = s.charAt(right);
            map.put(rCh, map.getOrDefault(rCh, 0) + 1);

            while (map.get(rCh) > 2) {
                char lCh = s.charAt(left);
                int leftVal = map.get(lCh) - 1;
                map.put(lCh, leftVal);
                if (map.get(lCh) == 0) map.remove(lCh);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
