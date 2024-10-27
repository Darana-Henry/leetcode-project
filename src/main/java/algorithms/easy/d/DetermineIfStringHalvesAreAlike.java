//https://leetcode.com/problems/determine-if-string-halves-are-alike/
package algorithms.easy.d;

import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        DetermineIfStringHalvesAreAlike alike = new DetermineIfStringHalvesAreAlike();
        System.out.println("Output:\t" + alike.halvesAreAlike("book"));
        System.out.println("Output:\t" + alike.halvesAreAlike("textbook"));
    }

    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0, right = 0, n = s.length() >> 1;

        for (int i = 0; i < n; i++) {
            left += set.contains(s.charAt(i)) ? 1 : 0;
            right += set.contains(s.charAt(i + n)) ? 1 : 0;
        }

        return left == right;
    }
}
