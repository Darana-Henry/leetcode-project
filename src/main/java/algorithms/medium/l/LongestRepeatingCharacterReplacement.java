//https://leetcode.com/problems/longest-repeating-character-replacement/
package algorithms.medium.l;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement obj = new LongestRepeatingCharacterReplacement();
        System.out.println("Output:\t" + obj.characterReplacement("ABAB", 2));
        System.out.println("Output:\t" + obj.characterReplacement("AABABBA", 1));
    }

    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int start = 0, end = 0, max = 0;

        for (; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            max = Math.max(max, count[s.charAt(end) - 'A']);

            if (end - start + 1 - max > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

        }

        return end - start;
    }
}
