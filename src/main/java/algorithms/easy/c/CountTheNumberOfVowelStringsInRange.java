//https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
package algorithms.easy.c;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        CountTheNumberOfVowelStringsInRange vowels = new CountTheNumberOfVowelStringsInRange();
        System.out.println("Output:\t" + vowels.vowelStrings(new String[]{"are", "amy", "u"}, 0, 2));
        System.out.println("Output:\t" + vowels.vowelStrings(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4));
    }

    public int vowelStrings(String[] words, int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++)
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) answer++;

        return answer;
    }

    public boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
