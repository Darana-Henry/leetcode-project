//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
package algorithms.easy.c;

import java.util.Arrays;
import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords {
    public static void main(String[] args) {
        CheckIfAStringIsAnAcronymOfWords acronym = new CheckIfAStringIsAnAcronymOfWords();
        System.out.println("Output:\t" + acronym.isAcronym(Arrays.asList("alice", "bob", "charlie"), "abc"));
        System.out.println("Output:\t" + acronym.isAcronym(Arrays.asList("an", "apple"), "a"));
        System.out.println(
                "Output:\t" + acronym.isAcronym(Arrays.asList("never", "gonna", "give", "up", "on", "you"), "ngguoy"));
    }

    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : words)
            sb.append(word.charAt(0));
        return sb.toString().equals(s);
    }
}
