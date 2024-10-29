//https://leetcode.com/problems/rearrange-characters-to-make-target-string/
package algorithms.easy.r;

import algorithms.easy.m.MaximumNumberOfPairsInArray;

public class RearrangeCharactersToMakeTargetString {
    public static void main(String[] args) {
        MaximumNumberOfPairsInArray pairs = new MaximumNumberOfPairsInArray();
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2}));
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{1, 1}));
        System.out.println("Output:\t" + pairs.numberOfPairs(new int[]{0}));
    }

    public int rearrangeCharacters(String s, String target) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        int answer = Integer.MAX_VALUE;

        for (char ch : s.toCharArray())
            sCount[ch - 'a']++;

        for (char ch : target.toCharArray())
            tCount[ch - 'a']++;

        for (int i = 0; i < 26; i++)
            if (tCount[i] > 0) answer = Math.min(answer, sCount[i] / tCount[i]);

        return answer;
    }
}
