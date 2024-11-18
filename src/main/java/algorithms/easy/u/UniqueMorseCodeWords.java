//https://leetcode.com/problems/unique-morse-code-words/
package algorithms.easy.u;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        UniqueMorseCodeWords morse = new UniqueMorseCodeWords();
        System.out.println("Output:\t" + morse.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        System.out.println("Output:\t" + morse.uniqueMorseRepresentations(new String[]{"a"}));
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> answer = new HashSet<>();
        String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray())
                sb.append(codes[ch - 'a']);
            answer.add(sb.toString());
        }
        return answer.size();
    }
}
