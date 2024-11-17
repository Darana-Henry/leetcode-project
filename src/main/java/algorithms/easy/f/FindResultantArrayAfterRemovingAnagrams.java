//https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        FindResultantArrayAfterRemovingAnagrams anagrams = new FindResultantArrayAfterRemovingAnagrams();
        System.out.println("Output:\t" + anagrams.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));
        System.out.println("Output:\t" + anagrams.removeAnagrams(new String[]{"a", "b", "c", "d", "e"}));
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> answer = new ArrayList<>();
        String prev = "";

        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);

            if (!(sorted.equals(prev))) answer.add(word);

            prev = sorted;
        }
        return answer;
    }
}
