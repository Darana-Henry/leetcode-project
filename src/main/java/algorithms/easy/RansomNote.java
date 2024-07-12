//https://leetcode.com/problems/ransom-note/description/
package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransom = new RansomNote();
        System.out.println("Output:\t" + ransom.canConstructBruteForce("a", "b"));
        System.out.println("Output:\t" + ransom.canConstructOptimized("aa", "ab"));
        System.out.println("Output:\t" + ransom.canConstructOptimized("aa", "aab"));
    }

    public boolean canConstructBruteForce(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch) && map.get(ch) != 0)
                map.put(ch, map.getOrDefault(ch, 0) - 1);
            else
                return false;
        }
        return true;
    }

    public boolean canConstructOptimized(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] counts = new int[26];

        for (char ch : magazine.toCharArray())
            counts[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {
            if (counts[ch - 'a'] == 0)
                return false;
            else
                counts[ch - 'a']--;
        }
        return true;
    }
}
