//https://leetcode.com/problems/count-the-number-of-special-characters-i/
package algorithms.easy.c;

public class CountTheNumberOfSpecialCharactersI {
    public static void main(String[] args) {
        CountTheNumberOfSpecialCharactersI special = new CountTheNumberOfSpecialCharactersI();
        System.out.println("Output:\t" + special.numberOfSpecialChars("aaAbcBC"));
        System.out.println("Output:\t" + special.numberOfSpecialChars("abc"));
        System.out.println("Output:\t" + special.numberOfSpecialChars("abBCab"));
    }

    public int numberOfSpecialChars(String word) {
        int answer = 0;
        int[] small = new int[26];
        int[] capital = new int[26];

        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') small[ch - 'a'] = 1;
            else capital[ch - 'A'] = 1;
        }

        for (int i = 0; i < 26; i++)
            if (small[i] == 1 && capital[i] == 1) answer++;

        return answer;
    }
}
