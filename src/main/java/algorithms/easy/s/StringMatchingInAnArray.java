//https://leetcode.com/problems/string-matching-in-an-array/
package algorithms.easy.s;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        StringMatchingInAnArray matching = new StringMatchingInAnArray();
        System.out.println("Output:\t" + matching.stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        System.out.println("Output:\t" + matching.stringMatching(new String[]{"leetcode", "et", "code"}));
        System.out.println("Output:\t" + matching.stringMatching(new String[]{"blue", "green", "bu"}));
    }

    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    answer.add(words[i]);
                    break;
                }
            }
        }
        return answer;
    }
}
