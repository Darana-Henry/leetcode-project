//https://leetcode.com/problems/count-vowel-substrings-of-a-string/
package algorithms.easy.c;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubstringsOfAString {
    public static void main(String[] args) {
        CountVowelSubstringsOfAString vowels = new CountVowelSubstringsOfAString();
        System.out.println("Output:\t" + vowels.countVowelSubstrings("aeiouu"));
        System.out.println("Output:\t" + vowels.countVowelSubstrings("unicornarihan"));
        System.out.println("Output:\t" + vowels.countVowelSubstrings("cuaieuouac"));
    }

    public int countVowelSubstrings(String word) {
        int n = word.length();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (!isVowel(word.charAt(j))) break;
                set.add(word.charAt(j));
                if (set.size() == 5) answer++;
            }
        }

        return answer;
    }

    private boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
