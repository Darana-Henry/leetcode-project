//https://leetcode.com/problems/longest-substring-without-repeating-characters/
package algorithms.medium.l;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters repeat = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println("Output:\t" + repeat.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Output:\t" + repeat.lengthOfLongestSubstring("bbbbb"));
        System.out.println("Output:\t" + repeat.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch))
                left = Math.max(left, map.get(ch) + 1);

            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
