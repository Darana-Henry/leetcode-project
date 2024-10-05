//https://leetcode.com/problems/find-common-characters/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {

        FindCommonCharacters common = new FindCommonCharacters();
        System.out.println("Output:\t" + common.commonChars(new String[]{"bella", "label", "roller"}));
        System.out.println("Output:\t" + common.commonChars(new String[]{"cool", "lock", "cook"}));
    }

    public List<String> commonChars(String[] words) {
        ArrayList<String> commonChars = new ArrayList<>();

        int[] occurrence = new int[26];
        Arrays.fill(occurrence, Integer.MAX_VALUE);

        for (String s : words) {
            int[] charCount = new int[26];

            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                occurrence[i] = Math.min(occurrence[i], charCount[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (occurrence[i] > 0) {
                commonChars.add("" + (char) (i + 'a'));
                occurrence[i]--;
            }
        }

        return commonChars;
    }
}
