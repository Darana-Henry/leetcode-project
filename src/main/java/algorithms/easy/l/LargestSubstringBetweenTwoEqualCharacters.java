//https://leetcode.com/problems/largest-substring-between-two-equal-characters/
package algorithms.easy.l;

import java.util.Arrays;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters twoEqual = new LargestSubstringBetweenTwoEqualCharacters();
        System.out.println("Output:\t" + twoEqual.maxLengthBetweenEqualCharacters("aa"));
        System.out.println("Output:\t" + twoEqual.maxLengthBetweenEqualCharacters("abca"));
        System.out.println("Output:\t" + twoEqual.maxLengthBetweenEqualCharacters("cbzxy"));
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        int[] count = new int[26];
        Arrays.fill(count, -1);

        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';

            if (count[pos] == -1) count[pos] = i;
            else max = Math.max(max, i - count[pos] - 1);
        }

        return max;
    }
}
