//https://leetcode.com/problems/valid-anagram/description/
package algorithms.easy.v;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram anagram = new ValidAnagram();
        System.out.println("Output:\t" + anagram.isAnagramViaCount("anagram", "nagaram"));
        System.out.println("Output:\t" + anagram.isAnagram("rat", "car"));
    }

    public boolean isAnagramViaCount(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char ch : s.toCharArray())
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

        for (char ch : t.toCharArray())
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);

        for (char ch : s.toCharArray()) {
            if (sMap.get(ch) != tMap.get(ch)) return false;
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
