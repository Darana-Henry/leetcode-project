//https://leetcode.com/problems/find-all-anagrams-in-a-string/
package algorithms.medium.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        FindAllAnagramsInAString anagrams = new FindAllAnagramsInAString();
        System.out.println("Output:\t" + anagrams.findAnagrams("cbaebabacd", "abc"));
        System.out.println("Output:\t" + anagrams.findAnagrams("abab", "ab"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int[] pCount = new int[26];
        int[] currCount = new int[26];
        List<Integer> answer = new ArrayList<>();
        if (sLen < pLen) return answer;

        for (char ch : p.toCharArray())
            pCount[ch - 'a']++;

        for (int i = 0; i < pLen - 1; i++)
            currCount[s.charAt(i) - 'a']++;

        for (int i = pLen - 1; i < sLen; i++) {
            currCount[s.charAt(i) - 'a']++;
            if (Arrays.equals(pCount, currCount)) answer.add(i - pLen + 1);
            currCount[s.charAt(i - pLen + 1) - 'a']--;
        }

        return answer;
    }
}
